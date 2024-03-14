package com.example.demo.controller;

import java.io.IOException;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.BlobEntity;
import com.example.demo.service.BlobEntityService;

@RestController
@RequestMapping("/bec")
public class BlobEntityController {
	@Autowired
	private BlobEntityService bes;
	
	@PostMapping("/upload")
	public BlobEntity upload(@RequestParam("file") MultipartFile blob) throws IOException {
		BlobEntity imm= new BlobEntity();
		imm.setBlobData(blob.getBytes());
		
		return bes.uploadBlob(imm);
	}
	@GetMapping("/mostra/{id}")
	public String mostra(@PathVariable Long id) {
		String encoded=
				Base64.encodeBase64String(
						bes.download(id));
		return encoded;
				
				//(				bes.download(id));
		
	}

}
