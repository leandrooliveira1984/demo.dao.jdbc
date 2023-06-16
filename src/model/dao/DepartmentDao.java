package model.dao;

import java.util.List;
import model.entities.Department;

public interface DepartmentDao {

	void insert (Department obj); // inserir no banco de dados um Departamento a partir do parâmetro recebido obj
	void update (Department obj); // atualiza
	void deleteById(Integer id);  // exlcui do banco de dados a partir do recebimento de um ID
	Department findById(Integer id); // pega o ID e consulta no banco de dados
	List<Department> findAll(); // listar todos os departamentos
}
