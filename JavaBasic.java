import java.util.Scanner;

public class JavaBasic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Correct input stream
        System.out.print("Enter the radius of the circle: ");
        float r = sc.nextFloat(); // Correct method
        float area = 3.14f * r * r; // Corrected area calculation
        System.out.println("Area of the circle = " + area);
        sc.close(); // Always close the scanner
    }
}
