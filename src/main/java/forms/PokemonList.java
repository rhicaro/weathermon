package forms;

import api_assets_pokemon.PokemonResponseName;
import api_assets_weather.Response;
import api_response_classes.API_Response_Pokemon;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author raphaelhicaro
 */
public class PokemonList extends javax.swing.JPanel {
    private Response weatherResponse;
    private String[] pokemonTypes;
    private final DefaultListModel model;
    private URL url;
    
    private final ArrayList<String> pokemonNameListTemp;
    private final ArrayList<String> pokemonNameList;
    private String type1;
    private String type2;
    private String type3;
    private final API_Response_Pokemon pokemonNameResponse;
    private PokemonResponseName pokemonNameResponseType1;
    private PokemonResponseName pokemonNameResponseType2;
    private PokemonResponseName pokemonNameResponseType3;
    private ArrayList<PokemonResponseName> pokemonTypeList;
    
    private final ArrayList<ImageIcon> pokemonIcons;
    /**
     * Creates new form PokemonList
     */
    public PokemonList() {
        initComponents();
        weatherResponse = null;
        pokemonTypes = null;
        pokemonNameResponse = new API_Response_Pokemon();
        
        model = new DefaultListModel();  
        pokemonTypeList = new ArrayList<>();
        pokemonNameResponseType1 = new PokemonResponseName();
        pokemonNameResponseType2 = new PokemonResponseName();
        pokemonNameResponseType3 = new PokemonResponseName();
        pokemonNameList = new ArrayList<>();
        pokemonNameListTemp = new ArrayList<>();
        pokemonList.setModel(model);      
        model.clear();
        
        pokemonIcons = new ArrayList<>();
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
     * @param weatherResponse2 API response
     * @param pokemonTypes2 string of pokemon type
     */
    public void updatePanel(Response weatherResponse2, String[] pokemonTypes2){
        pokemonTypeList.clear();
        weatherResponse = weatherResponse2;
        pokemonTypes = pokemonTypes2;
        setWeatherImage(weatherResponse);
        pokemonTypeList = setTypes(pokemonTypes, pokemonTypeList);
        model.clear();
        pokemonIcons.clear();
        pokemonSprite.setIcon(new ImageIcon("src/main/resources/pokeball.png"));
        for (PokemonResponseName type: pokemonTypeList){
            setPokemonList(type, model);
        }
    }

    /**
     * sets the list to all the pokemon with a similar typing
     * @param pokemonNameResp API response
     * @param model list to be shown
     */
    public void setPokemonList(PokemonResponseName pokemonNameResp, DefaultListModel model){
        ImageIcon placeHolder = new ImageIcon("src/main/resources/pokeball.png");
        int numberOfPokemon = pokemonNameResp.getPokemonList().length;
        for (int i=0; i<numberOfPokemon; i++){
            String pokemonName = pokemonNameResp.getPokemonList()[i].
                    getPokemon().getPokemonName();
            pokemonNameList.add(pokemonName); //Apparently pokemon list doesnt change 
            pokemonNameListTemp.add(pokemonName);
            pokemonIcons.add(placeHolder);
        }
        model.addAll(pokemonNameList);
        pokemonNameList.clear();
    }

    /**
     * sets the array list to the 2-3 different types
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
     * sets the weather image
     * @param weatherResponse API response
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
                .addComponent(pokemonListAll, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(pokemonSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(weatherSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weather)
                            .addComponent(currentWeatherLabel))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(currentWeatherLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(weather)
                        .addGap(7, 7, 7)
                        .addComponent(weatherSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pokemonSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pokemonListAll, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pokemonListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_pokemonListValueChanged
        if (pokemonList.getSelectedIndex() < 0) {
            return;
        }
        
        String currentPokemon = pokemonList.getSelectedValue();
        ImageIcon pokeIcon = pokemonIcons.get(pokemonList.getSelectedIndex());
        
        pokemonSprite.setIcon(pokeIcon);
        if (!pokeIcon.toString().equalsIgnoreCase("src/main/resources/pokeball.png")) {
            return;
        }
        
        //code from https://www.w3schools.com/java/java_threads.asp
        Runnable myThread = () ->
            {
            try {
                String pokemonURL = pokemonNameResponse.getPokemonResponseGeneral(currentPokemon).getSprite().getImageURL(); //set as a variable 
                url = new URL(pokemonURL);
                BufferedImage image = ImageIO.read(url);
                ImageIcon icon = new ImageIcon(image);//make an arrayList of imageIcon to make pictures load faster.
                pokemonIcons.set(pokemonList.getSelectedIndex(), icon);
                pokemonSprite.setIcon(icon);
            
                } catch (IOException | NullPointerException ex) {
                    System.out.println(ex);
                }
            };
        Thread run = new Thread(myThread);
        run.start();
        //end of code
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
