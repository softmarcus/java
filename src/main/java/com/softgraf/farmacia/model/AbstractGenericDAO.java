package com.softgraf.farmacia.model;

import java.util.List;
	

public interface AbstractGenericDAO <T>{

	boolean inserir(T entidade);
	
	void remover (T entidade);
	
	void atualizar(T entidade);
	
	List <Produto> listar();
	
}
