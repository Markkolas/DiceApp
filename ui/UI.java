package ui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class UI extends JFrame implements MouseListener{
	private JPanel dicePanel, timesPanel;
	private JButton[] diceButton = new JButton[8];
	private JTextArea[] timeBox = new JTextArea[8];
	private JTextArea resultBox;
	
	public void startUI() {
		setTitle("DiceApp");
		setSize(200,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		
		//Intancacianos constantes para emplazamiento de componentes
		GridBagConstraints[] c = { new GridBagConstraints(),
								new GridBagConstraints(),
								new GridBagConstraints()
		};
		
		//Definicion de atributos
		c[0].gridx = 0;
		c[0].gridy = 0;
		c[0].gridheight = 2;
		
		c[1].gridx = 2;
		c[1].gridy = 0;
		c[1].gridheight = 2;
		
		c[2].gridx = 0;
		c[2].gridy = 2;
		c[2].gridwidth = 3;
		
		c[0].fill = GridBagConstraints.BOTH;
		c[1].fill = GridBagConstraints.BOTH;
		c[2].fill = GridBagConstraints.BOTH;
		
		
		dicePanel = new JPanel();
		dicePanel.setLayout(new BoxLayout(dicePanel, BoxLayout.Y_AXIS));
		
		timesPanel = new JPanel();
		timesPanel.setLayout(new BoxLayout(timesPanel, BoxLayout.Y_AXIS));
		
		startButtons();
		startBoxes();
		startResultField();
		
		add(dicePanel,c[0]);
		add(timesPanel,c[1]);
		add(resultBox,c[2]);
		
		setVisible(true);
		
		System.out.print("dicePanel size: "+timesPanel.getSize());
		
	}
	
	private void startButtons() {
		for (int i=0; i<8; i++) {
			diceButton[i] = new JButton();
			dicePanel.add(diceButton[i]);
			diceButton[i].addMouseListener(this);
		}
	}
	
	/*No quiero invertir tiempo en encontrar una forma mejor de recoger el num
	 de veces para lanzar el dado, odio la programacion de interfaces*/
	private void startBoxes() {
		for (int i=0; i<8; i++) {
			timeBox[i] = new JTextArea();
			timesPanel.add(timeBox[i]);
		}
	}
	
	private void startResultField() {
		resultBox = new JTextArea();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
