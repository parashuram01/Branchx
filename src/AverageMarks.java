import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Enter number of Subjects");
        count = scanner.nextInt();
        System.out.println("Enter Marks of " + count
                + " Subjects");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }

        average = totalMarks / count;
        // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;

        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Average Marks : " + average);
        System.out.println("Percentage : " + percentage);
    }
}