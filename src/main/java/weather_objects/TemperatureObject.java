/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weather_objects;

import classes.WeatherAPICall;
import api_assets_weather.Response;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author raphaelhicaro
 */
public class TemperatureObject extends WeatherAPICall{
    @Override
    public double tempCall(Response weatherData, int index) {
        double temp = weatherData.getList()[index].getMain().getTemp();
        temp = (temp - 273.15) * (9/5) + 32;
        return temp;
    }

    @Override
    public double tempCallHigh(Response weatherData, int index) {
        double temp = weatherData.getList()[index].getMain().getTemp_max();
        temp = (temp - 273.15) * (9/5) + 32;
        return temp;
    }

    @Override
    public double tempCallLow(Response weatherData, int index) {
        double temp = weatherData.getList()[index].getMain().getTemp_min();
        temp = (temp - 273.15) * (9/5) + 32;
        return temp;
    }
    
    public double round(double value, int places){
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public double convert2Celsius(double value){
        double convertedValue = round(((value - 32) * 5)/9,2);
        return convertedValue;
    }
    //==========================================================================
    
    @Override
    public String dateCall(Response weatherData, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double windCall(Response weatherData, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int humidityCall(Response weatherData, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String weatherCall(Response weatherData, int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String cityCall(Response weatherData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String countryCall(Response weatherData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
