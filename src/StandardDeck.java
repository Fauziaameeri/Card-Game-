import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StandardDeck implements Deck{
    private ArrayList<StandardCard> dealerPile;
    private ArrayList<StandardCard> discardPile;

    public StandardDeck(){
        ArrayList<String> rankList = new ArrayList<String>(){
            {
                add("2");
                add("3");
                add("4");
                add("5");
                add("6");
                add("7");
                add("8");
                add("9");
                add("10");
                add("Jack");
                add("Queen");
                add("King");
                add("Ace");
            }
        };
        ArrayList<String> suitList = new ArrayList<String>(){
            {
                add("clubs");
                add("diamonds");
                add("hearts");
                add("spades");
            }
        };

        this.dealerPile = new ArrayList<>();
        this.discardPile = new ArrayList<>();
        for (String rank: rankList){
            for (String suit : suitList){
                dealerPile.add(new StandardCard(rank, suit));
            }
        }
    }
    @Override
    public void addCard(StandardCard card){
        this.dealerPile.add(card);
    }
    @Override
    public void shuffle(){
        this.dealerPile.addAll(this.discardPile);
        Collections.shuffle(this.dealerPile);
        this.discardPile.clear();
    }
    @Override
    public StandardCard dealTopCard(){
        StandardCard card = this.dealerPile.get(0);
        this.discardPile.add (card);
        return card;
    }
    @Override
    public int cardCount(){
        return this.dealerPile.size();
    }
    public void sortSuits(){
        Collections.sort(this.dealerPile);
    }
    @Override
    public String toString(){
        String string = "";
        string += dealerPile.size() + " cards in deck\n";
        string += "********************\n";
        for (StandardCard card : dealerPile){
            string += card.toString() + "\n";
        }
        string += "\n";
        string += discardPile.size() + " cards in discard\n";
        string += "*********************\n";
        for (StandardCard card : discardPile){
            string += card.toString() + "\n";
        }
        string += "\n\n";
        return string;
    }
}