package project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class QuiEstCe {

	static JFrame frame = new JFrame("Qui est-ce ?");

	public static void check() {

		// Window
		// --------------------------------------------------------------------------------------------------

		frame.setSize(1400, 800);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		// Logo
		// --------------------------------------------------------------------------------------------------

		ImageIcon imageLogo = new ImageIcon("src/public/assets/Images/logo.png");
		JLabel labelLogo = new JLabel(imageLogo, JLabel.CENTER);
		

		// Image random
		// --------------------------------------------------------------------------------------------

		Random rand = new Random();
		int randomNum = rand.nextInt((24 - 1) + 1) + 1;
		JLabel labelImageAleatoire = new JLabel(new ImageIcon("src/public/assets/Images/img250_" + randomNum + ".png"));

		// Button replay
		// -------------------------------------------------------------------------------------------

		BoutonReplay boutonReplay = new BoutonReplay();

		// Left
		// --------------------------------------------------------------------------------------------------

		JPanel left = new JPanel();
		left.setBackground(Color.orange);
		left.setPreferredSize(new Dimension(300, 700));
		left.setLayout(new FlowLayout());

		left.add(labelLogo);
		left.add(boutonReplay.getBtnReplay());
		left.add(labelImageAleatoire);

		// Right
		// --------------------------------------------------------------------------------------------------

		JPanel right = new JPanel();
		right.setBackground(Color.orange);
		right.setPreferredSize(new Dimension(1100, 680));

		right.setLayout(new FlowLayout());

		// Images
		// ------------------------------------------------------------------------------------------------

		for (int i = 1; i <= 24; i++) {

			right.add(new Bouton(i).getBtn());

		}

		// Container principal
		// ----------------------------------------------------------------------------------------------

		JPanel principal = new JPanel();

		principal.setPreferredSize(new Dimension(1000, 750));
		principal.setBackground(Color.orange);

		principal.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;

		gbc.gridheight = 1;
		gbc.gridwidth = 1;

		principal.add(left, gbc);

		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = GridBagConstraints.REMAINDER;
		gbc.gridx = 1;

		principal.add(right, gbc);

		frame.setContentPane(principal);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static void main(String[] args) {

		check();

	}

}
