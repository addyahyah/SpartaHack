package framework;

import java.util.Date;

/**
 * Created by yangr on 2/27/2016.
 */
public interface IReview {
    String getOwnerId();
    String getPostId();
    int getRatingScore();
    String getContend();
    Date getDate();
    int setRatingScore();
    String setContend();

}
