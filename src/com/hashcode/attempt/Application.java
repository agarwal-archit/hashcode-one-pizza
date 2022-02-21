package com.hashcode.attempt;

import com.hashcode.attempt.algo.LikedVsDisliked;
import com.hashcode.attempt.algo.NonDisliked;
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
        int sum = 0;
        for (File input : inputs) {
            if (input.isFile()) {
                Input example = readInput(input);
                AlgoInterface algoInterface = new LikedVsDisliked();
                int maxScore = 0;
                for (int i = 0; i < 1; i++) {
                    Output output = algoInterface.tryAlgo(example);
                    int score = Evaluator.evaluate(example, output);
                    if (maxScore < score) {
                        maxScore = score;
                    }
                }
                System.out.println(
                        input.getName() + " scores: " + maxScore + " #customer: " + example.getNumCustomer());
                sum += maxScore;
            }
        }
        System.out.println("Total scores: " + sum);
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
