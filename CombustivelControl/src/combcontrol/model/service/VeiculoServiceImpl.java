package combcontrol.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import combcontrol.model.dao.VeiculoDao;
import combcontrol.model.domain.Veiculo;

public class VeiculoServiceImpl implements VeiculoService {
	
	@Inject
	private VeiculoDao veiculoDao;


	@Override
	public List<Veiculo> getVeiculos() {
		return veiculoDao.getVeiculos();
	}

	
	@Override
	@Transactional
	public Veiculo salvar(Veiculo veiculo) {
		return veiculoDao.salvar(veiculo);
	}

	
	@Override
	@Transactional
	public void atualizar(Veiculo veiculo) {
		veiculoDao.atualizar(veiculo);
		
	}

	
	@Override
	@Transactional
	public void excluir(Veiculo veiculo) {
		veiculoDao.excluir(veiculo);
		
	}

}
