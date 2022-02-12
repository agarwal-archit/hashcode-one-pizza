package com.hashcode.attempt.models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Archit Agarwal on 13/02/22
 */
public class FrequencyDistribution {

    private Set<String> allToppings;
    private Set<String> allLikes;
    private Set<String> allDislikes;
    private Map<String, Integer> likeDistribution;
    private Map<String, Integer> dislikeDistribution;

    public FrequencyDistribution() {
        this.allToppings = new HashSet<>();
        this.allLikes = new HashSet<>();
        this.allDislikes = new HashSet<>();
        this.likeDistribution = new HashMap<>();
        this.dislikeDistribution = new HashMap<>();
    }

    public Set<String> getAllToppings() {

        return allToppings;
    }

    public void setAllToppings(final Set<String> allToppings) {

        this.allToppings = allToppings;
    }

    public Set<String> getAllLikes() {

        return allLikes;
    }

    public void setAllLikes(final Set<String> allLikes) {

        this.allLikes = allLikes;
    }

    public Set<String> getAllDislikes() {

        return allDislikes;
    }

    public void setAllDislikes(final Set<String> allDislikes) {

        this.allDislikes = allDislikes;
    }

    public Map<String, Integer> getLikeDistribution() {

        return likeDistribution;
    }

    public void setLikeDistribution(final Map<String, Integer> likeDistribution) {

        this.likeDistribution = likeDistribution;
    }

    public Map<String, Integer> getDislikeDistribution() {

        return dislikeDistribution;
    }

    public void setDislikeDistribution(final Map<String, Integer> dislikeDistribution) {

        this.dislikeDistribution = dislikeDistribution;
    }
}
