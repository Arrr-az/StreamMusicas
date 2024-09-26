package br.com.model;

import br.com.interfaces.model.IArtista;

public class Artista implements IArtista {
    private final String nome;
    private final String biografia;

    public Artista(String nome, String biografia) {
        this.nome = nome;
        this.biografia = biografia;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getBiografia() {
        return this.biografia;
    }

}
