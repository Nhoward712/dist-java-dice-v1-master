package edu.wctc.dice.impl;

import edu.wctc.dice.iface.WhatTypeOfDice;

import java.util.Random;

public class TwelveSidedDice implements WhatTypeOfDice {
    @Override
    public int rollDie() {
        Random random = new Random();
        return random.nextInt(12) + 1;
    }
}
