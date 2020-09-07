package main;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;

import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Color;

public class Inicio extends JPanel {
	private JFrame frame;
	private JTextField contraseñaField;
	private JTextField usuarioField;

	public Inicio(JFrame frame) {
		this.frame = frame;

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblUsuario = new JLabel("USUARIO");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 0;
		add(lblUsuario, gbc_lblUsuario);

		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 0);
		gbc_lblContrasea.gridx = 2;
		gbc_lblContrasea.gridy = 0;
		add(lblContrasea, gbc_lblContrasea);

		contraseñaField = new JTextField();
		GridBagConstraints gbc_contraseñaField = new GridBagConstraints();
		gbc_contraseñaField.gridheight = 2;
		gbc_contraseñaField.insets = new Insets(0, 0, 5, 10);
		gbc_contraseñaField.fill = GridBagConstraints.BOTH;
		gbc_contraseñaField.gridx = 2;
		gbc_contraseñaField.gridy = 1;
		add(contraseñaField, gbc_contraseñaField);
		contraseñaField.setColumns(10);

		usuarioField = new JTextField();
		GridBagConstraints gbc_usuarioField = new GridBagConstraints();
		gbc_usuarioField.gridheight = 2;
		gbc_usuarioField.insets = new Insets(0, 10, 5, 5);
		gbc_usuarioField.fill = GridBagConstraints.BOTH;
		gbc_usuarioField.gridx = 0;
		gbc_usuarioField.gridy = 1;
		add(usuarioField, gbc_usuarioField);
		usuarioField.setColumns(10);

		JButton btnNewButton = new JButton("Inicio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a = usuarioField.getText();
				String b = contraseñaField.getText();
				if (b.equals("AAAA") && a.length() > 3 || true) {
					frame.setContentPane(new PantallaPrincipal(frame));
					frame.revalidate();
					frame.repaint();
				} else {
					JOptionPane.showMessageDialog(null, "Error, repIta la operacion");
				}
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(25, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 3;
		add(btnNewButton, gbc_btnNewButton);

		JLabel lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.gridheight = 5;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 4;
		add(lblNewLabel, gbc_lblNewLabel);
		Image img = new ImageIcon(this.getClass().getResource("/ship-speed-icon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));

	}

}
