package br.com.model;

import br.com.interfaces.model.IMusica;
import br.com.interfaces.model.IPlaylist;
import br.com.interfaces.model.IUsuario;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IPlaylist {
    private String nome;
    private List<IMusica> musicas;
    private boolean isPublica;
    private List<IUsuario> colaboradores;
    private IUsuario criador;

    public Playlist(String nome, IUsuario criador) {
        this.nome = nome;
        this.criador = criador;
        this.musicas = new ArrayList<IMusica>();
        this.colaboradores = new ArrayList<IUsuario>();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public List<IMusica> getMusicas() {
        return musicas;
    }

    @Override
    public void adicionarMusica(IMusica im) {
        musicas.add(im);
    }

    @Override
    public void removerMusica(IMusica im) {
        musicas.remove(im);
    }

    @Override
    public boolean isPublica() {
        return isPublica;
    }

    @Override
    public void setPublica(boolean bln) {
        isPublica = bln;
    }

    @Override
    public void adicionarColaborador(IUsuario iu) {
        colaboradores.add(iu);
    }

    @Override
    public List<IUsuario> getColaboradores() {
        return colaboradores;
    }
    
    @Override
    public IUsuario getCriador() {
        return criador;
    }
}