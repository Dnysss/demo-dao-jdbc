package app;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Seller seller = new Seller(21, "Denys", "denys@gmail.com", new Date(), 3000.0, new Department(1, "Books"));
		System.out.println(seller);
	}

}
