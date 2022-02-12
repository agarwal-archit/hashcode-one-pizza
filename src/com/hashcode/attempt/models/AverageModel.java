package com.hashcode.attempt.models;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Archit Agarwal on 13/02/22
 */
public class AverageModel {

    private Set<String> allToppings;
    private Set<String> allLikes;
    private Set<String> allDislikes;
    private Integer avgLike;
    private Integer avgDislike;

    public AverageModel() {

        this.allToppings = new HashSet<>();
        this.allLikes = new HashSet<>();
        this.allDislikes = new HashSet<>();
        this.avgLike = 0;
        this.avgDislike = 0;
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

    public Integer getAvgLike() {

        return avgLike;
    }

    public void incLikes(Integer inc) {

        avgLike += inc;
    }

    public void incDislike(Integer inc) {

        avgDislike += inc;
    }

    public void setAvgLike(final Integer avgLike) {

        this.avgLike = avgLike;
    }

    public Integer getAvgDislike() {

        return avgDislike;
    }

    public void setAvgDislike(final Integer avgDislike) {

        this.avgDislike = avgDislike;
    }
}
