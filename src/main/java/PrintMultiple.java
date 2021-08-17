import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintMultiple {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(1, 100).boxed().collect(Collectors.toList());
        checkMultiple(numbers);
    }

    private static void checkMultiple(List<Integer> numbers) {

        for (Integer number : numbers) {
            if (number % 5 == 0 && number % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}
