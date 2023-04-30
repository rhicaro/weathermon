/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import api_assets_pokemon.PokemonResponseName;
import api_assets_weather.Response;
import api_response_classes.API_Response_Pokemon;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import weather_objects.WeatherObject;

/**
 *
 * @author raphaelhicaro
 */
public class PokemonList extends javax.swing.JPanel {
    private Pokeframe pokeframe;
    private Response weatherResponse;
    private String[] pokemonTypes;
    private WeatherObject weatherObj;
    private DefaultListModel model;
    private URL url;
    
    private String selectedPokemon;
    private ArrayList<String> pokemonNameList;
    private String type1;
    private String type2;
    private String type3;
    private API_Response_Pokemon pokemonNameResponse;
    private PokemonResponseName pokemonNameResponseType1;
    private PokemonResponseName pokemonNameResponseType2;
    private PokemonResponseName pokemonNameResponseType3;
    private ArrayList<PokemonResponseName> pokemonTypeList;
    /**
     * Creates new form PokemonList
     */
    public PokemonList() {
        initComponents();
        weatherResponse = null;
        pokemonTypes = null;
        weatherObj = new WeatherObject();
        pokemonNameResponse = new API_Response_Pokemon();
        selectedPokemon = null;
        
        model = new DefaultListModel();  
        pokemonTypeList = new ArrayList<>();
        pokemonNameResponseType1 = new PokemonResponseName();
        pokemonNameResponseType2 = new PokemonResponseName();
        pokemonNameResponseType3 = new PokemonResponseName();
        pokemonNameList = new ArrayList<>();
        pokemonList.setModel(model);      
        model.clear();
    }
    
    /**
     * sets the creator as pokeframe
     * @param myCreator 
     */
    public void setPokeframe(Pokeframe myCreator){
        pokeframe = myCreator;
    }
    
    /**
     * gets the name fo the selected pokemon
     * @return 
     */
    public String getSelectedPokemon(){
        return pokemonList.getSelectedValue();
    }
    
    /**
     * updates the panel
     * @param weatherResponse2 api response
     * @param pokemonTypes2 string of pokemon type
     */
    public void updatePanel(Response weatherResponse2, String[] pokemonTypes2){
        weatherResponse = weatherResponse2;
        pokemonTypes = pokemonTypes2;
        setWeatherImage(weatherResponse);
        pokemonTypeList = setTypes(pokemonTypes, pokemonTypeList);
        model.clear();
        for (PokemonResponseName type: pokemonTypeList){
            setPokemonList(type, model);
        }
    }

    /**
     * sets the list to all the pokemon with a similar typing
     * @param pokemonNameResp api response
     * @param model list to be shown
     */
    public void setPokemonList(PokemonResponseName pokemonNameResp, DefaultListModel model){
        int numberOfPokemon = pokemonNameResp.getPokemonList().length;
        for (int i=0; i<numberOfPokemon; i++){
            String pokemonName = pokemonNameResp.getPokemonList()[i].
                    getPokemon().getPokemonName();
            pokemonNameList.add(pokemonName);
        }
        model.addAll(pokemonNameList);
        pokemonNameList.clear();
    }

    /**
     * sets the arraylist to the 2-3 different types
     * @param pokemonTypes string array of types
     * @param pokemonTypeList arrayList to add to
     * @return 
     */
    public ArrayList<PokemonResponseName> setTypes(String[] pokemonTypes, ArrayList<PokemonResponseName> pokemonTypeList){
        if (pokemonTypes.length == 2){
            type1 = pokemonTypes[0];
            type2 = pokemonTypes[1];
            pokemonNameResponseType1 = pokemonNameResponse.getPokemonResponseName(type1);
            pokemonNameResponseType2 = pokemonNameResponse.getPokemonResponseName(type2);
            pokemonTypeList.add(pokemonNameResponseType1);
            pokemonTypeList.add(pokemonNameResponseType2);
            return pokemonTypeList;
        } else {
            type1 = pokemonTypes[0];
            type2 = pokemonTypes[1];
            type3 = pokemonTypes[2];
            pokemonNameResponseType1 = pokemonNameResponse.getPokemonResponseName(type1);
            pokemonNameResponseType2 = pokemonNameResponse.getPokemonResponseName(type2);
            pokemonNameResponseType3 = pokemonNameResponse.getPokemonResponseName(type3);
            pokemonTypeList.add(pokemonNameResponseType1);
            pokemonTypeList.add(pokemonNameResponseType2);
            pokemonTypeList.add(pokemonNameResponseType3);
            return pokemonTypeList;
        }
    }
    
