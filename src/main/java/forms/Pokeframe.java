package forms;

import day_panel_factory.DayPanel;
import day_panel_factory.DayPanelFactory;
import api_assets_weather.*;
import api_response_classes.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;
import pokemon_objects.*;
import weather_objects.*;

public final class Pokeframe extends javax.swing.JFrame {
    private int stateNumber;
    private int buttonState;
    private Response weatherResponse;
    
    private final API_Response_Weather weatherResponseObject;
    private final WeatherObject weatherObj;
    private final PokemonDescriptionObject descriptionObj;
            
    private final CityForm cityform;
    private final Day1 day1;
    private final DayPanel day2;
    private final DayPanel day3;
    private final DayPanel day4;
    private final DayPanel day5;
    private final PokemonList pokemonlist;
    private final Pokedex pokedex;
    private final ArrayList<JPanel> JPanelList;

    /**
     * Creates a new instance of pokeframe
     */
    public Pokeframe() {
        initComponents();
        stateNumber = 0;
        buttonState = 0;
        weatherResponse = null;
        weatherResponseObject = new API_Response_Weather();
        descriptionObj = new PokemonDescriptionObject();
        weatherObj = new WeatherObject();
        
        cityform = new CityForm();
        day1 = new Day1();
        
        DayPanelFactory dayFactory1 = new DayPanelFactory(7);
        day2 = dayFactory1.createPanel();

        DayPanelFactory dayFactory2 = new DayPanelFactory(15);
        day3 = dayFactory2.createPanel();
        
        DayPanelFactory dayFactory3 = new DayPanelFactory(23);
        day4 = dayFactory3.createPanel();
        
        DayPanelFactory dayFactory4 = new DayPanelFactory(31);
        day5 = dayFactory4.createPanel();
        
        pokemonlist = new PokemonList();
        pokedex = new Pokedex();
        
        JPanelList = new ArrayList<>();
        JPanelList.add(cityform);
        JPanelList.add(day1);
        JPanelList.add(day2);
        JPanelList.add(day3);
        JPanelList.add(day4);
        JPanelList.add(day5);
        JPanelList.add(pokemonlist);
        JPanelList.add(pokedex);
        
        for (JPanel panel:JPanelList){
            panel.setSize(400,400);
            descriptionPanel.add(panel);
        }
        
        changeState(stateNumber);
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
        setTitle("Pokédex 2.0");
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
            .addGap(0, 388, Short.MAX_VALUE)
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
            .addGroup(windowDisplayInfoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(windowNameDisplay)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        windowDisplayInfoLayout.setVerticalGroup(
            windowDisplayInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, windowDisplayInfoLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(windowNameDisplay)
                .addGap(28, 28, 28))
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

        tempChangeBtn.setText("Change to Metric");
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
                .addComponent(windowDisplayInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tempChangeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(enterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(windowDisplayInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tempChangeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );

        javax.swing.GroupLayout pokedexPanelLayout = new javax.swing.GroupLayout(pokedexPanel);
        pokedexPanel.setLayout(pokedexPanelLayout);
        pokedexPanelLayout.setHorizontalGroup(
            pokedexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pokedexPanelLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(pokedexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionPanel, 398, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPanel, 398, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
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
                .addComponent(pokedexPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if (stateNumber == 1 || stateNumber == 0 || stateNumber == 7){
            stateNumber -= 0;
        } else {
            stateNumber -= 1;
        }
        changeState(stateNumber);
    }//GEN-LAST:event_return2LastPanelBtn

    private void nextPanelBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPanelBtn
        if (stateNumber == 7 || stateNumber == 6 || stateNumber ==0){
            stateNumber += 0;
        } else if (stateNumber == 6){
            enterBtn.setText("View Seleceted Pokemon");
        } else {
        stateNumber += 1;
        }
        changeState(stateNumber);
    }//GEN-LAST:event_nextPanelBtn

    private void enterBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtn
        if (stateNumber == 0){
            String cityName = cityform.getCityName();
            try {
                Location cityNameObj = weatherResponseObject.getLocationResp(cityName)[0];
                double cityLat = cityNameObj.getLat();
                double cityLon = cityNameObj.getLon();
                weatherResponse = weatherResponseObject.getResponse(cityLat, cityLon); //should now be accessible outside of the frame
            } catch (java.lang.NullPointerException | ArrayIndexOutOfBoundsException |java.lang.NoSuchMethodError| NumberFormatException ex) {
               //Timer code from http://www.java2s.com/Tutorials/Java/Swing_How_to/Timer/Update_JLabel_with_Timer.htm 
                cityform.setErrorMsg("Please Enter a Valid City Name");
                new Timer(3000, (ActionEvent e) -> {
                    cityform.setErrorMsg("");
               }).start();
               //End of timer code
            }
     
            String weatherType1 = weatherObj.weatherCall(weatherResponse, 0);
            String weatherType2 = weatherObj.weatherCall(weatherResponse, 7);
            String weatherType3 = weatherObj.weatherCall(weatherResponse, 15);
            String weatherType4 = weatherObj.weatherCall(weatherResponse, 23);
            String weatherType5 = weatherObj.weatherCall(weatherResponse, 31);

            String[] pokemonTypes1 = descriptionObj.checkPokemonType(weatherType1).split(",");
            String[] pokemonTypes2 = descriptionObj.checkPokemonType(weatherType2).split(",");
            String[] pokemonTypes3 = descriptionObj.checkPokemonType(weatherType3).split(",");
            String[] pokemonTypes4 = descriptionObj.checkPokemonType(weatherType4).split(",");
            String[] pokemonTypes5 = descriptionObj.checkPokemonType(weatherType5).split(",");
            
            day1.updatePanel(weatherResponse, pokemonTypes1);
            day2.updatePanel(weatherResponse, pokemonTypes2);
            day3.updatePanel(weatherResponse, pokemonTypes3);
            day4.updatePanel(weatherResponse, pokemonTypes4);
            day5.updatePanel(weatherResponse, pokemonTypes5);
            pokemonlist.updatePanel(weatherResponse, pokemonTypes1);
            
            tempChangeBtn.setText("Convert to Celsius");
            buttonState=0;
            
            change2Imperial();
            
            stateNumber += 1;
            changeState(stateNumber);
            
        } else if (stateNumber != 0 && stateNumber < 6){
            stateNumber = 0;
            changeState(stateNumber);
        } else if (stateNumber == 6){
            stateNumber = 7;
            change2Imperial();
            String selectedPokemon = pokemonlist.getSelectedPokemon();
            pokedex.updatePanel(selectedPokemon);
            changeState(stateNumber);
        } else if (stateNumber == 7){
            stateNumber = 6;
            changeState(stateNumber);
        }
    }//GEN-LAST:event_enterBtn

    private void tempChangeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempChangeBtnActionPerformed
        if (buttonState == 0){
            change2Metric();
            buttonState+=1;
        } else if (buttonState == 1){
            change2Imperial();
            buttonState-=1;
        }
    }//GEN-LAST:event_tempChangeBtnActionPerformed
        
    /**
     * changes the scene (panel)
     * @param stateNumber state of the program
     */
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
            tempChangeBtn.setVisible(false);
            enterBtn.setText("Enter");
            cityform.setVisible(true);
        }
        if (stateNumber == 1){
            windowNameDisplay.setText("   Day 1");
            tempChangeBtn.setVisible(true);
            enterBtn.setText("Change Location");
            day1.setVisible(true);
        }
        if (stateNumber == 2){
            windowNameDisplay.setText("   Day 2");
            day2.setVisible(true);
        }
        if (stateNumber == 3){
            windowNameDisplay.setText("   Day 3");
            day3.setVisible(true);
        }
        if (stateNumber == 4){
            windowNameDisplay.setText("   Day 4");
            day4.setVisible(true);
        }
        if (stateNumber == 5){
            windowNameDisplay.setText("   Day 5");
            enterBtn.setText("Change Location");
            day5.setVisible(true);
        }
        if (stateNumber == 6){
            windowNameDisplay.setText("Pokémon");
            tempChangeBtn.setVisible(false);
            enterBtn.setText("View Selected Pokemon");
            pokemonlist.setVisible(true);
        }
        if (stateNumber == 7){
            windowNameDisplay.setText(" Pokédex");
            tempChangeBtn.setVisible(true);
            enterBtn.setText("Return to Pokemon List");
            pokedex.setVisible(true);
        }
    }
    
    /**
     * changes everything to metric system
     */
    public void change2Metric(){
        tempChangeBtn.setText("Change to Imperial");
        day1.change2Metric();
        day2.change2Metric();
        day3.change2Metric();
        day4.change2Metric();
        day5.change2Metric();
        pokedex.convertStats();
    }
    
    /**
     * changes everything to Imperial system
     */
    public void change2Imperial(){
        tempChangeBtn.setText("Change to Metric");
        day1.change2Imperial(weatherResponse);
        day2.change2Imperial(weatherResponse);
        day3.change2Imperial(weatherResponse);
        day4.change2Imperial(weatherResponse);
        day5.change2Imperial(weatherResponse);
        pokedex.revertStats();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        if (args.length > 0 && args[0].equals("-help")) {
        // Print help information
        System.out.println("||Help Information||");
        System.out.println("How to run the project:");
        System.out.println("java -jar target/Weathermon-1.0-SNAPSHOT-jar-with-dependencies.jar");
        System.out.println();
        System.out.println("Options:");
        System.out.println("-help/'Nothing'      Print this help message and exit");
        return;
    }
        
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Pokeframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);\
            return;
        }

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
