package pokemon_objects;

import api_assets_pokemon.*;
import classes.*;

public class PokemonDescriptionObject extends PokemonAPICall{
    @Override
    public String getName(PokemonResponseName resp, int index) {
        String temp = resp.getPokemonList()[index].getPokemon().getPokemonName();
        return temp;
    }

    @Override
    public String getDescription(PokemonResponseDescription resp) {
        String temp = englishDescription(resp);
        return temp;
    }

    @Override
    public String getSprite(PokemonResponseGeneral resp) {
        String temp = resp.getSprite().getImageURL();
        return temp;
    }
    
    public static String englishDescription(PokemonResponseDescription pokemon){
        String temp = "";
        String description = "";
        FlavorText[] entryList = pokemon.getFlavorText();
        for (int i=0; i<entryList.length;i++){
            if("en".equals(entryList[i].getFlavorTextInner().getlanguageName())){
                description = entryList[i].getText();
                String[] split = description.split("\n");
                for (int j=0;j<split.length;j++){
                    if (j == 0){
                        temp = temp + split[j];
                    } else {
                    temp = temp + " " +split[j];
                    }
                }
                return temp;
            }   
        }
        return "No entry";
    }
//
//==============================================================================
        @Override
    public int getHeight(PokemonResponseGeneral resp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getWeight(PokemonResponseGeneral resp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
