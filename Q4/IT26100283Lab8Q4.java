import java.util.Scanner;

public class IT26100283Lab8Q4 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int studentsArray[] = new int[8];
		
		System.out.print( "Enter Student ID for Student 1: ");
		int num1 = input.nextInt();
        if (num1 <= 0) {
			System.out.print("Error: Please Enter ONLY Positive Numbers");
			return;
        }
		studentsArray[0] = num1;
	
        System.out.print( "Enter Student ID for Student 2: ");
		int num2 = input.nextInt();
        if (num2 <= 0) {
	 		System.out.print("Error: Please Enter ONLY Positive Numbers");
			return;
        }
		studentsArray[1] = num2;
	
        System.out.print( "Enter Student ID for Student 3: ");
		int num3 = input.nextInt();
        if (num3 <= 0) {
			System.out.print("Error: Please Enter ONLY Positive Numbers");
			return;
        }
		studentsArray[2] = num3;
	
        System.out.print( "Enter Student ID for Student 4: ");
		int num4 = input.nextInt();
        if (num4 <= 0) {
			System.out.print("Error: Please Enter ONLY Positive Numbers");
			return;
        }
		studentsArray[3] = num4;
	
        System.out.print( "Enter Student ID for Student 5: ");
		int num5 = input.nextInt();
        if (num5 <= 0) {
			System.out.print("Error: Please Enter ONLY Positive Numbers");
			return;
        }
		studentsArray[4] = num5;
	
        System.out.print( "Enter Student ID for Student 6: ");
		int num6 = input.nextInt();
        if (num6 <= 0) {
			System.out.print("Error: Please Enter ONLY Positive Numbers");
	    	return;
        }
		studentsArray[5] = num6;
	
        System.out.print( "Enter Student ID for Student 7: ");
		int num7 = input.nextInt();
        if (num7 <= 0) {
			System.out.print("Error: Please Enter ONLY Positive Numbers");
			return;
        }
		studentsArray[6] = num7;
	
        System.out.print( "Enter Student ID for Student 8: ");
		int num8 = input.nextInt();
        if (num8 <= 0) {
			System.out.print("Error: Please Enter ONLY Positive Numbers");
		    return;
        }
		studentsArray[7] = num8;
		
		System.out.println("");
		
		System.out.print( "Enter a Student ID to Search: ");
		int searchid = input.nextInt();
		
		System.out.println("");
		
		if (searchid == num1 || searchid == num2 || searchid == num3 || searchid == num4 || searchid == num5 || searchid == num6 || searchid == num7 || searchid == num8) {
			System.out.println( "Student is Available");
		}
		else {
			System.out.println( "Student is Not Available");
		}
			
	}
}






    