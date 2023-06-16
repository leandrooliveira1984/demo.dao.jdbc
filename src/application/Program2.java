package application;

import java.util.List;
import java.util.Scanner;

import org.graalvm.compiler.nodes.extended.GetClassNode;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartamentDao();
		
		System.out.println("=== Test 1: department findById ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n=== Test 2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep); //Para cada Department dep da lista list, imprima na tela o dep.
		}
		System.out.println("\n=== Test 3: insert Department ===");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Insert complete: " + newDepartment.getId());
		
		
		sc.close();
	}

}
