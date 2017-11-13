package lab1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class InputGraph implements ActionListener
{
	JTextField text_input;
	JLabel label_input_message;
	InputGraph(JTextField text,JLabel input_message)
	{
		text_input=text;
		label_input_message=input_message;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		label_input_message.setText(readin.read(text_input.getText()));
		new FloydInit().start();
	}
}
