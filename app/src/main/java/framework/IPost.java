package framework;

import java.util.Date;
import java.util.List;

/**
 * Created by yangr on 2/27/2016.
 */
public interface IPost {
    IUser getOwner();


    void setOwner(IUser owner);


    String getDescription();


    void setDescription(String subject);


    double getReward();

    void setReward(double reward);



    Date getPostingTime();


    void setPostingTime(Date postingTime);


    List<IReply> getReplies();


    void setReplies(List<IReply> replies);


    IUser getSeller();

    void setSeller(IUser seller);

    String getStatus();
    void setStatus(String status);

    public double getLongitude();

    public void setLongitude(double longitude);

    public double getLatitude();

    public void setLatitude(double latitude);

    public String getTitle();

    public void setTitle(String title);

}
