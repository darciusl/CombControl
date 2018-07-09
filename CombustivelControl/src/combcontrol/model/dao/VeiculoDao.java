package combcontrol.model.dao;

import java.util.List;

import combcontrol.model.domain.Veiculo;

public interface VeiculoDao {

	public abstract List<Veiculo> getVeiculos();

	public abstract Veiculo salvar(Veiculo veiculo);

	public abstract void atualizar(Veiculo veiculo);

	public abstract void excluir(Veiculo veiculo);

}