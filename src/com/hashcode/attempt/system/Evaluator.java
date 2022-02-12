package com.hashcode.attempt.system;

/**
 * @author Archit Agarwal on 13/02/22
 */
public class Evaluator {

    public static int evaluate(Input input,
                               Output output) {

        int score = 0;
        for (Customer customer : input.getCustomers()) {
            boolean likes = output.getToppings().containsAll(customer.getLikes());
            boolean dislikes = true;
            if (likes) {
                for (String dislike : customer.getDislikes()) {
                    if (output.getToppings().contains(dislike)) {
                        dislikes = false;
                        break;
                    }
                }
            }
            if (dislikes && likes) {
                score++;
            }
        }
        return score;
    }

}
