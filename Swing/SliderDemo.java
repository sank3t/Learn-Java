import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
class SliderDemo extends JFrame implements ChangeListener
{
	JSlider j1,j2,j3;
	JLabel l1,l2,l3;
	Panel p1;
	public SliderDemo()
	{
		super("My Slider");
		l1=new JLabel("red");
		l2=new JLabel("green");
		l3=new JLabel("blue");
		p1=new Panel();
		j1=new JSlider();
		j2=new JSlider();
		j3=new JSlider();
		j1.setMinimum(0);
		j1.setMaximum(255);
		j1.setMinorTickSpacing(5);
		j1.setMajorTickSpacing(15);
		j1.setPaintLabels(true);
		j1.setPaintTicks(true);
		j2.setMinimum(0);
		j2.setMaximum(255);
		j2.setMinorTickSpacing(5);
		j2.setMajorTickSpacing(15);
		j2.setPaintLabels(true);
		j2.setPaintTicks(true);
		j3.setMinimum(0);
		j3.setMaximum(255);
		j3.setMinorTickSpacing(5);
		j3.setMajorTickSpacing(15);
		j3.setPaintLabels(true);
		j3.setPaintTicks(true);
		j1.addChangeListener(this);
		j2.addChangeListener(this);
		j3.addChangeListener(this);
		setSize(600,600);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(l1);add(l2);add(l3);add(p1);
		add(j1);add(j2);add(j3);
		p1.setBounds(20,20,400,200);
		l1.setBounds(20,250,60,20);
		j1.setBounds(100,250,500,50);
		l2.setBounds(20,300,60,20);
		j2.setBounds(100,300,500,50);
		l3.setBounds(20,350,60,20);
		j3.setBounds(100,350,500,50);
	}
	public void stateChanged(ChangeEvent c)
	{
		int r=j1.getValue();
		int g=j2.getValue();
		int b=j3.getValue();
		p1.setBackground(new Color(r,g,b));
	}
	public static void main(String args[])
	{
		new SliderDemo();
	}
}