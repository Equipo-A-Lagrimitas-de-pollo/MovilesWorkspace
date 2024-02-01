package com.moviles.model.DTO;

	
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public class DTOTecnologiaPantalla {

		
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long claveTecnologiaPantalla;
		private String tipo;

		public DTOTecnologiaPantalla(String tipo) {
			super();
			this.tipo = tipo;
		}

	}

	

