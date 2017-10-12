package lab1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class OutputGraph implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		for(Map.Entry<Integer,StartPoint> i:Main.graph.startpoint.entrySet())
		{
			System.out.println("{"+Main.graph.wordof.get(i.getKey())+"}");
			for(EndPoint j:i.getValue().endpoint)
			{
				System.out.println(Main.graph.wordof.get(j.index)+"["+j.weight+"]");
			}
			System.out.println();
		}
		
	}

}
