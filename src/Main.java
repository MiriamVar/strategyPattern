public class Main {
    public static void main(String[] args) {

//        Context context = new Context();
//        context.setStrategyTraveling(new America());
//        System.out.println(context.travelingAroundTheWorld("Peru"));

        ContextConverting contextConverting = new ContextConverting();
        contextConverting.setStrategy(new Binary());
        System.out.println(contextConverting.converting(20));

    }
}