    /**
     * sets th weather image
     * @param weatherResponse api response
     */
    public void setWeatherImage(Response weatherResponse){ //changes the img based on the current weather
        String weatherDescription = weatherResponse.getList()[0].getWeather()[0].getDescription();
        weather.setText(weatherDescription);
        if (weatherDescription.contains("clear") || weatherDescription.contains("sun")){
            weatherSprite.setIcon(new ImageIcon("src/main/resources/sun.png"));
        } else if (weatherDescription.contains("cloud") || weatherDescription.contains("part")){
            weatherSprite.setIcon(new ImageIcon("src/main/resources/cloud.png"));
        } else if (weatherDescription.contains("rain")){
            weatherSprite.setIcon(new ImageIcon("src/main/resources/rain.png"));
        } else if (weatherDescription.contains("wind")){
            weatherSprite.setIcon(new ImageIcon("src/main/resources/wind.png"));
        } else if (weatherDescription.contains("thunder") || weatherDescription.contains("storm") || weatherDescription.contains("lightening")){
            weatherSprite.setIcon(new ImageIcon("src/main/resources/thunder.png"));
        } else if (weatherDescription.contains("snow")){
            weatherSprite.setIcon(new ImageIcon("src/main/resources/snow.png"));
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pokemonListAll = new javax.swing.JScrollPane();
        pokemonList = new javax.swing.JList<>();
        currentWeatherLabel = new javax.swing.JLabel();
        weather = new javax.swing.JLabel();
        pokemonSprite = new javax.swing.JLabel();
        weatherSprite = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        pokemonList.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pokémon", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 0, 12))); // NOI18N
        pokemonList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        pokemonList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                pokemonListValueChanged(evt);
            }
        });
        pokemonListAll.setViewportView(pokemonList);

        currentWeatherLabel.setText("Current Weather:");

        weather.setText("Place Holder");

        pokemonSprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeball.png"))); // NOI18N
        pokemonSprite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pokemonListAll, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentWeatherLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(weather))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(weatherSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(pokemonSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(pokemonListAll, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(currentWeatherLabel)
                            .addComponent(weather))
                        .addGap(18, 18, 18)
                        .addComponent(weatherSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pokemonSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pokemonListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_pokemonListValueChanged
        String currentPokemon = pokemonList.getSelectedValue();
        try {
            String pokemonURL = pokemonNameResponse.getPokemonResponseGeneral(currentPokemon).getSprite().getImageURL(); //set as a variable 
            url = new URL(pokemonURL);
            BufferedImage image = ImageIO.read(url);
            ImageIcon icon = new ImageIcon(image);//make an arrayList of imageIcon to make pictures load faster.
            pokemonSprite.setIcon(icon);
        } catch (MalformedURLException | FileNotFoundException ex) {
            pokemonSprite.setIcon(new ImageIcon("src/main/resources/pokeball.png"));
        } catch (IOException | NullPointerException ex) {
            pokemonSprite.setIcon(new ImageIcon("src/main/resources/pokeball.png"));
        }
    }//GEN-LAST:event_pokemonListValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentWeatherLabel;
    private javax.swing.JList<String> pokemonList;
    private javax.swing.JScrollPane pokemonListAll;
    private javax.swing.JLabel pokemonSprite;
    private javax.swing.JLabel weather;
    private javax.swing.JLabel weatherSprite;
    // End of variables declaration//GEN-END:variables
}
