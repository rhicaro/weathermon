/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import api_assets_pokemon.PokemonResponseName;
import api_assets_weather.Response;
import api_response_classes.API_Response_Pokemon;
import java.awt.image.BufferedImage;
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
    
    public void setPokeframe(Pokeframe myCreator){
        pokeframe = myCreator;
    }
    
    public void updatePanel(Response weatherResponse2, String[] pokemonTypes2){
        weatherResponse = weatherResponse2;
        pokemonTypes = pokemonTypes2;
        setWeatherImage(weatherResponse);
        
        pokemonTypeList = setTypes(pokemonTypes, pokemonTypeList);
        for (PokemonResponseName type: pokemonTypeList){
            setPokemonList(type, model);
        }
    }

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
    
    public void setWeatherImage(Response weatherResponse){ //changes the img based on the current weather
        String weatherDescription = weatherResponse.getList()[0].getWeather()[0].getDescription();
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
        pokemonAvailable = new javax.swing.JLabel();
        currentWeatherLabel = new javax.swing.JLabel();
        weather = new javax.swing.JLabel();
        pokemonSprite = new javax.swing.JLabel();
        viewPokemonBtn = new javax.swing.JButton();
        weatherSprite = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

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

        pokemonAvailable.setText("Pokemon Available:");

        currentWeatherLabel.setText("Current Weather:");

        weather.setText("Place Holder");

        pokemonSprite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        viewPokemonBtn.setText("View Selected Pokemon");
        viewPokemonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPokemonBtnActionPerformed(evt);
            }
        });

        weatherSprite.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), "Weather"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pokemonAvailable)
                    .addComponent(pokemonListAll, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(weatherSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(currentWeatherLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(weather))
                            .addComponent(viewPokemonBtn))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pokemonSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pokemonAvailable)
                    .addComponent(currentWeatherLabel)
                    .addComponent(weather))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pokemonListAll, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(weatherSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pokemonSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewPokemonBtn)))
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewPokemonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPokemonBtnActionPerformed
        selectedPokemon = pokemonList.getSelectedValue();
    }//GEN-LAST:event_viewPokemonBtnActionPerformed

    private void pokemonListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_pokemonListValueChanged
         String currentPokemon = pokemonList.getSelectedValue();
        String pokemonURL = pokemonNameResponse.getPokemonResponseGeneral(currentPokemon).getSprite().getImageURL();
        if (pokemonURL == null){
            pokemonSprite.setIcon(new ImageIcon("src/main/resources/pokeball.png"));
        } else {
            try {
                url = new URL(pokemonURL);
                BufferedImage image = ImageIO.read(url);
                ImageIcon icon = new ImageIcon(image);
                pokemonSprite.setIcon(icon);
            } catch (MalformedURLException ex) {
                Logger.getLogger(Day5.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Day5.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_pokemonListValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentWeatherLabel;
    private javax.swing.JLabel pokemonAvailable;
    private javax.swing.JList<String> pokemonList;
    private javax.swing.JScrollPane pokemonListAll;
    private javax.swing.JLabel pokemonSprite;
    private javax.swing.JButton viewPokemonBtn;
    private javax.swing.JLabel weather;
    private javax.swing.JLabel weatherSprite;
    // End of variables declaration//GEN-END:variables
}
