package br.com.systec.application;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.systec.domain.Cartao;
import br.com.systec.infra.repository.CartaoRepository;


@Service
public class CartaoService {
	
	@Autowired
	private CartaoRepository repository;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public Cartao save(Cartao cartao) {		
		return repository.save(cartao);
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Cartao> findByRenda(Long renda){
		BigDecimal rendaBigDecimal = BigDecimal.valueOf(renda);
		return repository.findByRendaLessThanEqual(rendaBigDecimal);
	}
}
