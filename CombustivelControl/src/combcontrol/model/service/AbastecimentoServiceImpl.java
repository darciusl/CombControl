package combcontrol.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import combcontrol.model.dao.AbastecimentoDao;
import combcontrol.model.domain.Abastecimento;


public class AbastecimentoServiceImpl implements AbastecimentoService {
	
	@Inject
	private AbastecimentoDao abastecimentoDao;

	
	@Override
	public List<Abastecimento> getAbastecimentos() {
		return abastecimentoDao.getAbastecimentos();
	}

	
	@Override
	@Transactional
	public Abastecimento salvar(Abastecimento abastecimento) {
		return abastecimentoDao.salvar(abastecimento);
	}


	@Override
	@Transactional
	public void atualizar(Abastecimento abastecimento) {
		abastecimentoDao.atualizar(abastecimento);	
		
	}

	
	@Override
	@Transactional
	public void excluir(Abastecimento abastecimento) {
		abastecimentoDao.excluir(abastecimento);
		
	}

}
