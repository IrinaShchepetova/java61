package repozitory;

import entity.WeatherData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface DatabaseRepozitory {
    boolean saveWeatherData(WeatherData weatherData) throws SQLException;
    List<WeatherData> getAllSavedData() throws IOException, SQLException;
    void closeConnection();
}
