package use_case.create_reply;

import entity.Review;
import entity.User;

public class CreateReplyInteractor implements CreateReplyInputBoundary {
    private final CreateReplyDataAccessInterface dataAccess;
    private final CreateReplyOutputBoundary presenter;

    public CreateReplyInteractor(CreateReplyDataAccessInterface dataAccess, CreateReplyOutputBoundary presenter) {
        this.dataAccess = dataAccess;
        this.presenter = presenter;
    }

    @Override
    public void execute(CreateReplyInputData inputData) {
        User user = inputData.getUser();
        String comment = inputData.getComment();
        final Review reply = new Review(user, comment);
        dataAccess.saveReply(reply);

        final CreateReplyOutputData outputData = new CreateReplyOutputData(user, comment, false);
        presenter.prepareSuccessView(outputData);
    }
}
