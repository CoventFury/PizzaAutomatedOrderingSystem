
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PizzaTypeOptions extends JFrame
{
	private JList pizzaType;
	private JRadioButton[] radioButton;
	private ButtonGroup bgroup;

	public PizzaTypeOptions()
	{
		this.pizzaType = new JList();
		this.radioButton = new JRadioButton[2];
		this.radioButton[0] = new JRadioButton("Do-It-Yourself");
		this.radioButton[1] = new JRadioButton("PreFab");

		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(this.radioButton[0]);
		bgroup.add(this.radioButton[1]);

		this.getContentPane().setLayout(new GridLayout(1,1));
		this.getContentPane().add(this.pizzaType);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3,2));
		for(int i=0; i < this.radioButton.length; i++)
		{
			panel2.add(this.radioButton[i]);
			this.radioButton[i].setPreferredSize(new Dimension(40,40));
		}
		this.getContentPane().add(panel2);
		this.setVisible(true);
	}	
}