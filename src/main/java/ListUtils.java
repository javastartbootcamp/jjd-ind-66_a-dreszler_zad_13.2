import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ListUtils {
    public static List<Integer> getNumbers(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            numbers.add(number);
        }
        return numbers;
    }

    private static int getSumOfNumbers(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void printNumbersInReverse(List<Integer> numbers) {
        checkIfListSizeIsValid(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(numbers.size() - i - 1));
            if (i != numbers.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printSumOfNumbersCalculation(List<Integer> numbers) {
        checkIfListSizeIsValid(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i != numbers.size() - 1) {
                System.out.print(" + ");
            }
        }
        System.out.print(" = " + getSumOfNumbers(numbers) + "\n");
    }

    public static int getLowestNumber(List<Integer> numbers) {
        checkIfListSizeIsValid(numbers);
        int lowest = Integer.MAX_VALUE;

        for (Integer number : numbers) {
            lowest = Math.min(lowest, number);
        }

        return lowest;
    }

    public static int getGreatestNumber(List<Integer> numbers) {
        checkIfListSizeIsValid(numbers);
        int greatest = Integer.MIN_VALUE;

        for (Integer number : numbers) {
            greatest = Math.max(greatest, number);
        }

        return greatest;
    }

    private static void checkIfListSizeIsValid(List<Integer> numbers) {
        if (numbers.size() == 0) {
            throw new IllegalArgumentException("Podano pustą listę");
        }
    }
}
