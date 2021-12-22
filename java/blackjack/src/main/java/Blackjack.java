public class Blackjack {

    public int parseCard(String card) {

        // calculate the numerical value of a card given its name using conditionals
        int value = 0;
        switch(card) {
            case "ace":
                value = 11;
                return value;
            case "two":
                value = 2;
                return value;
            case "three":
                value = 3;
                return value;
            case "four":
                value = 4;
                return value;
            case "five":
                value = 5;
                return value;
            case "six":
                value = 6;
                return value;
            case "seven":
                value = 7;
                return value;
            case "eight":
                value = 8;
                return value;
            case "nine":
                value = 9;
                return value;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                value = 10;
                return value;
            case "other":
                return value;
        }
        return value;
    }

    public boolean isBlackjack(String card1, String card2) {
       // return true if sum of card values = 21
       // ace + ten or jack or queen or king
        boolean blackjack = false;
        int aceNo = 0;
        if (card1.equals("ace")) {
            aceNo = 21;
        }

        if (aceNo == 21 && (card2.equals("ten") || card2.equals("jack") || card2.equals("queen") || card2.equals("king"))) {
             blackjack = true;
        } else if (card2.equals("ace") && (card1.equals("ten") || card1.equals("jack") || card1.equals("queen") || card1.equals("king") && aceNo != 21)) {
            blackjack = true;
        }
        return blackjack;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        // decision logic for hand scores larger than 20points
        // returns the string representation of a decision, given your cards
        //function is only called if 'handScore' > 20
        //large hand spec:
                // if have 2 aces, must always split them (P)
                // if have blackjack (2 cards sum to 21) and dealer has no ace/figure/10 = you                      auto win (W)
                //  if dealer has any of those cards, then you must wait for reveal of the other                    card (S)
        String result = "";

        if (isBlackjack == false) {
            return result = "P";
        } else if ((isBlackjack) && (dealerScore < 10)) {
            return result ="W";
        } else if ((isBlackjack) && dealerScore > 10) {
            return result = "S";
        } else if ((isBlackjack) && dealerScore > 0) {
            return result = "S";
        }
        return result;
    }

    public String smallHand(int handScore, int dealerScore) {
       // hand scores with < 21 points
        // returns string
        // if cards = 17+ (S)
        // if cards = 11- (H)
        // if cards = 12-16, must (S) until dealerScore 7+, then should (H)
        String result = "";
        if (handScore >= 17){
            return result = "S";
        } else if (handScore <= 11) {
            return result = "H";
        } else if ((handScore >= 12 && handScore <= 16) && dealerScore < 7) {
            return result = "S";
        } else if ((handScore >= 12 && handScore <= 16) && dealerScore >= 7) {
            return result = "H";
        }
        else return null;
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
