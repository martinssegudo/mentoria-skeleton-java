package br.com.skeleton.apis.impl;

import br.com.skeleton.apis.entities.response.PersonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.skeleton.apis.ApiPerson;

@RestController
@RequestMapping(path = "/person")
public class ApiPersonImpl implements ApiPerson {
	
	@GetMapping
	@Override
	public ResponseEntity<PersonResponse> save(@RequestBody Long id) {
		return ResponseEntity.ok(PersonResponse.builder().build());
	}

}
