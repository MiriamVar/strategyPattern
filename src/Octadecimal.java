public class Octadecimal implements Strategy {
    @Override
    public String convert(int number) {
        return Integer.toOctalString(number);
    }
}
