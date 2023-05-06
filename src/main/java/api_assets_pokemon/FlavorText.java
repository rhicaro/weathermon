package api_assets_pokemon;

/**
 * Class made for the pokeAPI to receive the flavor text of the certain pokemon
 * @author Hicaro
 */
public class FlavorText {
    private String flavor_text;
    private FlavorTextInner language;
    
    /**
     * 
     * @return String 
     */
    public String getText(){
        return this.flavor_text;
    }
    
    /**
     * 
     * @return FlavorTextInner 
     */
    public FlavorTextInner getFlavorTextInner(){
        return language;
    }
}
