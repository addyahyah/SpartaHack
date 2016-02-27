package framework;

import java.util.List;

/**
 * Created by yangr on 2/27/2016.
 */
public interface IUser {
    String get_id();

    String getName();

    void setName(String name);
    String getFname();

    void setFname(String fname);
    String getLname();

    void setLname(String lname);
    List<String> getPostsOwned();
    void addPostsOwned(String postId);
    List<IReview> getReviews();
    void addReviews(IReview review);
    double getRating();

    void addRating(int rating);
    void removeRating(int rating);
    List<String> getPostListening();
    void addPostListening(String postId);
}
