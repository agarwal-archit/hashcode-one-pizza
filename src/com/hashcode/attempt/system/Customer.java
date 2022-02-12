package com.hashcode.attempt.system;

import java.util.List;

/**
 * @author Archit Agarwal on 13/02/22
 */
public class Customer {
    private List<String> likes;
    private List<String> dislikes;

    public List<String> getLikes() {

        return likes;
    }

    public void setLikes(final List<String> likes) {

        this.likes = likes;
    }

    public List<String> getDislikes() {

        return dislikes;
    }

    public void setDislikes(final List<String> dislikes) {

        this.dislikes = dislikes;
    }
}
