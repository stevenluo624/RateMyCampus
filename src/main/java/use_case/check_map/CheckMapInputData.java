package use_case.check_map;

/**
 * The input data for the Check Map Use Case.
 */
public class CheckMapInputData {

    private final String name;
    private final String latitude;
    private final String longitude;

    public CheckMapInputData(String name, String latitude, String longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;

    }
}
