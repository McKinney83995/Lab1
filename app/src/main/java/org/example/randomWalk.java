package org.example;
import java.util.Random;

public class randomWalk {
    int randomNumber,   //variable to hold the randomly generated number
        tails = 1, heads = 2; //declared at top for ease of access
    
    Random random = new Random (); /*create instance of random class*/


    public int steps (int N){
        int currentPosition = 0;
        for (; N > 0; --N) { //for each value of N
            randomNumber = random.nextInt(heads - tails + 1) + tails; //randomally generate an int btw the heads/tails values
            
            if (randomNumber == heads) { //if randomly generated value is equal to heads
                ++currentPosition; 
            }
            else if (randomNumber == tails) { //if randomaly generated value is equal to tails
                --currentPosition;
            }  
            
        }
        
        return currentPosition; //return final position after iterating through N
    }

}
