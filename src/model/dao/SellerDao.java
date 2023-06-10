package model.dao;

import java.util.List;
import model.entities.Seller;

public interface SellerDao {

	void insert (Seller obj); // inserir no banco de dados um Seller a partir do parâmetro recebido obj
	void update(Seller obj); // atualiza
	void deleteById(Integer id); // exlcui do banco de dados a partir do recebimento de um ID
	Seller findById(Integer id); // pega o ID e consulta no banco de dados
	List<Seller> findAll(); // listar todos os departamentos
	}


