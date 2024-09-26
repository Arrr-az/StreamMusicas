package br.com.interfaces.services;

import br.com.interfaces.model.IMusica;
import br.com.interfaces.model.IPlaylist;
import br.com.interfaces.model.IUsuario;

import java.util.List;
import java.util.Optional;

public interface IPlayListService {
    Optional<IPlaylist> criarPlayList(String nome, IUsuario criador);
    Integer compartilharPlayList(IPlaylist playlist, IUsuario usuario);
    Integer convidarColaborador(IPlaylist playlist, IUsuario usuario);
    List<IMusica> recomendarMusicasParaPlayList(IPlaylist playlist);
    Integer iniciarReproducaoPlayList(IPlaylist playlist, IUsuario usuario,
                                   IReproducaoService reproducaoService);
}
