package api_assets_pokemon;

/**
 * Class made to get the name of the pokemon
 * @author raphaelhicaro
 */
public class PokemonResponseName {
    public Pokemon[] pokemon;
    
    /**
     * 
     * @return Pokemon[] 
     */
    public Pokemon[] getPokemonList(){
        return this.pokemon;
    }
}
