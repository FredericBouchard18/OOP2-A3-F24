package com.champlain.oop2assignment3;

import java.util.Comparator;
import java.util.Objects;

/**
 * Comparator for sorting cards by rank first, then by suit.
 */
public class RankFirstComparator implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
        // Null checks for both cards
        Objects.requireNonNull(card1, "First card must not be null");
        Objects.requireNonNull(card2, "Second card must not be null");

        return Comparator.comparing(Card::getRank, Comparator.nullsLast(Comparator.naturalOrder()))
                .thenComparing(Card::getSuit, Comparator.nullsLast(Comparator.naturalOrder()))
                .compare(card1, card2);
    }
}
