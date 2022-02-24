import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigPow(1, 100));
    }

    public static List<Long> sumDigPow(long a, long b) {

        List<Long> numbers = new ArrayList<>();

        for (long i = a; i <= b; i++) {

            long temp = 0;
            String tempString = Long.toString(i);
            int length = tempString.length();
            long number = i; // 89
            while(number > 0) {
                temp = (long) (temp + Math.pow(number % 10, length));
                --length;
                number = number / 10;
            }

            if(temp == i) {
                numbers.add(i);
            }

        }

        return numbers;
    }
}
