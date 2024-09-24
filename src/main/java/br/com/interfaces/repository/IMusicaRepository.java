package br.com.interfaces.repository;

import br.com.interfaces.model.IMusica;

import java.util.List;
import java.util.Optional;

public interface IMusicaRepository {
    List<IMusica> getAll();
    public Optional<List<IMusica>> getMusicasMaisTocadas(String nomeArtista, int qtd) throws Exception;
    public Optional<List<IMusica>> getMusicas(String nomeArtista) throws Exception;
    public void atualizarEstatisticasReproducao(IMusica musica) throws Exception;
    public Optional<IMusica> findByTitulo(String titulo);
    Optional<List<IMusica>> findMaisTocadasByGenero( String genero, int qtd );
}
