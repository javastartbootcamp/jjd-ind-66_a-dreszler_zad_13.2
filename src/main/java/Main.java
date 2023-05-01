import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        List<Integer> numbers = ListUtils.getNumbers(scanner);
        try {
            ListUtils.printNumbersInReverse(numbers);
            ListUtils.printSumOfNumbersCalculation(numbers);
            int lowest = ListUtils.getLowestNumber(numbers);
            int greatest = ListUtils.getGreatestNumber(numbers);
            System.out.println("Najmniejsza liczba w liście to " + lowest);
            System.out.println("Największa liczba w liście to " + greatest);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
