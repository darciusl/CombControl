package combcontrol.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import combcontrol.model.domain.Abastecimento;


public class AbastecimentoDaoImpl implements AbastecimentoDao {
	
	@PersistenceContext(unitName="SCOMPU")
	private EntityManager entityManager;

	
	@Override
	@SuppressWarnings("unchecked")
	public List<Abastecimento> getAbastecimentos() {
		javax.persistence.Query query = entityManager.createQuery("from Abastecimento");
		return query.getResultList();
	}

	
	@Override
	public Abastecimento salvar(Abastecimento abastecimento) {
		entityManager.persist(abastecimento);
		return abastecimento;
	}

	
	@Override
	public void atualizar(Abastecimento abastecimento) {
		Abastecimento abastecimentoMerge = entityManager.merge(abastecimento);
		entityManager.persist(abastecimentoMerge);
		
	}

	
	@Override
	public void excluir(Abastecimento abastecimento) {
		Abastecimento abastecimentoMerge = entityManager.merge(abastecimento);
		entityManager.remove(abastecimentoMerge);	
		
	}

}
