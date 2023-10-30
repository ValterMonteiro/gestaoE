package br.com.gestaoe.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.gestaoe.dto.ProdutoDto;
import br.com.gestaoe.dto.RoleDTO;
import br.com.gestaoe.dto.UserDTO;
import br.com.gestaoe.dto.UserInsertDTO;
import br.com.gestaoe.entities.Role;
import br.com.gestaoe.entities.User;
import br.com.gestaoe.repositories.RoleRepository;
import br.com.gestaoe.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
	private RoleRepository roleRepository;
    
    @Transactional(readOnly = true)
	public List<UserDTO> findAll(){
		List<User> lista = userRepository.findAll();
		return lista.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
	}
    
    @Transactional
	public UserDTO insert(UserInsertDTO dto) {
		User entity = new User();
		copiarDTOParaEntidade(dto, entity);
		
		entity.setSenha(passwordEncoder.encode(dto.getSenha()));		
		
		entity = userRepository.save(entity);

		return new UserDTO(entity);
	}
    
    private void copiarDTOParaEntidade(UserDTO dto, User entity) {	
		 
		entity.setEmail(dto.getEmail());
		
		entity.getRoles().clear();
		for(RoleDTO roleDTO : dto.getRoles()) {
			Role role = roleRepository.getReferenceById(roleDTO.getId());
			entity.getRoles().add(role);
		}
	}

}
