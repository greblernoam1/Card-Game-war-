/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;

/**
 *
 * @author Noam
 */
public class WarTester {
    public static void main(String[] args) {
       //
       System.out.print("Test WarCard: \n\n");
            //Test constructor
            WarCard c = new WarCard(12);
            WarCard a = new WarCard (34);

            //Test toString
            System.out.print(c.toString());
            System.out.print(a.toString());

            //Test compareTo 
            int d = c.compareTo(a);
            int e = a.compareTo(c);
            int f = a.compareTo(a);

            System.out.print("\n" + d );
            System.out.print("\n" + e );
            System.out.print("\n" + f );
            
        System.out.print("\n\nTest WarDeck:");
        
            WarDeck deck1 = new WarDeck();
            System.out.print("\n\nUnshuffled deck: \n\n");
            deck1.print();
            
            deck1.shuffle();
            System.out.print("\n\nShuffled deck: \n\n");
            deck1.print();
            
        System.out.print("\n\nTest WarPlayer: \n\n");
        
            WarPlayer p = new WarPlayer("Jaime");
            
            System.out.print("\nPrint empty hand: \n");
            
            p.print();
            System.out.print("\n");
            
            WarPlayer [] player_arr = new WarPlayer[1];
            
            player_arr[0] = p;
                
            
             System.out.print("\nPrint empty pile and unshuffled hand: \n");
             WarDeck deck2 = new WarDeck();
             deck2.deal(player_arr, 52);
            
             p.print();
             
           
            System.out.print("\nPlay two cards card (go from the hand to pile): \n");
            p.play();
            p.play();
            p.print();
            
             
            
            System.out.print("\nDeal unshuffled deck with two players: \n");
            WarDeck deck3 = new WarDeck();
            WarPlayer p_2 = new WarPlayer("Noam");
            WarPlayer p_3 = new WarPlayer("Alvaro");
            
            WarPlayer [] player_arr_2 = new WarPlayer[2];
            
            player_arr_2[0] = p_2;
            player_arr_2[1] = p_3;
            
            deck3.deal(player_arr_2, 52);
            
            p_2.print();
            p_3.print();
            
            System.out.print("\nPlay with two players: \n");
            p_2.play();
            p_3.play();
            
            p_2.print();
            p_3.print();
            
            System.out.print("\np_2 takes both piles: \n");
            
            p_2.take(p_3);
            
            p_2.print();
            p_3.print();

            
    }
    
    
}
