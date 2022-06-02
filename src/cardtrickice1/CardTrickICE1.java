/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.Scanner;
import java.util.Random;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            //use a method to generate random *13
            Random rand = new Random();
            c1.setValue(rand.nextInt(13) + 1);
            c1.setSuits(Card.SUITS[rand.nextInt(4)]);//random method suit
            magicHand[i] = c1;
            System.out.println(c1.getValue() + " of " + c1.getSuits());
        }
        
        Card luckyCard = new Card();
        luckyCard.setSuit("hearts");
        luckyCard.setValue(4);
        
        //step 2:take input 
        Scanner s = new Scanner(System.in);
        System.out.println("\n1 - Hearts \n2 - Diamonds \n"
                + "3 - Spades \n4 - Clubs");
        System.out.println("Pick choose a suit:");
        int suitNum = s.nextInt();
        String suit = "";
        
        switch(suitNum) {
            case 1:
                suit = "hearts";
            case 2:
                suit = "diamonds";
            case 3:
                suit = "spades";
            case 4:
                suit = "clubs";
        } 
        
        System.out.println("Pick choose a number:");
        int number = s.nextInt();
        
        Boolean doesExist = false;
        for( int i=0;i<magicHand.length;i++) {
            if(magicHand[i].getSuits().equals(suit) && magicHand[i].getValue() == number) {
                doesExist = true;
            } 
            
            else {
                doesExist = false;
            }
        }
        
        if(doesExist) {
            System.out.println("The card is in the hand!");
        } 
        
        else {
            System.out.println("The card does not exist!");
        }
        //step 3: match with array 
    }
    
}
