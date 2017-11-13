package lab1;

import java.util.Set;

public class bridgeWord {
	public static String cal(String word1,String word2)
	{
		Set<Integer> bridges=Main.getbridge(word1, word2);
		if(bridges==null)
		{
			System.out.println("No word1 or word2 in the graph!");
			return("No word1 or word2 in the graph!");
		}
		else
		{
			if(bridges.isEmpty())
			{
				System.out.println("No bridge words from word1 to word2!");
				return("No bridge words from word1 to word2!");
			}
			else
			{
				StringBuilder output=new StringBuilder("The bridge words from word1 to word2 are:");
				boolean first=true;
				for(Integer i:bridges)
				{
					if(first) output.append(Main.graph.wordof.get(i));
					else output.append(",").append(Main.graph.wordof.get(i));
					first=false;
				}
				
				System.out.println(output.toString());
				return(output.toString());
			}
		}
	}
}
