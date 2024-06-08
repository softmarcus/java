package com.softgraf.farmacia.view;

import com.softgraf.farmacia.model.Produto;

public class ProdutoView {

		private ProdutoView() {};
		
		public static Produto cadastrar() {
			System.out.println("-----Cadastro de  produto");
			
			String codigo = Teclado.lerString("codigo do produto");
			String descricao = Teclado.lerLinha("descricao do produto");
			float preco = Teclado.lerFloat("preco do produto");
			
			Produto p = new Produto(codigo,descricao,preco);
			
			return p;
		}
}
