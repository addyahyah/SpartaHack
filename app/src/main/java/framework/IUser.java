package framework;

import java.util.List;

/**
 * Created by yangr on 2/27/2016.
 */
public interface IUser {
    public String get_id();

    public String getName();

    public void setName(String name);
    public String getFname();

    public void setFname(String fname);
    public String getLname();

    public void setLname(String lname);
    public List<String> getPostsOwned();
    public void addPostsOwned(String postId);
    public List<IReview> getReviews();
    public void addReviews(IReview review);
    public double getRating();

    public void addRating(int rating);
    public void removeRating(int rating);
    public List<String> getPostListening();
    public void addPostListening(String postId);
}
