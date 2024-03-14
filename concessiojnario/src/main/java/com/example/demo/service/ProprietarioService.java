package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.Auto;
import com.example.demo.model.Auto_Proprietario;
import com.example.demo.model.Proprietario;
import com.example.demo.repository.AutoProprietarioRepository;
import com.example.demo.repository.AutoRepository;
import com.example.demo.repository.ProprietarioRepository;

@Service
public class ProprietarioService {
	@Autowired
	ProprietarioRepository prr;
	@Autowired
	AutoProprietarioRepository aapr;
	@Autowired
	AutoRepository aar;

	public List<Proprietario> infoDI(Long auto_id) {
		// TODO Auto-generated method stub
		Auto a=aar.getReferenceById(auto_id);

			List<Auto_Proprietario> listaP
				= aapr.findA0ByA0(a);
			
			List<Long> listaiD = new ArrayList<>();
			
			for (Auto_Proprietario aaa : listaP) {
				listaiD.add(aaa.getP0().getId());
				//a.getP0()
			}
			
			 prr.findById(listaP.get(0).getP0().getId());
			 
			 
			return prr.findAllById(listaiD);
			 
			 
//			aapr.findAutoByAutoId(auto_id);
		//	List<Long> listaId= listaP.getId();
			
			
//			return null;
	}

	public List<Proprietario> getinfo(String modello) {
        Auto auto = aar.findByModello(modello); 
        

        List<Auto_Proprietario> autoProprietari = aapr.findByA0(auto);

        List<Long> proprietarioIds = new ArrayList<>();
        for (Auto_Proprietario ap1 : autoProprietari) {
            proprietarioIds.add(ap1.getP0().getId());
        }

        return prr.findAllById(proprietarioIds);
    }


}
