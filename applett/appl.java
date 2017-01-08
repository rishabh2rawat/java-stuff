
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public  class appl extends Applet  implements ActionListener
{
	JButton button =new JButton("Login");
	JLabel label1=new JLabel("user");
	JLabel label2=new JLabel("password");
	JTextField name=new JTextField("name");
	JTextField pass=new JTextField("***");
	
	public void init()
	{
		add(label1);
		add(name);
		add(label2);
		add(pass);
		add(button);
		button.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e)
	{
		String username=name.getText();
		String password=pass.getText();
		if(username=="rishabh"&&password=="qwe")
		{
			JOptionPane.showMessageDialog(null,"login Sucsessfull");

		}
		else 
		{
			name.setText("");
			pass.setText("");
			JOptionPane.showMessageDialog(null,"wrong passord or user name");

		}
	}
	
}
