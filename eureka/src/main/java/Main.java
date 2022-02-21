import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static List<Long> sumDigPow(long a, long b) {

        List<Long> numbers = new ArrayList<>();

        for (long i = a; i < b; i++) {

            if(i <= 9 && i > 0) {
                numbers.add(i);
            }

            String stringNumber;

            while(i > 9) {
                long temp = i % 10;
                i = i / 10;
                double square = Math.pow(temp, temp);
            }

        }

        return numbers;
    }
}
