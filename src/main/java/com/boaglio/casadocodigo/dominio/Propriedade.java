package com.boaglio.casadocodigo.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Propriedade {

    @Id
    private String nome;
    private String valor;
    private String descricao;
    private String categoria;
    private String subcategoria;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Propriedade{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", valor='").append(valor).append('\'');
        sb.append(", descricao='").append(descricao).append('\'');
        sb.append(", categoria='").append(categoria).append('\'');
        sb.append(", subcategoria='").append(subcategoria).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
