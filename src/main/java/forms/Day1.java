/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import api_assets_weather.*;
import api_assets_pokemon.*;
import api_response_classes.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import weather_objects.*;
import pokemon_objects.*;
import java.util.Random;


public class Day1 extends javax.swing.JPanel {
    private Response weatherResponse;
    private String[] pokemonTypes;
    private TemperatureObject tempObj;
    private CityObject cityObj;
    private DateObject dateObj;
    private WeatherObject weatherObj;
    private DefaultListModel model;
    private Random rand;
    
    private ArrayList<String> pokemonNameList;
    private String type1;
    private String type2;
    private String type3;
    private API_Response_Pokemon pokemonNameResponse;
    private PokemonResponseName pokemonNameResponseType1;
    private PokemonResponseName pokemonNameResponseType2;
    private PokemonResponseName pokemonNameResponseType3;
    private ArrayList<PokemonResponseName> pokemonTypeList;

            

    //Cite this
    private static final DecimalFormat df = new DecimalFormat("0");
    private static final DecimalFormat df2 = new DecimalFormat("0.00");
    
    /**
     * Creates new form Day1
     */
    public Day1(Response weatherResponse,String[] pokemonTypes) {
        initComponents();
        this.weatherResponse = weatherResponse;
        this.pokemonTypes = pokemonTypes;
        
        pokemonTypeList = new ArrayList<>();
        pokemonNameResponse = new API_Response_Pokemon();
        pokemonNameResponseType1 = new PokemonResponseName();
        pokemonNameResponseType2 = new PokemonResponseName();
        pokemonNameResponseType3 = new PokemonResponseName();
        setTypes(pokemonTypes, pokemonTypeList); 
        
        model = new DefaultListModel();
        pokemonNameList = new ArrayList<>();
        pokemonList.setModel(model);
        rand = new Random();
        
        
        
    }
    
    public void setWeatherInfo(Response weatherResponse){
        temperature.setText(df2.format(tempObj.tempCall(weatherResponse, 0)));
        windspeed.setText(df.format(weatherObj.windCall(weatherResponse, 0)));
        humidity.setText(df.format(weatherObj.humidityCall(weatherResponse, 0)));
        currentWeather.setText(weatherObj.weatherCall(weatherResponse, 0));
        maxTemperature.setText(df.format(tempObj.tempCallHigh(weatherResponse, 0)));
        minTemperature.setText(df.format(tempObj.tempCallLow(weatherResponse, 0)));
        city.setText(cityObj.cityCall(weatherResponse));
        country.setText(cityObj.countryCall(weatherResponse));
    }
    
    public void setPokemonInfo(ArrayList<PokemonResponseName> pokemonTypeList, DefaultListModel model){
        int numberOfPokemon = pokemonResponse.getPokemonList().length;
        int randomIndex = rand.nextInt(numberOfPokemon);
        
        pokemonNameList.add(pokemonResponse.getPokemonList()[randomIndex].getPokemon().getPokemonName());
        
        model.addAll(pokemonNameList);
    }

