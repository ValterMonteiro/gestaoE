package br.com.gestaoe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gestaoe.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
