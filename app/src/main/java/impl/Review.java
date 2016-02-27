package impl;

import java.util.Date;

import framework.IReview;

/**
 * Created by yangr on 2/27/2016.
 */
public class Review implements IReview {
    private String title;
    private String ownerId;
    private String postId;
    private int ratingScore;
    private String contend;
    private Date date;

    @Override
    public String getOwnerId() {
        return ownerId;
    }

    @Override
    public String getPostId() {
        return postId;
    }

    @Override
    public int getRatingScore() {
        return ratingScore;
    }

    @Override
    public String getContend() {
        return contend;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public int setRatingScore() {
        return ratingScore;
    }

    @Override
    public String setContend() {
        return contend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Review review = (Review) o;

        if (!ownerId.equals(review.ownerId)) return false;
        if (!postId.equals(review.postId)) return false;
        return date.equals(review.date);

    }

    @Override
    public int hashCode() {
        int result = ownerId.hashCode();
        result = 31 * result + postId.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }
}
