//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Main
{
	public static void main( String args[] )
	{
		int[] r = {5, 12, 9, 6, 1, 4, 8, 6 };
		NumberAnalyzer test = new NumberAnalyzer( r );
		out.println(test);
		out.println("odd count = "+test.countOdds());
		out.println("even count = "+test.countEvens());
		out.println("perfect count = "+test.countPerfects()+"\n\n\n");

    		int[] t = {5, 12, 3, 7, 28, 496, 81, 65, 33, 11};
		NumberAnalyzer testt = new NumberAnalyzer( t );
		out.println(testt);
		out.println("odd count = "+testt.countOdds());
		out.println("even count = "+testt.countEvens());
		out.println("perfect count = "+testt.countPerfects()+"\n\n\n");


		//add more test cases			
	}
}