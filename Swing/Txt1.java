import java.awt.*;
import javax.swing.*;
import java.net.*;
class Msg1 extends JFrame
{
	JTextArea t;
	JButton b1,b2;
	public Msg1()
	{
		super("SENDER");
		t=new JTextArea();
		b1=new JButton("Send");
		b2=new JButton("Cancel"); 
		setLayout(new FlowLayout());
		add(t);add(b1);add(b2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
class Txt1
{
	public static void main(String args[])
	{
		new Msg1();
	}
}