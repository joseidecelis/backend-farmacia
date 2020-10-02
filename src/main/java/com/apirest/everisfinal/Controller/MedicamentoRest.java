package com.apirest.everisfinal.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.everisfinal.entity.Medicamentos;
import com.apirest.everisfinal.services.IMedicamentosService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping(value="/api")

public class MedicamentoRest {
	
	@Autowired
	private IMedicamentosService medicamentoservice;
	
	@GetMapping("/medicamentos")
	
	public List<Medicamentos>index(){
		
		return medicamentoservice.findAll();
	}
	
	@GetMapping("/medicamento/{id}")
	public Medicamentos show(@PathVariable Long id) {
		
		return medicamentoservice.findById(id);
	}
	
	@PostMapping("/guardar")
	@ResponseStatus(HttpStatus.CREATED)
	public Medicamentos create(@RequestBody Medicamentos medicamento) {
		
		return medicamentoservice.save(medicamento);
	}
	
	@PutMapping("/medicamento/{id}")
	public Medicamentos update(@RequestBody Medicamentos medicamento, @PathVariable Long id) {
		Medicamentos medicamentoactual= medicamentoservice.findById(id);
		medicamentoactual.setNombre(medicamento.getNombre());
		medicamentoactual.setDescripcion(medicamento.getDescripcion());
		medicamentoactual.setContraindicacion(medicamento.getContraindicacion());
		medicamentoactual.setLaboratorio(medicamento.getLaboratorio());
		medicamentoactual.setFormato(medicamento.getFormato());
		medicamentoactual.setPrecio(medicamento.getPrecio());
		medicamentoactual.setCantidad(medicamento.getCantidad());
		
		return medicamentoservice.save(medicamentoactual);
	}
	
	@DeleteMapping("/medicamento/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		
		medicamentoservice.delete(id);
	}
	
}
