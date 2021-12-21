package com.poshyweb.forum.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private String categoria;

    public Curso(String spring, String progrmação) {
    }

    public Curso(Long id, String nome, String categoria) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso)) return false;
        Curso curso = (Curso) o;
        return Objects.equals(id, curso.id) && Objects.equals(nome, curso.nome) && Objects.equals(categoria, curso.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, categoria);
    }


}
