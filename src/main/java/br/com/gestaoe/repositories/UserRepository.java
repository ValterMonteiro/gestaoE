package br.com.gestaoe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gestaoe.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
