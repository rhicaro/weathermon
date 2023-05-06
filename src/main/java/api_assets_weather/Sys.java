package api_assets_weather;

/**
 * class made to get the part of day from the weather api
 * @author Hicaro
 */

public class Sys {
    public String pod;
    
    /**
     * 
     * @return String 
     */
    public String getPod(){ //returns the part of the day (day [d], night [n])
        return this.pod;
    }
}
