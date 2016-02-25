package model.facade.ws;

import java.util.Arrays;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import model.domain.Cliente;


@WebService
public class ClienteFacade {
	
	@WebMethod
	public List<Cliente> getClientes() {
		return Arrays.asList(new Cliente(1, "Carlos", "carlos@iftm.edu.br"),
				new Cliente(2, "Neirivon", "neirivon@gmail.com"));
		
	}

}
