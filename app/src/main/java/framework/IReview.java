package framework;

import java.util.Date;

/**
 * Created by yangr on 2/27/2016.
 */
public interface IReview {
    public String getOwnerId();
    public String getPostId();
    public int getRatingScore();
    public String getContend();
    public Date getDate();
    public int setRatingScore();
    public String setContend();

}
