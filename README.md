/*1- Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. */
```java
import java.util.Scanner; public class idade {

 public static void main(String []args){
     //declaração de variável
     int anos,meses,dias; 
     float resultado;
     //atribuição de valor à variavel
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Digite sua idade: ");
     anos= sc.nextInt();
     // calculos necessários
     meses= anos*12;
     dias= meses*30;
     
     // impressão de resultados
    System.out.println("Idade em anos: " + anos);
    
    System.out.println("Idade em meses: " + meses);
     
      System.out.println("Idade em dias: " + dias);
     
   
   
   
 }
```
 
 
 
 
/*2-Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.  */

```java
import java.util.Scanner;

public class idade {

public static void main(String[] args) {
    // Declaração de variáveis
    int eleitores, nulos, brancos, validos;
    double porcentagemNulos;
    double porcentagembrancos;
    double porcentagemvalidos;// Usando double para porcentagem

    // Atribuição de valor à variável
    Scanner sc = new Scanner(System.in);

    // Solicitar o número de eleitores
    System.out.print("Quantos eleitores tem na sua cidade? ");
    eleitores = sc.nextInt();

    // Solicitar o número de votos nulos
    System.out.print("Quantos votos foram nulos? ");
    nulos = sc.nextInt();

    // Solicitar o número de votos brancos
    System.out.print("Quantos votos foram brancos? ");
    brancos = sc.nextInt();

    // Calcular o número de votos válidos
    validos = eleitores - nulos - brancos;

    // Exibir o número de votos válidos
    System.out.println("Restam " + validos + " votos válidos.");

   
    // Calcular e exibir a porcentagem de votos nulos
    porcentagemNulos = ((double) nulos / eleitores) * 100;  
    
    System.out.println("A porcentagem de votos nulos é: " + porcentagemNulos + "%");
    
    porcentagembrancos = ((double) brancos / eleitores) * 100; 
    
    System.out.println("A porcentagem de votos brancos é: " + porcentagembrancos  + "%");
porcentagemvalidos= ((double) validos / eleitores) * 100;

System.out.println("A porcentagem de votos nulos é: " + porcentagemvalidos + "%"); // Fechar o scanner sc.close(); } }
```


3- Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário. 8?*/

```java
import java.util.Scanner;

public class idade{
    
    public static void main(String[] args){
        //declaração de variavel
        float diferenca,salario,reajuste,novosal;
        Scanner sc = new Scanner(System.in);
      System.out.print("Qual o seu salario? ");
     salario = sc.nextInt();
     
      System.out.print("Qual o seu novo reajuste em % ? ");
     reajuste = sc.nextInt();
     novosal= (reajuste/100)*salario;
     
      System.out.print("Você teve um aumento salarial de  "+ novosal+ " reais");
    
     
    }
} 

```



4- O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.*/


```java
import java.util.Scanner;

public class idade{
    
    public static void main(String[] args){
        //declaração de variavel
        double precofabrica,custofim,distribuidora,imposto;
        Scanner sc = new Scanner(System.in);
     
     imposto=45.0;
     distribuidora=28.0;
     
     
      System.out.print("Qual o preço do carro? ");
     precofabrica =  sc.nextDouble();
     
     imposto=(precofabrica*imposto/100);
    distribuidora= (precofabrica*distribuidora/100);
    custofim=(precofabrica+imposto+distribuidora);
    
     
      System.out.print("Custo Final: "+custofim );
    
     
    }
}

```


5- Escreva um algoritimo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius. Observação: PARA TESTAR SE SUA RESPOSTA ESTA CORRETA SAIBA QUE 100°C = 212F



```java
import java.util.Scanner;
public class idade{
    
    public static void main(String[] args){
        //declaração de variavel
        double grausf,grausc,conversao;
        Scanner sc = new Scanner(System.in);
     
    
     
      System.out.print("Digite a temperatura em FH: ");
     grausf =  sc.nextDouble();
    conversao= ((grausf-32)*5/9);
    System.out.print("Temperatura em celsius: "+ conversao);
      
     
    }
}
```


