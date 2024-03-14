package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BlobEntity;
import com.example.demo.repository.BlobEntityRepository;

@Service
public class BlobEntityService {
	@Autowired
	BlobEntityRepository ber;

	public BlobEntity uploadBlob(BlobEntity imm) {
		
		return ber.save(imm);
		// TODO Auto-generated method stub
		
	}

	public byte[] download(Long id) {
		// TODO Auto-generated method stub
		return ber.getReferenceById(id).getBlobData();
	}

}
