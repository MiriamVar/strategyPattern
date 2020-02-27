import java.util.HashMap;
import java.util.Map;

public class America implements StrategyTraveling {

    @Override
    public String travel(String country) {
        Map<String, String> countriesDistances = new HashMap<String, String>();
        countriesDistances.put("Texas","496235 km");
        countriesDistances.put("Colorado","245462 km");
        countriesDistances.put("Alaska","446213 km");
        countriesDistances.put("Peru","846459 km");
        countriesDistances.put("Brazil","461348 km");
        countriesDistances.put("Cuba","467662 km");
        countriesDistances.put("Connecticut","475784 km");

        return countriesDistances.get(country);
    }
}
