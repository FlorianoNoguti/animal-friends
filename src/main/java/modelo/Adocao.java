package modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adocao")
public class Adocao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_adocao")
	private Long id ;
	
	
	private String nome;
	
	private String cpf;
	
	private String descricaoAnimal;
	
	private String informacoesContato;
	
	private String porte;
	
	private String especie;
	
	private String sexo;
	
	private Integer idade;
	
	private String pelagem;
	
	private String raca;
	
	private String linkVideo;
	
	private Boolean castrado;
	
	private Date dataCadastro;
	
	private String cidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDescricaoAnimal() {
		return descricaoAnimal;
	}

	public void setDescricaoAnimal(String descricaoAnimal) {
		this.descricaoAnimal = descricaoAnimal;
	}

	public String getInformacoesContato() {
		return informacoesContato;
	}

	public void setInformacoesContato(String informacoesContato) {
		this.informacoesContato = informacoesContato;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	

	public String getLinkVideo() {
		return linkVideo;
	}

	public void setLinkVideo(String linkVideo) {
		this.linkVideo = linkVideo;
	}

	public Boolean getCastrado() {
		return castrado;
	}

	public void setCastrado(Boolean castrado) {
		this.castrado = castrado;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}	
	 
	
	

}
