package combcontrol.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import combcontrol.model.domain.Oleo;


public class OleoDaoImpl implements OleoDao {
	
	@PersistenceContext(unitName="SCOMPU")
	private EntityManager entityManager;

	
	@Override
	@SuppressWarnings("unchecked")
	public List<Oleo> getOleos() {
		javax.persistence.Query query = entityManager.createQuery("from Oleo");
		return query.getResultList();
	}

	
	@Override
	public Oleo salvar(Oleo oleo) {
		entityManager.persist(oleo);
		return oleo;
	}

	
	@Override
	public void atualizar(Oleo oleo) {
		Oleo oleoMerge = entityManager.merge(oleo);
		entityManager.persist(oleoMerge);
		
	}

	
	@Override
	public void excluir(Oleo oleo) {
		Oleo oleoMerge = entityManager.merge(oleo);
		entityManager.remove(oleoMerge);	
		
	}

}
