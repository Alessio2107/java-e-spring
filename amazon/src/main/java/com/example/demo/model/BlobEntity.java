package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class BlobEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Lob
	@Column(columnDefinition="LONGBLOB")
	private byte[] BlobData;

	public BlobEntity() {
		super();
	}

	public BlobEntity(Long id, byte[] blobData) {
		super();
		this.id = id;
		BlobData = blobData;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getBlobData() {
		return BlobData;
	}

	public void setBlobData(byte[] blobData) {
		BlobData = blobData;
	}
	
	
}
