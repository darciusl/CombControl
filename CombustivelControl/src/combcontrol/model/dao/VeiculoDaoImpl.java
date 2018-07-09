package combcontrol.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import combcontrol.model.domain.Veiculo;

public class VeiculoDaoImpl implements VeiculoDao {
	
	@PersistenceContext(unitName="SCOMPU")
	private EntityManager entityManager;

	
	@Override
	@SuppressWarnings("unchecked")
	public List<Veiculo> getVeiculos() {
		javax.persistence.Query query = entityManager.createQuery("from Veiculo");
		return query.getResultList();
	}

	
	@Override
	public Veiculo salvar(Veiculo veiculo) {
		entityManager.persist(veiculo);
		return veiculo;
	}


	@Override
	public void atualizar(Veiculo veiculo) {
		Veiculo veiculoMerge = entityManager.merge(veiculo);
		entityManager.persist(veiculoMerge);		
		
	}

	
	@Override
	public void excluir(Veiculo veiculo) {
		Veiculo veiculoMerge = entityManager.merge(veiculo);
		entityManager.remove(veiculoMerge);	
		
	}

}
