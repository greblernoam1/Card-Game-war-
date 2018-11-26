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
public class WarCard {

    private String suit;
    private String rank;
    private int value;
    
    WarCard(int val){
        value = (val%13);
       
        if(val <= 12)
        {
            suit = "Hearts";
        }
        else if(val <= 25)
        {
            suit = "Clubs";
        }
        else if(val <= 38)
        {
            suit = "Spades";
        }
        else
        {
            suit = "Diamonds";
        }
        
        
        if(value == 0)
        {
            rank = "Two";
        }
        else if(value == 1)
        {
            rank = "Three";
        }
        else if(value == 2)
        {
            rank = "Four";
        }
        else if(value == 3)
        {
            rank = "Five";
        }
        else if(value == 4)
        {
            rank = "Six";
        }
        else if(value == 5)
        {
            rank = "Seven";
        }
        else if(value == 6)
        {
            rank = "Eight";
        }
        else if(value == 7)
        {
            rank = "Nine";
        }
        else if(value == 8)
        {
            rank = "Ten";
        }
        else if(value == 9)
        {
            rank = "Jack";
        }
        else if(value == 10)
        {
            rank = "Queen";
        }
        else if(value == 11)
        {
            rank = "King";
        }
        else
        {
            rank = "Ace";
        }
        
    }
    
    
    
    @Override
    public String toString()
    {
        String s =(rank + " of " + suit );
        return s;
    }
    
    public int compareTo(WarCard otherCard)
    {
        if(this.value==otherCard.value)
        {
            return 0;
        }
        
        else if(this.value > otherCard.value)
        {
            return 1;
        }
        
        else
        {
            return -1;
        }
    }
    /**
     * @param args the command line arguments
     */
    
    
}
