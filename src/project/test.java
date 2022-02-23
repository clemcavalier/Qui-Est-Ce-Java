package project;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;




public class test {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(1400, 800);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		frame.setContentPane(panel);
		
		ImageIcon img1 = new ImageIcon("src/project/Images/img1.png");
		JButton btn1 = new JButton(img1);
		
		
		
		
		panel.add(btn1);
		panel.add(new JButton (new ImageIcon("src/project/Images/img2.png")));
		
		panel.setBackground(Color.ORANGE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	
	}

}
