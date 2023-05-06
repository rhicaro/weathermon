package api_assets_weather;
/**
 * class made to get the description of the weather from the weather api
 * @author Hicaro
 */
public class Weather {
    private int id;
    private String main;
    private String description;
    private String icon;

    /**
     * 
     * @return int 
     */
    public int getId(){
        return this.id;
    }
    
    /**
     * 
     * @return String
     */
    public String getMain(){
        return this.main;
    }
    
    /**
     * 
     * @return String
     */
    public String getDescription(){ //returns a description of the current weater
        return this.description;
    }
    
    /**
     * 
     * @return String
     */
    public String getIcon(){ //returns an icon of the weather probablt through url
        return this.icon;
    }        
}
