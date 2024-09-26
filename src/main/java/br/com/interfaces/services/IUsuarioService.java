/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.interfaces.services;

import br.com.interfaces.model.IUsuario;
import java.util.List;

/**
 *
 * @author Arthu
 */
public interface IUsuarioService {
    
    public void adicionarUsuario(IUsuario iu);
    public void removerUsuario(IUsuario iu);
    public List<IUsuario> getUsuariosCadastrados();
    public Boolean possuiCadastro( IUsuario iu );
}
