package br.com.skeleton.apis;

import br.com.skeleton.apis.entities.response.PersonResponse;
import org.springframework.http.ResponseEntity;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface ApiPerson {
	
	@ApiOperation(value = "Salva um valor")
	@ApiResponses(value = {
	    @ApiResponse(code = 200, message = "Retorna uma mensagem se salvou o valor"),
	    @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
	    @ApiResponse(code = 500, message = "Retornara uma mensagem amigável para o usuária"),
	})	
	ResponseEntity<PersonResponse> save(Long id);

}
