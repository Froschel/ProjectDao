/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelo.Pessoa;

/**
 *
 * @author UTFPR
 */

public class PessoaDaoArrayList implements Dao{

    private ArrayList<Pessoa> lista;

    public PessoaDaoArrayList() {
        lista = new ArrayList<>();
    }
    
    @Override
    public void adicionar(Pessoa p) {
        lista.add(p);
        System.out.println("A pessoa /'" + p.getNome() + " foi adicionada.");
    }

    @Override
    public void remover(Pessoa p) {
        lista.remove(p);
        System.out.println("A pessoa /'" + p.getNome() + " foi removida.");
    }

    @Override
    public void listarTudo() {
        //Temos que percorrer o ArrayList
        System.out.println("Inicio da relação");
        for (Pessoa elementoDaLista : lista) {
            System.out.println(elementoDaLista);
        }
        System.out.println("Final da relação");
    }
    
    
}
