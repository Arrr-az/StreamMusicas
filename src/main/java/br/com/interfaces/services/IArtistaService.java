package br.com.interfaces.services;

import br.com.interfaces.model.IMusica;

import java.util.List;
import java.util.Optional;

public interface IArtistaService() {
    Optional<List<IMusica>> getMusicasMaisTocadas(String artista,
                                                  IReproducaoService reproducaoService);
    Optional<List<IMusica>> getDiscografia(String artista);
    Optional<String> getBiografia(String artista);
    void atualizarEstatisticasReproducao(String artista,
                                         IReproducaoService reproducaoService);

}
