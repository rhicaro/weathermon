/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weather_objects;

import classes.WeatherAPICall;
import api_assets_weather.Response;
import api_assets_weather.Location;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author raphaelhicaro
 */
public class WeatherObject extends WeatherAPICall{    
    @Override
    public double windCall(Response weatherData, int index) {
        double temp = weatherData.getList()[index].getWind().getSpeed();
        return temp;
    }

    @Override
    public int humidityCall(Response weatherData, int index) {
        int temp = weatherData.getList()[index].getMain().getHumidity();
        return temp;
    }

    @Override
    public String weatherCall(Response weatherData, int index) {
        String temp = weatherData.getList()[index].getWeather()[0].getDescription();
        return temp;
    }
    //==========================================================================
    @Override
    public String cityCall(Response weatherData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String countryCall(Response weatherData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double tempCall(Response weatherData, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double tempCallHigh(Response weatherData, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double tempCallLow(Response weatherData, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String dateCall(Response weatherData, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}