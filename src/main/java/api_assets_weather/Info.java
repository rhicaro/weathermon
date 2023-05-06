package api_assets_weather;
/**
 * class made to get weather information from the weather api
 * @author Hicaro
 */
public class Info { 
    private int dt;
    private Main main;
    private Weather[] weather;
    private Clouds clouds;
    private Wind wind;
    private int visibility;
    private double pop;
    private Sys sys;
    private String dt_txt;

    /**
     * 
     * @return int
     */
    public int getDt(){
        return this.dt;
    }
    
    /**
     * 
     * @return Main
     */
    public Main getMain(){
        return this.main;
    }
    
    /**
     * 
     * @return Weather[]
     */
    public Weather[] getWeather(){
        return this.weather;
    }
    
    /**
     * 
     * @return Clouds
     */
    public Clouds getClouds(){
        return this.clouds;
    }
    
    /**
     * 
     * @return Wind
     */
    public Wind getWind(){
        return this.wind;
    }    
    
    /**
     * 
     * @return int
     */
    public int getVis(){
        return this.visibility;
    }
    
    /**
     * 
     * @return double
     */
    public double getPop(){
        return this.pop;
    }
    
    /**
     * 
     * @return Sys
     */
    public Sys getSys(){
        return this.sys;
    }
    
    /**
     * 
     * @return String
     */
    public String getDt_Text(){
        return this.dt_txt;
    }
}
