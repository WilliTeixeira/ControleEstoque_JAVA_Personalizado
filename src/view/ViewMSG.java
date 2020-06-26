package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

import controller.ControllerLogin;
import sessao.Sessao;
import sessao.Usuario;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class ViewMSG extends JDialog {

	public ViewMSG(int tipoMsg, String msg) {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Mensagem");
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		JLabel lblIcone = new JLabel("\r\n");
		
		switch(tipoMsg) {
			case 1:	
				lblIcone.setIcon(new ImageIcon(ViewMSG.class.getResource("/icons/infoIcon64.png")));
				setTitle("Mensagem");
				break;
		    case 2: 
		    	lblIcone.setIcon(new ImageIcon(ViewMSG.class.getResource("/icons/alertIcon64.png")));
		    	setTitle("Alerta");
		    	break;
		    case 3: 
		    	lblIcone.setIcon(new ImageIcon(ViewMSG.class.getResource("/icons/erroIcon72.png")));
		    	setTitle("Erro");
		    	break;
		}
		
		lblIcone.setBounds(20, 11, 68, 80);
		getContentPane().add(lblIcone);
		JLabel lblBotãoOK = new JLabel("OK");
		lblBotãoOK.setOpaque(true);
		lblBotãoOK.setHorizontalAlignment(SwingConstants.CENTER);
		lblBotãoOK.setForeground(Color.WHITE);
		lblBotãoOK.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBotãoOK.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), null, null, null));
		lblBotãoOK.setBackground(new Color (147, 112, 219));
		lblBotãoOK.setBounds(162, 91, 135, 39);
		
		getContentPane().add(lblBotãoOK);
		
		JTextArea txtAMensagem = new JTextArea();
		txtAMensagem.setEditable(false);
		txtAMensagem.setLineWrap(true);
		txtAMensagem.setBounds(105, 11, 307, 69);
		getContentPane().add(txtAMensagem);
        txtAMensagem.setText(msg);
		lblBotãoOK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblBotãoOK.setBackground(new Color (165, 130, 240));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblBotãoOK.setBackground(new Color (147, 112, 219));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				lblBotãoOK.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), null, null, null));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblBotãoOK.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), null, null, null));
			}
			@Override
			public void mouseClicked(MouseEvent e) {				
				dispose();
			}
		});
		setSize(450, 180);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
