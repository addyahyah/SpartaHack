package impl;

import java.util.Date;
import java.util.List;

import framework.IPost;
import framework.IReply;
import framework.IUser;

/**
 * Created by yangr on 2/27/2016.
 */
public class Post implements IPost {
    private final int EXPIRATION_TIME = 3600; // in seconds which is 1 hour
    private IUser owner;
    private String subject;
    private double reward;
    private Date postingTime;
    private List<IReply> replies;
    private IUser seller;

    public Post(String postID){
        //? A post can retrieve information itself?
    }
    public Post(){

    }

    public IUser getOwner() {
        return owner;
    }

    public void setOwner(IUser owner) {
        this.owner = owner;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public Date getPostingTime() {
        return postingTime;
    }

    public void setPostingTime(Date postingTime) {
        this.postingTime = postingTime;
    }

    public List<IReply> getReplies() {
        return replies;
    }

    public void setReplies(List<IReply> replies) {
        this.replies = replies;
    }

    public IUser getSeller() {
        return seller;
    }

    public void setSeller(IUser seller) {
        this.seller = seller;
    }
}
