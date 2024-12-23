package interface_adapters.create_review;

import entity.Location;
import entity.User;
import use_case.create_review.CreateReviewInputBoundary;
import use_case.create_review.CreateReviewInputData;
import use_case.create_review.CreateReviewInteractor;

/**
 * Controller for our Note related Use Cases.
 */
public class CreateReviewController {

    private final CreateReviewInputBoundary rateInteractor;

    public CreateReviewController(CreateReviewInputBoundary rateInteractor) {
        this.rateInteractor = rateInteractor;
    }

    /**
     * Executes the Note related Use Cases.
     * @param rating the rating to be recorded
     * @param user the user inputed the rating
     * @param comment the comment the user made
     */
    public void execute(User user, int rating, String comment, String locationName) {
        final CreateReviewInputData createReviewInputData = new CreateReviewInputData(user, rating, comment,
                locationName);

        rateInteractor.execute(createReviewInputData);
    }

    /**
     * Executes the "switch to list of reviews" use case.
     */
    public void switchToListReviewView() {
        rateInteractor.switchToListReviewView();
    }
}
