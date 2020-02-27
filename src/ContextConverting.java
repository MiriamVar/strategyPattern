public class ContextConverting {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String converting(int number){
        return strategy.convert(number);
    }
}
