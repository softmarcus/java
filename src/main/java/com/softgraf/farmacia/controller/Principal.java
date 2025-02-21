package com.softgraf.farmacia.controller;

import java.sql.Connection;
import java.sql.SQLException;



import com.softgraf.farmacia.model.dao.ConexaoBD;
import com.softgraf.farmacia.model.dao.ProdutoDAO;
import static com.softgraf.farmacia.view.Teclado.*;
public class Principal {

	public static void main(String[] args) throws SQLException {
		
	
		
		ConexaoBD bd = new ConexaoBD();
		Connection conexao = bd.conectar();
		
		ProdutoDAO dao = new ProdutoDAO(conexao);
		dao.criarTabela();
	
		int opcao = 0;
		
		do {
		msg("========= Sistema e FARMACIA V 1.0 =============");
		msg("1= cadastrar produto");
		msg("2 = cadastrar cliente");
		msg("3 = cadastrar pedido");
		msg("9 = sair do sistema");
		
		opcao = lerInt("escolha");
		
	}while(opcao !=9);
		
		//Continua...
		
		bd.fecharConexao(conexao);
	}
	
}
