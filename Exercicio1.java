import java.util.Scanner;
import java.lang.Math;

//JONATHAN RAMOS CORDEIRO
//RA: 822220970


public class Exercicio1{
    public static void main (String[]args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite o nome do funcionário: ");
        String nome = ler.nextLine();
        System.out.println("Digite o peso do funcionário em KG: ");
        double pesoFuncionario = ler.nextDouble();
        System.out.println("Digite a quantidade já ingerida no dia em litros: ");
        double quantidadeDeAguaIngerida = ler.nextDouble();
        System.out.println("Digite a quantidade já ingerida no dia em litros: ");
        double quantidadeIdeal = (pesoFuncionario * 35) / 1000;
        double soma = quantidadeDeAguaIngerida - quantidadeIdeal;
        double arredondado = soma;
        double quantidadeFalta = quantidadeIdeal-quantidadeDeAguaIngerida;

        System.out.println("Nome: "+nome);
        System.out.println("Peso: "+pesoFuncionario+"Kg");
        System.out.println("Quantidade de água ingerida: "+quantidadeDeAguaIngerida+ " litros");
        System.out.println("Quantidade ideal de água ideal a ingerir: "+ Math.round(quantidadeIdeal) + " litros");

        if(quantidadeFalta<0){
            System.out.println("Parabéns, você atingiu a meta de hidratação diária");
        } else{
            System.out.println("Continue focado em se hidratar por hoje, ainda faltam " +Math.round(quantidadeFalta)+" litros! Você Consegue!");
        }
        

    }
}