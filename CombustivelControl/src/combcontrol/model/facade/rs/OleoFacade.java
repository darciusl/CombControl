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

import combcontrol.model.domain.Oleo;
import combcontrol.model.service.OleoService;


@Path("/oleo")
@Produces({MediaType.APPLICATION_JSON,
		   MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class OleoFacade {
	
	@Inject
	private OleoService oleoService;
	
	@GET
	public List<Oleo> getOleos() {
		return oleoService.getOleos();
	}

	@POST
	public Oleo salvar(Oleo oleo) {
		return oleoService.salvar(oleo);
	}
	
	@PUT
	public void atualizar(Oleo oleo) {
		oleoService.atualizar(oleo);
	}
	
	@DELETE
	@Path("/{codigoOleo}")
	public void excluir(@PathParam("codigoOleo") Integer codigoOleo) {
		Oleo oleo = new Oleo();
		oleo.setCodigo(codigoOleo);
		oleoService.excluir(oleo);
	}

}
