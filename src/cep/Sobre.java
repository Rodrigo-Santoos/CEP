package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(300, 300, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP vs 1.0");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(54, 11, 148, 29);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@ Rodrigo de Oliveira dos Santos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(54, 51, 306, 29);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblWeb = new JLabel("Web Service:");
		lblWeb.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWeb.setBounds(54, 100, 148, 14);
		getContentPane().add(lblWeb);
		
		JLabel lblWebService = new JLabel("republicavirtual.com.br");
		lblWebService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.republicavirtual.com.br/");
			}
		});
		lblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblWebService.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWebService.setForeground(SystemColor.textHighlight);
		lblWebService.setBounds(164, 96, 260, 22);
		getContentPane().add(lblWebService);
		
		JButton btnGit = new JButton("");
		btnGit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/Rodrigo-Santoos");
			}
		});
		btnGit.setToolTipText("GitHub");
		btnGit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGit.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGit.setBounds(176, 148, 48, 48);
		getContentPane().add(btnGit);
		
	}
	
	//metodo para abrir site no navegador
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
