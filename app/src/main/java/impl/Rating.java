package impl;

/**
 * Created by yangr on 2/27/2016.
 */
public class Rating {
    private double totalScores;
    private int totalNumOfPosts;

    public double getRatingScore() {
        return totalScores/totalNumOfPosts;
    }

    public void addRating(int rating) {
        totalScores+=rating;
        totalNumOfPosts++;
    }

    public void removeRating(int rating) {
        totalScores-=rating;
        totalNumOfPosts--;
    }
}
