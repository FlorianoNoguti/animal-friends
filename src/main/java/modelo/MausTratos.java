package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="maus_tratos")

public class MausTratos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_mausTratos")
	private Long id;
	
	private String descricaoAnimal;
	
	private String informaoesContato;
	
	private String cidade;
	
	private Double latitude;
	
	private Double longitude;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoAnimal() {
		return descricaoAnimal;
	}

	public void setDescricaoAnimal(String descricaoAnimal) {
		this.descricaoAnimal = descricaoAnimal;
	}

	public String getInformaoesContato() {
		return informaoesContato;
	}

	public void setInformaoesContato(String informaoesContato) {
		this.informaoesContato = informaoesContato;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	
}
