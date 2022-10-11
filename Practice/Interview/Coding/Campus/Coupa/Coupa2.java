/*

//Problem 2

3 233 mins max time per day i 6
3
*/

import java.util.*;

class Coupa2{

	static int noOfTracks(int totalTracks, int timeTakenToReachGround)
	{
		int tracksCovered=0;
		int timeRemaining = 360-timeTakenToReachGround;
		int trackFactor=1;
		while(timeRemaining>0)
		{
			timeRemaining-=trackFactor;
			tracksCovered++;
			trackFactor*=2;
		}
		return tracksCovered;
	}

	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int totalTracks = sc.nextInt();
		int timeTakenToReachGround = sc.nextInt();
		
		System.out.println(noOfTracks(totalTracks,timeTakenToReachGround));
	}


}