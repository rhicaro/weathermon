package api_assets_pokemon;

/**
 *Class made to get various information about the certain pokemon
 * @author raphaelhicaro
 */
public class PokemonResponseGeneral {
    private int height, weight;
    private String name;
    private Types[] types;
    private Sprite sprites;
    
    /**
     * 
     * @return int 
     */
    public int getHeight(){
        return this.height;
    }
    
    /**
     * 
     * @return int 
     */
    public int getWeight(){
        return this.weight;
    }
    
    /**
     * 
     * @return string 
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * 
     * @return Types[] 
     */
    public Types[] getTypes(){
        return this.types;
    }
    
    /**
     * 
     * @return Sprite
     */
    public Sprite getSprite(){
        return this.sprites;
    }
}
