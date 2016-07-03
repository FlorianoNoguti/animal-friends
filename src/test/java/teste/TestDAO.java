package teste;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;



import dao.DAOGenerico;
import modelo.Adocao;

public class TestDAO {
	@Test
	public void testaOpera��esCrud() {
		DAOGenerico dao = new DAOGenerico();
		
		Adocao adocao1 = new Adocao("Floriano","98660739","Paranavai","Parana" );
		Adocao adocao2 = new Adocao("Jose", "3333333","Maringa", "Parana");
		Adocao adocao3 = new Adocao("Maria","34333333","Loanda","Parana");
		
		System.out.println("****Inser��o***");	
		
		dao.inserir(adocao1);
		dao.inserir(adocao2);
		dao.inserir(adocao3);		
		
		List<Adocao> adocoes1 = dao.listar(Adocao.class);
		System.out.println("Tamanho da lista �: " + adocoes1.size());	
		System.out.println("Registro" + adocao3.getId() + " � " + adocao3.getNomeAnunciante());
		
		//Verifica inclusao
		Assert.assertEquals(3, adocoes1.size());
		
		
		System.out.println("******Altera��o*****");
		adocao1.setNomeAnunciante("Pedro");
		dao.alterar(adocao1);
		Adocao adocaoAlterada = (Adocao) dao.buscarPorId(null, 0);
		
		//Verifica alteracao
		Assert.assertEquals("Pedro", adocao1.getNomeAnunciante());
		
		
		System.out.println("*****Exclus�o*****");
		
		/*N�o consegui fazer funcionar :(*/
		
		dao.deletar((long) 3);
		Long id3 = adocao3.getId();	
		
		/*Verifica se registro solicitado existe*/
		Assert.assertNull(id3);
		
	}
	
}



