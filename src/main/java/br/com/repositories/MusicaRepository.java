package br.com.repositories;

import br.com.interfaces.model.IMusica;
import br.com.interfaces.repository.IMusicaRepository;
import br.com.model.Musica;

import java.security.interfaces.EdECKey;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MusicaRepository implements IMusicaRepository {

	private static IMusicaRepository musicaRepository;
	private List<IMusica> musicas;

	MusicaRepository() {
		this.musicas = new ArrayList<>();

		musicas.add( new Musica( "How You Like That", "BlackPink", "KPOP", 3.0 ) );
		musicas.add( new Musica( "What is Love", "Twice", "KPOP", 3.3 ) );
		musicas.add( new Musica( "Na Sola da Bota", "Rionegro & Solimões", "Sertanejo", 2.8 ) );
		musicas.add( new Musica( "Bohemian Rhapsody", "Queen", "Rock", 5.9 ) );
		musicas.add( new Musica( "Imagine", "John Lennon", "Pop", 3.1 ) );
		musicas.add( new Musica( "Billie Jean", "Michael Jackson", "Pop", 4.5 ) );
		musicas.add( new Musica( "Smells Like Teen Spirit", "Nirvana", "Grunge", 5.0 ) );
		musicas.add( new Musica( "What's Going On", "Marvin Gaye", "Soul", 3.5 ) );
		musicas.add( new Musica( "Shape of You", "Ed Sheeran", "Pop", 3.5 ) );
		musicas.add( new Musica( "Hotel California", "Eagles", "Rock", 6.3 ) );
		musicas.add( new Musica( "Uptown Funk", "Mark Ronson ft. Bruno Mars", "Funk", 4.3 ) );
		musicas.add( new Musica( "Rolling in the Deep", "Adele", "Soul", 3.8 ) );
		musicas.add( new Musica( "Despacito", "Luis Fonsi ft. Daddy Yankee", "Reggaeton", 3.6 ) );
		musicas.add( new Musica( "Sweet Child O' Mine", "Guns N' Roses", "Rock", 5.5 ) );
		musicas.add( new Musica( "Levitating", "Dua Lipa", "Pop", 3.2 ) );
		musicas.add( new Musica( "Viva La Vida", "Coldplay", "Alternative Rock", 4.0 ) );
		musicas.add( new Musica( "Blinding Lights", "The Weeknd", "Synthwave", 3.2 ) );
		musicas.add( new Musica( "Stand By Me", "Ben E. King", "Soul", 2.9 ) );
		musicas.add( new Musica( "I Will Always Love You", "Whitney Houston", "Ballad", 4.5 ) );
		musicas.add( new Musica( "Lose Yourself", "Eminem", "Hip Hop", 5.2 ) );
		musicas.add( new Musica( "Gangnam Style", "PSY", "KPOP", 3.3 ) );
		musicas.add( new Musica( "Let It Be", "The Beatles", "Rock", 4.0 ) );
		musicas.add( new Musica( "Killing Me Softly With His Song", "Lauryn Hill", "Soul", 4.1 ) );
		musicas.add( new Musica( "I Want It That Way", "Backstreet Boys", "Pop", 3.5 ) );
		musicas.add( new Musica( "Livin' on a Prayer", "Bon Jovi", "Rock", 4.1 ) );
		musicas.add( new Musica( "Boys Don't Cry", "The Cure", "Post-Punk", 2.5 ) );
		musicas.add( new Musica( "Shallow", "Lady Gaga & Bradley Cooper", "Pop", 3.4 ) );
		musicas.add( new Musica( "Radioactive", "Imagine Dragons", "Alternative Rock", 3.0 ) );
		musicas.add( new Musica( "Superstition", "Stevie Wonder", "Funk", 4.1 ) );
		musicas.add( new Musica( "What's Love Got to Do with It", "Tina Turner", "Rock", 3.6 ) );
		musicas.add( new Musica( "Sweet Caroline", "Neil Diamond", "Pop", 3.2 ) );
		musicas.add( new Musica( "Don't Stop Believin'", "Journey", "Rock", 4.2 ) );
		musicas.add( new Musica( "Crazy in Love", "Beyoncé ft. Jay-Z", "R&B", 3.5 ) );
		musicas.add( new Musica( "Royals", "Lorde", "Pop", 3.1 ) );
		musicas.add( new Musica( "Numb", "Linkin Park", "Nu Metal", 3.5 ) );
		musicas.add( new Musica( "I Gotta Feeling", "The Black Eyed Peas", "Dance Pop", 4.0 ) );
		musicas.add( new Musica( "Dancing Queen", "ABBA", "Disco", 3.5 ) );
		musicas.add( new Musica( "Take On Me", "A-ha", "Synthpop", 3.4 ) );
		musicas.add( new Musica( "Hallelujah", "Leonard Cohen", "Folk", 4.3 ) );
		musicas.add( new Musica( "Everybody Wants to Rule the World", "Tears for Fears", "New Wave", 4.1 ) );
	}

	public static IMusicaRepository getMusicaRepository() {
		if( MusicaRepository.musicaRepository == null ) {
			MusicaRepository.musicaRepository = new MusicaRepository();
		}
		return MusicaRepository.musicaRepository;
	}

	@Override
	public Optional<List<IMusica>> getMusicasMaisTocadas( String nomeArtista, int qtd ) throws Exception {
		 List<IMusica> musicas = this.musicas
				.stream()
				.filter( item -> item.getArtista().equalsIgnoreCase( nomeArtista ) )
				.sorted( Comparator.comparingInt( IMusica::getQtdVezesReproduzidas ).reversed() )
				.limit( qtd )
				.map( musica -> new Musica( musica.getTitulo(), musica.getArtista(), musica.getGenero(), musica.getDuracao() ) )
				.collect( Collectors.toList() );

		return musicas.isEmpty() ? Optional.empty() : Optional.of(musicas);
	}

	@Override
	public Optional<List<IMusica>> getMusicas( String nomeArtista ) throws Exception {
		List<IMusica> musicas =this.musicas
						.stream()
						.filter( item -> item.getArtista().equalsIgnoreCase( nomeArtista ) )
						.map( musica -> new Musica( musica.getTitulo(), musica.getArtista(), musica.getGenero(), musica.getDuracao() ) )
						.collect( Collectors.toList());

		return musicas.isEmpty() ? Optional.empty() : Optional.of(musicas);
	}

    @Override
    public void atualizarEstatisticasReproducao(IMusica musica) throws Exception{
		Optional<IMusica> musicaRecuperada = Optional.empty();

		try{
			musicaRecuperada = this.musicas
				.stream()
				.filter(item -> item.getTitulo().equalsIgnoreCase(musica.getTitulo()))
				.findFirst();

			if(musicaRecuperada.isPresent()) {
				musicaRecuperada.get().incrementaContagemReproducao();
			}
		}catch (Exception ex){
			throw new Exception("ReproducaoService não está disponível");
		}

		if(musicaRecuperada.isEmpty()){
			throw new Exception("Artista " + musica.getArtista() + " não existe na plataforma");
		}
    }

	@Override
	public List<IMusica> getAll() {
		return this.musicas;
	}

	@Override
	public Optional<IMusica> findByTitulo( String titulo ) {
		return this.musicas.stream().filter( m -> m.getTitulo().equalsIgnoreCase( titulo ) ).findFirst();
	}

	@Override
	public Optional<List<IMusica>> findMaisTocadasByGenero( String genero, int qtd ) {
		return Optional.of( this.musicas.stream().filter( musica -> musica.getGenero().equalsIgnoreCase( genero ) ).sorted( Comparator.comparingInt( IMusica::getQtdVezesReproduzidas ).reversed() ).limit( qtd ).toList() );
	}

}
