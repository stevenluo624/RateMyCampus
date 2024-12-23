package use_case.check_map;

/**
 * The Check Map Use Case.
 */
public interface CheckMapInputBoundary {

    /**
     * Execute the Check Map Use Case.
     * @param checkMapInputData the input data for this use case
     */
    void execute(CheckMapInputData checkMapInputData);

    /**
     * Executes the switch to list of reviews use case.
     */
    void switchToListReviewView();
}
