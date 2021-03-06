package br.com.alura.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ordem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Double preco;

	private String tipo;

	private LocalDate data;

	private String status;

	@Column(name = "user_id")
	private Long userId;
	
	public void setPreco(Double preco) {
	    this.preco = preco;
	}

	public LocalDate getData() {
		return data;
	}

	public String getStatus() {
		return status;
	}

	public void setTipo(String tipo) {
	    this.tipo = tipo;
	}

	public Long getUserId() {
		return userId;
	}

	public Long getId() {
		return id;
	}

	public void setData(LocalDate data) {
	    this.data = data;
	}

	public void setStatus(String status) {
	    this.status = status;
	}

	public void setUserId(Long userId) {
	    this.userId = userId;
	}
	
	

}
