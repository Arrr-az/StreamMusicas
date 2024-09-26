package br.com.model;

import br.com.interfaces.model.IUsuario;

public class Usuario implements IUsuario {

    private final String nome;
    private String email;
    private Boolean permissaoReproduzirMusicas;
    private Boolean permissaoCriarPlaylists;
    
    public Usuario( String nome,
            String email,
            Boolean permissaoReproduzirMusicas,
            Boolean permissaoCriarPlaylists ) {
        this.nome = nome;
        this.email = email;
        this.permissaoReproduzirMusicas = permissaoReproduzirMusicas;
        this.permissaoCriarPlaylists = permissaoCriarPlaylists;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail( String email ) {
        this.email = email;
    }
    
    @Override
    public Boolean getPermissaoReproduzirMusicas() {
        return permissaoReproduzirMusicas;
    }

    @Override
    public Boolean getPermissaoCriarPlaylists() {
        return permissaoCriarPlaylists;
    }
}
