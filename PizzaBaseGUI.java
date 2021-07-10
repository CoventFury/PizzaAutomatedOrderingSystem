import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class PizzaBaseGUI extends JFrame implements ActionListener, ItemListener
{
	JFrame frame = new JFrame();
	private JButton[] addButton;
	private JButton[] buttons;
	private JButton[] textAreaButton;
	private JTextField priceField;
	private JRadioButton[] rButtons;
	private JComboBox diyInchSize;
	private JComboBox preFabInchSize;
	private JComboBox preFabOptions;
	private JCheckBox[] toppings;
	private JTextArea textArea;
	private String[] pizzaInch = {"Six-Inch", "Nine-Inch", "Twelve-Inch"};
	private String[] preFab = {"Hawaiian Overload", "Ham & Egg", "Beef Pepperoni", "ChogBurizo", "Pizza Supreme"};
	private	double preFabSizeMultiplier;
	private	double diySizeMultiplier;
	private	double toppingsTotal;
	private	double preFabChoice;
	public PizzaBaseGUI()
	{
		this.buttons = new JButton[4];
		this.buttons[0] = new JButton("Coca-Cola (Small)");
		this.buttons[1] = new JButton("Lemonade (Small)");
		this.buttons[2] = new JButton("Coca-Cola (Large)");
		this.buttons[3] = new JButton("Lemonade (Large)");

		this.buttons[0].addActionListener(this);
		this.buttons[1].addActionListener(this);
		this.buttons[2].addActionListener(this);
		this.buttons[3].addActionListener(this);

		this.addButton = new JButton[2];
		this.addButton[0] = new JButton("Add to Order(PreFab)");
		this.addButton[1] = new JButton("Add to Order(Do-It-Yourself)");

		this.addButton[0].addActionListener(this);
		this.addButton[1].addActionListener(this);

		this.textAreaButton = new JButton[2];
		this.textAreaButton[0] = new JButton("Generate Bill");
		this.textAreaButton[1] = new JButton("Reset Order");

		this.buttons[0].addActionListener(this);
		this.buttons[1].addActionListener(this);

		this.rButtons = new JRadioButton[4];
		this.rButtons[0] = new JRadioButton("Deep Crust");
		this.rButtons[1] = new JRadioButton("Crispy Base");
		this.rButtons[2] = new JRadioButton("Deep Crust");
		this.rButtons[3] = new JRadioButton("Crispy Base");

		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(this.rButtons[0]);	
		bgroup.add(this.rButtons[1]);
		bgroup.add(this.rButtons[2]);	
		bgroup.add(this.rButtons[3]);

		this.toppings = new JCheckBox[6];
		this.toppings[0] = new JCheckBox("Ham (30.25)");
		this.toppings[1] = new JCheckBox("Pepperoni (47.50)");
		this.toppings[2] = new JCheckBox("Bell Pepper (18.00)");
		this.toppings[3] = new JCheckBox("Ground Meat (35.75)");
		this.toppings[4] = new JCheckBox("Pineapple (24.25)");
		this.toppings[5] = new JCheckBox("Chorizo (27.80)");

		this.toppings[0].addItemListener(this);
		this.toppings[1].addItemListener(this);
		this.toppings[2].addItemListener(this);
		this.toppings[3].addItemListener(this);
		this.toppings[4].addItemListener(this);
		this.toppings[5].addItemListener(this);

		this.diyInchSize = new JComboBox(pizzaInch);
		this.preFabInchSize = new JComboBox(pizzaInch);
		this.preFabOptions = new JComboBox(preFab);

		this.diyInchSize.addItemListener(this);
		this.preFabInchSize.addItemListener(this);
		this.preFabOptions.addItemListener(this);

		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.setTitle("PizzaBase Automated Ordering System");
		frame.getContentPane().setBackground(new Color(228,228,228));
		frame.setSize(720,640);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JPanel panel1 = new JPanel(new GridBagLayout());
		//panel1.setBorder(BorderFactory.createLineBorder(Color.black));
		panel1.setBackground(new Color(228,228,228));
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 20;
		panel1.add(new JLabel("Crust Type"), c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 21;
		panel1.add(this.rButtons[2],c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 22;
		panel1.add(this.rButtons[3],c);
		frame.add(panel1);

		JPanel panel5 = new JPanel();
		panel5.setLayout(new GridLayout(1,1));
		c.gridx = 0;
		c.gridy = 1;
		panel1.add(new JLabel("MENU"),c);
		c.gridx = 1;
		c.gridy = 2;
		panel1.add(new JLabel("PreFab Options"), c);
		c.gridx = 1;
		c.gridy = 3;
		panel5.add(this.preFabOptions);
		panel1.add(panel5,c);

		JPanel panel9 = new JPanel();
		panel9.setLayout(new GridLayout(1,1));
		c.gridx = 1;
		c.gridy = 4;
		panel1.add(new JLabel("Pizza Size(Inches)"), c);
		c.gridx = 1;
		c.gridy = 5;
		panel9.add(this.preFabInchSize);
		panel1.add(panel9,c);

		JPanel panel18 = new JPanel(new GridBagLayout());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 6;
		panel1.add(new JLabel("Crust Type"), c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 7;
		panel1.add(this.rButtons[0],c);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 8;
		panel1.add(this.rButtons[1],c);
		panel1.add(panel18);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1,1));
		c.gridx = 1;
		c.gridy = 18;
		panel1.add(new JLabel("Pizza Size(Inches)"), c);
		c.gridx = 1;
		c.gridy = 19;
		panel2.add(this.diyInchSize);
		panel1.add(panel2,c);

		JPanel panel6 = new JPanel();
		c.gridx = 1;
		c.gridy = 10;
		panel1.add(new JLabel("Do-It-Yourself Options"), c);
		c.gridx = 1;
		c.gridy = 11;
		panel1.add(new JLabel("Select Toppings:"), c);
		c.gridx = 1;
		c.gridy = 12;
		panel1.add(this.toppings[0], c);
		c.gridx = 1;
		c.gridy = 13;
		panel1.add(this.toppings[1], c);
		c.gridx = 1;
		c.gridy = 14;
		panel1.add(this.toppings[2], c);
		c.gridx = 1;
		c.gridy = 15;
		panel1.add(this.toppings[3], c);
		c.gridx = 1;
		c.gridy = 16;
		panel1.add(this.toppings[4], c);
		c.gridx = 1;
		c.gridy = 17;
		panel1.add(this.toppings[5], c);
		panel1.add(panel6);


		JPanel panel3 = new JPanel();
		GridLayout layout = new GridLayout(2,2);
		layout.setHgap(5);
		layout.setVgap(5);
		panel3.setBackground(new Color(228,228,228));
		panel3.setLayout(layout);
		for(int i = 0; i < this.buttons.length; i++)
		{
			panel3.add(this.buttons[i]);
		}
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 24;
		panel1.add(new JLabel("Drink Options"), c);
		c.gridx = 1;
		c.gridy = 25;
		panel1.add(panel3,c);


		JPanel panel8 = new JPanel(new GridLayout(1,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 9;
		panel8.add(this.addButton[0]);
		panel1.add(panel8,c);

		JPanel panel24 = new JPanel(new GridLayout(1,1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 23;
		panel24.add(this.addButton[1]);
		panel1.add(panel24,c);

		JPanel textPanel = new JPanel (new GridBagLayout());
		textArea = new JTextArea();
		textArea.setPreferredSize(new Dimension(150,480));
		textArea.setEditable(false);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=1;
		textPanel.add((textArea),gbc);
		frame.add(textPanel,gbc);

		JPanel panel15 = new JPanel ();
		GridLayout layout2 = new GridLayout(1,2);
		panel15.setBackground(new Color(228,228,228));
		layout2.setHgap(135);
		panel15.setLayout(layout2);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=2;
		panel15.add(this.textAreaButton[0],gbc);
		panel15.add(this.textAreaButton[1],gbc);
		textPanel.add(panel15,gbc);
	}

	public void itemStateChanged(ItemEvent i)
	{
		Toppings toppingOption = new Toppings();
		PizzaSize size = new PizzaSize();
		PreFab preFabPizza = new PreFab();
		preFabChoice = 0.0;
		toppingsTotal = 0.0;

		if(this.toppings[0].isSelected())
		{
			toppingsTotal += toppingOption.addHam();
		}

		if(this.toppings[1].isSelected())
		{
			toppingsTotal += toppingOption.addPepperoni();
		}

		if(this.toppings[2].isSelected())
		{
			toppingsTotal += toppingOption.addBellPepper();
		}

		if(this.toppings[3].isSelected())
		{
			toppingsTotal += toppingOption.addGroundMeat();
		}

		if(this.toppings[4].isSelected())
		{
			toppingsTotal += toppingOption.addPineapple();
		}

		if (this.toppings[5].isSelected())
		{
			toppingsTotal += toppingOption.addChorizo();
		}

		if (this.preFabOptions.getSelectedItem().toString().equals("Hawaiian Overload"))
		{
			preFabChoice += preFabPizza.addHawaiianOverload();
		}
		else if (this.preFabOptions.getSelectedItem().toString().equals("Ham & Egg"))
		{
			preFabChoice += preFabPizza.addHamEgg();
		}
		else if (this.preFabOptions.getSelectedItem().toString().equals("Beef Pepperoni"))
		{
			preFabChoice += preFabPizza.addBeefPepperoni();
		}
		else if (this.preFabOptions.getSelectedItem().toString().equals("ChogBurizo"))
		{
			preFabChoice += preFabPizza.addChogBurizo();
		}

		else if (this.preFabOptions.getSelectedItem().toString().equals("Pizza Supreme"))
		{
			preFabChoice += preFabPizza.addPizzaSupreme();
		}

		if (this.preFabInchSize.getSelectedItem().toString().equals("Six-Inch"))
		{
			preFabSizeMultiplier += size.getSixInchPrice();
		}

		else if (this.preFabInchSize.getSelectedItem().toString().equals("Nine-Inch"))
		{
			preFabSizeMultiplier += size.getNineInchPrice();
		}

		else if (this.preFabInchSize.getSelectedItem().toString().equals("Twelve-Inch"))
		{
			preFabSizeMultiplier += size.getTwelveInchPrice();
		}

		if (this.diyInchSize.getSelectedItem().toString().equals("Six-Inch"))
		{
			diySizeMultiplier += size.getSixInchPrice();
		}

		else if (this.diyInchSize.getSelectedItem().toString().equals("Nine-Inch"))
		{
			diySizeMultiplier += size.getNineInchPrice();
		}

		else if (this.diyInchSize.getSelectedItem().toString().equals("Twelve-Inch"))
		{
			diySizeMultiplier += size.getTwelveInchPrice();
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		Drinks drink = new Drinks();
		String s = e.getActionCommand();
		if(s.equals("Coca-Cola (Small)"))
		{	
			textArea.setText("Coca-Cola (Small) = "+drink.addCocaColaSmall());	
		}

		if(s.equals("Lemonade (Small)"))
		{	
			textArea.setText("Lemonade (Small) = "+drink.addLemonadeSmall());	
		}

		if(s.equals("Coca-Cola (Large)"))
		{	
			textArea.setText("Coca-Cola (Large) = " +drink.addCocaColaLarge());	
		}

		if(s.equals("Lemonade (Large)"))
		{	
			textArea.setText("Lemonade (Large) = "+drink.addLemonadeLarge());	
		}

		else if (s.equals("Add to Order(PreFab)"))
		{
			textArea.setText(String.valueOf(preFabChoice*preFabSizeMultiplier));
		}

		else if (s.equals("Add to Order(Do-It-Yourself)"))
		{
			textArea.setText(String.valueOf((100+toppingsTotal)*diySizeMultiplier));
		}

		else if (s.equals("Reset Order"))
		{
			textArea.setText("");
		}
	}  
}
