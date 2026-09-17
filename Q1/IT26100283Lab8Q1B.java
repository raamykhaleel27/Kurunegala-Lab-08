import java.util.Scanner;

public class IT26100283Lab8Q1B {
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
	
	    int evenArray[] = new int[5];
	
		int i = 0;
		if (num1 % 2 == 0) {
			evenArray[i] = num1;
			i = i + 1;
		}
		if (num2 % 2 == 0) {
			evenArray[i] = num2;
			i = i + 1;
		}
		if (num3 % 2 == 0) {
			evenArray[i] = num3;
			i = i + 1;
		}
		if (num4 % 2 == 0) {
			evenArray[i] = num4;
			i = i + 1;
		}
		if (num5 % 2 == 0) {
			evenArray[i] = num5;
			i = i + 1;
			
		}
		System.out.println("");
		System.out.println("myArray Contents:");
		System.out.println(+myArray[0] +" " +myArray[1] +" " +myArray[2] +" " +myArray[3] +" " +myArray[4]);
		System.out.println("");
		System.out.println("evenArray Contents:");
		System.out.println(+evenArray[0] +" " +evenArray[1] +" " +evenArray[2] +" " +evenArray[3] +" " +evenArray[4]);
		
		input.close();
	}
}
