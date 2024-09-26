/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.services;

import br.com.interfaces.model.IUsuario;
import br.com.interfaces.services.IUsuarioService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arthu
 */
public class UsuarioService implements IUsuarioService {
    
    private static List<IUsuario> usuariosCadastrados;
    
    public UsuarioService() {
        this.usuariosCadastrados = new ArrayList<IUsuario>();
    }

    @Override
    public void adicionarUsuario( IUsuario iu ) {
        usuariosCadastrados.add( iu );
    }
    
    @Override
    public void removerUsuario( IUsuario iu ) {
        usuariosCadastrados.remove( iu );
    }

    @Override
    public List<IUsuario> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }
    
    @Override
    public Boolean possuiCadastro( IUsuario iu ) {
        return usuariosCadastrados.contains( iu );
    }
}
