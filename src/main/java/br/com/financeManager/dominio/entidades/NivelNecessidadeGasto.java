package br.com.financeManager.dominio.entidades;

import br.com.financeManager.dominio.enums.NivelNecessidadeGastoEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NIVEL_NECESSIDADE")
public class NivelNecessidadeGasto {

    @Id
    @Column(name = "ID_NIVEL")
    @Enumerated(EnumType.ORDINAL)
    private NivelNecessidadeGastoEnum nivel;

    @Column(name = "NM_NIVEL")
    @Enumerated(EnumType.STRING)
    private NivelNecessidadeGastoEnum descricaoNivel;

    public NivelNecessidadeGasto() {
    }

    public NivelNecessidadeGasto(NivelNecessidadeGastoEnum n) {
        this.nivel = n;
        this.descricaoNivel = n;
    }

    public NivelNecessidadeGastoEnum getNivel() {
        return nivel;
    }

    public void setNivel(NivelNecessidadeGastoEnum nivel) {
        this.nivel = nivel;
    }

    public NivelNecessidadeGastoEnum getDescricaoNivel() {
        return descricaoNivel;
    }

    public void setDescricaoNivel(NivelNecessidadeGastoEnum descricaoNivel) {
        this.descricaoNivel = descricaoNivel;
    }
}
