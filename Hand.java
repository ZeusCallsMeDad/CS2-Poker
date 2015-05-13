import java.util.*;

public class Hand implements Comparable {
   private ArrayList<Card> hand;

   public Hand(){
      hand = new ArrayList<Card>();
   }

   public void add(Card c){
      hand.add(c);
   }

   public void sortHand(){
      Collections.sort(hand);
   }

   public String toString(){
      return hand.toString();
   }

   /*
   BEST
   Royal Flush == 10
   Straight Flush == 9
   Four of a Kind == 8
   Full House == 7
   Flush == 6
   Straight == 5
   Three of a Kind == 4
   Two Pair == 3
   One Pair == 2
   High Card == 1
   WORST
   */
   public String handValue() {
     return "TODO: String of Best Hand; may need helper methods";
   }

   public int ifStatementsGalore()
   {
     hand.sort();
     String x = hand(0).suit;

     if(hand(0).value==10 &&
        hand(1).toString.equals("11"+firstSuit) &&
        hand(2).toString.equals("12"+firstSuit) &&
        hand(3).toString.equals("13"+firstSuit) &&
        hand(4).toString.equals("14"+firstSuit)){//Royal Flush
       return 10;
     }

     for(int i = 0; i < 5; i++)
     {
       if(hand.get(0).value==i &&
         (hand.get(1).value==i+1 && hand.get(1).suit.equals(firstSuit)) &&
         (hand.get(2).value==i+3 && hand.get(2).suit.equals(firstSuit)) &&
         (hand.get(3).value==i+4 && hand.get(3).suit.equals(firstSuit)) &&
         (hand.get(4).value==i+5 && hand.get(4).suit.equals(firstSuit))){//Straight Flush
         return 9;
       }
     }
     if(hand.get(0).value == hand.get(3).value || hand.get(1).value == hand.get(4).value)//Four of a Kind
        return 8;
     if((hand.get(0).value==hand.get(1).value && hand.get(2).value==hand.get(4).value) ||
        (hand.get(0).value==hand.get(2).value && hand.get(3).value==hand.get(4).value))//Full House
        return 7;

     String[] otherSuits = { hand.get(1).suit, hand.get(2).suit, hand.get(3).suit, hand.get(4).suit};
     boolean flush = false;

     for(int i = 0; i < 5; i++)
     {
       if(firstSuit.equals(otherSuits[0]) && firstSuit.equals(otherSuits[i])){//Flush
          return 6;
       }
     }

     if(hand.get(0).value == hand.get(4).value-4){//Straight
        return 5;
     }

     for(int i = 0; i < 3; i++)
     {
       if(hand.get(i).value == hand.get(i+1).value-1 && hand.get(i+1).value == hand.get(i+2).value -1 || hand.get(i).value == hand.get(i+1).value+1 && hand.get(i+1).value == hand.get(i+2).value + 1)//Three of a Kind
          return 4;
     }

     int count = 0;
     for(int i = 0; i < 4; i++)
     {
       if((hand.get(i).value == hand.get(i+1).value-1 || hand.get(i).value == hand.get(i+1).value+1))//Two Pair
       {
         i++;
         count++;
       }
       if(count == 2)
       {
          return 3;
       }
     }

     for(int i = 0; i < 4; i++)
     {
       if(hand.get(i).value == hand.get(i+1).value-1 || hand.get(i).value == hand.get(i+1).value+1)// One Pair
          return 2;
     }

     if()//High Card
        return 1;

   }

   public int compareTo(Object x){
      Hand other = (Hand)x;
      int hand1 = ifStatementsGalore();
      int hand2 = ifStatementsGalore();
      //TODO: Compare hands by ordering above; return -1, 1, or 0
      if(hand1 < hand2) //player 2 wins
         return -1;
      if(hand1 > hand2) //player 1 wins
         return 1;
      if(hand1 == hand2) //tie
         return 0;
   }
}

//make a high card method to check if hand 1 and hand2 are actually a tie
