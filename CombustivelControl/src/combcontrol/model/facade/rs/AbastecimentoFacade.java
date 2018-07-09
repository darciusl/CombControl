package combcontrol.model.facade.rs;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import combcontrol.model.domain.Abastecimento;
import combcontrol.model.service.AbastecimentoService;


@Path("/abastecimento")
@Produces({MediaType.APPLICATION_JSON,
		   MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class AbastecimentoFacade {
	
	@Inject
	private AbastecimentoService abastecimentoService;
	
	@GET
	public List<Abastecimento> getAbastecimentos() {
		return abastecimentoService.getAbastecimentos();
	}

	@POST
	public Abastecimento salvar(Abastecimento abastecimento) {
		return abastecimentoService.salvar(abastecimento);
	}
	
	@PUT
	public void atualizar(Abastecimento abastecimento) {
		abastecimentoService.atualizar(abastecimento);
	}
	
	@DELETE
	@Path("/{codigoAbastecimento}")
	public void excluir(@PathParam("codigoAbastecimento") Integer codigoAbastecimento) {
		Abastecimento abastecimento = new Abastecimento();
		abastecimento.setCodigo(codigoAbastecimento);
		abastecimentoService.excluir(abastecimento);
	}

}
