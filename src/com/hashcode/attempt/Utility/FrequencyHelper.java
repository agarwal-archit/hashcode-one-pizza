package com.hashcode.attempt.Utility;

import com.hashcode.attempt.models.FrequencyDistribution;
import com.hashcode.attempt.system.Customer;
import com.hashcode.attempt.system.Input;

/**
 * @author Archit Agarwal on 13/02/22
 */
public class FrequencyHelper {

    public static FrequencyDistribution getFreqDistribution(Input input) {

        FrequencyDistribution frequencyDistribution = new FrequencyDistribution();

        for (Customer customer : input.getCustomers()) {
            for (String likes : customer.getLikes()) {
                frequencyDistribution.getAllLikes().add(likes);
                frequencyDistribution.getAllToppings().add(likes);
                frequencyDistribution.getLikeDistribution().put(likes,
                                                                frequencyDistribution.getLikeDistribution().getOrDefault(likes, 0) + 1);
            }

            for (String dislikes : customer.getDislikes()) {
                frequencyDistribution.getAllDislikes().add(dislikes);
                frequencyDistribution.getAllToppings().add(dislikes);
                frequencyDistribution.getDislikeDistribution().put(dislikes,
                                                                   frequencyDistribution.getDislikeDistribution().getOrDefault(dislikes,
                                                                                                                               0) + 1);
            }
        }
        return frequencyDistribution;
    }

}
