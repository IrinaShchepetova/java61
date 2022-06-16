package provider;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import enums.Periods;
import entity.WeatherData;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException, SQLException;

    List<WeatherData> getAllFromDb() throws IOException, SQLException;
}
