import java.util.Scanner;
public class LetterOfEmployment2 {
  public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter first name");
    String firstName = input.next();
    System.out.print("Please enter last name");
    String lastName = input.next(); 
    input.nextLine(); //clear buffer
     System.out.print("Please enter job title");
    String jobTitle = input.nextLine();
    double salary = 54590.50;
    
     System.out.print("Dear Sir or Madam:");
     System.out.print("\n\nThis letter is to confirm that " + firstName  + " " + lastName + " is presently employed by ABC Company, in the ");
     System.out.print("position of " + jobTitle + " on a full time basis. " + firstName + " " + lastName + " commenced employment with ");
     System.out.printf("company on 01/01/2015 and is presently paid $%.2f based salary per year.",salary);
     System.out.print("\n\nABC company is located at 2708 N Glebe Rd, Arlington, VA, 22207.");
     System.out.print("\n\nIf you require any addtional information about ABC company and/or Mr." + lastName + ", please do not ");
     System.out.print("hesitate to contact us.\n\nSincerely,\n\n\n");
  }
}

