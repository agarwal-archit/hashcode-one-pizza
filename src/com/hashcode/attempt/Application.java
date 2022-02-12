package com.hashcode.attempt;

import com.hashcode.attempt.system.Customer;
import com.hashcode.attempt.system.Evaluator;
import com.hashcode.attempt.system.Input;
import com.hashcode.attempt.system.Output;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Archit Agarwal on 13/02/22
 */
public class Application {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Welcome to hashcode - One Pizza!!");
        System.out.println("welcome to google hashcode");

        File file = new File("src/com/hashcode/attempt/inputs");
        File[] inputs = file.listFiles();
        for (File input : inputs) {
            if (input.isFile()) {
                Input example = readInput(input);

                Output output = new Output();
                System.out.println(input.getName() + " scores: " + Evaluator.evaluate(example, output));
            }
        }
    }


    private static Input readInput(File file) throws FileNotFoundException {

        Input input = new Input();
        Scanner scanner = new Scanner(file);
        input.setNumCustomer(scanner.nextInt());
        input.setCustomers(new ArrayList<>(input.getNumCustomer()));
        for (int i = 0; i < input.getNumCustomer(); i++) {
            Customer customer = new Customer();
            int nLikes = scanner.nextInt();
            customer.setLikes(new ArrayList<>(nLikes));
            for (int j = 0; j < nLikes; j++) {
                customer.getLikes().add(scanner.next());
            }
            int nDislikes = scanner.nextInt();
            customer.setDislikes(new ArrayList<>(nDislikes));
            for (int j = 0; j < nDislikes; j++) {
                customer.getDislikes().add(scanner.next());
            }
            input.getCustomers().add(customer);
        }
        return input;
    }

}
