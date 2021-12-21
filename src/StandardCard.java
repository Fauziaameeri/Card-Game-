import java.util.ArrayList;

public class StandardCard implements Comparable<StandardCard> {
    private String rank;
    private String suit;

    ArrayList<String> suitList = new ArrayList<String>() {
        {
            add("clubs");
            add("diamonds");
            add("hearts");
            add("spades");
        }
    };

    public StandardCard(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public int compareTo(StandardCard o) {
        int thisIndex = suitList.indexOf(this.suit);
        int otherIndex = suitList.indexOf(o.suit);
        if (thisIndex > otherIndex) {
            return -1;
        } else if (thisIndex < otherIndex) {
            return 1;
        } else {
            return 0;
        }
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return this.rank + " of " + this.suit;
    }
}
