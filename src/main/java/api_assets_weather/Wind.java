package api_assets_weather;

/**
 * class made to get the wind information from the weather api
 * @author Hicaro
 */
public class Wind {
    public double speed;
    public int deg;
    public double gust;

    /**
     * 
     * @return double
     */
    public double getSpeed(){ //returns the speed of the wind
        return this.speed;
    }
    
    /**
     * 
     * @return int
     */
    public int getDeg(){
        return this.deg;
    }
    
    /**
     * 
     * @return double
     */
    public double getGust(){
        return this.gust;
    }
}
