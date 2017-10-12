package lab1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;

import javax.swing.JTextField;

public class ShortPath implements ActionListener
{
	JTextField text_pathstart,text_pathend,text_pathans;
	ShortPath(JTextField pathstart,JTextField pathend,JTextField pathans)
	{
		text_pathstart=pathstart;
		text_pathend=pathend;
		text_pathans=pathans;
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(!Main.floydready) text_pathans.setText("未准备就绪");
		Integer n1=Main.graph.indexof.get(text_pathstart.getText()),n2=Main.graph.indexof.get(text_pathend.getText());
		if(n1==null||n2==null)
		{
			text_pathans.setText("单词不存在");
			return;
		}
		Queue<Integer> ans=Main.floyd(n1,n2);
		if(ans==null) text_pathans.setText("单词不存在");
		else if(ans.size()==0) text_pathans.setText("无可选路径");
		else
		{
			StringBuilder ans_str=new StringBuilder();
			boolean first=true;
			while(!ans.isEmpty())
			{
				if(first) ans_str.append(Main.graph.wordof.get(ans.poll()));
				else ans_str.append("->").append(Main.graph.wordof.get(ans.poll()));
				first=false;
			}
			text_pathans.setText(ans_str.toString());
		}
	}
}
