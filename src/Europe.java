import java.util.HashMap;
import java.util.Map;

public class Europe implements StrategyTraveling {

    @Override
    public String travel(String country) {
        Map<String, String> countriesDistances = new HashMap<String, String>();
        countriesDistances.put("Italy","3000 km");
        countriesDistances.put("France","5000 km");
        countriesDistances.put("England","45603 km");
        countriesDistances.put("Latvia","86459 km");
        countriesDistances.put("Hungary","1532 km");
        countriesDistances.put("Spain","4662 km");
        countriesDistances.put("Andorra","4753 km");

        return countriesDistances.get(country);
    }
}
