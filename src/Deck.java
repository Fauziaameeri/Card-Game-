public interface Deck {
    /**
     * This method adds a card to the dealerPile
     *
     * @param card StandardCard to be added to the dealerPile
     */
    public void addCard(StandardCard card);

    /**
     * This method folds(adds) any cards in the discardPile back into the dealerPile
     * and shuffles the order of the cards (Hint: You can use Collections.shuffle())
     */
    public void shuffle();

    /**
     * This method removes the top card from the dealerPile and adds it to the
     * discardPile
     *
     * @return StandardCard the card that was removed
     */
    public StandardCard dealTopCard();

    /**
     * This method returns the count of cards in the dealerPile
     *
     * @return count - number of cards in the dealerPile
     */
    public int cardCount();
}