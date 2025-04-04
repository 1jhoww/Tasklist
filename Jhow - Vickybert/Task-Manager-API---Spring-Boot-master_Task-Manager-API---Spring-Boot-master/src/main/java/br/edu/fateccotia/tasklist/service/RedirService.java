package br.edu.fateccotia.tasklist.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fateccotia.tasklist.model.Redir;
import br.edu.fateccotia.tasklist.repository.RedirRepository;

@Service
public class RedirService {
	
	@Autowired
	private RedirRepository redirRepository;
	
	
	public void encurta(Integer id, String url){
		
	Optional<Redir> urlFound = redirRepository.findById(url);
		
		}
	
	
	

}
