package com.dio.projspring.model;

import lombok.*;

import javax.persistence.ManyToOne;
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
    private BigDecimal tolerancia; // trabalha melhor com números decimais que double
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;

    @ManyToOne // vários usuários podem pertencer a uma categoria
    private CategoriaUsuario categoriaUsuario;

    @ManyToOne // vários usuários podem pertencer a uma empresa
    private Empresa empresa;

    @ManyToOne // vários usuários podem pertencer a um nível de acesso
    private NivelAcesso nivelAcesso;

    @ManyToOne // vários usuários podem pertencer a uma certa categoria de jornada de trabalho (40 h/semanais, p. ex.)
    private JornadaTrabalho jornadaTrabalho;


}
