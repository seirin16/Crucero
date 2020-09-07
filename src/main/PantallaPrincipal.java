package main;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaPrincipal extends JPanel {
	private JFrame frame;
	private JTextField txtquienesSomos;
	private JTextField txtImagenes;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	public PantallaPrincipal(JFrame frame) {
		this.frame= frame;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		txtquienesSomos = new JTextField();
		txtquienesSomos.setHorizontalAlignment(SwingConstants.CENTER);
		txtquienesSomos.setText("\u00BFQUIENES SOMOS?");
		GridBagConstraints gbc_txtquienesSomos = new GridBagConstraints();
		gbc_txtquienesSomos.insets = new Insets(100, 100, 5, 100);
		gbc_txtquienesSomos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtquienesSomos.gridx = 0;
		gbc_txtquienesSomos.gridy = 0;
		add(txtquienesSomos, gbc_txtquienesSomos);
		txtquienesSomos.setColumns(10);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QuienesSomos Qs = new QuienesSomos();
				frame.setContentPane(Qs);
				frame.revalidate();
				frame.repaint();
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(10, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		add(btnNewButton_1, gbc_btnNewButton_1);
		
		txtImagenes = new JTextField();
		txtImagenes.setHorizontalAlignment(SwingConstants.CENTER);
		txtImagenes.setText("IMAGENES");
		GridBagConstraints gbc_txtImagenes = new GridBagConstraints();
		gbc_txtImagenes.insets = new Insets(80, 100, 5, 100);
		gbc_txtImagenes.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtImagenes.gridx = 0;
		gbc_txtImagenes.gridy = 2;
		add(txtImagenes, gbc_txtImagenes);
		txtImagenes.setColumns(10);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(10, 0, 100, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 3;
		add(btnNewButton, gbc_btnNewButton);
	}

}