    public void setTypes(String[] pokemonTypes, ArrayList<PokemonResponseName> pokemonTypeList){
        if (pokemonTypes.length == 2){
            type1 = pokemonTypes[0];
            type2 = pokemonTypes[1];
            pokemonNameResponseType1 = pokemonNameResponse.getPokemonResponseName(type1);
            pokemonNameResponseType2 = pokemonNameResponse.getPokemonResponseName(type2);
            pokemonTypeList.add(pokemonNameResponseType1);
            pokemonTypeList.add(pokemonNameResponseType2);

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
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        temperatureLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        temperature = new javax.swing.JLabel();
        temperatureType = new javax.swing.JLabel();
        windLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pokemonList = new javax.swing.JList<>();
        humidtyLabel = new javax.swing.JLabel();
        weatherLabel = new javax.swing.JLabel();
        windspeed = new javax.swing.JLabel();
        windSpeedType = new javax.swing.JLabel();
        humidity = new javax.swing.JLabel();
        currentWeather = new javax.swing.JLabel();
        pokemonListLabel = new javax.swing.JLabel();
        pokemonSprite = new javax.swing.JLabel();
        weatherSprite = new javax.swing.JLabel();
        maxTemperatureLabel = new javax.swing.JLabel();
        minTemperatureLabel = new javax.swing.JLabel();
        minTemperature = new javax.swing.JLabel();
        maxTemperature = new javax.swing.JLabel();
        maxTemperatureType = new javax.swing.JLabel();
        minTemperatureType = new javax.swing.JLabel();
        percentageLabel = new javax.swing.JLabel();
        country = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel21.setText("°Farenheit");

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        temperatureLabel.setText("Temperature:");

        locationLabel.setText("Current Location:");

        city.setText("City");

        temperature.setText("__.__");

        temperatureType.setText("°Farenheit");

        windLabel.setText("Wind Speed:");

        pokemonList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(pokemonList);

        humidtyLabel.setText("Humidity:");

        weatherLabel.setText("Current Weather:");

        windspeed.setText("__");

        windSpeedType.setText("MPH");

        humidity.setText("__");

        currentWeather.setText("Place Holder");

        pokemonListLabel.setText("Pokemon Potentially Available:");

        pokemonSprite.setText("Pokemon Sprite");
        pokemonSprite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        weatherSprite.setText("weather Img");
        weatherSprite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        weatherSprite.setMaximumSize(new java.awt.Dimension(100, 100));

        maxTemperatureLabel.setText("Max Temperature:");

        minTemperatureLabel.setText("Min Temperature:");

        minTemperature.setText("__");

        maxTemperature.setText("__");

        maxTemperatureType.setText("°Farenheit");

        minTemperatureType.setText("°Farenheit");

        percentageLabel.setText("%");

        country.setText("Country");

        jLabel2.setText(",");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(windLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(windspeed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(windSpeedType))
                            .addComponent(pokemonListLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(weatherLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(currentWeather))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(humidtyLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(humidity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(percentageLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(temperatureLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(temperature)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(temperatureType)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weatherSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(locationLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(city)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(country)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pokemonSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(minTemperatureLabel)
                                .addGap(8, 8, 8)
                                .addComponent(minTemperature)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minTemperatureType))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maxTemperatureLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxTemperature)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxTemperatureType)))
                        .addGap(25, 25, 25)))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatureLabel)
                    .addComponent(locationLabel)
                    .addComponent(city)
                    .addComponent(temperature)
                    .addComponent(temperatureType)
                    .addComponent(jLabel2)
                    .addComponent(country))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(windLabel)
                            .addComponent(windspeed)
                            .addComponent(windSpeedType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(humidtyLabel)
                            .addComponent(humidity)
                            .addComponent(percentageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weatherLabel)
                            .addComponent(currentWeather))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pokemonListLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(weatherSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pokemonSprite, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxTemperatureLabel)
                            .addComponent(maxTemperature)
                            .addComponent(maxTemperatureType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minTemperatureLabel)
                            .addComponent(minTemperature)
                            .addComponent(minTemperatureType))
                        .addGap(28, 28, 28))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel city;
    private javax.swing.JLabel country;
    private javax.swing.JLabel currentWeather;
    private javax.swing.JLabel humidity;
    private javax.swing.JLabel humidtyLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel maxTemperature;
    private javax.swing.JLabel maxTemperatureLabel;
    private javax.swing.JLabel maxTemperatureType;
    private javax.swing.JLabel minTemperature;
    private javax.swing.JLabel minTemperatureLabel;
    private javax.swing.JLabel minTemperatureType;
    private javax.swing.JLabel percentageLabel;
    private javax.swing.JList<String> pokemonList;
    private javax.swing.JLabel pokemonListLabel;
    private javax.swing.JLabel pokemonSprite;
    private javax.swing.JLabel temperature;
    private javax.swing.JLabel temperatureLabel;
    private javax.swing.JLabel temperatureType;
    private javax.swing.JLabel weatherLabel;
    private javax.swing.JLabel weatherSprite;
    private javax.swing.JLabel windLabel;
    private javax.swing.JLabel windSpeedType;
    private javax.swing.JLabel windspeed;
    // End of variables declaration//GEN-END:variables
}
