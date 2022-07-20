import java.io.*;
import java.util.*;
public class Guess_num {
	public static void guessnumber() {
		Scanner input = new Scanner(System.in);
		int num=1+(int)(100*Math.random());
		int k=6;
		int i,guess,read;
		System.out.println("Welcome to the game-GUESS NUMBER");
		System.out.println("System will generate a number betweeen 1 and 100."+"Guess the number within 6 trails");
		for(i=0;i<6;i++) {
			System.out.println("Guess the number:");
			guess=input.nextInt();
			if(guess>100 || guess <0) {
				System.out.println("Guess the number between 1 to 100");
			}
			else if(num==guess) {
				System.out.println("Congrtulations!...You have guessed the number");
				break;
			}
			else if(num<guess && i!=k-1) {
				System.out.println("Oops! number is less than the"+guess);
			}
			else if(num>guess && i!=k-1) {
				System.out.println("Oops! number is greater than the"+guess);
			}
		}
		if(i==k) {
			System.out.println("Sorry! No.of attempts finished to guess the number");
			System.out.println("The number is"+num);
			System.out.println("Do you want to play the game again..??");
			System.out.println("Enter 1 if YES"+" "+"else enter 0");
			read=input.nextInt();
			if(read==1) {
				guessnumber();
			}
			else {
				System.out.println("Thank you..");
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guessnumber();
	}

}


