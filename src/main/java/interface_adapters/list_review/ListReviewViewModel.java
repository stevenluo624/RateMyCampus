package interface_adapters.list_review;

import interface_adapters.ViewModel;

/**
 * View model for list review view.
 */
public class ListReviewViewModel extends ViewModel<ListReviewState> {

    public static final String TITLE_LABEL = "Reviews List";
    public static final String PAGE_SIZE_LABEL = "Reviews per page";

    public static final String NEXT_PAGE_BUTTON_LABEL = "Next Page";
    public static final String PREVIOUS_PAGE_BUTTON_LABEL = "Previous Page";

    public ListReviewViewModel() {
        super("list review");

        setState(new ListReviewState());
    }
}
