import java.util.Scanner;

public class IT26100283Lab8Q1A {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3, num4, num5;
		int myArray[] = new int[5];
		
		System.out.println("Enter 5 numbers:");
		System.out.print("Enter number 1: ");
		num1 = input.nextInt();
		myArray[0] = num1;
		
		System.out.print("Enter number 2: ");
		num2 = input.nextInt();
		myArray[1] = num2;
		
		System.out.print("Enter number 3: ");
		num3 = input.nextInt();
		myArray[2] = num3;
		
		System.out.print("Enter number 4: ");
		num4 = input.nextInt();
		myArray[3] = num4;
		
		System.out.print("Enter number 5: ");
		num5 = input.nextInt();
		myArray[4] = num5;
		
		
		
		System.out.println("");
		System.out.println("Array in Reverse Order:");
		System.out.println(+myArray[4] +" " +myArray[3] +" " +myArray[2] +" " +myArray[1] +" " +myArray[0]);
		
		input.close();
	}
}