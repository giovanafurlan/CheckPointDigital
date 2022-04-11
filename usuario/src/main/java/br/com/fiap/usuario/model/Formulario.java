package br.com.fiap.usuario.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formulario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name = "Giovana";
	private LocalDate dataNascimento = LocalDate.now();
	private String email = "giovana@gmai.com";
	private String senha = "012345";
	
	@Override
	public String toString() {
		return "Formulario [id=" + id + ", name=" + name + ", dataNascimento=" + dataNascimento + ", email=" + email
				+ ", senha=" + senha + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
