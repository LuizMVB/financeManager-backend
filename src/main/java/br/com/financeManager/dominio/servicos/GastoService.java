package br.com.financeManager.dominio.servicos;

import br.com.financeManager.dominio.dados.IGastoDados;
import br.com.financeManager.dominio.servicos.conversores.ConversorCriacaoGasto;
import br.com.financeManager.dominio.vos.CriacaoGastoVo;
import br.com.financeManager.visao.dtos.CriacaoGastoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GastoService {

    @Autowired
    private ConversorCriacaoGasto conversorCriacaoGasto;

    @Autowired
    private IGastoDados gastoRepository;

    public void inserirGasto(CriacaoGastoDTO dto) {
        CriacaoGastoVo vo = conversorCriacaoGasto.converterDTOEmVO(dto);
        gastoRepository.inserirGasto(vo);
    }
}
