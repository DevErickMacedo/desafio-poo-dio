import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java...");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Kotlin");
        curso2.setDescricao("Descrição Curso Kotlin...");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição de Mentoria em Java...");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Backend Com Java");
        bootcamp.setDescricao("Descrição Bootcamp Backend Com Java...");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devErick = new Dev();
        devErick.setNome("Erick");
        devErick.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Erick: " + devErick.getConteudosInscritos());
        devErick.progredir();
        devErick.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Erick: " + devErick.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Erick: " + devErick.getConteudosConcluidos());
        System.out.println("XP: " + devErick.calcularXpTotal());

        System.out.println();

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXpTotal());

    }
}
