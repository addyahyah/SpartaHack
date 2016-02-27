package framework;

/**
 * Created by yangr on 2/27/2016.
 */
public interface IRating {
    double getRatingScore();

    void addRating(int rating);

    void removeRating(int rating);
}
