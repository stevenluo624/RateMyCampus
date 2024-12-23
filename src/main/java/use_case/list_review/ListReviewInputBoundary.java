package use_case.list_review;

import entity.User;
import use_case.check_map.CheckMapInputData;

/**
 * Input boundary for the list reviews use case.
 */
public interface ListReviewInputBoundary {

    /**
     * Executes list review use case.
     * @param listReviewInputData contains all needed input data.
     */
    void execute(ListReviewInputData listReviewInputData);

    /**
     * Switches to the map view use case.
     * @param checkMapInputData contains data needed to show map.
     */
    void switchToMapView(CheckMapInputData checkMapInputData);

    /** Switches to the profile user case.
     * @param username the logged-in username
     */
    void switchToProfileView(String username);

    /**
     * Switches to the create review use case.
     * @param user the logged in user
     */
    void switchToCreateReviewView(User user);
}
