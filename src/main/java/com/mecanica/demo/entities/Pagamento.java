package com.mecanica.demo.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.mecanica.demo.enums.EstadoPagamento;
import com.mecanica.demo.enums.TipoPagamento;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private TipoPagamento tipoPagamento;
    private EstadoPagamento estadoPagamento;
    private LocalDateTime dataPagamento;
    @OneToOne(mappedBy = "pagamento")
    private OrdemDeServico ordemDeServico;
}