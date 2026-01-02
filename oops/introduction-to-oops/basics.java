// class basics {
//   public static void main (String[] args) {
//     System.out.println("Hello, welcome to Object Oriented Programming!");
//   }
// }

// input ouptput

import java.util.Scanner;
class basics {
   public static void main (String [] args ) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String name = sc.nextLine();
      System.out.println("Hello, " + name + "! Welcome to Object Oriented Programming!");
      sc.close();
   }
}

