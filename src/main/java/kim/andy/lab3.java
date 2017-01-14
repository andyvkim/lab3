package kim.andy;

import java.util.Scanner;

/**
 * Created by andykim on 1/13/17.
 */
public class lab3 {


    public void main(String[] args) {

        Scanner ask = new Scanner(System.in);

        System.out.println("m or a?");

        String input = ask.nextLine();
    }

    public int addNumbers(int digit) {


        int sum = 0;

        for (int i = 1; i <= digit; i++) {

            sum += i;

        }
        System.out.println(sum);
        return sum;

    }

    public int multiplyNumbers(int digit) {

        int product = 1;

        for (int i = 1; i <= digit; i++) {

            product *= i;

        }
        System.out.println(product);
        return product;

    }

    public int multiply(String input, int digit) {

        if (input.equalsIgnoreCase("m")) {

            Scanner number = new Scanner(System.in);

            System.out.println("give me a number");





        }
        return multiplyNumbers(digit);

    }

    public int add(String input, int digit) {
        if (input.equalsIgnoreCase("a")) {
            Scanner number = new Scanner(System.in);

            System.out.println("give me a number");




        }
        return addNumbers(digit);
    }


}





