import java.awt.event.*;
import javax.swing.*;
class mouselis implements MouseListener
{
	mouselis()
	{
		JFrame frame=new JFrame("mouse testing");
		frame.setSize(300,300);
		frame.setVisible(true);

		JPanel panel=new JPanel();

		JLabel label=new JLabel("mouse listener");
		panel.add(label);

		frame.add(panel);

		frame.addMouseListener(this);

	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseClicked(MouseEvent e)
	{
		JOptionPane.showMessageDialog(null,"mouse is clicked");

	}
	public static void main(String[]args)
	{
		new mouselis();
	}
}