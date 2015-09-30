package com.markjlehman.funfacts;

import android.graphics.Color;

import java.util.Random;

public class FactBook {
    private String[] mFacts = {
            "The human head weighs 8 pounds",
            "Bees and Dogs can smell fear",
            "The Human Torch was denied a bank loan"
    };

    private String[] mColors = {
            "#ffbb33",
            "#abcdef",
            "#1234be"
    };

    public String getFact() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        return mFacts[randomNumber];
    }

    public int getColor() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        return Color.parseColor(mColors[randomNumber]);
    }
}
