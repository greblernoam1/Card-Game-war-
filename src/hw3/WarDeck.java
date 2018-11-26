/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Noam
 */
public class WarDeck {
    
    private ArrayList <WarCard> cardStack = new ArrayList<WarCard>();
    
    WarDeck(){
        for(int i = 0 ; i < 52; i++){
            
            WarCard card = new WarCard(i);
            
            cardStack.add(card);
            
        }
    }
    
    public void print(){
        
        int stack_size = cardStack.size();
        
        for(int k = 0 ; k <stack_size; k++){
            System.out.print(cardStack.get(k).toString());
            System.out.print("\n");
        }
    }
    
    public void shuffle(){
        Collections.shuffle(cardStack);
    }
    
    public void deal (WarPlayer[] players, int numberOfCards)
    {
        int counter = 0;
        
        int size = players.length;
        
        while(numberOfCards > 0)
        {
            players[counter%size].add(cardStack.get(0));
            cardStack.remove(0);
            counter++;
            numberOfCards--;
        }
    }
       
    
    
    
}
