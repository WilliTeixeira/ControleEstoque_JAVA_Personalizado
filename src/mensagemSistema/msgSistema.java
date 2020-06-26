package mensagemSistema;

import javax.swing.JOptionPane;

import view.ViewMSG;

public class msgSistema {

	static String msg001 = "Usuário ou senha está incorreto.";
	static String msg002 = "Favor, preencha os campos.";
	
	public static void getMsgUsuarioNaoEncontrado() {
		new ViewMSG(1, msg001);
	}
	
	public static void MsgCamposVazios() {
		new ViewMSG(1, msg002);
		
	}	
}
