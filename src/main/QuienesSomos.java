package main;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class QuienesSomos extends JPanel {
	private JTextField txtAdf;
	public QuienesSomos() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		txtAdf = new JTextField();
		txtAdf.setText("Disney Cruise Line es una l\u00EDnea de cruceros operada por Walt Disney Parks");
		GridBagConstraints gbc_txtAdf = new GridBagConstraints();
		gbc_txtAdf.insets = new Insets(0, 0, 5, 0);
		gbc_txtAdf.fill = GridBagConstraints.BOTH;
		gbc_txtAdf.gridx = 0;
		gbc_txtAdf.gridy = 0;
		add(txtAdf, gbc_txtAdf);
		txtAdf.setColumns(10);
		
		JLabel fotoDisney = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/mick.png")).getImage();
		fotoDisney.setIcon(new ImageIcon(img));
		GridBagConstraints gbc_fotoDisney = new GridBagConstraints();
		gbc_fotoDisney.weighty = 1.0;
		gbc_fotoDisney.gridx = 0;
		gbc_fotoDisney.gridy = 1;
		add(fotoDisney, gbc_fotoDisney);
	}

}
