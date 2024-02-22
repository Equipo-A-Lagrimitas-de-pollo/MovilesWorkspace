package com.example.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ram {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long idRam;
	
	private String modeloRam;

	public Ram(String modeloRam) {
		super();
		this.modeloRam = modeloRam;
	}
	
}
