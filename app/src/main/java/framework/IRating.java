package framework;

/**
 * Created by yangr on 2/27/2016.
 */
public interface IRating {
    public double getRatingScore();

    public void addRating(int rating);

    public void removeRating(int rating);
}
