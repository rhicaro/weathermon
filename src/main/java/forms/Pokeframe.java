package forms;

import api_assets_pokemon.*;
import api_assets_weather.*;
import api_response_classes.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import weather_objects.*;

public class Pokeframe extends javax.swing.JFrame {
    public int stateNumber;
    private Response weatherResponse;
    private PokemonResponseName pokeNameResponse;
    private String[] pokemonTypes;
    private TemperatureObject tempObj;
    
    private API_Response_Weather weatherResponseObject;
    private API_Response_Pokemon pokemonResponseObject;
    private CityForm cityform;
    private Day1 day1;
    private Day2 day2;
    private Day3 day3;
    private Day4 day4;
    private Day5 day5;
    private PokemonList pokemonlist;
    private Pokedex pokedex;
    private ArrayList<JPanel> JPanelList;
        
    public Pokeframe() {
        initComponents();
        stateNumber = 0;
        weatherResponse = null;
        pokeNameResponse = null;
        pokemonTypes = null;
        
        cityform = new CityForm();
        day1 = new Day1();
        day2 = new Day2();
        day3 = new Day3();
        day4 = new Day4();
        day5 = new Day5();
        pokemonlist = new PokemonList();
        pokedex = new Pokedex();
        tempObj = new TemperatureObject();
        
        cityform.setPokeframe(this);
        day1.setPokeframe(this);
        day2.setPokeframe(this);
        day3.setPokeframe(this);
        day4.setPokeframe(this);
        day5.setPokeframe(this);
        pokemonlist.setPokeframe(this);

        cityform.setSize(400,400);
        day1.setSize(400,400);
        day2.setSize(400,400);
        day3.setSize(400,400);
        day4.setSize(400,400);
        day5.setSize(400,400);
        pokemonlist.setSize(400,400);
        pokedex.setSize(400,400);
        
        descriptionPanel.add(cityform);
        descriptionPanel.add(day1);
        descriptionPanel.add(day2);
        descriptionPanel.add(day3);
        descriptionPanel.add(day4);
        descriptionPanel.add(day5);
        descriptionPanel.add(pokemonlist);
        descriptionPanel.add(pokedex);

        changeState(stateNumber);
        
        JPanelList = new ArrayList<>(); 
        JPanelList.add(day1);
        JPanelList.add(day2);
        JPanelList.add(day3);
        JPanelList.add(day4);
        JPanelList.add(day5);
        JPanelList.add(pokemonlist);
        JPanelList.add(pokedex);

        weatherResponseObject = new API_Response_Weather();
        pokemonResponseObject = new API_Response_Pokemon();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pokedexPanel = new javax.swing.JPanel();
        descriptionPanel = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();
        windowDisplayInfo = new javax.swing.JPanel();
        windowNameDisplay = new javax.swing.JLabel();
        enterBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        tempChangeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pokedexPanel.setBackground(new java.awt.Color(255, 51, 51));
        pokedexPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        pokedexPanel.setMaximumSize(new java.awt.Dimension(500, 700));
        pokedexPanel.setPreferredSize(new java.awt.Dimension(500, 700));

        descriptionPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        descriptionPanel.setMaximumSize(new java.awt.Dimension(400, 400));
        descriptionPanel.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout descriptionPanelLayout = new javax.swing.GroupLayout(descriptionPanel);
        descriptionPanel.setLayout(descriptionPanelLayout);
        descriptionPanelLayout.setHorizontalGroup(
            descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        descriptionPanelLayout.setVerticalGroup(
            descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        userPanel.setBackground(new java.awt.Color(99, 99, 99));
        userPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        userPanel.setPreferredSize(new java.awt.Dimension(400, 150));

        windowDisplayInfo.setBackground(new java.awt.Color(141, 198, 69));
        windowDisplayInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        windowDisplayInfo.setPreferredSize(new java.awt.Dimension(260, 100));

        windowNameDisplay.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        windowNameDisplay.setText("Blank");

        javax.swing.GroupLayout windowDisplayInfoLayout = new javax.swing.GroupLayout(windowDisplayInfo);
        windowDisplayInfo.setLayout(windowDisplayInfoLayout);
        windowDisplayInfoLayout.setHorizontalGroup(
            windowDisplayInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, windowDisplayInfoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(windowNameDisplay)
                .addContainerGap())
        );
        windowDisplayInfoLayout.setVerticalGroup(
            windowDisplayInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, windowDisplayInfoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(windowNameDisplay)
                .addGap(35, 35, 35))
        );

        enterBtn.setText("Enter");
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtn(evt);
            }
        });

        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPanelBtn(evt);
            }
        });

        returnBtn.setText("Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return2LastPanelBtn(evt);
            }
        });

        tempChangeBtn.setText("Farenheit");
        tempChangeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempChangeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(windowDisplayInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tempChangeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returnBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                        .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tempChangeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addComponent(windowDisplayInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        javax.swing.GroupLayout pokedexPanelLayout = new javax.swing.GroupLayout(pokedexPanel);
        pokedexPanel.setLayout(pokedexPanelLayout);
        pokedexPanelLayout.setHorizontalGroup(
            pokedexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pokedexPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(pokedexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        pokedexPanelLayout.setVerticalGroup(
            pokedexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pokedexPanelLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(descriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(userPanel, 129, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pokedexPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pokedexPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void return2LastPanelBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return2LastPanelBtn
        if (stateNumber == 1 || stateNumber == 0){
            stateNumber -= 0;
        } else {
            stateNumber -= 1;
        }
        changeState(stateNumber);
    }//GEN-LAST:event_return2LastPanelBtn

    private void nextPanelBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPanelBtn
        if (stateNumber == 7 || stateNumber == 6){
            stateNumber += 0;
        } else {
        stateNumber += 1;
        }
        changeState(stateNumber);
    }//GEN-LAST:event_nextPanelBtn

    private void enterBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtn
        if (stateNumber == 0){
            String cityName = cityform.getCityName();
            Location cityNameObj = weatherResponseObject.getLocationResp(cityName)[0];
            double cityLat = cityNameObj.getLat();
            double cityLon = cityNameObj.getLon();
            weatherResponse = weatherResponseObject.getResponse(cityLat, cityLon); //should now be accessible outside of the frame
            String weatherType = weatherResponse.getList()[0].getWeather()[0].getDescription();
            pokemonTypes = checkPokemonType(weatherType).split(",");//should now be accessible outside of the frame
            stateNumber += 1;
            changeState(stateNumber);
            enterBtn.setText("Change Location");
            day1.updatePanel(weatherResponse, pokemonTypes);//use arrayList
            day2.updatePanel(weatherResponse, pokemonTypes);
            day3.updatePanel(weatherResponse, pokemonTypes);
            day4.updatePanel(weatherResponse, pokemonTypes);
            day5.updatePanel(weatherResponse, pokemonTypes);
            pokemonlist.updatePanel(weatherResponse, pokemonTypes);
        } else if (stateNumber != 0){
            stateNumber = 0;
            enterBtn.setText("Enter");
            changeState(stateNumber);
        } else if (stateNumber == 6){
            stateNumber = 7;
            enterBtn.setText("View Selected Pokemon");
        }
    }//GEN-LAST:event_enterBtn

    private void tempChangeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempChangeBtnActionPerformed

    }//GEN-LAST:event_tempChangeBtnActionPerformed
    
    public Response getWeatherResponse(){
        return this.weatherResponse;
    }
    
    public String[] getPokemonTypes(){
        return this.pokemonTypes;
    }
    
    public PokemonResponseName getPokemonNameResponse(){
        return this.pokeNameResponse;
    }
    
    //Have to move this somewhere else
    public void changeState(int stateNumber){
        cityform.setVisible(false);
        day1.setVisible(false);
        day2.setVisible(false);
        day3.setVisible(false);
        day4.setVisible(false);
        day5.setVisible(false);
        pokemonlist.setVisible(false);
        pokedex.setVisible(false);
                        
        if (stateNumber == 0){
            windowNameDisplay.setText("Enter City");
            cityform.setVisible(true);
        }
        if (stateNumber == 1){
            windowNameDisplay.setText("    Day 1");
            day1.setVisible(true);
        }
        if (stateNumber == 2){
            windowNameDisplay.setText("    Day 2");
            day2.setVisible(true);
        }
        if (stateNumber == 3){
            windowNameDisplay.setText("    Day 3");
            day3.setVisible(true);
        }
        if (stateNumber == 4){
            windowNameDisplay.setText("    Day 4");
            day4.setVisible(true);
        }
        if (stateNumber == 5){
            windowNameDisplay.setText("    Day 5");
            day5.setVisible(true);
        }
        if (stateNumber == 6){
            windowNameDisplay.setText("Pokémon");
             pokemonlist.setVisible(true);
        }
        if (stateNumber == 7){
            windowNameDisplay.setText("Pokédex");
            pokedex.setVisible(true);
        }
    }
    
    public String checkPokemonType(String weatherType){
        if (weatherType.contains("clear")||weatherType.contains("sun")){
            return "fire,grass,ground";
        } else if (weatherType.contains("cloud")||weatherType.contains("overcast")){
            return "fighting,poison,fairy";
        } else if (weatherType.contains("part")||weatherType.contains("scattered")||
                weatherType.contains("few")){
            return "normal,rock";
        }else if (weatherType.contains("rain")){
            return "water,electric,bug";
        }else if (weatherType.contains("wind")){
            return "flying,psychic,dragon";
        }else if (weatherType.contains("fog")){
            return "ghost,dark";
        }else if (weatherType.contains("snow")){
            return "ice,steel";
        } else {
            return null;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pokeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pokeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pokeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pokeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pokeframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel descriptionPanel;
    private javax.swing.JButton enterBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JPanel pokedexPanel;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton tempChangeBtn;
    private javax.swing.JPanel userPanel;
    private javax.swing.JPanel windowDisplayInfo;
    private javax.swing.JLabel windowNameDisplay;
    // End of variables declaration//GEN-END:variables
}
