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
}
