package com.hashcode.attempt.Utility;

import com.hashcode.attempt.models.AverageModel;
import com.hashcode.attempt.system.Customer;
import com.hashcode.attempt.system.Input;

/**
 * @author Archit Agarwal on 13/02/22
 */
public class AverageHelper {

    public static AverageModel getAvg(Input input) {

        AverageModel averageModel = new AverageModel();

        for (Customer customer : input.getCustomers()) {
            for (String likes : customer.getLikes()) {
                averageModel.getAllLikes().add(likes);
                averageModel.getAllToppings().add(likes);
            }
            averageModel.incLikes(customer.getLikes().size());

            for (String dislikes : customer.getDislikes()) {
                averageModel.getAllDislikes().add(dislikes);
                averageModel.getAllToppings().add(dislikes);
            }
            averageModel.incDislike(customer.getDislikes().size());
        }
        averageModel.setAvgLike(averageModel.getAvgLike() / input.getNumCustomer()+1);
        averageModel.setAvgDislike(averageModel.getAvgDislike() / input.getNumCustomer()+1);
        return averageModel;
    }
}
