package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Bouton {

	

	private  JButton btn;

	private int nombre;
	private String urlMax ;
	private String urlMin ;
	private ImageIcon img;

	public Bouton(int nombre) {

		this.nombre = nombre;
		
		urlMax = "src/public/assets/Images/img"+ nombre +".png";
		urlMin = "src/public/assets/Images/imgt"+ nombre +".png";
		
		img = new ImageIcon (urlMax);
		
		btn = new JButton(img);
		
		btn.setBorderPainted(false);
		btn.setFocusPainted(false);
		btn.setContentAreaFilled(false);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ImageIcon newImg = (ImageIcon) btn.getIcon();

				if (newImg.equals(img)) {
				btn.setIcon(new ImageIcon ("src/public/assets/Images/imgt"+nombre+".png"));
				} else {
				btn.setIcon(img);
				}
				}

		});

		

	}

	public JButton getBtn() {
		return btn;
	}
	
	public int getNombre() {
		return nombre;
	}
	

}
