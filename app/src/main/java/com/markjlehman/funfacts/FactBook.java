package com.markjlehman.funfacts;

import java.util.Random;

public class FactBook {
    public String getFact() {
        Random randomGenerator = new Random();
        String[] facts = {
                "The human head weighs 8 pounds",
                "Bees and Dogs can smell fear",
                "The Human Torch was denied a bank loan"
        };
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}
