package com.dio.projspring.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Movimentacao {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentacaoID implements Serializable {
        private Long idMovimentacao;
        private Long idUsuario;
    } // essa classe é nossa chave primária, estrangeira ou COMPOSTA(ele disse isso)? Não entendi

    @EmbeddedId
    private MovimentacaoID id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;

    private Ocorrencia ocorrencia;
    private Calendario calendario;
}
