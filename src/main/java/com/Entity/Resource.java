package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Resource")
public class Resource {
	
	// create field
	// add annotation
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String resourceNamw;
	
	@Column(name = "code")
	private String resourceCode;
	
	@ManyToOne
	@JoinColumn(name = "projects_id")
	@Column(name = "projects_id")
	private int projectId;
	
	//default constructor
	public Resource() {
		
	}

	// generate getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResourceNamw() {
		return resourceNamw;
	}

	public void setResourceNamw(String resourceNamw) {
		this.resourceNamw = resourceNamw;
	}

	public String getResourceCode() {
		return resourceCode;
	}

	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	// generate toString()
	@Override
	public String toString() {
		return "Resource [id=" + id + ", resourceNamw=" + resourceNamw + ", resourceCode=" + resourceCode
				+ ", projectId=" + projectId + "]";
	}	
}
