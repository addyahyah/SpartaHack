package impl;

import java.util.List;

import framework.IRating;
import framework.IReview;
import framework.IUser;

/**
 * Created by yangr on 2/27/2016.
 */
public class User implements IUser {
    private String _id;
    private String name;
    private String fname;
    private String lname;
    private String gender;
    private List<String> postsOwned;
    private List<IReview> reviews;
    private IRating Rating;
    private List<String> postListening;
    private String email;

    public User(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public List<String> getPostsOwned() {
        return postsOwned;
    }

    public void addPostsOwned(String postId) {
        this.postsOwned.add(postId);
    }

    public List<IReview> getReviews() {
        return reviews;
    }

    public void addReviews(IReview review) {
        this.reviews.add(review);
    }

    public double getRating() {
        return Rating.getRatingScore();
    }

    public void addRating(int rating) {
        this.Rating.addRating(rating);
    }

    public void removeRating(int rating) {
        this.Rating.removeRating(rating);
    }

    public List<String> getPostListening() {
        return postListening;
    }

    public void addPostListening(String postId) {
        this.postListening.add(postId);
    }
}
