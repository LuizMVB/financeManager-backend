package br.com.financeManager.dominio.dados;

import br.com.financeManager.dominio.vos.CriacaoGastoVo;

import javax.transaction.Transactional;

@Transactional
public interface IGastoDados {
    void inserirGasto(CriacaoGastoVo vo);
}
