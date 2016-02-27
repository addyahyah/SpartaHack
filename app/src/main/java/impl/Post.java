package impl;

import java.util.Date;
import java.util.List;

import framework.IPost;
import framework.IReply;

/**
 * Created by yangr on 2/27/2016.
 */
public class Post implements IPost {
    private final int EXPIRATION_TIME = 3600; // in seconds which is 1 hour

    private String status;
    private String postId;
    private String ownerId;
    private String title;
    private double latitude;
    private double longitude;
    private String description;
    private double reward;
    private Date postingTime;
    private List<IReply> replies;
    private String sellerId;

    public Post(String postID){
        //? A post can retrieve information itself?
    }
    public Post(){

    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String seller) {
        this.sellerId = seller;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;
        if (!postId.equals(post.postId)) return false;
        if (!ownerId.equals(post.ownerId)) return false;
        if (!postingTime.equals(post.postingTime)) return false;
        else
            return true;

    }

    @Override
    public int hashCode() {
        int result = postId.hashCode();
        result = 31 * result + ownerId.hashCode();
        result = 31 * result + postingTime.hashCode();
        return result;
    }
}
