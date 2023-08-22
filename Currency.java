package my_java_project;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true)
		{
	    System.out.println("");
		System.out.println("Choose From Following Options : ");
		System.out.println("1_ USD to € ");
		System.out.println("2_ € to USD ");
		System.out.println("3_ £ to USD ");
		System.out.println("4_ Exit");
		System.out.println("");
        System.out.println("Enter Your Choice");
        int sh = sc.nextInt();
        System.out.println("");
        switch(sh)
        {
        case 1:
        {
        	System.out.println("Enter the number of USD : ");
        	int usd = sc.nextInt();
        	if(usd >= 0)
        	{
        		System.out.println(usd+ " USD is " + usd*0.908+ "€ ");
        	}
        	else
        	{
        		System.out.println("Please enter the positive number");
        	}
        }
        break;
        case 2:
        {
        	System.out.println("Enter the number of €  : ");
        	int euro = sc.nextInt();
        	if(euro >= 0)
        	{
        		System.out.println(euro+ " €  is " + euro*1.101+ " USD");
        	}
        	else
        	{
        		System.out.println("Please enter the positive number");
        	}
        }
        break;
        case 3:
        {
        	System.out.println("Enter the number of £ : ");
        	int pound = sc.nextInt();
        	if(pound >= 0)
        	{
        		System.out.println(pound+ " £ is " + pound*1.28+ " USD ");
        	}
        	else
        	{
        		System.out.println("Please enter the positive number");
        	}
        }
        break;
        case 4:
        	System.out.println("Thank you!!!");
        	System.exit(0);
        }

		}
	}

}
