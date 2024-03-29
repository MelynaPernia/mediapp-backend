package com.mely.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="consulta")

public class Consulta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idConsulta;
	
	// Representación de llave foranea
	
	@ManyToOne
	@JoinColumn(name="id_paciente", nullable = false, foreignKey = @ForeignKey(name="fk_consulta_paciente"))
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name="medico", nullable = false, foreignKey = @ForeignKey(name="fk_consulta_medico"))
	private Medico medico;
	@ManyToOne
	@JoinColumn(name="id_especialidad", nullable = false, foreignKey = @ForeignKey(name="fk_consulta_especialidad"))
	private Especialidad especialidad;
	private LocalDateTime fecha;
	
	// cascade es para trabajar en cascada
	// como se va comportar JSPA fetch = FetchType.LAZY lAZY- es perezoso  
	// FectchType => puedes usar EAGER cuando los registros son pocos
	@OneToMany(mappedBy="consulta", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.LAZY, orphanRemoval = true)
	private List<DetalleConsulta>  detalleConsulta ;
	
	
	
	public Integer getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public List<DetalleConsulta> getDetalleConsulta() {
		return detalleConsulta;
	}
	public void setDetalleConsulta(List<DetalleConsulta> detalleConsulta) {
		this.detalleConsulta = detalleConsulta;
	}
	
	
}
