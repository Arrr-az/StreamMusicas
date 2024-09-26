package br.com.interfaces.model;

public interface IUsuario {
    String getNome();
    String getEmail();
    void setEmail(String email);
    public Boolean getPermissaoReproduzirMusicas();
    public Boolean getPermissaoCriarPlaylists();
}
