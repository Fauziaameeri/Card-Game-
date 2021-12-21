public class DeckClient {
    public static void main(String[] args){
        StandardDeck deck = new StandardDeck();
        deck.sortSuits();
        deck.shuffle();
        System.out.println(deck);
        StandardCard card = deck.dealTopCard();
        System.out.println("Dealt a "+ card);
        card = deck.dealTopCard();
        System.out.println("Dealt a "+ card);
        card = deck.dealTopCard();
        System.out.println("Dealt a "+ card);
        card = deck.dealTopCard();
        System.out.println("Dealt a "+ card);
        System.out.println(deck);
    }
}
