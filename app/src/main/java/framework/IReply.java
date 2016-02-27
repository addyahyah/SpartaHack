package framework;

import java.util.Date;

/**
 * Created by yangr on 2/27/2016.
 */
public interface IReply {
    public String getOwner();
    public String getContend();
    public void setContend(String contend);
    public Date getTime();
}
