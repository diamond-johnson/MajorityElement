package TestProject;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the integers chosen by students:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int candidate = numbers[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (numbers[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = numbers[i];
                    count = 1;
                }
            }
        }

        int majorityCount = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == candidate) {
                majorityCount++;
            }
        }

        if (majorityCount > n / 2) {
            System.out.println("The number chosen by more than half of the students is: " + candidate);
        } else {
            System.out.println("None");
        }
    }
}