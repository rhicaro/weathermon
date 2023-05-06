package api_assets_weather;
/**
 * class made to get different aspects of the city
 * @author Hicaro
 */
public class City {
    private int id;
    private String name;
    private String country;
    private int population;
    private int timezone;
    private Coord coord;

    /**
     * 
     * @return String 
     */
    public String getName(){ 
        return this.name;
    }
    
    /**
     * 
     * @return String 
     */
    public String getCountry(){ //returns the country
        return this.country;
    }
    
    /**
     * 
     * @return int 
     */
    public int getPopulation(){
        return this.population;
    }
    
    /**
     * 
     * @return int 
     */
    public int getTime(){   //returns the time zone of the coordinates
        return this.timezone;
    }
}
