package view;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.SoftBevelBorder;

import conexaoDB.Conexao;
import controller.ControllerLogin;
import sessao.Sessao;
import sessao.Usuario;

public class Viewlogin extends JDialog {
	private JTextField tfUsuario;
	private JPasswordField pfSenha;
	private JLabel lblIcon;
	
	public Viewlogin() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Log in");
		setResizable(false);
		getContentPane().setBackground(new Color(147, 112, 219));		
		getContentPane().setLayout(null);
		
		lblIcon = new JLabel("");
		lblIcon.setForeground(Color.BLACK);
		lblIcon.setBackground(Color.WHITE);
		lblIcon.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblIcon.setIcon(new ImageIcon(Viewlogin.class.getResource("/icons/loginIcon.png")));
		lblIcon.setBounds(32, 81, 138, 140);
		getContentPane().add(lblIcon);
		
		JLabel lblLogin = new JLabel("Usu\u00E1rio");
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLogin.setBounds(180, 121, 100, 27);
		getContentPane().add(lblLogin);
		
		JLabel lblPassword = new JLabel("Senha");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(180, 159, 100, 27);
		getContentPane().add(lblPassword);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		tfUsuario.setBounds(262, 121, 152, 26);
		getContentPane().add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setFont(new Font("Tahoma", Font.BOLD, 15));
		pfSenha.setBounds(262, 159, 152, 26);
		getContentPane().add(pfSenha);
		
		JLabel lblTitulo = new JLabel("INFORME SUAS CREDENCIAS");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitulo.setBounds(92, 11, 275, 46);
		getContentPane().add(lblTitulo);
		
		JLabel lblBotãoEntrar = new JLabel("Entrar");
		lblBotãoEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblBotãoEntrar.setBackground(new Color (255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblBotãoEntrar.setBackground(new Color (147, 112, 219));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				lblBotãoEntrar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), null, null, null));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblBotãoEntrar.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), null, null, null));
			}
			@Override
			public void mouseClicked(MouseEvent e) {				
				Sessao.getInstance().setUsuario(new Usuario(tfUsuario.getText(), new String(pfSenha.getPassword())));
				new ControllerLogin().ValidaAcesso();
			}
		});
		lblBotãoEntrar.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), null, null, null));
		lblBotãoEntrar.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBotãoEntrar.setForeground(new Color(255, 255, 255));
		lblBotãoEntrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblBotãoEntrar.setBounds(151, 242, 135, 39);
		lblBotãoEntrar.setBackground(new Color (147, 112, 219));
		getContentPane().add(lblBotãoEntrar);
		setSize(450, 350);
		setLocationRelativeTo(null);
		setVisible(true);

	}
}
