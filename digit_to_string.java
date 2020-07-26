package StringJavaPrograms;

import java.util.Scanner;

public class digit_to_string {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the 4 digit number");
			int num=sc.nextInt();
			
			int digit4=num%10;
			num=num/10;
			int digit3=num%10;
			num=num/10;
			int digit2=num%10;
			num=num/10;
			int digit1=num%10;
			num=num/10;
			
			switch(digit1)
			{
			
			case 1:System.out.print("One");
					break;
			case 2:System.out.print("Two");
					break;
			case 3:System.out.print("Three");
					break;
			case 4:System.out.print("Four");
					break;
			case 5:System.out.print("Five");
					break;
			case 6:System.out.print("Six");
					break;
			case 7:System.out.print("Seven");
					break;
			case 8:System.out.print("Eight");
					break;
			case 9:System.out.print("nine");
					break;
			case 0:System.out.print("Zero");
					break;
			default:System.out.print("");
					break;
					
			
			}
			switch(digit2)
			{
			
			case 1:System.out.print("One");
					break;
			case 2:System.out.print("Two");
					break;
			case 3:System.out.print("Three");
					break;
			case 4:System.out.print("Four");
					break;
			case 5:System.out.print("Five");
					break;
			case 6:System.out.print("Six");
					break;
			case 7:System.out.print("Seven");
					break;
			case 8:System.out.print("Eight");
					break;
			case 9:System.out.print("nine");
					break;
			case 0:System.out.print("Zero");
					break;
			default:System.out.print("");
					break;
					
			
			}
			switch(digit3)
			{
			
			case 1:System.out.print("One");
					break;
			case 2:System.out.print("Two");
					break;
			case 3:System.out.print("Three");
					break;
			case 4:System.out.print("Four");
					break;
			case 5:System.out.print("Five");
					break;
			case 6:System.out.print("Six");
					break;
			case 7:System.out.print("Seven");
					break;
			case 8:System.out.print("Eight");
					break;
			case 9:System.out.print("nine");
					break;
			case 0:System.out.print("Zero");
					break;
			default:System.out.print(" ");
					break;
					
			
			}
			switch(digit4)
			{
			
			case 1:System.out.print("One");
					break;
			case 2:System.out.print("Two");
					break;
			case 3:System.out.print("Three");
					break;
			case 4:System.out.print("Four");
					break;
			case 5:System.out.print("Five");
					break;
			case 6:System.out.print("Six");
					break;
			case 7:System.out.print("Seven");
					break;
			case 8:System.out.print("Eight");
					break;
			case 9:System.out.print("nine");
					break;
			case 0:System.out.print("Zero");
					break;
			default:System.out.print("");
					break;
					
			
			}
		}

	}
