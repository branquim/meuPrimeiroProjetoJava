package edu.alexandre.primeirobimestre;

import java.util.Random;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá turma, sejam bem vindos");

        String primeiroNome = "Alexandre";
        String segundoNome = "Branquinho";
        int anoFabricacao = 2013;
        boolean verdadeira = true;

        anoFabricacao = 2018;

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);



        System.out.println(nomeCompleto);;

        System.out.println(nomeCompleto + anoFabricacao);

        imprimirSelecionados();
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato de número: "+ (i+1)+ " é: "+ candidatos[i]);
        }

        System.out.println("Forma abreviada de interação for each");

        for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi: " + candidato);
        }

        for (String candidato: candidatos){
            System.out.println("Ligando para o candidato "+candidato);
            entrandoEmContato(candidato);
        }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 0;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            tentativasRealizadas++;
            atendeu = atender();
            if (atendeu){
                System.out.println("O candidato "+candidato+" atendeu a ligação na tentativa de número "+tentativasRealizadas);
                continuarTentando = false;
            }
            if (tentativasRealizadas==3 && continuarTentando){
                System.out.println("Não foi possível entrar em contato com o candidato "+candidato+" após "+tentativasRealizadas+" tentativas.");
            }
        }while(continuarTentando && tentativasRealizadas<3);
    }
}
