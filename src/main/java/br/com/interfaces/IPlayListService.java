package br.com.interfaces;

import java.util.List;
import java.util.Optional;

public interface IPlayListService {
    Optional<IPlayList> criarPlayList(String nome, IUsuario criador);
    void compartilharPlayList(IPlayList playlist, IUsuario usuario);
    void convidarColaborador(IPlayList playlist, IUsuario usuario);
    List<IMusica> recomendarMusicasParaPlayList(IPlayList playlist,
                                               IRecomendacaoService recomendacaoService);
    void iniciarReproducaoPlayList(IPlayList playlist, IUsuario usuario,
                                   IReproducaoService reproducaoService);

}
