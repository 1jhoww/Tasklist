package br.edu.fateccotia.tasklist.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.edu.fateccotia.tasklist.model.Redir;

public interface RedirRepository extends CrudRepository<Redir, Integer>{

	Optional<Redir> findById(String url);

	

}
