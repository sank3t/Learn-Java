import java.awt.*;
import javax.swing.*;
class TabDemo extends JFrame
{
	JTabbedPane jtp;
	ImageIcon i1,i2,i3;
	Panel p1,p2,p3;
	JLabel l1,l2,l3;
	public TabDemo()
	{
		super("My Tab");
		i1=new ImageIcon("Digit(1)");
		i2=new ImageIcon("Digit(2)");
		i3=new ImageIcon("Digit(3)");
		l1=new JLabel(i1);
		l2=new JLabel(i2);
		l3=new JLabel(i3);
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		jtp=new JTabbedPane();
		jtp.addTab("pic1",p1);
		jtp.addTab("pic2",p2);
		jtp.addTab("pic3",p3);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(jtp);
		setLayout(null);
		jtp.setBounds(20,30,500,500);
	}
	public static void main(String args[])
	{
		new TabDemo();
	}
}