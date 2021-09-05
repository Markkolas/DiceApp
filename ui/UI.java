package ui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

import javax.swing.*;
import javax.swing.text.DefaultCaret;

import main.Main;

@SuppressWarnings("serial")
public class UI extends JFrame implements MouseListener{
	private JButton[] diceButton = new JButton[8];
	private JTextField[] timeBox = new JTextField[8];
	private JTextArea resultBox;
	private JScrollPane resultBoxScroll;
	
	//Intancacianos array de constantes para emplazamiento de componentes
	GridBagConstraints c = new GridBagConstraints();
	
	public void startUI() {
		setTitle("DiceApp");
		setSize(400,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		
		//Constant property of c across cells
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.weighty = 0.5;
		//c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(10,10,10,10);
		
		startButtons();
		startBoxes();
		startResultField();
		
		setVisible(true);
		
	}
	
	private void startButtons() {
		c.gridx = 0;
		
		for (int i=0; i<8; i++) {
			diceButton[i] = new JButton();
			diceButton[i].addMouseListener(this);
			diceButton[i].setMaximumSize(new Dimension (200,100));
			diceButton[i].setIcon(new ImageIcon("img/"+i+".png"));
			
			c.gridy = i;
			
			add(diceButton[i],c);
		}
	}
	
	/*No quiero invertir tiempo en encontrar una forma mejor de recoger el num
	 de veces para lanzar el dado, odio la programacion de interfaces*/
	private void startBoxes() {
		c.gridx = 1;
		
		for (int i=0; i<8; i++) {
			timeBox[i] = new JTextField("1");
			timeBox[i].setHorizontalAlignment(JTextField.CENTER);
			
			c.gridy = i;
			
			add(timeBox[i],c);
		}
	}
	
	private void startResultField() {
		resultBox = new JTextArea();
		resultBoxScroll = new JScrollPane(resultBox);
		
		//Quick "hack" to maintain scroll at new lines
		DefaultCaret caret = (DefaultCaret)resultBox.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		
		resultBox.setLineWrap(true);
		resultBox.setEditable(false);
		resultBox.setText("DiceApp V1 aka \"El Feo\". Free license, this program is shit. Enjoy!\n"
				+ "Use: left buttons to throw dice, right to determine number of throws\n"
				+ "The dices are waiting, lets go!\n\n");
		
		c.gridx = 0;
		c.gridy = 8;
		c.gridwidth = 2;
		c.weighty = 1;
		
		add(resultBoxScroll,c);
		
	}
	
	public void showResults(int[] results, int diceIndex, int timesToRoll, String type) {
		resultBox.append("\n\nHas tirado un "+type+" "+timesToRoll+" veces\n"
				+ "Resultado(s): "+Arrays.toString(results));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton pressedButton = (JButton)e.getSource();
		
		int i = 0;
		
		while (diceButton[i] != pressedButton)
			i++;
		
		Main.roll(i, (int)Integer.parseInt(timeBox[i].getText()));
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		setCursor(new Cursor(Cursor.HAND_CURSOR));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
}
