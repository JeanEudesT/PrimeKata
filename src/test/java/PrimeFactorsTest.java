import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

// RULES
// input = 24
// generate(24) -> [3,2,2,2] because 3*2*2*2 = 24 and also because 3 and 2 are prime numbers
public class PrimeFactorsTest extends TestCase {

    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : ints)
            list.add(i);
        return list;
    }


    public void testReturnsPrimeNumbersOf2(){
        // GIVEN
        int input = 2;

        // WHEN
        List<Integer> primeNumbers = PrimeFactors.generate(input);

        // THEN
        Assertions.assertEquals(list(2), primeNumbers);
    }

    public void testReturnsPrimeNumbersOf3() {
        int input = 3;
        List<Integer> primeNumbers = PrimeFactors.generate(input);
        Assertions.assertEquals(list(3), primeNumbers);
    }

    public void testReturnsPrimeNumbersOf5() {
        int input = 5;
        List<Integer> primeNumbers = PrimeFactors.generate(input);
        Assertions.assertEquals(list(5), primeNumbers);
    }

    public void testReturnsPrimeNumbersOf7() {
        int input = 7;
        List<Integer> primeNumbers = PrimeFactors.generate(input);
        Assertions.assertEquals(list(7), primeNumbers);
    }

    public void testFourth() {
        int input = 4;
        List<Integer> primeNumbers = PrimeFactors.generate(input);
        Assertions.assertEquals(list(2,2), primeNumbers);
    }

    public void testSix(){
        assertEquals(list(2,3),PrimeFactors.generate(6));
    }

    public void testEight(){
        assertEquals(list(2,2,2),PrimeFactors.generate(8));
    }

    public void testTwentyFourth(){
        assertEquals(list(2,2,2,3),PrimeFactors.generate(24));
    }

    public void testNine(){
        assertEquals(list(3,3),PrimeFactors.generate(9));
    }

}
