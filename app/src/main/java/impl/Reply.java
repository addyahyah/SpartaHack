package impl;

import java.util.Date;

import framework.IReply;
import framework.IUser;

/**
 * Created by yangr on 2/27/2016.
 */
public class Reply implements IReply {
    private String ownerId;
    private String contend;
    private Date time;

    @Override
    public String getOwner() {
        return ownerId;
    }

    @Override
    public String getContend() {
        return contend;
    }

    @Override
    public void setContend(String contend) {
        this.contend = contend;
    }

    @Override
    public Date getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reply reply = (Reply) o;

        if (!ownerId.equals(reply.ownerId)) return false;
        return time.equals(reply.time);

    }

    @Override
    public int hashCode() {
        int result = ownerId.hashCode();
        result = 31 * result + time.hashCode();
        return result;
    }
}
