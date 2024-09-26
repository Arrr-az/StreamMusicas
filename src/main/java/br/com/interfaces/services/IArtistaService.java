package br.com.interfaces.services;

import br.com.interfaces.model.IMusica;

import java.util.List;
import java.util.Optional;

public interface IArtistaService{
    Optional<List<IMusica>> getMusicasMaisTocadas(String artista);
    Optional<List<IMusica>> getMusicas(String artista);
    Optional<String> getBiografia(String artista);
    void atualizarEstatisticasReproducao(IMusica musica) throws Exception;
}
