package atm;

import java.util.Scanner;  

public class Pins extends Bank{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter your pin: ");  
        int enterpin = sc.nextInt(); 
        Pins p=new Pins();
      if(  p.pin(enterpin))
        {
        	System.out.println("valid pin");
        }
      else
      {
    	  System.out.println("Invalid Pin");
      }
      		}
				
		}

