package use_case.create_review;

import entity.UserReview;

/**
 *  DAO for the create review use case
 */
public interface CreateReviewDataAccessInterface {

    /**
     * Adds a new review.
     * @param review contains details of the review
     * @return the id of the new review
     */
    String saveReview(UserReview review);

    /**
     * Retrieves the review with the given id
     * @param id the review id
     * @return details of the review
     */
    UserReview getReview(String id);
}
