package api_assets_pokemon;
/**
 * Class made to get the flavor text of a certain pokemon
 * @author Hicaro
 */
public class PokemonResponseDescription {
    private FlavorText[] flavor_text_entries;
    
    /**
     * 
     * @return FlavorText[]
     */
    public FlavorText[] getFlavorText(){
        return this.flavor_text_entries;
    }
}
