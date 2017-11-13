package lab1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.JTextField;

public class QueryBridge implements ActionListener
{
	JTextField text_word1,text_word2,text_word3;
	QueryBridge(JTextField word1,JTextField word2,JTextField word3)
	{
		text_word1=word1;
		text_word2=word2;
		text_word3=word3;
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		text_word3.setText(bridgeWord.cal(text_word1.getText(), text_word2.getText()));
		
	}
}
