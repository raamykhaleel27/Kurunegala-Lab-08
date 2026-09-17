import java.util.Scanner;

public class IT26100283Lab8Q3 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Positive Number (1/6): ");
		int num1 = input.nextInt();
		if (num1 <= 0) {
			System.out.print("Error: Please Enter ONLY Positive Numbers");
			return;
		}
		
		System.out.print("Enter a Positive Number (2/6): ");
		int num2 = input.nextInt();
		if (num2 <= 0) {
			System.out.print("Error: Please Enter ONLY Positive Numbers");
			return;
		}
		
		System.out.print("Enter a Positive Number (3/6): ");
		int num3 = input.nextInt();
		if (num3 <= 0) {
			System.out.print("Error: Please Enter ONLY Positive Numbers");
			return;
		}
		
		System.out.print("Enter a Positive Number (4/6): ");
		int num4 = input.nextInt();
		if (num4 <= 0) {
			System.out.print("Error: Please Enter ONLY Positive Numbers");
			return;
		}
		
		System.out.print("Enter a Positive Number (5/6): ");
		int num5 = input.nextInt();
		if (num5 <= 0) {
			System.out.print("Error: Please Enter ONLY Positive Numbers");
			return;
		}
		
		System.out.print("Enter a Positive Number (6/6): ");
		int num6 = input.nextInt();
		if (num6 <= 0) {
			System.out.print("Error: Please Enter ONLY Positive Numbers");
			return;
		}
		
		
		
		System.out.println(""); 
		System.out.println("Array Contents:");
        System.out.println(+num1 + " " +num2 + " " +num3 + " " +num4 + " " +num5 + " " +num6); 		
		
		int maxnum = num1;
		
		if (num2 > maxnum) {
			maxnum = num2;
		}
		if (num3 > maxnum) {
			maxnum = num3;
		}
		if (num4 > maxnum) {
			maxnum = num4;
		}
		if (num5 > maxnum) {
			maxnum = num5;
		}
		if (num6 > maxnum) {
			maxnum = num6;
		}
		
		System.out.print("The Maximum Number Entered: "+maxnum);
		
		
		input.close();
	}
}