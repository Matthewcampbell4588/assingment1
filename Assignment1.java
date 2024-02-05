/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: (Give a brief description for each Class)
 * Due: 02/05/2023
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Matthew Campbell
*/
import java.util.Scanner;
public class Assignment1 {
	public static void main(String[] args) 
	{
		// create vars 
		int randNum=2;
		String userName;
		String userD;
		String duedate;
		String userMn;
		String userInput;
		Scanner keyboard = new Scanner(System.in);
		int num=0; //number of correct results 
		//ask for data 
		System.out.print("Enter your name:");
		userName= keyboard.nextLine();
		System.out.print("Enter you M-Number:");
		userMn= keyboard.nextLine();
		System.out.print("Describe yourself: ");
		userD=keyboard.nextLine();
		System.out.print("Due Date");
		duedate=keyboard.nextLine();
		
		// random number generator
		// use for loop to repeat 11 times
		for(int i=1;i<=11;i++)
		{
			if (randNum<0||randNum>6) 
			{
				randNum=0;
			}
			System.out.println("Round "+i);
			System.out.println("Please chose a color. Red, Yellow, Orange, Green, Blue, Black, White");
			userInput=keyboard.nextLine();
			if( !userInput.equalsIgnoreCase("red")&&!userInput.equalsIgnoreCase("yellow")&&!userInput.equalsIgnoreCase("blue")&&!userInput.equalsIgnoreCase("orange")&&!userInput.equalsIgnoreCase("green")&&!userInput.equalsIgnoreCase("black")&&!userInput.equalsIgnoreCase("white"))
			{
				System.out.println("You entered incorrect color.Is it Red, Yellow, Orange, Green, Blue, Black, White");
				randNum--;
				System.out.println("Please try again");
				userInput=keyboard.nextLine();
			}
			if(userInput.equalsIgnoreCase("red")&&randNum==0)
			{
				System.out.println("I was thinking Red");
				randNum++;
				num++;
			}
			else if(userInput.equalsIgnoreCase("yellow")&&randNum==1)
			{
				System.out.println("I was thinking yellow");
				randNum++;
				num++;
			}
			else if(userInput.equalsIgnoreCase("orange")&&randNum==2)
			{
				System.out.println("I was thinking orange");
				randNum++;
				num++;
			}
			else if(userInput.equalsIgnoreCase("green")&&randNum==3)
			{
				System.out.println("I was thinking green");
				randNum++;
				num++;
			}
			else if(userInput.equalsIgnoreCase("blue")&&randNum==4)
			{
				System.out.println("I was thinking blue");
				randNum++;
				num++;
			}
			else if(userInput.equalsIgnoreCase("black")&&randNum==5)
			{
				System.out.println("I was thinking black");
				randNum++;
				num++;
			}
			else if(userInput.equalsIgnoreCase("white")&&randNum==6)
			{
				System.out.println("I was thinking white");
				randNum++;
				num++;
			}
			else
			{
				switch(randNum) 
				{
				 	case 0:
				 		System.out.println("I was thinking red");
						randNum++;
						break;
				 	case 1:
				 		System.out.println("I was thinking yellow");
						randNum--;
						break;
				 	case 2:
				 		System.out.println("I was thinking orange");
				 		randNum++;
				 		break;
				 	case 3:
				 		System.out.println("I was thinking green");
				 		randNum--;
				 		break;
				 		
				 	case 4:
				 		System.out.println("I was thinking blue");
				 		randNum++;
				 		break;
				 		
				 	case 5:
				 		System.out.println("I was thinking black");
				 		randNum--;
				 		break;
				 		
				 	case 6:
				 		System.out.println("I was thinking white");
				 		randNum--;
						break;
					default:
						break;
							
				}
				
			}
			
		}
		System.out.println("Game Over");
		System.out.println("You guessed "+num+"out of 11 correctly");
		System.out.println("Student Name : " +userName);
		System.out.println("User Description: "+userD);
		System.out.println(duedate);
			//use if statement to check if guess was right 
	}
}
