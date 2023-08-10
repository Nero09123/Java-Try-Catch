package forTest2;
import java.util.Scanner;


public class TryCatch {


    public static void main(String[] args) {

        System.out.println("Date: 8/10/2023");
        System.out.println("Basic number exception \n");
        
        Scanner input = new Scanner(System.in);
        boolean isDone = false;
        int num1 = 0, num2 = 0, sum = 0;
        
        while(!isDone){
            try{
                System.out.print("Input a number: ");
                     num1 = input.nextInt();

                System.out.print("Input a number: ");
                     num2 = input.nextInt();

            }catch(Exception e){
                System.out.println("Please input an integer number!\n");
                isDone = false;
                input.nextLine();

            }
            if(num1 > 0 && num2 > 0){
                do{
                    sum = num1 + num2;
                    
                    System.out.printf("The result: %s\n", sum);
                    isDone = true;
                }while(!isDone);
                
            }else{
                isDone = false;
            }
            
        }

        input.close();
            
    }
    
}

