package com.champlain.oop2assignment3;

import java.util.Comparator;

/**
 * Comparator for sorting cards by suit first, then by rank.
 */
public class SuitFirstComparator implements Comparator<Card> {
    /**
     * @param card1 the first object to be compared.
     * @param card2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Card card1, Card card2) {
        int suitComparison = card1.getSuit().compareTo(card2.getSuit());
        if (suitComparison != 0) {
            return suitComparison;
        }
        return card1.getRank().compareTo(card2.getRank());
    }
}