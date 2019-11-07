package com.mely.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="medico")
public class Medico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMedico;
	
	@Size(min=3, message="Nombres debe tener mínimo 3 caracteres")
	@Column(name="nombres", nullable = false, length= 70)
	private String nombres;
	
	@Size(min=3, message="Apellidos debe tener mínimo 3 caracteres")
	@Column(name="apellidos", nullable = false, length= 70)
	private String apellidos;
	
	@Size(min=3, message="Nombres debe tener mínimo 3 caracteres")
	@Column(name="cmp", nullable = false, length= 70)
	private String cmp;
	
	public Integer getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCmp() {
		return cmp;
	}
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}
	
}
