package ui;

import java.awt.BorderLayout;
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
		this.setTitle("DiceApp");
		this.setSize(700,200);
		this.setLayout(new BorderLayout());
		
		dicePanel = new JPanel();
		dicePanel.setLayout(new BoxLayout(dicePanel, BoxLayout.Y_AXIS));
		
		timesPanel = new JPanel();
		timesPanel.setLayout(new BoxLayout(timesPanel, BoxLayout.Y_AXIS));
		
		this.startButtons();
		this.startBoxes();
		this.startResultField();
		
		this.getContentPane().add(dicePanel, "West");
		this.getContentPane().add(timesPanel,"East");
		this.add(resultBox,-1);
		
		this.setVisible(true);
		
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
			timeBox[i].setEditable(true);
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
