package combcontrol.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import combcontrol.model.dao.OleoDao;
import combcontrol.model.domain.Oleo;


public class OleoServiceImpl implements OleoService {
	
	@Inject
	private OleoDao oleoDao;

	
	@Override
	public List<Oleo> getOleos() {
		return oleoDao.getOleos();
	}

	
	@Override
	@Transactional
	public Oleo salvar(Oleo oleo) {
		return oleoDao.salvar(oleo);
	}


	@Override
	@Transactional
	public void atualizar(Oleo oleo) {
		oleoDao.atualizar(oleo);	
		
	}

	
	@Override
	@Transactional
	public void excluir(Oleo oleo) {
		oleoDao.excluir(oleo);
		
	}

}
