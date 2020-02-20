import java.awt.*;
import java.applet.*;
public class MyApplet extends Applet
{
	public void init()
	{
		setBackground(Color.Magenta);
		setForeground(Color.Black);
		setFont("Consolas",Font.Bold,40);
	}
	public void start()
	{
		System.out.println("start invoked");
	}
	public void paint(Graphics g)
	{
		g.drawString("hello applet",20,50);
	}
	public void stop()
	{
		System.out.println("start invoked");		
	}
	public void destroy()
	{
		System.out.println("start invoked");
	}
}