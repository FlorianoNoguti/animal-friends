package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.process.internal.RequestScoped;

import dao.DAOGenerico;
import modelo.Adocao;
import modelo.MausTratos;
import utilitarios.ValidaCPF;

@Path("/WebService")
@ApplicationPath("/resource")
public class ServicoWeb extends Application {

	@POST
	@Path("/add")
	public String addUser(@FormParam("name") String name, @FormParam("age") int age) {

		// return Response.status(200)
		// .entity("addUser is called, name : " + name + ", age : " + age)
		// .build();{
		System.out.println("Nome:" +name);
		return name;
		}
	

	@POST
	@Path("/addForm")
	public String addUsuario(@FormParam("name") String name, @FormParam("age") int age) {

		return "addUser is called, name : " + name + ", age : " + age;

	}
//	http://172.17.244.150:8080/ServicoWeb/resource/WebService/addAdocao
//	http://localhost:8080/ServicoWeb/resource/WebService/addAdocao

	@POST
	@Path("/addAdocao")
	public Response addAdocao(@FormParam("nomeAnunciante") String nomeAnunciante, @FormParam("telefone") String telefone,
			@FormParam("cidade") String cidade, @FormParam("estado") String estado,@FormParam("observacao")String observacao,
			@FormParam("nomeAnimal") String nomeAnimal, @FormParam("especie") String especie, @FormParam("raca") String raca,
			@FormParam("pelagem") String pelagem,@FormParam("idade")Integer idade,@FormParam("portePeso")String portePeso,
			@FormParam("sexo")String sexo ,@FormParam("castracao")Boolean castracao, @FormParam("descricaoAnimal") String descricaoAnimal) {
		
		
		Adocao adocao = new Adocao();
		adocao.setNomeAnunciante(nomeAnunciante);
		adocao.setTelefone(telefone);
		adocao.setCidade(cidade);
		adocao.setEstado(estado);
		adocao.setObservacao(observacao);
		adocao.setNomeAnimal(nomeAnimal);
		adocao.setEspecie(especie);
		adocao.setRaca(raca);
		adocao.setPelagem(pelagem);
		adocao.setIdade(idade);
		adocao.setPortePeso(portePeso);
		adocao.setSexo(sexo);
		adocao.setCastracao(castracao);
		adocao.setDescricaoAnimal(descricaoAnimal);
		
			
		DAOGenerico dao = new DAOGenerico();
		dao.inserir(adocao);

		return Response.status(200).entity("Inserido com sucesso!").build();
	}
	
	
//	http://172.17.244.150:8080//ServicoWeb/resource/WebService/addMausTratos
//	http://localhost:8080/ServicoWeb/resource/WebService/addMausTratos
	@POST
	@Path("/addMausTratos")
	public Response addMausTratos(@FormParam("descricaoAnimal") String descricaoAnimal,@FormParam("informacoesContato") String informacoesContato,
			@FormParam("cidade") String cidade,@FormParam("latitude") Double latitude,@FormParam("longitude") Double longitude){
				
		MausTratos mausTratos = new MausTratos();
		mausTratos.setDescricaoAnimal(descricaoAnimal);
		mausTratos.setCidade(cidade);
		mausTratos.setLatitude(latitude);
		mausTratos.setLongitude(longitude);
		
		DAOGenerico dao = new DAOGenerico();
		dao.inserir(mausTratos);
		
		return Response.status(200).entity("Inserido com sucesso!").build();
		
	}

	@GET
	@Path("/listaString")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pessoa> listaString() {
		// Pode buscar do banco
		List<Pessoa> le = new ArrayList<Pessoa>();
		le.add(new Pessoa("Frank", "ra"));
		le.add(new Pessoa("José", "rb"));

		return le;

	}

	@GET
	@Path("/adds")
	public Response addU(@QueryParam("name") String name, @QueryParam("age") int age) {

		return Response.status(200).entity("addUser is called, name is : " + name + ", age : " + age).build();

	}

	@GET
	@Path("/validaCpf")
	public boolean validarCPF(@QueryParam("cpf") String cpf) {

		if (ValidaCPF.isCPF(cpf)) {
			// return Response.status(200).entity("CPF Válido").build();
			return true;
		}

		// return Response.status(200).entity("CPF Inválido").build();
		return false;

	}

	// http://localhost:8080/ServicoWeb/resource/WebService/hello
	@GET
	@Path("/hello")
	public String getHello() {
		return "Hello Web Service";
	}

	// http://localhost:8080/ServicoWeb/resource/WebService/msg?nome=Maria
	@GET
	@Path("/msg")
	public Response getMensagem(@QueryParam("nome") String txt) {
		return Response.ok("Ola: " + txt).build();
		// return "Mensagem "+txt;
	}

	// http://localhost:8080/ServicoWeb/resource/WebService/soma?valor1=2&valor2=3
	@GET
	@Path("/soma")
	public int soma(@QueryParam("valor1") int v1, @QueryParam("valor2") int v2) {
		return v1 + v2;

	}

	@GET
	@Path("/somaDouble")
	public Double soma(@QueryParam("valor1") Double v1, @QueryParam("valor2") Double v2) {
		return v1 + v2;

	}
}
