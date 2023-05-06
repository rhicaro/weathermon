package api_assets_weather;

/**
 * class made to get the initial response information from the weather api
 * @author Hicaro
 */
public class Response { //same as json format
    private String cod;
    private int message;
    private int cnt;
    private Info[] list; 
    private City city;
    
    /**
     * 
     * @return String
     */
    public String getCod(){
        return this.cod;
    }
    
    /**
     * 
     * @return int
     */
    public int getMsg(){
        return this.message;
    }
    
    /**
     * 
     * @return int
     */
    public int getCnt(){
        return this.cnt;
    }
    
    /**
     * 
     * @return Info[]
     */
    public Info[] getList(){
        return this.list;
    }
    
    /**
     * 
     * @return City
     */
    public City getCity(){
        return this.city;
    }
}
