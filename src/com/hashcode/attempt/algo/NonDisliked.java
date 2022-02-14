package com.hashcode.attempt.algo;

import com.hashcode.attempt.AlgoInterface;
import com.hashcode.attempt.Utility.FrequencyHelper;
import com.hashcode.attempt.models.FrequencyDistribution;
import com.hashcode.attempt.system.Input;
import com.hashcode.attempt.system.Output;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Archit Agarwal on 14/02/22
 */
public class NonDisliked implements AlgoInterface {

    @Override
    public Output tryAlgo(final Input input) {

        Output output = new Output();
        FrequencyDistribution freqDistribution = FrequencyHelper.getFreqDistribution(input);

        output.getToppings().addAll(freqDistribution.getAllLikes());
        List<Map.Entry<String, Integer>> dislikeSortedList = freqDistribution.getDislikeDistribution().entrySet().stream().sorted(
                (o1, o2) -> o2.getValue().compareTo(o1.getValue())).collect(Collectors.toList());

        for (int i = 0, sum = 0; sum < dislikeSortedList.size() / 3; i++) {
            output.getToppings().remove(dislikeSortedList.get(i).getKey());
            sum += dislikeSortedList.get(i).getValue();
        }

        return output;
    }
}
