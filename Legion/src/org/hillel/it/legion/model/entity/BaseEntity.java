package org.hillel.it.legion.model.entity;
import java.util.Date;

public class BaseEntity {

	protected int id;
	protected User createdBy;
	protected Date createdAt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
}
