package br.com.financeManager.dominio.dados.servicos;

import br.com.financeManager.dominio.entidades.Gasto;
import br.com.financeManager.dominio.dados.IGastoCrudDados;
import br.com.financeManager.dominio.dados.IGastoDados;
import br.com.financeManager.dominio.servicos.conversores.ConversorCriacaoGasto;
import br.com.financeManager.dominio.vos.CriacaoGastoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GastoDados implements IGastoDados {

    @Autowired
    private IGastoCrudDados IGastoCrudDados;

    @Autowired
    private ConversorCriacaoGasto conversorCriacaoGasto;

    @Override
    public void inserirGasto(CriacaoGastoVo vo) {
        Gasto gasto = conversorCriacaoGasto.converterVoEmEntidade(vo);
        IGastoCrudDados.save(gasto);
    }
}