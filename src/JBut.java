import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JBut extends JFrame{
	
	private JButton reg;
	private JButton custom;
	
	public JBut()
	{
		super("TITLE");
		setLayout(new FlowLayout());
		reg = new JButton ("reg button");
		add(reg);
		
		Icon b = new ImageIcon(getClass().getResource("images.png"));
		Icon x= new ImageIcon(getClass().getResource("images2.png"));
		
		custom = new JButton("custom",b);
		custom.setRolloverIcon(x);
		add(custom);
		
		Handlerclass handler = new Handlerclass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
		
		
		
		
		
	}
	private class Handlerclass implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JOptionPane.showMessageDialog(null,String.format("%s" , event.getActionCommand()));
		}
	}

}