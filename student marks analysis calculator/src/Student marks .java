import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter mark2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter mark3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        if(avg >= 90)
            System.out.println("Grade: A");
        else if(avg >= 75)
            System.out.println("Grade: B");
        else if(avg >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }
}