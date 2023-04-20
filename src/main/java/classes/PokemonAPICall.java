package classes;

import api_assets_pokemon.*;

public abstract class PokemonAPICall {
    public abstract int getHeight(PokemonResponseGeneral resp);
    public abstract int getWeight(PokemonResponseGeneral resp);
    public abstract String getName(PokemonResponseName resp, int index);
    public abstract String getDescription(PokemonResponseDescription resp);
    public abstract String getSprite(PokemonResponseGeneral resp);
}
