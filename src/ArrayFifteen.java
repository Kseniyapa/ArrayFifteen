import java.util.Arrays;
import java.util.Scanner;

public class ArrayFifteen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] array = new int[15];
        Arrays.fill(array, -1);
        do {
            int value = scan.nextInt() % 15;
            int index = value;
            boolean done = false;
            int cicleiterator = 0;

            try {
                while (!done) {
                    if (array[index] == -1) {
                        array[index] = value;
                        done = true;
                    } else {
                        index += 3;
                        if (index > 14) index -= 15;
                    }
                    cicleiterator++;
                    if (cicleiterator > 5) throw new Exception("loop");
                    System.out.println("Number of tries " + cicleiterator);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
            System.out.println(Arrays.toString(array));
        } while (!scan.nextLine().equals("exit"));

    }
}

