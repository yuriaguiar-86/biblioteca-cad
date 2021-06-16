/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.imepac.biblioteca.telas.livros.util;

import be.com.imepac.biblioteca.daos.LivroDao;
import be.com.imepac.biblioteca.entidades.Livro;
import be.com.imepac.biblioteca.servicos.LivroServico;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Incubadora02
 */
public class LivroServicoComplemento extends LivroServico{
    
    private LivroDao livroDao;

    public LivroServicoComplemento() throws ClassNotFoundException, SQLException {
        this.livroDao = new LivroDao();
    }
    
    
    
    public List<Livro> pesquisarAll() throws SQLException{
        return this.livroDao.consultar();
    }
    
}
