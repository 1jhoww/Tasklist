package br.edu.fateccotia.tasklist.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tokens")
public class Token {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private String token;
	@ManyToOne @JsonIgnore
	private User user;
	private Long expirationTime;
	
	public Token() {
		
	}
	public Token(Integer id, String token, User user, Long expirationTime) {
		super();
		Id = id;
		this.token = token;
		this.user = user;
		this.expirationTime = expirationTime;
	}
	

	public String getToken() {
		return token;
	}



	public void setToken(String token) {
		this.token = token;
	}

	public Long getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(Long expirationTime) {
		this.expirationTime = expirationTime;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	


}
