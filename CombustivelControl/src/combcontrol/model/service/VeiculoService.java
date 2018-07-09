package combcontrol.model.service;

import java.util.List;

import combcontrol.model.domain.Veiculo;

public interface VeiculoService {

	public abstract List<Veiculo> getVeiculos();

	public abstract Veiculo salvar(Veiculo veiculo);

	public abstract void atualizar(Veiculo veiculo);

	public abstract void excluir(Veiculo veiculo);

}