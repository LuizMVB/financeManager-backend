package br.com.financeManager.visao.controllers;

import br.com.financeManager.dominio.servicos.GastoService;
import br.com.financeManager.dominio.util.Rotas;
import br.com.financeManager.visao.dtos.CriacaoGastoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GastoController {

    @Autowired
    private GastoService gastoService;

    @PostMapping(Rotas.GASTO_API + "/insereGasto")
    public void inserirGasto(@RequestBody CriacaoGastoDTO dto) {
        gastoService.inserirGasto(dto);
    }
}
