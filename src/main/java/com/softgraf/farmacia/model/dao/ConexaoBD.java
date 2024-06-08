package com.softgraf.farmacia.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

	private String urlConexao = "jdbc:sqlite:estoque.db";

	public Connection conectar() {
		 Connection conexao = null;
		
		try {
			conexao = DriverManager.getConnection(urlConexao);
			System.out.println("connectou");

		} catch (SQLException e) {
			System.out.println(" ERRO DE CONEXAO COM O BANCO DE DADOS SQLITE");
			e.printStackTrace();
		}
		return conexao;
	}

	public boolean fecharConexao(Connection conexao) {
		boolean fechou = false;

		try {
			if (conexao != null && !conexao.isClosed()) {
				conexao.close();
				System.out.println("fechou a conexao");
				fechou = true;
			}
		} catch (SQLException e) {
			System.out.println("erro ao fechar com o banco de dados");
			e.printStackTrace();
		}
		return fechou;
	}
}
