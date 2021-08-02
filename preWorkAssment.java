import java.util.Scanner;


class Main{

//Palindrome Method Defination

public void isPalindromeNumber() 
{

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Number to check Palindrome Number");
		int num=sc.nextInt();
		int reverse=0;
		int palindrome=num;
		while(num!=0)
		{
			
			int remainder=num % 10;
			reverse= reverse * 10 + remainder;
			num=num/10;
			
		}

		if(palindrome==reverse)
		
			System.out.println("Given Number is palindrom Number");
		
		else 
			System.out.println("Given Number is not palindrom Number");

	}

	//Star Pattern Method Defination

	public void printStarPattern()
	{
	
		Scanner sc=new Scanner (System.in);

		System.out.println("Please Enter Number to Print Star Pattern");

		int num=sc.nextInt();

		for(int i=num-1; i>=0; i--)  
             {  
                     for(int j=0; j<=i; j++)  
                                   
                         System.out.print("*");  
                     System.out.println(); 
                         
             }  
    } 

    //Prime Number Method Defination

    public void isPrimeNumber(){
	
		boolean isPrime=false;

		Scanner sc=new Scanner(System.in);

		System.out.println("Please Enter Number");

		int num=sc.nextInt();

		
		for(int i=2;i<=num/2;i++)
		{

			
			if(num % i ==0)
			{

				isPrime=true;
				break;
			}

			
		}
		if (!isPrime)

				System.out.println(num + "- It is a Prime Number");
			else

				System.out.println(num + "- It is not a Prime Number");
	}

	//Fabonici series printing Method Defination


	public void printFaboniciSeries(){

		Scanner sc= new Scanner(System.in);

		System.out.println("Please Enter Number for Fabonici Serise");

		int num1=0;
		int num2=1;
		int counter=0;
		int n=sc.nextInt();

		while(counter<n)
		{
			System.out.println(num1+" ");

			int num3=num2+num1;
			num1=num2;
			num2=num3;

			counter++;


		}



	}
}
	


public class preWorkAssment{

	//PSVM
	
	public static void main(String[] args){

		//Creating Scanner object for user inputs

		Scanner sc1= new Scanner(System.in);

		//Creating object of main method

		Main objMain=new Main();

		int choice;

		do{

			//Below list will execute after each selection untill choice is 0 


			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

			+ "2. Print Pattern for a given no.\n" + "3. Check whether the no. is a  prime number.\n"

			+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc1.nextInt();
				
			switch(choice)
			{

				case 0:

				{
					System.exit(1);
				}
				break;

				case 1:
				{
					//Calling method to perform action

					objMain.isPalindromeNumber();
				}

					break;
				case 2:
				{
					//Calling method to perform action

					objMain.printStarPattern();
				}
				break;

				case 3:
				{
					//Calling method to perform action

					objMain.isPrimeNumber();
				}
				break;

				case 4:
				{
					//Calling method to perform action

					objMain.printFaboniciSeries();
				}

				break;

			    default:

				System.out.println("Invalid choice. Enter a valid no.\n");
				
			
			}

				
		}
		       	while(choice!=0);
				System.out.println("Exited Successfully!!!");
		

       }
}
