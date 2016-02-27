package framework;

import java.util.Date;
import java.util.List;

/**
 * Created by yangr on 2/27/2016.
 */
public interface IPost {
    public IUser getOwner();


    public void setOwner(IUser owner);


    public String getSubject();


    public void setSubject(String subject);


    public double getReward();

    public void setReward(double reward);



    public Date getPostingTime();


    public void setPostingTime(Date postingTime);


    public List<IReply> getReplies();


    public void setReplies(List<IReply> replies);


    public IUser getSeller();

    public void setSeller(IUser seller);




}
