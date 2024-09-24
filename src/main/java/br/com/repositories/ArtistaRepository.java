package br.com.repositories;

import br.com.interfaces.model.IArtista;
import br.com.interfaces.model.IMusica;
import br.com.interfaces.repository.IArtistaRepository;
import br.com.model.Artista;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArtistaRepository implements IArtistaRepository {
    private static IArtistaRepository artistaRepository;
    private List<IArtista> artistas;

    private ArtistaRepository() {
        this.artistas = new ArrayList<>();
        artistas.add(new Artista("BlackPink", "Biografia de BlackPink"));
        artistas.add(new Artista("Twice", "Biografia de Twice"));
        artistas.add(new Artista("Rionegro & Solimões", "Biografia de Rionegro & Solimões"));
        artistas.add(new Artista("Queen", "Biografia de Queen"));
        artistas.add(new Artista("John Lennon", "Biografia de John Lennon"));
        artistas.add(new Artista("Michael Jackson", "Biografia de Michael Jackson"));
        artistas.add(new Artista("Nirvana", "Biografia de Nirvana"));
        artistas.add(new Artista("Marvin Gaye", "Biografia de Marvin Gaye"));
        artistas.add(new Artista("Ed Sheeran", "Biografia de Ed Sheeran"));
        artistas.add(new Artista("Eagles", "Biografia de Eagles"));
        artistas.add(new Artista("Mark Ronson", "Biografia de Mark Ronson"));
        artistas.add(new Artista("Adele", "Biografia de Adele"));
        artistas.add(new Artista("Luis Fonsi", "Biografia de Luis Fonsi"));
        artistas.add(new Artista("Guns N' Roses", "Biografia de Guns N' Roses"));
        artistas.add(new Artista("Dua Lipa", "Biografia de Dua Lipa"));
        artistas.add(new Artista("Coldplay", "Biografia de Coldplay"));
        artistas.add(new Artista("The Weeknd", "Biografia de The Weeknd"));
        artistas.add(new Artista("Ben E. King", "Biografia de Ben E. King"));
        artistas.add(new Artista("Whitney Houston", "Biografia de Whitney Houston"));
        artistas.add(new Artista("Eminem", "Biografia de Eminem"));
        artistas.add(new Artista("PSY", "Biografia de PSY"));
        artistas.add(new Artista("The Beatles", "Biografia de The Beatles"));
        artistas.add(new Artista("Lauryn Hill", "Biografia de Lauryn Hill"));
        artistas.add(new Artista("Backstreet Boys", "Biografia de Backstreet Boys"));
        artistas.add(new Artista("Bon Jovi", "Biografia de Bon Jovi"));
        artistas.add(new Artista("The Cure", "Biografia de The Cure"));
        artistas.add(new Artista("Lady Gaga", "Biografia de Lady Gaga"));
        artistas.add(new Artista("Imagine Dragons", "Biografia de Imagine Dragons"));
        artistas.add(new Artista("Stevie Wonder", "Biografia de Stevie Wonder"));
        artistas.add(new Artista("Tina Turner", "Biografia de Tina Turner"));
        artistas.add(new Artista("Neil Diamond", "Biografia de Neil Diamond"));
        artistas.add(new Artista("Journey", "Biografia de Journey"));
        artistas.add(new Artista("Beyoncé", "Biografia de Beyoncé"));
        artistas.add(new Artista("Lorde", "Biografia de Lorde"));
        artistas.add(new Artista("Linkin Park", "Biografia de Linkin Park"));
        artistas.add(new Artista("The Black Eyed Peas", "Biografia de The Black Eyed Peas"));
        artistas.add(new Artista("ABBA", "Biografia de ABBA"));
        artistas.add(new Artista("A-ha", "Biografia de A-ha"));
        artistas.add(new Artista("Leonard Cohen", "Biografia de Leonard Cohen"));
        artistas.add(new Artista("Tears for Fears", "Biografia de Tears for Fears"));
    }

    public static IArtistaRepository getArtistaRepository(){
        if(ArtistaRepository.artistaRepository == null ){
            ArtistaRepository.artistaRepository = new ArtistaRepository();
        }

        return ArtistaRepository.artistaRepository;
    }

    @Override
    public Optional<String> getBiografia(String artista) throws Exception{
        return this.artistas
                .stream()
                .filter(item -> item.getNome().equalsIgnoreCase(artista))
                .map(IArtista::getBiografia)
                .findFirst();
    }
}
