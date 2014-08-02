package org.hillel.it.legion.service;

import java.util.List;

import org.hillel.it.legion.model.entity.User;

public interface ShopService {
	
	public void createProduct(Product product); 
	
	public List<Product> findAllProducts();
	
	public List<Product> findProductsByCategory(String categoryName);
	
	public Product findProductById(int id);
	
	public void editProduct(int id);
	
	public void removeProduct(Product product);
	
	public void createUser(User user);
	
	public User findUser(int id);
	
	public void editUser(User user);
	
	public List<User> findAllUsers();
	
	public void removeUser(User user);	
	
}
