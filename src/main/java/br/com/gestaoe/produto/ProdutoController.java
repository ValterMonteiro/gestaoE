/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gestaoe.produto;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
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
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;
    
    @GetMapping
    public ResponseEntity<List<ProdutoDto>> findAll(){
    	List<ProdutoDto> list = service.findAll();
		return ResponseEntity.ok().body(list);
    }
    
    
    @GetMapping(value = "/{id}")
	public ResponseEntity<ProdutoDto> findById(@PathVariable Long id){
		ProdutoDto dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<ProdutoDto> insert(@RequestBody ProdutoDto Dto){
		Dto = service.insert(Dto);
		URI uri = ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(Dto.getId())
					.toUri();
		return ResponseEntity.created(uri).body(null);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<ProdutoDto> update(
			@PathVariable Long id,
			@RequestBody ProdutoDto Dto){
		Dto = service.update(id, Dto);
		return ResponseEntity.ok().body(Dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
    
    //relatorio controle de estoque
	/*
	@GetMapping(value="/relatorio")
	public String listarControleDeEstoque(Model model) {
        List<ControleDeEstoque> controleDeEstoque = service.getControleDeEstoque();
        model.addAttribute("controleDeEstoque", controleDeEstoque);
        return "listaControleDeEstoque";
    }
	*/
	
	@GetMapping(value="/controleDeEstoque")
	public ResponseEntity<List<ControleDeEstoqueDTO>> findByControleDeEstoqueSQL(@PathVariable 
			LocalDate data, Long id,String descricao,Long entradaQuantidade, Double entradaValorUnit, 
			Double entradaValorTotal, Long saidaQuantidade, Double saidaValorUnit, Double saidaValorTotal,
			Long saldoQuantidade, Double saldoValorUnit, Double saldoValorTotal){
		List<ControleDeEstoqueDTO> lista = service.findByControleDeEstoqueSQL(
				data, id, descricao, entradaQuantidade, entradaValorUnit,
				entradaValorTotal, saidaQuantidade, saidaValorUnit, saidaValorTotal,
				saldoQuantidade, saldoValorUnit, saldoValorTotal);
		return ResponseEntity.ok().body(lista);
	}
}