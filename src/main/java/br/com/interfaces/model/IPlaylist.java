package br.com.interfaces.model;

import java.util.List;

public interface IPlaylist {
    String getNome();
    List<IMusica> getMusicas();
    void adicionarMusica(IMusica musica);
    void removerMusica(IMusica musica);
    boolean isPublica();
    void setPublica(boolean publica);
    boolean isCompartilhavel();
    void setCompartilhavel(boolean compartilhavel);
    void adicionarColaborador(IUsuario usuario);
    List<IUsuario> getColaboradores();
    void adicionarUsuario(IUsuario usuario);
    List<IUsuario> getUsuarios();
    public IUsuario getCriador();
}
