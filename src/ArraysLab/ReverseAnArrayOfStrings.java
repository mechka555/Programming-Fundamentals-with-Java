package ArraysLab;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        for (int i = 0; i < array.length / 2; i++) {
            String local = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = local;
        }
        System.out.println(String.join(" ", array));
    }
}
