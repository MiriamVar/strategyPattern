public class Context {

    private StrategyTraveling strategyTraveling;

    public void setStrategyTraveling(StrategyTraveling strategyTraveling) {
        this.strategyTraveling = strategyTraveling;
    }

    public String travelingAroundTheWorld(String country){
       return strategyTraveling.travel(country);
    }
}
