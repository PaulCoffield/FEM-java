package decision_structure;

import java.util.Scanner;
public class QuotaCalculator {

    public static void main(String[] args) {

        int quota = 10;

        System.out.println("Enter the number of sales made");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if(sales >= quota){
            System.out.println("Congrats! You've met your quota");
        }else{
            int salesShort = quota - sales;
            System.out.println("You did not make your quota." +
                    "You were " + salesShort + " sales short.");
        }

        /* My attempt before watching the video

        if(sales > quota){
            System.out.println("Excellent work on hitting over your quota!");
        }else if(sales < quota){
            int deficit = quota - sales;
            System.out.println("Uh oh, you were short by " + deficit + " sales this week.");
        }
         */

        scanner.close();

    }
}
