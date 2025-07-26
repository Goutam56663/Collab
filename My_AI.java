// This project is made in such a way so that the user can perform things through menus

// This project is made to handle user provided inputs

import java.util.*;

public class My_AI
{
    void menu()
    {
       Scanner sc = new Scanner (System.in);
       
        
      System.out.println("Welcome to our program & thanks for choosing us ! ");
      
      System.out.println("  ");
      
      System.out.println("Please enter your username : - ");
      
      String username = sc.nextLine();
      
      System.out.println("  ");
      
      System.out.println("Welcome " + username);
      
      System.out.println("  ");
      System.out.println("  ");
      
      
      System.out.println(" What function do you want to do ?  ");
      
      System.out.println("  ");
      
      System.out.println("1. Basic Arithmatic operations ");
      
      System.out.println("2. Complex Mathematical operations  ");
      
      int option_menuI = sc.nextInt();
      
      
      
    }

}