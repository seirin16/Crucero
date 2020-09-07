package main;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Imagenes extends JPanel {
	public Imagenes() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel foto1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/mick.png")).getImage();
		foto1.setIcon(new ImageIcon(img));
		GridBagConstraints gbc_foto1 = new GridBagConstraints();
		gbc_foto1.weightx = 1.0;
		gbc_foto1.weighty = 1.0;
		gbc_foto1.gridx = 0;
		gbc_foto1.gridy = 0;
		add(foto1, gbc_foto1);
		
		JLabel foto2 = new JLabel("");
		foto2.setIcon(new ImageIcon(img));
		GridBagConstraints gbc_foto2 = new GridBagConstraints();
		gbc_foto2.weightx = 1.0;
		gbc_foto2.gridx = 1;
		gbc_foto2.gridy = 0;
		add(foto2, gbc_foto2);
	}

}