7- Ler um valor e escrever a mensagem É MAIOR QUE 10, se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10.

```java
import java.util.Scanner;

public class idade{
    
    public static void main(String[] args){
        //declaração de variavel
        double valor1,valorfix;
        Scanner sc = new Scanner(System.in);
     
    valorfix= 10;
     
      System.out.print("Primeiro valor: ");
     valor1 =  sc.nextDouble();
    
     
     if(valorfix>valor1){  System.out.print("É MENOR QUE "+ valorfix);
         
     }else if (valorfix>valor1) {
            System.out.println("VALORES IGUAIS");}
            
            
    else{  System.out.println("É MAIOR QUE "+ valorfix);
        
        
    }
     
    }
}
```


8- ler um valor e escrever se é positivoou negativo(considere o valor zero como positivo)


```java

import java.util.Scanner;

public class idade{
    
    public static void main(String[] args){
        //declaração de variavel
        double valor,valorfix;
        Scanner sc = new Scanner(System.in);
     
    valorfix= 0;
     
      System.out.print("Primeiro valor: ");
     valor =  sc.nextDouble();
    
     
     if(valor>valorfix){  System.out.print("É POSITIVO ");
         
     }else if (valor<valorfix) {
            System.out.println("VALOR É NEGATIVO");}
            
            
   
     
    }
}
```


9-






```java

import java.util.Scanner;

public class idade{
    
    public static void main(String[] args){
        //declaração de variavel
        int qtdeatac,qtde;
        double varejo,atacado;
        Scanner sc = new Scanner(System.in);
     
     varejo = 1.30;
     atacado = 1.00;

    qtdeatac= 12;
      System.out.print("Quantas maçãs deseja comprar?: ");
        qtde = sc.nextInt();
if (qtde>=qtdeatac){
      System.out.print("Quantidade :  "+qtde+ "\n Preço: "+(qtde*atacado));
} else{
     System.out.print("Quantidade :  "+qtde+ "\n Preço: "+(qtde*varejo));
}

}
}
```
10-


```java

import java.util.Scanner;

public class idade{
    
    public static void main(String[] args){
        //declaração de variavel
        double nota1,nota2,notafix,mediari;
        Scanner sc = new Scanner(System.in);
    
     
      System.out.print("Primeira nota?: ");
        nota1 = sc.nextInt();
      
   
      System.out.print("Segunda nota?: ");
        nota2 = sc.nextInt();   
        
     mediari=(nota1+nota2)/2;
     notafix=6.0;     
if (mediari>=notafix){
      System.out.print("passou");
} else{System.out.print("ficou");
     
}

}
}
```
11-

```java

import java.util.Scanner;

public class idade{
    
    public static void main(String[] args){
        //declaração de variavel
        int anoatu,nasc,deferenca;
        Scanner sc = new Scanner(System.in);
    
     
      System.out.print("Ano atual?: ");
        anoatu = sc.nextInt();
      
   
      System.out.print("Seu Nascimento?: ");
        nasc = sc.nextInt();   
     deferenca=  (anoatu-nasc);
     
if (deferenca>=18){
      System.out.print("Pode votar");
} else{System.out.print("Não pode");
     
}

}
}
```

12-



```java
import java.util.Scanner;

public class idade{
    
    public static void main(String[] args){
        //declaração de variavel
        int num1,num2;
        Scanner sc = new Scanner(System.in);
    
     
      System.out.print("Primeiro numero?: ");
        num1 = sc.nextInt();
      
   
      System.out.print("Segundo numero: ");
        num2 = sc.nextInt();   
    
if (num1>=num2){
      System.out.print("Maior "+num1);
} else if{System.out.print("Maior "+num2);
     
}

}
}
```

12-

```java

import java.util.Scanner;

public class Idade {
    
    public static void main(String[] args){
        // declaração de variáveis
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        // Solicitar e ler os números
        System.out.print("Primeiro número?: ");
        num1 = sc.nextInt();
      
        System.out.print("Segundo número: ");
        num2 = sc.nextInt();   

        // Verificação de qual número é maior
        if (num1 >= num2) {
            System.out.print(num1 + ", " + num2);  // Corrigido para concatenar os números
        } else if (num2 > num1) {
            System.out.print(num2 + ", " + num1);  // Corrigido para concatenar os números
        }
    }
}

```


