package br.com.financeManager.dominio.servicos.conversores;

import br.com.financeManager.dominio.entidades.Gasto;
import br.com.financeManager.dominio.vos.CriacaoGastoVo;
import br.com.financeManager.visao.dtos.CriacaoGastoDTO;
import org.springframework.stereotype.Component;

@Component
public class ConversorCriacaoGasto {

    public CriacaoGastoVo converterDTOEmVO(CriacaoGastoDTO dto) {
        CriacaoGastoVo vo = new CriacaoGastoVo(dto.getTitulo(), dto.getMotivo(), dto.getCategoria(), dto.getNivelNecessidadeGastoEnum());
        return vo;
    }

    public Gasto converterVoEmEntidade(CriacaoGastoVo vo) {
        Gasto entidade = new Gasto(vo.getTitulo(), vo.getMotivo(), vo.getCategoria(), null, null, null);
        return entidade;
    }
}
