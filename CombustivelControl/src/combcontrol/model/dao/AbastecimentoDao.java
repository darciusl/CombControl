package combcontrol.model.dao;

import java.util.List;

import combcontrol.model.domain.Abastecimento;

public interface AbastecimentoDao {

	public abstract List<Abastecimento> getAbastecimentos();

	public abstract Abastecimento salvar(Abastecimento abastecimento);

	public abstract void atualizar(Abastecimento abastecimento);

	public abstract void excluir(Abastecimento abastecimento);

}