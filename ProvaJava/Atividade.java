package ProvaJava;

import java.util.Scanner;

public class Atividade {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.print("Informe o Primeiro Número:");
        double valor1 = sc.nextDouble();
        System.out.print("Informe o Segundo Número:");
        double valor2 = sc.nextDouble();
        System.out.print("Informe a Operação a ser Realizada, 1 - Adição / 2- Subtração / 3-Multiplicação / 4- Divisão :");
        int operacao = sc. nextInt();
        
        if (operacao==1){
            double adicao = valor1+valor2;
            System.out.println("O Resultado é:" +adicao);
        } else if (operacao==2){
            double subtracao = valor1-valor2;
            System.out.println("O Resultado é:" +subtracao);
        } else if (operacao==3){
            double multiplicacao = valor1*valor2;
            System.out.println("O Resultado é:" +multiplicacao);
        } else if(operacao==4 && valor2==0){
            System.out.println("IMPOSSÍVEL DIVIDIR POR 0");
        } else {
            double divisao = valor1/valor2;
            System.out.println("O Resultado é:" +divisao);
        }

    }

    public void exercicio2() {
        System.out.print("Informe o Número de Matrícula do Aluno:");
        int matricula = sc.nextInt();

        if (matricula % 4==0){
        System.out.println("Você caiu no Time do CHRIS");
        }else if (matricula % 4==1)
        System.out.println("Você caiu no Time do GREG");
        else if (matricula % 4==2)
        System.out.println("Você caiu no Time do CARUSO");
        else{
        System.out.println("Você caiu no Time do JEROME");
        }
        }
  
    public void exercicio3() {
        System.out.print("Informe a Quantidade de Morangos Adquridas em Kg:");
        double morangos = sc.nextDouble();
        System.out.print("Informe a Quantidade de Maçãs Adquridas em Kg:");
        double macas = sc.nextDouble();
        System.out.print("Informe a Quantidade de Bananas Adquridas em Kg:");
        double bananas = sc.nextDouble();

        double totalKilos = morangos+macas+bananas;

        double morangosPreco = morangos*3.50;
        double macasPreco = macas*2.30;
        double bananasPreco = bananas*1.80;

        double totalPreco = morangosPreco+macasPreco+bananasPreco;


        if (totalKilos>15 || totalPreco>30){
        double precoFinal = totalPreco - (totalPreco*0.10);
        System.out.print("O valor a ser Pago é R$: " +precoFinal);
        } else {
        System.out.print("O valor a ser Pago é R$: " + totalPreco);
        }

    }

}
