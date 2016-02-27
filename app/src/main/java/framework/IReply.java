package framework;

import java.util.Date;

/**
 * Created by yangr on 2/27/2016.
 */
public interface IReply {
    String getOwner();
    String getContend();
    void setContend(String contend);
    Date getTime();
}
