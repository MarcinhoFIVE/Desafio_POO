package main;

import br.mdan.desafio.Bootcamp;
import br.mdan.desafio.Conteudo;
import br.mdan.desafio.Curso;
import br.mdan.desafio.Dev;
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
        //Conteudo conteudo1 = new Mentoria();
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());
        
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devMarcio = new Dev();
        devMarcio.setNome("Marcio");
        devMarcio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcio" + 
                devMarcio.getConteudosInscritos());
        devMarcio.progredir();
        System.out.println("Conteúdos Inscritos Marcio" + 
                devMarcio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcio" + 
                devMarcio.getConteudosConcluidos());
        devMarcio.progredir();
        System.out.println("XP:" + devMarcio.calcularTotalXp());
        
        System.out.println("----------------");
        
        Dev devDarlan = new Dev();
        devMarcio.setNome("Darlan");
        devDarlan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Darlan" + 
                devDarlan.getConteudosInscritos());
        devDarlan.progredir();
        System.out.println("Conteúdos Inscritos Darlan" + 
                devDarlan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Darlan" + 
                devDarlan.getConteudosConcluidos());
        System.out.println("XP:" + devDarlan.calcularTotalXp());
        
    }
    
}
