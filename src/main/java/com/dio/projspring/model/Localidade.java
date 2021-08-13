package com.dio.projspring.model;

import lombok.*;

import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {

    private long id;
    private String descricao;
    @OneToMany //Um nível de acesso pode ter N localidades (diretor pode acessar todos os andares da empresa p. ex)
    private NivelAcesso nivelAcesso;

}
