package com.apirest.everisfinal.services;

import java.util.List;

import com.apirest.everisfinal.entity.Medicamentos;

public interface IMedicamentosService {

      List<Medicamentos> findAll(); 
      
      Medicamentos findById(Long id);
      
      Medicamentos save(Medicamentos medicamentos);
      
      void delete (Long id);
}
