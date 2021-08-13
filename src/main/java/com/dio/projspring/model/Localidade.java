package com.dio.projspring.model;

import lombok.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {

    private Long id;
    private String descricao;

    @ManyToOne // muitos níveis de acesso podem estar associados a uma localidade específica
    // (diretor, gerente e estagiário podem acessar o primeiro andar da empresa, por exemplo)
    private NivelAcesso nivelAcesso;

}
