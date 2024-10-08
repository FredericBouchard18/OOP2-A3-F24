package com.champlain.oop2assignment3;

public class CalculateSimple implements ScoringStrategie {
    @Override
    public int calculateScore(CardCollection pCards) {
        return pCards.size();
    }
}