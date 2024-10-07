package com.champlain.oop2assignment3;

import java.util.Comparator;

/**
 * Comparator for sorting cards by rank first, then by suit.
 */
public class RankFirstComparator implements Comparator<Card> {
    /**
     * @param card1 the first object to be compared.
     * @param card2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Card card1, Card card2) {
        int rankComparison = card1.getRank().compareTo(card2.getRank());
        if (rankComparison != 0) {
            return rankComparison;
        }
        return card1.getSuit().compareTo(card2.getSuit());
    }
}
