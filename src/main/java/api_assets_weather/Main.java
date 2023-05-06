package api_assets_weather;
/**
 * class made to get the temp from the weather api
 * @author Hicaro
 */
public class Main {
    private double temp;
    private double temp_min;
    private double temp_max;
    private int humidity;

    /**
     * 
     * @return double 
     */
    public double getTemp(){
        return this.temp;
    }   
    
    /**
     * 
     * @return double 
     */
    public double getTemp_min(){ 
        return this.temp_min;
    }
    
    /**
     * 
     * @return double 
     */
    public double getTemp_max(){ 
        return this.temp_max;
    }
    
    /**
     * 
     * @return int
     */
    public int getHumidity(){
        return this.humidity;
    }
}
