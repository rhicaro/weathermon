package abstract_classes;
/**
 * Abstract Class made of methods for pokemon related objects so that they retrieve information 
 * from the pokemon API
 */
import api_assets_pokemon.*;

public abstract class PokemonAPICall {
    public abstract String getType(PokemonResponseGeneral resp, int index);
    public abstract double getHeight(PokemonResponseGeneral resp);
    public abstract double getWeight(PokemonResponseGeneral resp);
    public abstract String getName(PokemonResponseName resp, int index);
    public abstract String getDescription(PokemonResponseDescription resp);
    public abstract String getSprite(PokemonResponseGeneral resp);
}
