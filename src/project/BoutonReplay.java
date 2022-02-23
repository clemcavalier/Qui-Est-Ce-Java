package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BoutonReplay {

	JButton btnReplay;
	
	
	public BoutonReplay() {
		
		btnReplay = new JButton("Rejouer !");
		
		
		btnReplay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				QuiEstCe.check(); 
				
				}

		});
		
	}
	
	public JButton getBtnReplay () {
		return btnReplay;
	}
	
	
	
}
