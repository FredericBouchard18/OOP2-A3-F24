package com.champlain.oop2assignment3;

public class CalculateAces implements ScoringStrategie {
    @Override
    public int calculateScore(CardCollection pCards ){
        int num = 0 ;
        for (Card card: pCards) {
            if (card.getRank() == Rank.ACE){
                num ++ ;
            }
        }
        return num;
    }


}
