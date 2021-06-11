package br.com.financeManager.dominio.dados;

import br.com.financeManager.dominio.entidades.Gasto;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface IGastoCrudDados extends CrudRepository<Gasto, Integer> {
}
