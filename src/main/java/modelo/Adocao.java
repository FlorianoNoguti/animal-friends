package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adocao")
public class Adocao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_adocao")
	private Long id;

	private String nomeAnunciante;
	private String telefone;
	private String estado;
	private String cidade;
	private String observacao;
	private String nomeAnimal;
	private String especie;
	private String raca;
	private String pelagem;
	private Integer idade;
	private String portePeso;
	private String sexo;
	private Boolean castracao;
	private List<Integer> imagens;
	private String descricaoAnimal;
	
	public Adocao(String nomeAnunciante,String telefone,String nomeAnimal,String raca){
		this.nomeAnunciante = nomeAnunciante;
		this.telefone = telefone;
		this.nomeAnimal = nomeAnimal;
		this.raca = raca;
	}
	
	
	public Long getId() {
		return id;
	}
	
	public String getNomeAnunciante() {
		return nomeAnunciante;
	}
	public void setNomeAnunciante(String nomeAnunciante) {
		this.nomeAnunciante = nomeAnunciante;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getPortePeso() {
		return portePeso;
	}
	public void setPortePeso(String portePeso) {
		this.portePeso = portePeso;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Boolean getCastracao() {
		return castracao;
	}
	public void setCastracao(Boolean castracao) {
		this.castracao = castracao;
	}
	public List<Integer> getImagens() {
		return imagens;
	}
	public void setImagens(List<Integer> imagens) {
		this.imagens = imagens;
	}
	public String getDescricaoAnimal() {
		return descricaoAnimal;
	}
	public void setDescricaoAnimal(String descricaoAnimal) {
		this.descricaoAnimal = descricaoAnimal;
	}



}
