package com.stackthread.codeGladiator;

public class CandidateCode 
{ 

	public static void main(String[] args) {
		System.out.println(passCount(5,3,2));
	}
    public static int passCount(int playerCount, int gameTerminatorNumber, int ballPassLength )
    {
        int players[] = new int[playerCount];
        int currentBallPosition = 0;
        int ballPassCount = 0;
        int currentPlayerPassCount = 1;
        
        //default settings
        players[0] = 1; // starting from player 1
        ballPassLength +=1; //actual pass length
        
        //rise of game
        while(currentPlayerPassCount<gameTerminatorNumber)
        {
            //if current pass count for player is even, pass to right
            if(currentPlayerPassCount%2==0)
            {
                currentBallPosition = (currentBallPosition - ballPassLength);
            }
            else //pass ball to left
            {
                currentBallPosition = (currentBallPosition + ballPassLength);
            }
            while(currentBallPosition<0)
            	currentBallPosition+=(playerCount);
            
            //make the ball position within range
            currentBallPosition = currentBallPosition%playerCount;
            //increase the next player count;
            players[currentBallPosition]+=1;
            //increase pass count
            ballPassCount++;
            //assign next player pass count
            currentPlayerPassCount = players[currentBallPosition];
        }
        //score of game;
        return ballPassCount;
    }
}