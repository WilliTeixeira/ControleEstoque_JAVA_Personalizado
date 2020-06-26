package controller;

import javax.swing.JOptionPane;

import mensagemSistema.msgSistema;
import model.modelLogin;
import sessao.Sessao;

public class ControllerLogin {

	public void AcessaTelaPrincipal() {	
			
	} 

	public boolean ValidaAcesso() {
		boolean podeAcessar = false;
		String usuario = Sessao.getInstance().getUsuario().getLogin();
		String senha = Sessao.getInstance().getUsuario().getSenha();
		
		// O c�digo abaixo valida se o usu�rio preencheu os campos de usu�rio e senha
		// Se n�o preencher qualquer um dos campos, uma mensagem � exibida.
		// Caso contr�rio vai para a etapa de busca do usu�rio no banco de dados.
		
		if (usuario.trim().length() == 0 || senha.length() == 0) {
			msgSistema.MsgCamposVazios();
		}else {
			
		// Aqui abaixo realiza consulta no banco de dados. Caso encontre, abrir� 
		// a tela Principal

			podeAcessar = modelLogin.buscarUsuario();
			if (podeAcessar) {
				
			} else {
				msgSistema.getMsgUsuarioNaoEncontrado();
			}
		}
		return podeAcessar;
	}
	
}
