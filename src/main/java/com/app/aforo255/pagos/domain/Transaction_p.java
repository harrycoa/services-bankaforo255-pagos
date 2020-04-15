package com.app.aforo255.pagos.domain;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="transaction_p")
public class Transaction_p implements Serializable  {
	
	private static final long serialVersionUID = -4768773844464148005L;	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	
	@NotNull
	private Integer nroprestamo;
	
	@NotNull
	private double importe_cuota;
	
	@NotNull
	private Integer cuota;
		
	@NotNull
	@Column(name="creation_date")
	private String creationDate ;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNroprestamo() {
		return nroprestamo;
	}

	public void setNroprestamo(Integer nroprestamo) {
		this.nroprestamo = nroprestamo;
	}

	public double getImporte_cuota() {
		return importe_cuota;
	}

	public void setImporte_cuota(double importe_cuota) {
		this.importe_cuota = importe_cuota;
	}

	public Integer getCuota() {
		return cuota;
	}

	public void setCuota(Integer cuota) {
		this.cuota = cuota;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}		
	
}