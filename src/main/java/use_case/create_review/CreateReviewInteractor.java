package use_case.create_review;

import entity.UserReview;

public class CreateReviewInteractor implements CreateReviewInputBoundary {
    private final CreateReviewDataAccessInterface dataAccess;
    private final CreateReviewOutputBoundary presenter;

    public CreateReviewInteractor(CreateReviewDataAccessInterface dataAccess, CreateReviewOutputBoundary presenter) {
        this.dataAccess = dataAccess;
        this.presenter = presenter;
    }

    @Override
    public void execute(CreateReviewInputData inputData) {
        final UserReview review = new UserReview(inputData.getUser(), inputData.getRating(), inputData.getComment());
        dataAccess.saveReview(review);

        final CreateReviewOutputData outputData = new CreateReviewOutputData(inputData.getUser(),
                inputData.getRating(), inputData.getComment(), false);
        presenter.prepareSuccessView(outputData);
    }
}
