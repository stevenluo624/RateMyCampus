package use_case.create_review;

import entity.User;

/**
 * The Output Data for Create Review use case.
 */
public class CreateReviewOutputData {
    private final User user;
    private final int rating;
    private final String comment;
    private final String locationName;
    private final boolean useCaseFailed;

    public CreateReviewOutputData(User user, int rating, String comment, String locationName, boolean useCaseFailed) {
        this.user = user;
        this.rating = rating;
        this.comment = comment;
        this.locationName = locationName;
        this.useCaseFailed = useCaseFailed;
    }

    public User getUser() {
        return user;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public boolean isUseCaseFailed() {
        return useCaseFailed;
    }

    public String getLocationName() { return locationName; }
}
