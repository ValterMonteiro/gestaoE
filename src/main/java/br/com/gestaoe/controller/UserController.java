package br.com.gestaoe.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.gestaoe.dto.UserDTO;
import br.com.gestaoe.dto.UserInsertDTO;
import br.com.gestaoe.service.UserService;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
    public ResponseEntity<List<UserDTO>> findAll(){
    	List<UserDTO> list = userService.findAll();
		return ResponseEntity.ok().body(list);
    }
	
	@PostMapping
	public ResponseEntity<UserDTO> insert(@RequestBody UserInsertDTO dto){
		UserDTO newDto = userService.insert(dto);
		URI uri = ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(newDto.getId())
					.toUri();
		return ResponseEntity.created(uri).body(newDto);
	}

}
