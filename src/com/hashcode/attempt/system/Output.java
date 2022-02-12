package com.hashcode.attempt.system;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Archit Agarwal on 13/02/22
 */
public class Output {

    private int num;
    private Set<String> toppings = new HashSet<>();

    public int getNum() {

        return num;
    }

    public void setNum(final int num) {

        this.num = num;
    }

    public Set<String> getToppings() {

        return toppings;
    }

    public void setToppings(final Set<String> toppings) {

        this.toppings = toppings;
    }
}
