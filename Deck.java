import java.util.*;

public class Deck {
   private ArrayList<Card> deck;
   private Random rng = new Random();

   public Deck(){
      deck = new ArrayList<Card>();
      //TODO: Add a card (2-14) of each suit (h,s,d,c)
      for(int x = 1; x < 5; x++)
      {
        for(int i = 2; i < 15; i++)
        {
          if(x==1)
            deck.add(new Card(i,"h"));
          if(x==2)
            deck.add(new Card(i, "s"));
          if(x==3)
            deck.add(new Card(i, "d"));
          if(x==4)
            deck.add(new Card(i, "c"));
        }
      }
   }

   public Card remove(){
      int rand = rng.nextInt(deck.size()-1);
      return deck.remove(rand);
   }

   public String toString(){
      return deck.toString();
   }
}
