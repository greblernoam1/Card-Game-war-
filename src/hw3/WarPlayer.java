/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;
import java.util.ArrayList;


/**
 *
 * @author Noam
 */
public class WarPlayer {
    
    private String name;
    private ArrayList <WarCard> hand = new ArrayList<WarCard>();
    private ArrayList <WarCard> pile = new ArrayList<WarCard>();
    
    WarPlayer (String n)
    {
        name = n;
    }
    
    public void add(WarCard card)
    {
        hand.add(card);
    }
    
    public void play()
    {
        pile.add(hand.get(0));
        hand.remove(0);      
    }
    
    public String get_name()
    {
        return name;
    }
    public ArrayList get_pile()
    {
        return pile;
    }
    
    public WarCard get_pile_last()
    {
        return pile.get(pile.size()-1);
    }
    
    public void empty_pile()
    {
        pile.clear();
    }
    
    public boolean is_pile_empty()
    {
        if(pile.size()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean is_hand_empty()
    {
        if(hand.size()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    
    
    public void take(WarPlayer rival)
    {
        ArrayList <WarCard> rival_pile = new ArrayList<WarCard>();
        rival_pile = rival.get_pile();
        
        for(int j= 0 ; j < rival_pile.size();j++)
        {
            hand.add(rival_pile.get(j));
        }
        
        rival.empty_pile();
        
        for(int l= 0 ; l < pile.size();l++)
        {
            hand.add(pile.get(l));
        }
        
        this.empty_pile(); 
    }
    
    public void print()
    {
        
        int p_size = pile.size();
        int h_size = hand.size();
       
        
                
        //print pile
        
       
        if(p_size ==0)
        {
            
        }
        
        else if(p_size<=4)
        {
            System.out.print(name+"'s Pile: ");
            for(int h = 0 ; h < p_size ; h++)
            {
                if(h<(p_size-1))
                {
                    System.out.print(pile.get(h).toString());
                    System.out.print(", ");
                }
                else
                {
                    System.out.print(pile.get(h).toString());
                }          
            }
            
            
        }
        
        else
        {
            System.out.print(name+"'s Pile: ");
            System.out.print(pile.get(0).toString());
            System.out.print(", ");
            System.out.print(pile.get(1).toString());
            System.out.print(", ");
            
            int p_num = p_size-4;
            
            System.out.print("(" + p_num + "more), " );
            
            System.out.print(pile.get(p_size-2).toString());
            System.out.print(", ");
            System.out.print(pile.get(p_size-1).toString());
            
            
        }
        
        if(h_size != 0 && p_size != 0)
        {
            System.out.print(" | ");
        }
        
        if(h_size == 0)
        {
            System.out.print("\n");
        }
        
        
        else if(h_size <= 4)
        {
            System.out.print(name+"'s Hand: ");
            
            if(h_size==0)
            {
                System.out.print("\n");
            }
            for(int k = 0 ; k < h_size ; k++)
            {
                if(k<(h_size-1))
                {
                    System.out.print(hand.get(k).toString());
                    System.out.print(", ");
                }
                else
                {
                    System.out.print(hand.get(k).toString());
                    System.out.print(" .\n");
                }            
            }
        }
        
        else
        {
            System.out.print(name+"'s Hand: ");
            
            System.out.print(hand.get(0).toString());
            System.out.print(", ");
            System.out.print(hand.get(1).toString());
            System.out.print(", ");
            
            int h_num = h_size-4;
            
            System.out.print("(" + h_num + " more), " );
            
            System.out.print(hand.get(h_size-2).toString());
            System.out.print(", ");
            System.out.print(hand.get(h_size-1).toString());
            System.out.print(" .\n");
        }
        
    }
}
