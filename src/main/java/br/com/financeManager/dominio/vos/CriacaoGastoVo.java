package br.com.financeManager.dominio.vos;

import br.com.financeManager.dominio.enums.NivelNecessidadeGastoEnum;

public class CriacaoGastoVo {
    private String titulo;
    private String motivo;
    private String categoria;
    private NivelNecessidadeGastoEnum nivelNecessidadeGastoEnum;

    public CriacaoGastoVo(String titulo, String motivo, String categoria, NivelNecessidadeGastoEnum nivelNecessidadeGastoEnumName) {
        this.titulo = titulo;
        this.motivo = motivo;
        this.categoria = categoria;
        this.nivelNecessidadeGastoEnum = nivelNecessidadeGastoEnum;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public NivelNecessidadeGastoEnum getNivelNecessidadeGastoEnum() {
        return nivelNecessidadeGastoEnum;
    }

    public void setNivelNecessidadeGastoEnum(NivelNecessidadeGastoEnum nivelNecessidadeGastoEnum) {
        this.nivelNecessidadeGastoEnum = nivelNecessidadeGastoEnum;
    }
}
