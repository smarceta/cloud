/* * SANJIN MARCETA
 * 991574394
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner; 

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * SANJIN MARCETA
 * 991574394
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        //set luckyCard to value of choice
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(c.RandomNumb());
            c.setSuit(Card.SUITS[c.RandomNu()]);
        }
        
        
        
        System.out.println("Enter Card Value");
        int cardNu = input.nextInt(); 
        
        for(int i = 0; i<7; i++){
            if(Card[i] = cardNu) {
              System.out.println("COrrect Number");
            }else System.out.println("Nope!");
        }
        
        
        
        
        System.out.println("Enter Suit");
        String cardSu = input.nextLine();
        
        for(int i = 0; i<4; i++){
            if(Card.SUITS[i] == cardSu){
                System.out.println(cardSu + "is correct!");
                
            }else System.out.println("Not correct");
        }
        
//insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
