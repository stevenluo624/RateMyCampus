package use_case.like_review;

import use_case.logout.LogoutInputData;

/**
 * Input Boundary for actions which are related to liking a review.
 */
public interface LikeReviewInputBoundary {
    /**
     * Executes the Like Review use case.
     * @param likeReviewInputData the input data
     */
    void execute(LikeReviewInputData likeReviewInputData);
}