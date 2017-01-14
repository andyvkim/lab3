/**
 * Created by andykim on 1/12/17.
 */
import java.util.Scanner;
public class productAndSum {

    public static void main (String[] args) {

            Scanner ask = new Scanner(System.in);

            System.out.println("m or a?");

            String input = ask.nextLine();}

        public void mOrP(String input) {

            if (input.equalsIgnoreCase("m")) {

                Scanner number = new Scanner(System.in);

                System.out.println("give me a number");



                int digit = number.nextInt();

                int product = 1;

                for (int i = 1; i <= digit; i++) {

                    product *= i;

                }
                System.out.println(product);


            }

            else if(input.equalsIgnoreCase("a")){
                Scanner number = new Scanner(System.in);

                System.out.println("give me a number");


                int digit = number.nextInt();

                int sum = 0;

                for (int i = 1; i <= digit; i++){

                    sum += i;

                }
                System.out.println(sum);

            }
            }
    }


