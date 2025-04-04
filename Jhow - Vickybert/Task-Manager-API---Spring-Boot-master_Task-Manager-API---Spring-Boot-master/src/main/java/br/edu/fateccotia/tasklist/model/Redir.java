package br.edu.fateccotia.tasklist.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Redir {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
	    private String url;
		
		
		public Redir(Integer id, String url) {
			super();
			this.id = id;
			this.url = url;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getUrl() {
			return url;
		}


		public void setUrl(String url) {
			this.url = url;
		}
}
