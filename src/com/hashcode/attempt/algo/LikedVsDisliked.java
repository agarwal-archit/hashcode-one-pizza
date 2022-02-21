package com.hashcode.attempt.algo;

import com.hashcode.attempt.AlgoInterface;
import com.hashcode.attempt.Utility.FrequencyHelper;
import com.hashcode.attempt.models.FrequencyDistribution;
import com.hashcode.attempt.system.Input;
import com.hashcode.attempt.system.Output;

import java.util.stream.Collectors;

public class LikedVsDisliked implements AlgoInterface {

    @Override
    public Output tryAlgo(Input input) {
        Output output = new Output();
        FrequencyDistribution frequencyDistribution = FrequencyHelper.getFreqDistribution(input);

        output.setToppings(frequencyDistribution.getAllToppings().stream().filter(t -> {
            Integer likeCount = frequencyDistribution.getLikeDistribution().getOrDefault(t, 0);
            Integer dislikeCount = frequencyDistribution.getDislikeDistribution().getOrDefault(t, 0);
            return likeCount > dislikeCount;
        }).collect(Collectors.toSet()));

        return output;
    }
}
