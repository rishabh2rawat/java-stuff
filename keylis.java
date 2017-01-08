import java.awt.event.*;
import javax.swing.*;
public class keylis extends JFrame implements KeyListener
{
	keylis(String s)
	{
		super(s);
		JPanel j=new JPanel();
		JLabel label=new JLabel("key listner");
		j.add(label);
		add(j);
		addKeyListener(this);
		setSize(350,350);
		setVisible(true);

	}
	public void keyTyped(KeyEvent e)
	{

	}
	public void keyReleased(KeyEvent e)
	{

	}
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			JOptionPane.showMessageDialog(null,"right key pressed");

		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			JOptionPane.showMessageDialog(null,"Left key pressed");
		}
	}
	public static void main(String[]args)
	{
		new keylis("demo test");
	}
}