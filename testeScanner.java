package secao2;

// Inportando o Scanner 

import java.util.Scanner;

public class testeScanner {


    public static void main(String[] args) {


        // testando Scanner 
        // codigo para habilitar o Scanner

        Scanner scanner = new Scanner (System.in);

        // Mensagem para o usuario entender oque precisa digitar
        System.out.println("Digite o seu Nome: ");

        // Resgata o valor do terminal
        String nome = scanner.nextLine();

        // Exibe o Valor
        System.out.println("Olá " + nome + "!");

        // nextInt
System.out.println("Digite a sua Idade:");
int idade = scanner.nextInt();
System.out.println("Voce tem " + idade + " anos");


// Fechamento do scanner, para evitar o memory leak.



// Problemas do nextLine

System.out.println("Digite um Numero: ");

int n = scanner.nextInt();

scanner.nextLine();

System.out.println("Digite um texto: ");

String txt = scanner.nextLine();

System.out.println("Os dados sao, n = " + n + " ë txt = " + txt);



scanner.close();

   
 }   
}
