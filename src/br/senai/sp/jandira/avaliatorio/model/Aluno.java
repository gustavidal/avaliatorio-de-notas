package br.senai.sp.jandira.avaliatorio.model;

import java.util.Scanner;

public class Aluno {

    String nome;
    String situacao;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos começar!");
        System.out.print("Por favor, insira seu nome: ");
        nome = leitor.nextLine();

        System.out.print("Agora me diga sua primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.print("Agora me diga sua segunda nota: ");
        nota2 = leitor.nextDouble();

        System.out.print("Agora me diga sua terceira nota: ");
        nota3 = leitor.nextDouble();

        System.out.print("Agora me diga sua quarta nota: ");
        nota4 = leitor.nextDouble();

        calcularDadosEAprovacao();
    }

    public void calcularDadosEAprovacao(){
        double somaDasNotas = nota1 + nota2 + nota3 + nota4;

        media = somaDasNotas / 4;

        if (media >= 5.0){
            situacao = "aprovado";
        } else {
            situacao = "reprovado";
        }

        exibirResultados();
    }

    public void exibirResultados(){
        String mediaDecimal = String.format("%.2f", media);
        System.out.println("***** CÁLCULO DE MÉDIA ESCOLAR *****");
        System.out.println("------------------------------------------------------");
        System.out.println("Nome do(a) aluno(a): " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("------------------------------------------------------");
        System.out.println("Média da(a) aluno(a): " + mediaDecimal);
        System.out.println("O(A) aluno(a), " + nome + ", está " + situacao + "(a)!");
        System.out.println("************************************");
    }
}
