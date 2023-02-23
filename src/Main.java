import br.com.dio.dominio.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Javascript");
        curso2.setCargaHoraria(7);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Javascript");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Banco Inter Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz Eduardo");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Inscritos Luiz Eduardo: " + devLuiz.getConteudosInscritos());
        devLuiz.progredir();
        devLuiz.progredir();
        System.out.println("-");
        System.out.println("Contéudos Inscritos Luiz Eduardo: " + devLuiz.getConteudosInscritos());
        System.out.println("Contéudos Concluidos Luiz Eduardo: " + devLuiz.getConteudosConcluidos());
        System.out.println("XP: " + devLuiz.calcularTotalXp());


        System.out.println("---------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Contéudos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Contéudos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}