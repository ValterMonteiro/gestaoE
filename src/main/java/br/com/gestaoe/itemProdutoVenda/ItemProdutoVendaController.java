/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.itemProdutoVenda;

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
@RequestMapping("/api/itemProdutoVenda")
public class ItemProdutoVendaController  {

    @Autowired
private ItemProdutoVendaService service;
    
    @GetMapping
    public ResponseEntity<List<ItemProdutoVendaDto>> findAll(){
    	List<ItemProdutoVendaDto> list = service.findAll();
		return ResponseEntity.ok().body(list);
    }
    
    
    @GetMapping(value = "/{id}")
	public ResponseEntity<ItemProdutoVendaDto> findById(@PathVariable Long id){
		ItemProdutoVendaDto dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
    
	@PostMapping
	public ResponseEntity<ItemProdutoVendaDto> insert(@RequestBody ItemProdutoVendaDto Dto){
		Dto = service.insert(Dto);
		URI uri = ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(Dto.getId())
					.toUri();
		return ResponseEntity.created(uri).body(null);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<ItemProdutoVendaDto> update(
			@PathVariable Long id,
			@RequestBody ItemProdutoVendaDto Dto){
		Dto = service.update(id, Dto);
		return ResponseEntity.ok().body(Dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
}