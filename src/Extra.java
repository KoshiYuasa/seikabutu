import java.util.PriorityQueue;
import java.util.Random;
import java.util.Comparator;

public class Extra {

    public static void main(String[] args) {
        // Generate 100 random numbers between 1 and 10,000
        Random random = new Random();
        Integer[] numbers = new Integer[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = random.nextInt(10000) + 1;
        }

        // Print numbers in decreasing order
        PriorityQueue<Integer> decreasingQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (Integer number : numbers) {
            decreasingQueue.add(number);
        }
        System.out.println("Numbers in decreasing order:");
        printQueue(decreasingQueue);

        // Print numbers in increasing order
        PriorityQueue<Integer> increasingQueue = new PriorityQueue<>();
        for (Integer number : numbers) {
            increasingQueue.add(number);
        }
        System.out.println("\nNumbers in increasing order:");
        printQueue(increasingQueue);

        // Print numbers ordered increasingly by the sum of the digits in the number
        PriorityQueue<Integer> sumDigitsQueue = new PriorityQueue<>(Comparator.comparingInt(Extra::sumOfDigits));
        for (Integer number : numbers) {
            sumDigitsQueue.add(number);
        }
        System.out.println("\nNumbers ordered increasingly by the sum of the digits:");
        printQueue(sumDigitsQueue);
    }

    private static void printQueue(PriorityQueue<Integer> queue) {
        int count = 0;
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + "\t");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

