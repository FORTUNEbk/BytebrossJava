package CardSorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    private int handValueSum() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand otherHand) {
        return Integer.compare(this.handValueSum(), otherHand.handValueSum());
    }
}

