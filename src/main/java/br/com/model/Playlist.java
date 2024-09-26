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
    private boolean isCompartilhada;
    private List<IUsuario> colaboradores;
    private List<IUsuario> usuarios;
    private IUsuario criador;

    public Playlist(String nome, IUsuario criador) {
        this.nome = nome;
        this.criador = criador;
        this.musicas = new ArrayList<IMusica>();
        this.colaboradores = new ArrayList<IUsuario>();
        this.usuarios = new ArrayList<IUsuario>();
        this.isCompartilhada = true;
        this.isPublica = true;
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
    public boolean isCompartilhavel() {
        return isCompartilhada;
    }

    @Override
    public void setCompartilhavel(boolean bln) {
        isCompartilhada = bln;
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

    @Override
    public void adicionarUsuario(IUsuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public List<IUsuario> getUsuarios() {
        return this.usuarios;
    }
}