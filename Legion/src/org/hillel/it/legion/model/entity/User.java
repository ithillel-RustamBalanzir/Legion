package org.hillel.it.legion.model.entity;
import java.util.Date;


public class User extends BaseEntity {
	private String name;
	private boolean isAdmin;				// May be reconsidered
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;				// Modify that
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public User(String name, int id, User createdBy) {			
		this.id = id;
		this.createdBy = createdBy;			// Should probably be implemented differently 
		this.createdAt = new Date();	
		this.name = name;
		this.isAdmin = false;				// False by default, should be set separately
	}
}
