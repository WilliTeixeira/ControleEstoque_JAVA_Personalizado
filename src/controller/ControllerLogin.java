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
		
		// O código abaixo valida se o usuário preencheu os campos de usuário e senha
		// Se não preencher qualquer um dos campos, uma mensagem é exibida.
		// Caso contrário vai para a etapa de busca do usuário no banco de dados.
		
		if (usuario.trim().length() == 0 || senha.length() == 0) {
			msgSistema.MsgCamposVazios();
		}else {
			
		// Aqui abaixo realiza consulta no banco de dados. Caso encontre, abrirá 
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
