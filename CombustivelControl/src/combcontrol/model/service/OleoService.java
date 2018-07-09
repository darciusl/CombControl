package combcontrol.model.service;

import java.util.List;

import combcontrol.model.domain.Oleo;

public interface OleoService {

	public abstract List<Oleo> getOleos();

	public abstract Oleo salvar(Oleo oleo);

	public abstract void atualizar(Oleo oleo);

	public abstract void excluir(Oleo oleo);

}