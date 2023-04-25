package pokemon_objects;
import api_assets_pokemon.*;
import classes.*;


public class PokemonPhysicalObject extends PokemonAPICall{

    @Override
    public int getHeight(PokemonResponseGeneral resp) {
        return resp.getHeight();
    }

    @Override
    public int getWeight(PokemonResponseGeneral resp) {
        return resp.getWeight();
    }
//These methods are not used
//==============================================================================
    @Override
    public String getName(PokemonResponseName resp, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public String getDescription(PokemonResponseDescription resp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public String getSprite(PokemonResponseGeneral resp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
