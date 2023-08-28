/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.venda;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/api/vendas")
public class VendaController {

    @Autowired
    private VendaService service;
    
    @GetMapping
    public ResponseEntity<List<VendaDto>> findAll(){
    	List<VendaDto> list = service.findAll();
		return ResponseEntity.ok().body(list);
    }
    
    
    @GetMapping(value = "/{id}")
	public ResponseEntity<VendaDto> findById(@PathVariable Long id){
		VendaDto dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<VendaDto> insert(@RequestBody VendaDto Dto){
		Dto = service.insert(Dto);
		URI uri = ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(Dto.getId())
					.toUri();
		return ResponseEntity.created(uri).body(null);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<VendaDto> update(
			@PathVariable Long id,
			@RequestBody VendaDto Dto){
		Dto = service.update(id, Dto);
		return ResponseEntity.ok().body(Dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
    
    
    
}