14- 



```java

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
//		Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos)
//		e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que 
//		jogo pode iniciar em um dia e terminar no dia seguinte.

		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a hora de inicio: ");
		int horaInicio = entrada.nextInt();
		System.out.println("Insira a hora de fim: ");
		int horaFim = entrada.nextInt();
		int totalHoras;
		if (horaFim >= horaInicio) {
			totalHoras = horaFim - horaInicio ;
		}	else {
			totalHoras = (24 - horaInicio) + horaFim;
		}
		System.out.println("total de horas " + totalHoras);
		
		entrada.close();
		
	}
}
```


15- 
```java

import java.util.Scanner;

public class Questao15 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	 System.out.println("Insira horas no mês trabalhada: ");
	 int horas = sc.nextInt();
	 sc.nextLine();
	 System.out.println("Insira salário por hora: ");
	 double salHora = sc.nextDouble();
	 sc.nextLine();
	
	 double salTotal = horas*salHora;
	 if(horas > 160) {
		 double acresimo = (salTotal*0.5) + salTotal;
		 System.out.println("Total de horas: " + horas);
		 System.out.println("O salário do funcionário com acrésimo é: R$ " + acresimo);
		 }	else {
			 System.out.println("Total de horas: " + horas);
			 System.out.println("O salário do funcionário sem acrésimo é : R$ " + salTotal);
		 }
	
	 sc.close();
	 }
}
```
16- 

```java

import java.util.Scanner;

public class Questao16 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int jan,fev,mar;
		jan = 15000;
		fev = 23000;
		mar = 17000;
		
		int despesaTotal = jan + fev + mar;
		double mediaMensal = despesaTotal/3;
		
		System.out.printf("Despesa total:R$ %d %nMédia Mensal: R$ %.2f", despesaTotal, mediaMensal);
		
		 sc.close();
		}
		
}
```
17-
```java

import java.util.Scanner;

public class Questao17 {
	public static void main(String[] args) {
		
		// Programa que leia as notas e calcule a média de LP1 deste semestre, referente a um determinado aluno.
		Scanner entrada = new Scanner(System.in);
		//(P1*0.6+((E1+E2)/2)*0.4)*0.5+(max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)*0.4)-5.9))*(API*0.5)+X+(SUB*0.3)
			System.out.println("Insira a sua nota da primeira prova: ");
			double p1 = entrada.nextDouble();
			entrada.nextLine();
			System.out.println("Insira a sua nota no exercício 1: ");
			double e1 = entrada.nextDouble();
			entrada.nextLine();
			System.out.println("Insira a sua nota no exercício 2: ");
			double e2 = entrada.nextDouble();
			entrada.nextLine();
			System.out.println("Insira o valor dos pontos extras: ");
			double x = entrada.nextDouble();
			
			double media = (((p1*0.6)+((e1+e2)/2)*0.4))*0.5;
			double max = Math.max(((p1*0.6)+(((e1+e2)/2)*0.4))-5.9, 0);
			double fator = max / (((p1*0.6)+((e1+e2)/2)*0.4)-5.9); 
			double notaTotal;
			
			if(fator == 1) {
				System.out.println("Insira a nota da API: ");
				double api = entrada.nextDouble();
				notaTotal =  media + (fator* (api*0.5))+ x;
				System.out.printf("Sua nota final: %.2f", notaTotal);
				
			}	else{
				System.out.println("Insira a nota do exame: ");
				double sub = entrada.nextDouble() ;
				double notaSubTotal = fator + (sub*0.3) + media + x ;
				System.out.printf("%nSua nota final: %.2f ", notaSubTotal);
			}
			
		entrada.close();
	}
}
```
![image](https://github.com/Victorvmor/LIGUAGUEM-DE-PROG.I/blob/main/Tarefa%202/netflix.jpg?raw=true)
