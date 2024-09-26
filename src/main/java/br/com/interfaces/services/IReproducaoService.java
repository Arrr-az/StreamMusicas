package br.com.interfaces.services;

import br.com.interfaces.model.IMusica;
import br.com.interfaces.model.IPlaylist;
import br.com.interfaces.model.IUsuario;

import java.util.List;

public interface IReproducaoService {
    void reproduzirMusica(IMusica musica, IUsuario usuario);
    void reproduzirPlayList(IPlaylist playlist, IUsuario usuario);
    void pausarReproducao(IUsuario usuario);
    void retomarReproducao(IUsuario usuario);
    void pararReproducao(IUsuario usuario);
    List<IMusica> obterRecomendacoesDuranteReproducao(IRecomendacaoService recomendacaoService, IUsuario usuario);
    String exibirInformacoesArtistaDuranteReproducao(IMusica musica, IArtistaService artistaService);
}