public class Binary implements  Strategy {
    @Override
    public String convert(int number) {
        return Integer.toBinaryString(number);
    }
}
