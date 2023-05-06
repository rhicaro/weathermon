package abstract_classes;
import api_assets_weather.Response;
/**
 * Abstract Class made of methods for weather related objects so that they retrieve information 
 * from the weather API
 */
public abstract class WeatherAPICall{
    public abstract String cityCall(Response weatherData);
    public abstract String countryCall(Response weatherData);
    public abstract double tempCall(Response weatherData, int index);
    public abstract double tempCallHigh(Response weatherData, int index);
    public abstract double tempCallLow(Response weatherData, int index);
    public abstract String dateCall(Response weatherData, int index);
    public abstract double windCall(Response weatherData, int index);
    public abstract int humidityCall(Response weatherData, int index);
    public abstract String weatherCall(Response weatherData, int index);
}
