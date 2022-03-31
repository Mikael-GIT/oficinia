package com.mecanica.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class OrdemDeServico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    
    @OneToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;
    
    @OneToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;

    @ManyToMany
    @JoinTable(name = "peça_ordem_de_servico", 
            joinColumns = @JoinColumn(name = "ordem_de_servico_id"),
            inverseJoinColumns = @JoinColumn(name = "peça_id"))
    List<Peças> peças = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "pagamento_id")
    private Pagamento pagamento;
    
    private String descServiço;
    
    private String tipoManutencao;
    
    private Double valorManutencao;
}