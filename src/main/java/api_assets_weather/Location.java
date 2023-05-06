package api_assets_weather;
/**
 * Class made to get the specific aspects of the city given with the geolocation
 * api
 * @author Hicaro
 */

public class Location {
    private String name;
    private double lat;
    private double lon;
    private String country;
    private String state;
    
    /**
     * 
     * @return int
     */
    public String getName() { 
    return this.name; 
    }

    /**
     * 
     * @return double
     */
    public double getLat() { 
    return this.lat; 
    }

    /**
     * 
     * @return double
     */
    public double getLon() { 
    return this.lon; 
    }

    /**
     * 
     * @return String
     */
    public String getCountry() { 
    return this.country; 
    }

    /**
     * 
     * @return String
     */
    public String getState() { 
    return this.state; 
    }
}
