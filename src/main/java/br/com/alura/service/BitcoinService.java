package br.com.alura.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import br.com.alura.model.Bitcoin;

@Path("/bitcoins")
@RegisterRestClient(configKey="bitcoin-api")


public interface BitcoinService {
//Dessa forma já faz um get esperando um json, usando interfaces do próprio quarkus.
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Bitcoin> listar();
}
