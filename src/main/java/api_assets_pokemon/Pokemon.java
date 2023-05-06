package api_assets_pokemon;

/**
 *  Class made to get the name of the pokemon
 * @author raphaelhicaro
 */
public class Pokemon {
    private PokemonInner pokemon;
    
    /**
     * 
     * @return PokemonInner 
     */
    public PokemonInner getPokemon(){
        return this.pokemon;
    }
}
