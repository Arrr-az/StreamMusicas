package br.com.interfaces.repository;

import java.util.Optional;

public interface IArtistaRepository {
    public Optional<String> getBiografia(String nomeArtista) throws Exception;
}
