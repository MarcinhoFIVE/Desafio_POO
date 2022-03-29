package main;

import br.mdan.desafio.Conteudo;
import br.mdan.desafio.Curso;
import br.mdan.desafio.Mentoria;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descricao Curso js");
        curso2.setCargaHoraria(4);
        
        //Conteudo conteudo = new Curso();
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());
        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
    
}
