import java.awt.*;
import javax.swing.*;
import java.awt.*;
class Attempt //implements ActionListener
{
	JFrame f=new JFrame("app1");
	JButton b1=new JButton("HTML");
	public Attempt()
	{
		f.setVisible(true);
		f.add(b1);
	}
}
class At
{
	JFrame f=new JFrame("app1");
	JButton b1=new JButton("HTML");
	public At()
	{
		f.setVisible(true);
		f.add(b1);
	}
}
class Main
{
	public static void main(String args[])
	{
		new Attempt();
		new At();
	}
}