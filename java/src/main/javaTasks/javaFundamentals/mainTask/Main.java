package javaFundamentals.mainTask;

public class Main {
    public static void main(String[] args) {
        TaskM tm = new TaskM();

        tm.helloUser();
        System.out.println();
        tm.printArguments("Junior Test Automation Engineer in Java");
        System.out.println();
        tm.printRandomNumbers();
        System.out.println();
        tm.sumAndProductOfNumbers();
        System.out.println();
        tm.checkMonthOfYear();
    }
}
