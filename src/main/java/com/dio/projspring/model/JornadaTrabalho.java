package com.dio.projspring.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
//@Data  -- > parece que colocar apenas essa anotação substitui todas essas outras de cima, pesquisar!
public class JornadaTrabalho {

    private Long id;
    private String descricao;

}
