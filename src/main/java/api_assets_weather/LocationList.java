package api_assets_weather;

/**
 * class made to get the city that the user wants to view
 * @author Hicaro
 */
public class LocationList {
    private Location[] list;
    
    /**
     * 
     * @return Location[]
     */
    public Location[] getLocationList(){
        return this.list;
    }
}
