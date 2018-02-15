package com.x.api.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
	  @Id
	  @Column(name = "id")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  long id;

	  @Column(name = "active", nullable = false, columnDefinition = "BIT DEFAULT true")
	  boolean active;

	  public long getId() {
	    return id;
	  }

	  public void setId(long id) {
	    this.id = id;
	  }

	  public boolean isActive() {
	    return active;
	  }

	  public void setActive(boolean active) {
	    this.active = active;
	  }
}
