import java.util.Scanner;
public class TollFee3{
  
  public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    
     //Inputs
    System.out.print("Toll Fee Cashier");
    System.out.print("\nEnter your first name");
    String firstName = input.next();
    System.out.print("\nEnter your last name");
    String lastName = input.next();
    
    //Do...while loop
    int choice = 0;
    do{
         System.out.println("\nEnter type of vehicle: \n1.Two Axels \n2.Three or more Axels  \n3.A Motorcycle");
         int vehicle = input.nextInt();
    
         //Brain / Logic:
         double fee = 0;
         
         if(vehicle == 1){
           fee = 3.00;
         }else if(vehicle == 2){
           fee = 4.00;
         }else if(vehicle == 3){
           fee = 1.00;
         }
         
         System.out.printf("\nToll fee: $%.2f",fee);
         System.out.print("\nEnter 1 to Continue: 0 to Exit");
         choice = input.nextInt();
       
       }while(choice==1);
       
      
       
        
    
    
    //Outputs:
   
    System.out.print("\nFee collected by");
    System.out.printf("\nCashier name:%s %s",firstName,lastName);
  
    
  }
  
}
