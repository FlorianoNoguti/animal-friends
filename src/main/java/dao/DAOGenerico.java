package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;










public class DAOGenerico {
	private static EntityManager entityManager;

	public void inserir(Object objeto) {
		entityManager = ConexaoBanco.getConexao().getEm();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(objeto);
			entityManager.getTransaction().commit();
			

		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
		}
	}

	public void alterar(Object objeto) {
		entityManager = ConexaoBanco.getConexao().getEm();
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(objeto);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
		}
	}
	
	

	public List listaComStatus(Class classe) {
		Query query = null;
		try {
			entityManager = ConexaoBanco.getConexao().getEm();
			entityManager.getTransaction().begin();
			query = entityManager.createQuery("from " + classe.getSimpleName() + " where status is true order by id");
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
		}
		return query.getResultList();
	}
	
	
	
	

	public List listar(Class classe) {
		Query query = null;
		try {
			entityManager = ConexaoBanco.getConexao().getEm();
			entityManager.getTransaction().begin();
			query = entityManager.createQuery("from " + classe.getSimpleName());
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
		}
		return query.getResultList();
	}

	public Object buscarPorId(Class classe, int i) {
		Object retornando = null;
		try {
			entityManager.getTransaction().begin();
			retornando = entityManager.find(classe, i);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}

		return retornando;
	}
	
	public void deletar(Long id) {
	
		try {
			entityManager = ConexaoBanco.getConexao().getEm();
			entityManager.getTransaction().begin();
			entityManager.remove(id);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
		}
	}
	
}
