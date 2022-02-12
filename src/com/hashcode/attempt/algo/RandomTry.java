package com.hashcode.attempt.algo;

import com.hashcode.attempt.AlgoInterface;
import com.hashcode.attempt.Utility.AverageHelper;
import com.hashcode.attempt.models.AverageModel;
import com.hashcode.attempt.system.Input;
import com.hashcode.attempt.system.Output;

import java.util.Random;

/**
 * @author Archit Agarwal on 13/02/22
 */
public class RandomTry implements AlgoInterface {

    @Override
    public Output tryAlgo(final Input input) {

        Output output = new Output();
        AverageModel averageModel = AverageHelper.getAvg(input);

        Object[] likesList = averageModel.getAllLikes().toArray();
        Random random = new Random();

        while (output.getToppings().size() != averageModel.getAvgLike()) {
            output.getToppings().add(likesList[Math.abs(random.nextInt()) % likesList.length].toString());
        }
//        System.out.println("average size: "+ averageModel.getAvgLike());
        return output;
    }
}
