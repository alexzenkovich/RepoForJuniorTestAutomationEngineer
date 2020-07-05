package javaFundamentals.optionalTask1;

import java.util.Scanner;

public class OptionalTaskOne {
    private String[] numbers;

    public void createNumbers (int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + n + " numbers:");
        numbers = new String[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = String.valueOf(scanner.nextInt());
        }
    }

    public String[] getNumbers() {
        return numbers;
    }
}
