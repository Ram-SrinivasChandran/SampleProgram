import java.util.*;
class displayHighScorePosition{

public static void main(String[] args) 
{
	int a,b,c,d;
	String e,f,g,h;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Name1:");
	e=s.next();
	System.out.println("Enter the Mark of the Student:");
	a=s.nextInt();
	System.out.println("Enter the Name2:");
	f=s.next();
	System.out.println("Enter the Mark of the Student:");
	b=s.nextInt();
	System.out.println("Enter the Name3:");
	g=s.next();
	System.out.println("Enter the Mark of the Student:");
	c=s.nextInt();
	System.out.println("Enter the Name4:");
	h=s.next();
	System.out.println("Enter the Mark of the Student:");
	d=s.nextInt();
	int highscorePosition=calculatehighScore(a);
	displayHighScorePosition(e,highscorePosition);
	highscorePosition=calculatehighScore(b);
	displayHighScorePosition(f,highscorePosition);
	highscorePosition=calculatehighScore(c);
	displayHighScorePosition(g,highscorePosition);
	highscorePosition=calculatehighScore(d);
	displayHighScorePosition(h,highscorePosition);
}
	public static void displayHighScorePosition(String playerName,int highscorePosition)
	{

		System.out.println(playerName+" manage to get into position "+highscorePosition+" on the high score table");
	}
	public static int calculatehighScore(int playerscore)
	{
		if(playerscore>1000)
		{
			return 1;
		}
		else if(playerscore>500&&playerscore<1000)
		{
			return 2;
		}
		else if(playerscore>100&&playerscore<500)
		{
			return 3;
		}
		else
		{
			return 4;
		}
	}
 } 



