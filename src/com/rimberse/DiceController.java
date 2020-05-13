package com.rimberse;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DiceController {
	private JFrame frame;
	private JLabel label;
	private JComboBox<String> numOfDice;
	private JPanel content;

	public void getGuiPanel() {
		frame = new JFrame();
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JButton button = new JButton("Roll 'em!");
		String[] choices = { "1", "2", "3", "4", "5", "6" };
		numOfDice = new JComboBox<>(choices);
		label = new JLabel("Dice values will be displayed here");
		button.addActionListener(new RollEmListener());
		panel.add(numOfDice);
		panel.add(button);
		panel.add(label);

		content = new JPanel();
		content.setLayout(new GridLayout(2, 3, 5, 5));
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(BorderLayout.CENTER, content);
		mainPanel.add(BorderLayout.NORTH, panel);
		
		frame.add(mainPanel);
		frame.setSize(700, 500);
		frame.setTitle("Dice Roller");
		frame.setVisible(true);
	}

	private class RollEmListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent ev) {
			// roll the dice
			content.removeAll();
			String diceOutput = "";
			String selection = (String) numOfDice.getSelectedItem();
			int numOfDiceToRoll = Integer.parseInt(selection);

			for (int i = 0; i < numOfDiceToRoll; i++) {
				int random = (int) ((Math.random() * 6) + 1);
				diceOutput += (" " + random);

				if (random == 1) {
					content.add(new DiceOne());
				}
				if (random == 2) {
					content.add(new DiceTwo());
				}
				if (random == 3) {
					content.add(new DiceThree());
				}
				if (random == 4) {
					content.add(new DiceFour());
				}
				if (random == 5) {
					content.add(new DiceFive());
				}
				if (random == 6) {
					content.add(new DiceSix());
				}
			}
			
			label.setText(diceOutput);
			frame.repaint();
		}
	}
}