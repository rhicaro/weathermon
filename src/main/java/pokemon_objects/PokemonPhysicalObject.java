package pokemon_objects;
import api_assets_pokemon.*;
import classes.*;


public class PokemonPhysicalObject extends PokemonAPICall{

    @Override
    public double getHeight(PokemonResponseGeneral resp) {
        return convertHeightInitial(resp.getHeight());
    }

    @Override
    public double getWeight(PokemonResponseGeneral resp) {
        return convertWeightInitial(resp.getWeight());
    }
    
    /**
     * For converting the value from the API(hectograms to lbs)
     * @param value
     * @return 
     */
    public double convertWeightInitial(int value){
        return (value*0.2204623);
    }
    /**
     * For converting the value from the API(Decimeter to ft)
     * @param value
     * @return 
     */
    public double convertHeightInitial(double value){
        return (value*0.328084);
    }
    
    public double convert2MetricWeight(double value){
        return value/2.205;
    }
    
    public double convert2MetricHeight(double value){
        return value/3.281;
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
