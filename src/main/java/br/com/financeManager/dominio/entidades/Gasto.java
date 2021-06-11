package br.com.financeManager.dominio.entidades;

import com.sun.istack.NotNull;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "GASTO")
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "MOTIVO")
    private String motivo;

    @Column(name = "CATEGORIA")
    private String categoria;

    @Column(name = "DT_REALIZACAO")
    private LocalDate dataRealizacao;

    @Column(name = "NIVEL_NECESSIDADE")
    @OneToMany
    @JoinColumn(name = "ID_NIVEL_NECESSIDADE")
    private List<NivelNecessidadeGasto> nivelNecessidade;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_CICLO")
    @NotNull
    private Ciclo ciclo;

    public Gasto() {
    }

    public Gasto(String titulo, String motivo, String categoria, List<NivelNecessidadeGasto> nivelNecessidade, LocalDate dataRealizacao, Ciclo ciclo) {
        this.titulo = titulo;
        this.motivo = motivo;
        this.categoria = categoria;
        this.nivelNecessidade = nivelNecessidade;
        this.dataRealizacao = dataRealizacao;
        this.ciclo = ciclo;
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

    public List<NivelNecessidadeGasto> getNivelNecessidade() {
        return nivelNecessidade;
    }

    public void setNivelNecessidade(List<NivelNecessidadeGasto> nivelNecessidade) {
        this.nivelNecessidade = nivelNecessidade;
    }

    public LocalDate getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(LocalDate dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }
}
