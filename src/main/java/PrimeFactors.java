import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int input) {
        List<Integer> primeNumbers = new ArrayList<>();
        int candidate = 2;
        while(input>1) {
            while(input%candidate == 0) {
                primeNumbers.add(candidate);
                input = input / candidate;
            }
            candidate++;
        }
        return primeNumbers;
    }
}
