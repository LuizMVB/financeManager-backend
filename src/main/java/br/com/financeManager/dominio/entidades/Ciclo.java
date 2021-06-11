package br.com.financeManager.dominio.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "CICLO")
public class Ciclo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DT_INICIO")
    private LocalDate dataInicio;

    @Column(name = "DT_FIM")
    private LocalDate dataFim;

    @Column(name = "QT_GASTOS")
    private Long quantidadeGastos;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ciclo", cascade = CascadeType.ALL)
    private List<Gasto> gastos;

    public Ciclo() {
    }
}
