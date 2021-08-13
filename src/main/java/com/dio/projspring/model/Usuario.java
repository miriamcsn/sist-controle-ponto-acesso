package com.dio.projspring.model;

import lombok.*;

import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Usuario {

    private Long id;
    private String nome;
    private Empresa empresa;
    private BigDecimal tolerancia; // trabalha melhor com números decimais que double
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;

    @OneToMany // uma categoria para vários usuários
    private CategoriaUsuario categoriaUsuario;
    private NivelAcesso nivelAcesso;
    private JornadaTrabalho jornadaTrabalho;


}
