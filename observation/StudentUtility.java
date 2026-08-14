import java.util.Scanner;

public class StudentUtility {

    static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int findMaximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nSTUDENT UTILITY PROGRAM");
            System.out.println("1. Display Student Information");
            System.out.println("2. Check Even or Odd");
            System.out.println("3. Find Largest of Three Numbers");
            System.out.println("4. Display Grade");
            System.out.println("5. Display Day of the Week");
            System.out.println("6. Print Multiplication Table");
            System.out.println("7. Display Numbers from 1 to N");
            System.out.println("8. Sum of First N Natural Numbers");
            System.out.println("9. Fibonacci Series");
            System.out.println("10. Factorial");
            System.out.println("11. Check Prime Number");
            System.out.println("12. Maximum of Two Numbers");
            System.out.println("13. Area of a Circle");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();

                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter roll number: ");
                    int rollNumber = sc.nextInt();

                    System.out.print("Enter marks in Subject 1: ");
                    double mark1 = sc.nextDouble();

                    System.out.print("Enter marks in Subject 2: ");
                    double mark2 = sc.nextDouble();

                    System.out.print("Enter marks in Subject 3: ");
                    double mark3 = sc.nextDouble();

                    double total = mark1 + mark2 + mark3;
                    double percentage = total / 3;

                    System.out.println("\nStudent Details");
                    System.out.println("Name: " + name);
                    System.out.println("Roll Number: " + rollNumber);
                    System.out.println("Total Marks: " + total);
                    System.out.println("Percentage: " + percentage + "%");

                    if (percentage >= 40) {
                        System.out.println("Result: Pass");
                    } else {
                        System.out.println("Result: Fail");
                    }

                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int number = sc.nextInt();

                    if (number % 2 == 0) {
                        System.out.println("Even Number");
                    } else {
                        System.out.println("Odd Number");
                    }

                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();

                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();

                    System.out.print("Enter third number: ");
                    int c = sc.nextInt();

                    if (a >= b && a >= c) {
                        System.out.println("Largest Number: " + a);
                    } else if (b >= a && b >= c) {
                        System.out.println("Largest Number: " + b);
                    } else {
                        System.out.println("Largest Number: " + c);
                    }

                    break;

                case 4:
                    System.out.print("Enter percentage: ");
                    double percentageValue = sc.nextDouble();

                    if (percentageValue >= 90) {
                        System.out.println("Grade: A+");
                    } else if (percentageValue >= 80) {
                        System.out.println("Grade: A");
                    } else if (percentageValue >= 70) {
                        System.out.println("Grade: B");
                    } else if (percentageValue >= 60) {
                        System.out.println("Grade: C");
                    } else if (percentageValue >= 40) {
                        System.out.println("Grade: D");
                    } else {
                        System.out.println("Grade: F");
                    }

                    break;

                case 5:
                    System.out.print("Enter a number from 1 to 7: ");
                    int day = sc.nextInt();

                    switch (day) {
                        case 1:
                            System.out.println("Monday");
                            break;

                        case 2:
                            System.out.println("Tuesday");
                            break;

                        case 3:
                            System.out.println("Wednesday");
                            break;

                        case 4:
                            System.out.println("Thursday");
                            break;

                        case 5:
                            System.out.println("Friday");
                            break;

                        case 6:
                            System.out.println("Saturday");
                            break;

                        case 7:
                            System.out.println("Sunday");
                            break;

                        default:
                            System.out.println("Invalid Day");
                    }

                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    int tableNumber = sc.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(
                            tableNumber + " x " + i + " = "
                            + tableNumber * i
                        );
                    }

                    break;

                case 7:
                    System.out.print("Enter N: ");
                    int n = sc.nextInt();

                    int i = 1;

                    while (i <= n) {
                        System.out.print(i + " ");
                        i++;
                    }

                    System.out.println();

                    break;

                case 8:
                    System.out.print("Enter N: ");
                    int limit = sc.nextInt();

                    int sum = 0;

                    for (int j = 1; j <= limit; j++) {
                        sum = sum + j;
                    }

                    System.out.println("Sum = " + sum);

                    break;

                case 9:
                    System.out.print("Enter number of terms: ");
                    int terms = sc.nextInt();

                    int first = 0;
                    int second = 1;

                    for (int j = 1; j <= terms; j++) {
                        System.out.print(first + " ");

                        int next = first + second;
                        first = second;
                        second = next;
                    }

                    System.out.println();

                    break;

                case 10:
                    System.out.print("Enter a number: ");
                    int factorialNumber = sc.nextInt();

                    System.out.println(
                        "Factorial = "
                        + factorial(factorialNumber)
                    );

                    break;

                case 11:
                    System.out.print("Enter a number: ");
                    int primeNumber = sc.nextInt();

                    if (isPrime(primeNumber)) {
                        System.out.println("Prime Number");
                    } else {
                        System.out.println("Not a Prime Number");
                    }

                    break;

                case 12:
                    System.out.print("Enter first number: ");
                    int firstNumber = sc.nextInt();

                    System.out.print("Enter second number: ");
                    int secondNumber = sc.nextInt();

                    System.out.println(
                        "Maximum = "
                        + findMaximum(
                            firstNumber,
                            secondNumber
                        )
                    );

                    break;

                case 13:
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();

                    System.out.println(
                        "Area = "
                        + calculateCircleArea(radius)
                    );

                    break;

                case 0:
                    System.out.println("Program Terminated");

                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);

        sc.close();
    }
}