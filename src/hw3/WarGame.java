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
public class WarGame {
    
    public static void main(String[] args) {
        
            WarDeck deck = new WarDeck();
            deck.shuffle();
            WarPlayer p_1 = new WarPlayer("Noam");
            WarPlayer p_2 = new WarPlayer("Computer");
            
            WarPlayer [] player_arr_2 = new WarPlayer[2];
            
            player_arr_2[0] = p_1;
            player_arr_2[1] = p_2;
            
            deck.deal(player_arr_2, 52);
            
            int counter =0;
            
            while( (!p_1.is_hand_empty() && !p_2.is_hand_empty()) || ( !p_1.is_pile_empty() || !p_2.is_pile_empty() ))
            {
                if(counter==0)
                {
                    System.out.print("Initial Hands\n");
                    p_1.print();
                    p_2.print();  
                }
                else if((p_1.is_hand_empty() || p_2.is_hand_empty()) && (!p_1.is_pile_empty() || !p_2.is_pile_empty()))
                {
                    System.out.print("Round " + counter + "\n");
                    if(p_1.is_hand_empty())
                    {
                        p_2.play();
                        p_1.print();
                        p_2.print();
                        
                        
                        WarCard d_1 =  p_1.get_pile_last();
                        WarCard d_2 =  p_2.get_pile_last();
                         
                        int compa = d_1.compareTo(d_2);
                        
                        if(compa == 1)
                        {
                            System.out.print(p_1.get_name() + " says: I win.\n");
                            p_1.take(p_2);
                            System.out.print(p_1.get_name() + " took piles.\n");
                        }
                        else if(compa == -1)
                        {
                            System.out.print(p_2.get_name() + " says: I win.\n");
                            p_2.take(p_1);
                            System.out.print(p_2.get_name() + " took piles.\n");
                        }
                        else
                        {
                        System.out.print("War!\n");
                        p_2.play();
                        counter--;
                      
                        }
                    }
                    else
                    {
                         p_1.play();
                         
                         p_1.print();
                         p_2.print();
                        
                        WarCard d_1 =  p_1.get_pile_last();
                        WarCard d_2 =  p_2.get_pile_last();
                         
                        int compa = d_1.compareTo(d_2);
                        
                        if(compa == 1)
                        {
                            System.out.print(p_1.get_name() + " says: I win.\n");
                            p_1.take(p_2);
                            System.out.print(p_1.get_name() + " took piles.\n");
                        }
                        else if(compa == -1)
                        {
                            System.out.print(p_2.get_name() + " says: I win.\n");
                            p_2.take(p_1);
                            System.out.print(p_2.get_name() + " took piles.\n");
                        }
                        else
                        {
                        System.out.print("War!\n");
                        p_1.play();
                        counter--;
                        }
                    }
                }
                else
                {
                    System.out.print("Round " + counter + "\n");
                    
                    p_1.play();
                    p_2.play();
                    
                    p_1.print();
                    p_2.print();
                    
                    
                    WarCard c_1 =  p_1.get_pile_last();
                    WarCard c_2 =  p_2.get_pile_last();
                    
                    int comp = c_1.compareTo(c_2);
                  
                    if(comp == 1)
                    {
                        System.out.print(p_1.get_name() + " says: I win.\n");
                        p_1.take(p_2);
                        System.out.print(p_1.get_name() + " took piles.\n");
                    }
                    else if(comp == -1)
                    {
                        System.out.print(p_2.get_name() + " says: I win.\n");
                        p_2.take(p_1);
                        System.out.print(p_2.get_name() + " took piles.\n");
                    }
                    else
                    {
                        System.out.print("War!\n");
                        if(!p_1.is_hand_empty())
                        {
                           p_1.play();
                        }
                        if(!p_2.is_hand_empty())
                        {
                           p_2.play();
                        }
                        counter--;
                        
                        
                    }
                    
                    
                }
                
                counter++;
            }
            
            System.out.print("Game Over!\n");
    }
    
}
