package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void insert (Seller obj); // inserir no banco de dados um Seller a partir do parâmetro recebido obj
	void update(Seller obj); // atualiza
	void deleteById(Integer id); // exlcui do banco de dados a partir do recebimento de um ID
	Seller findById(Integer id); // consultar o vendedor por ID no banco de dados
	List<Seller> findAll(); // listar todos os os vendedores 
	List<Seller> findByDepartment(Department department);// Listar os vendedores por ID do Departamento
}
