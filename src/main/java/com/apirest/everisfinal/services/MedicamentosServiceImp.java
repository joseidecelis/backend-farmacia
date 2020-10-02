package com.apirest.everisfinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.everisfinal.Dao.IMedicamentos;
import com.apirest.everisfinal.entity.Medicamentos;

@Service
public class MedicamentosServiceImp implements IMedicamentosService{
	
	@Autowired
	private IMedicamentos imedicamentodao;
	
	@Override
	public List<Medicamentos> findAll() {
		
		return (List<Medicamentos>) imedicamentodao.findAll();
	}
	
	@Override
	public Medicamentos findById(Long id) {
		
		return imedicamentodao.findById(id).orElse(null);
	}
	
	@Override
	public Medicamentos save(Medicamentos medicamentos) {
		
		return imedicamentodao.save(medicamentos);
	}
	
	@Override
	public void delete(Long id) {
		
		imedicamentodao.deleteById(id);
		
	}

}
