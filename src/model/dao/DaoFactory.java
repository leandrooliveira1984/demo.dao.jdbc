package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() { // retorna um SellerDao
		return new SellerDaoJDBC();
		// A classe DaoFactory expoem o método (create) que retorna um tipo Interface (SellerDa),
		// mas internamente ela instancia uma implementação (SellerDaoJDBC())
	}

}
