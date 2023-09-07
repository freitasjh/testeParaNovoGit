package br.com.systec.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.systec.application.dto.CartaoDTO;
import br.com.systec.domain.Cartao;

@RestController
@RequestMapping("/cartoes")
public class CartaoController {
	@Autowired
	private CartaoService service;
	
	@GetMapping
	public ResponseEntity<String> status(){
		return ResponseEntity.ok("ok");
	}
	
	@PostMapping
	public ResponseEntity<Void> save(@RequestBody CartaoDTO cartaoDTO){
		Cartao cartao = cartaoDTO.toModel();
		service.save(cartao);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping(params = "renda")
	public ResponseEntity<List<Cartao>> findByRenda(@RequestParam("renda") Long renda){
		List<Cartao> listaDeCartao = service .findByRenda(renda);
		
		return ResponseEntity.ok(listaDeCartao);
	}
}
