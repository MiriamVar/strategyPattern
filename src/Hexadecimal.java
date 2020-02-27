public class Hexadecimal implements Strategy{
    @Override
    public String convert(int number) {
        return Integer.toHexString(number);
    }
}
