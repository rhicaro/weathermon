package api_assets_weather;
/**
 * class made to receive the lat and lon of the city from the geolocation api
 * @author Hicaro
 */
public class Coord { 
    private double lat;
    private double lon;

    /**
     * 
     * @return double
     */
    public double getLat(){ 
        return this.lat;
    }
    
    /**
     * 
     * @return double
     */
    public double getLon(){ 
        return this.lon;
    }
}
