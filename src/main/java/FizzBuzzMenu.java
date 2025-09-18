// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER

import java.util.Scanner;

public class FizzBuzzMenu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean menu = true;

        while(menu)
        {
            System.out.println("--- FizzBuzz Menu ---");
            System.out.println("1. Fizz (Multiples of 3");
            System.out.println("2. Buzz (Multiples of 5");
            System.out.println("3. FizzBuzz (Multiples of 3 and 5)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:  ");
            choice = sc.nextInt();
            System.out.print("\n");


            switch(choice)
            {
                case 1:
                    for(int i=1; i<=100; i++)
                    {
                        if(i%3==0)
                        {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.print("\n\n");
                    break;
                case 2:
                    for(int i=1; i<=100; i++)
                    {
                        if(i%5==0)
                        {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.print("\n\n");
                    break;
                case 3:
                    for(int i=1; i<=100; i++)
                    {
                        if(i%3==0 & i%5==0)
                        {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.print("\n\n");
                    break;
                case 4:
                    menu = false;
                    System.out.print("Goodbye!");
                    break;
            }

        }
    }
}