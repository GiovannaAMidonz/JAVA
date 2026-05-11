package org.example.CollectionsExerciciosDeFixacao.List.CatalogoDeLivro;

import java.util.ArrayList;
import java.util.List;

public class CatalagoDeLivro {

    List<Livro> livros ;

    public CatalagoDeLivro(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String autor, String titulo, int anoPublicacao){
        livros.add(new Livro(autor, titulo, anoPublicacao));
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livros.isEmpty()){
            for(Livro l : livros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAno(int anoInicio, int anoFim){
        List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();
        if(!livros.isEmpty()){
            for(Livro l : livros){
                if(l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFim){
                    livrosPorIntervaloDeAno.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAno;
    }
    public Livro pesquisarLivroPorTitulo(String titulo){
        if(!livros.isEmpty()){
            for(Livro l : livros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    return l;
                }
            }
        }
        return null;
    }
}


