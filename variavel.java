package secao2;


public class variavel {

public static void main(String[] args) {
    
// oque sao variaveis
// tipo -> nome -> atribuir um valor;

String nome = "Matheus";

// nome => "Matheus";

System.out.println(nome);

// Atribuicao de variavel com outra

String Testando = "teste";

System.out.println(Testando);

Long NumeroGrande = 9999999999999L;

System.out.println(NumeroGrande);

// Aula 4 Strings 

String firstName = "Sander";
String lastname = "Wringe";

System.out.println(firstName + lastname);
System.out.println(firstName + " " + lastname);
System.out.println("o nome dele e " + firstName);

String fullName = firstName + " " + lastname;

// Concatenacao = + nas strings, para uni-las

System.out.println(fullName);

// 5 Char OBS: ele nao aceita aspas duplas(""), somente simples ('')

char letra = 'A'; 
System.out.println(letra);

String letra2 = "A";
System.out.println(letra2);

char simbolo = '$';
System.out.println(simbolo);

// 6 int

int n = 42; 
System.out.println(n);
System.out.println(n + 5);
System.out.println(n * 10);
System.out.println(n / 5);

int soma = n + 12;
System.out.println(soma);


// 7 log

long PopulacaoMundial = 78000000000L; 
System.out.println(PopulacaoMundial);

long gradeNumero = 1000_000_000; 
System.out.println(gradeNumero);
System.out.println(gradeNumero + 1 );


// 8 double

double preco = 19.99; 
System.out.println(preco);
System.out.println(preco - 12);
System.out.println(preco / 2);
double pi = 3.141_592_123;
System.out.println(pi);

double valorComD = 12.1D;
System.out.println(valorComD);


// 9 operadores aritmeticos P1

int soma2 = 12 + 5;

System.out.println(soma2);
System.out.println(22 + 4);
System.out.println(10 - 5);
System.out.println(10 * 5);
System.out.println(10 / 2.5);
System.out.println(10.0 / 2.5);

// para ter um resultado quebrado (1.5) , pelomenos um numero da divisao tem que ser (Double)

System.out.println(10 / 3);

System.out.println(10.0 / 3);

// Essa divisao com o sinal de porcentagem , o resultado e o resto da divisao

System.out.println(10 % 3);


// Operadores aritimeticos P2

int x = 5; 
x++;
x++;
x++;
x++;

// Precisao de 1 e amplamente usado em loops -> for, while

System.out.println(x);

int y = 5;

y--;

 System.out.println(y);

 int a = 10;
 a += 5; 
 
 System.out.println(a);

 int b = 10; 

 b -= 5; 

 System.out.println(b);

 b -= a;
 System.out.println(b);

// Type casting

// Formato IMPRICITO (widening)

int numero2 = 42;

long numeroLong = numero2; 

double numeroDouble = numero2;

System.out.println(numeroLong); 
System.out.println(numeroDouble);

// Formato EXPLICITO (narrowing)

double valorDouble = 9.78;
int valorInt = (int) valorDouble;
 
System.out.println(valorInt);

// Casting de char para int 

char letra3 = 'A';

int codigoAscii = (int) letra3;

System.out.println(codigoAscii);

// 12 Cosntantes

final int DIAS_DA_SEMANA = 7; 
System.out.println("Dias da Semana: " + DIAS_DA_SEMANA);

// var 

var z = 10;
System.out.println(z);

z = 5; 

var texto2 = "teste"; 

var doubleteste = 2.0; 


System.out.println(doubleteste);

System.out.println(texto2);




}  
}
