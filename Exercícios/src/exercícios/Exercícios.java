package exercícios;
import java.util.Scanner;

public class Exercícios {

    public static void main(String[] args) {
        
        Scanner Leitor = new Scanner(System.in);
        
        //java 1
    
        /*System.out.println("Insira o primeiro dígito");
        int digitoUm = Leitor.nextInt();
        System.out.println("Insira o segundo dígito");
        int digitoDois = Leitor.nextInt();
        System.out.println("A soma dos dois é" + (digitoUm + digitoDois));*/
        
        // java 2
        
        /*System.out.println("Insira o primeiro dígito");
        int digitoUm = Leitor.nextInt();
        System.out.println("Insira o segundo dígito");
        int digitoDois = Leitor.nextInt();
        System.out.println("A soma dos dois é " + (digitoUm + digitoDois));
        System.out.println("A subtração dos dois é " + (digitoUm - digitoDois));
        System.out.println("A multiplicação dos dois é " + (digitoUm * digitoDois));
        System.out.println("A divisão dos dois é " + (digitoUm / digitoDois));*/
        
        // java 3
        
        /*System.out.println("Insira a distância percorrida (km)");
        float km = Leitor.nextFloat();
        System.out.println("Insira o combustível gasto (L)");
        float L = Leitor.nextFloat();
        System.out.println("O gasto de combustível é de " + (km / L)+"km/L");*/
        
        // java 4
        
        /*float comissao = 0.15f;
        System.out.println("Insira seu nome");
        String nome = Leitor.nextLine();
        System.out.println("Insira deu salário fixo");
        float salario = Leitor.nextFloat();
        System.out.println("Insira o valor total em vendas");
        float vendas = Leitor.nextFloat();
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Valor do salário fixo:" + salario);
        System.out.println("Salário no final do mês:" + (salario + (comissao * vendas)));*/
        
        // java 5
        
        /*System.out.println("Insira seu nome");
        String nomeDoAluno = Leitor.nextLine();
        System.out.println("Insira a nota da primeira prova");
        float nota1 = Leitor.nextFloat();
        System.out.println("Insira a nota da segunda prova");
        float nota2 = Leitor.nextFloat();
        System.out.println("Insira a nota da terceira prova");
        float nota3 = Leitor.nextFloat();
        System.out.println("Nome do aluno: " + nomeDoAluno);
        System.out.println("Média aritimética: " + (nota1 + nota2 + nota3)/3);*/
        
        // java 6
        
        /*int c;
        System.out.println("Insira o primeiro dígito");
        int a = Leitor.nextInt();
        System.out.println("Insira o segundo dígito");
        int b = Leitor.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("A agora vale " + a);
        System.out.println("B agora vale " + b);*/
        
        // java 7
        
        /*System.out.println("Insira a temperatura em C");
        float C = Leitor.nextFloat();
        float F = (9*C+160)/5;
        System.out.println(C + " em C equivale a " + F + "F");*/
        
        // java 8
        
        /*System.out.println("Insira o valor em dólares");
        float dolar = Leitor.nextFloat();
        System.out.println("Insira a cotação atual do dólar");
        float cotacaoDolar = Leitor.nextFloat();
        System.out.println("O valor atual em reais é R$" + (dolar * cotacaoDolar));*/
        
        // java 9
        
        /*int i = 0;
        float rendimento;
        double juros = 0.0007;
        System.out.println("Insira o valor do depósito");
        float deposito = Leitor.nextFloat();
        System.out.println("Insira o total de meses");
        int meses = Leitor.nextInt();
        while(i < meses){
            rendimento = deposito * (float) juros;
            deposito = deposito + rendimento;
            i++;
        } 
        System.out.println("O retorno total foi de R$" + deposito);*/
        
        // java 10
        
        /*int i = 0;
        System.out.println("Insira o valor do produto");
        float produto = Leitor.nextFloat();
        float prestacoes = produto / 5;
        System.out.println("A compra será dividida em 5 vezes de R$" + prestacoes + " sem juros");*/
        
        // java 11
        
        /*System.out.println("Insira o valor do produto");
        float produto = Leitor.nextFloat();
        System.out.println("Insira o acréscimo em %");
        float acrescimo = Leitor.nextFloat()/100;
        System.out.println("O valor de venda será R$" + (produto + (acrescimo * produto)));*/
        
        // java 12
        
        /*double imposto = 1.45;
        double acrescimo = 1.28;
        System.out.println("Insira o acréscimo em %");
        double carro = Leitor.nextFloat() * imposto;
        System.out.println("O valor de venda será R$" + carro * acrescimo);*/
        
        // java 13
        
        /*System.out.println("Insira o número");
        int numero = Leitor.nextInt();
        if (numero > 10){
            System.out.println(numero + " é maior que 10");
        }*/
        
        // java 14
        
        /*System.out.println("Insira o primeiro número");
        int numero1 = Leitor.nextInt();
        System.out.println("Insira o segundo número");
        int numero2 = Leitor.nextInt();
        if (numero1 > numero2){
            System.out.println("O primeiro número é maior");
        } else{
            System.out.println("O segundo número é maior");
        }*/
        
        // java 15
        
        /*System.out.println("Insira o número");
        int numero = Leitor.nextInt();
        if (numero > 100 && numero < 200){
            System.out.println("Este número está entre 100 e 200");
        }*/
        
        // java 16

        /*System.out.println("Insira seu nome");
        String nomeDoAluno = Leitor.nextLine();
        System.out.println("Insira a nota da primeira prova");
        float nota1 = Leitor.nextFloat();
        System.out.println("Insira a nota da segunda prova");
        float nota2 = Leitor.nextFloat();
        System.out.println("Insira a nota da terceira prova");
        float nota3 = Leitor.nextFloat();
        System.out.println("Nome do aluno: " + nomeDoAluno);
        float media = (nota1 + nota2 + nota3)/3;
        if (media >= 7){
            System.out.println("Aluno aprovado");
        } else if (media <= 5){
            System.out.println("Aluno reprovado");
        } else if (media > 5.1 && media < 6.9){
            System.out.println("Aluno em recuperação");
        }*/
        
        // java 17
        
        /*int i = 0;
        int n = 0;
        while(i < 80){
            System.out.println("Insira o número");
            int numero = Leitor.nextInt();
            if (numero > 10 && numero < 150){
                n++;
            }
            i++;
        }
        System.out.println(n +  " números estão entre 10 e 150");*/
        
        // java 18
        
        /*int i = 0;
        while(i < 75){
            System.out.println("Insira a sua idade");
            int idade = Leitor.nextInt();
            if (idade >= 18){
                System.out.println("Você é maior de idade");
            } else{
                System.out.println("Você é menor de idade");
            }
            i++;
        }*/
        
        // java 19
        
        /*int i = 0;
        int m = 0;
        int h = 0;
        for(; i < 56; i++){
            System.out.println("Insira o seu nome");
            String nome = Leitor.nextLine();
            System.out.println("Insira seu gênero (h para homem e m para mulher)");
            char genero = Leitor.nextLine().charAt(0);
            if (genero == 'h'){
                System.out.println(nome +  " é homem");
                h++;
            } else{
                System.out.println(nome +  " é mulher");
                m++;
            }
        }
        System.out.println(h +  " são homens e " + m + " são mulheres");*/
        
        // java 20
        
        /*char continuar = 'S';
        double total = 0;
        double valor;   
        while(continuar == 'S'){
            System.out.println("Insira o valor do carro");
            float carro = Leitor.nextFloat();
            System.out.println("Insira o ano do carro");
            int ano = Leitor.nextInt();
            if(ano <= 2000){
                valor = (carro - (0.12 * carro));
                System.out.println("O desconto será de R$" + (carro * 0.12) + " e o valor total será de R$" + valor);
            } else{
                valor = (carro - (0.07 * carro));
                System.out.println("O desconto será de R$" + (carro * 0.07) + " e o valor total será de R$" + valor);
            }
            total = (total + valor);
            System.out.println("Deseja continuar? S para sim e N para não");
            continuar = Leitor.next().charAt(0);
        }
        System.out.println("O total pago será R$" + total);*/
        
        // java 21
        
        /*int total = 0;
        int apto = 0;
        char continuar = 'S';
        while(continuar == 'S'){
            System.out.println("Insira seu nome");
            String nome = Leitor.next();
            System.out.println("Insira a sua idade");
            int idade = Leitor.nextInt();
            System.out.println("Insira seu gênero (h para homem e m para mulher)");
            char genero = Leitor.next().charAt(0);
            System.out.println("Você tem problemas de saúde? S/N");
            char saude = Leitor.next().charAt(0);
            if (idade >= 18 && genero == 'h' && saude == 'N'){
                System.out.println(nome + " está apto");
                apto++;
                total++;
            } else{
                System.out.println(nome + " não está apto");
                total++;
            }
            System.out.println("Continuar o cadastro? S/N");
            continuar = Leitor.next().charAt(0);
        }
        System.out.println(apto + " conscritos de " + total + " estão aptos");*/
        
        // java 22
        
        /*int i = 0;
        float custoTotal = 0;
        float vendaTotal = 0;
        for(; i < 40; i++){
            System.out.println("Informe o valor de custo");
            float custo = Leitor.nextFloat();
            System.out.println("Informe o valor de venda");
            float venda = Leitor.nextFloat();
            if(custo < venda){
                System.out.println("houve lucro");
            } else if (custo == venda){
                System.out.println("houve empate");
            } else{
                System.out.println("houve prejuízo");
            }
            custoTotal = custoTotal + custo;
            vendaTotal = vendaTotal + venda;
        }
        System.out.println("a média de custo foi R$" + (custoTotal / i) + " e o valor médio de venda foi R$" + (vendaTotal / i));*/
        
        // java 23

        /*System.out.println("Insira o número");
        int numero = Leitor.nextInt();
        if(numero > 80){
            System.out.println("É maior que 80");
        } else if(numero < 25) {
            System.out.println("É menor que 25");
        } else if (numero == 40){
            System.out.println("É igual a 40");
        }*/
        
        // java 24
        
        /*System.out.println("Insira o número");
        int numero = Leitor.nextInt();
        if(numero > 0){
            System.out.println("É positivo");
        } else if(numero < 0) {
            System.out.println("É negativo");
        } else if (numero == 0){
            System.out.println("É igual a 0");
        }*/
        
        // java 25 

        /*System.out.println("Insira o primeiro número");
        int numero1 = Leitor.nextInt();
        System.out.println("Insira o segundo número");
        int numero2 = Leitor.nextInt();
        if(numero1 == numero2){
            System.out.println("Ambos são iguais");
        } else if(numero1 > numero2){
            System.out.println("O primeiro numero é maior");
        } else{
            System.out.println("O segundo numero é maior");
        }*/
        
        // java 26

        /*System.out.println("Insira um numero de 1 a 5");
        int numero = Leitor.nextInt();
        switch (numero){
            case 1 :
                System.out.println("Um");
                break;
            case 2 :
                System.out.println("Dois");
                break;
            case 3 :
                System.out.println("Três");
                break;
            case 4 :
                System.out.println("Quatro");
                break;
            case 5 :
                System.out.println("Cinco");
                break;
            default :
                System.out.println("Este numero não está no intervalo de 1 a 5");
        }*/
        
        // java 27
        
        /*double total = 0;
        double valor = 0;   
        float carro = 1;
        while(carro != 0){
            System.out.println("Insira o valor do carro");
            carro = Leitor.nextFloat();
            if(carro != 0){
                System.out.println("Qual o combustível utilizado? a para alcool, g para gasolina e d para diesel");
                char combustivel = Leitor.next().charAt(0);
                switch (combustivel) {
                    case 'a':
                        valor = (carro - (0.25 * carro));
                        System.out.println("O desconto será de R$" + (carro * 0.12) + " e o valor total será de R$" + valor);
                        break;
                    case 'g':
                        valor = (carro - (0.21 * carro));
                        System.out.println("O desconto será de R$" + (carro * 0.07) + " e o valor total será de R$" + valor);
                        break;
                    case 'd':
                        valor = (carro - (0.14 * carro));
                        System.out.println("O desconto será de R$" + (carro * 0.07) + " e o valor total será de R$" + valor);
                        break;
                    default:
                        System.out.println("Escolha uma opção válida");
                        break;
                }
                total = (total + valor);
            }
        }
        System.out.println("O total pago será R$" + total);*/
        
        // java 28
        
        /*double folha = 0;
        double salarioMinimo = 1212.0;
        double reajuste = 0;
        for(int i = 0; i < 2; i++){
            System.out.println("Insira seu nome");
            String nome = Leitor.next();
            System.out.println("Insira a seu salário atual");
            double salario = Leitor.nextDouble();
            if (salario < 3 * salarioMinimo){
                reajuste = salario * 1.5;
            }
            else if (salario > 3 * salarioMinimo && salario <= 10 * salarioMinimo){
                reajuste = salario * 1.2;
            }
            else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo){
                reajuste = salario * 1.15;
            }
            else if (salario > 20 * salarioMinimo){
                reajuste = salario * 1.1;
            }
            folha = folha + (reajuste - salario);
            System.out.println(nome + ", seu sálario será reajustado para R$" + reajuste);
        }
        System.out.println("A folha de pagamento aumentará em R$" + folha);*/
        
        // java 29
          
        /*System.out.println("Insira o número índice do mês");
        int mes = Leitor.nextInt();
        switch (mes){
            case 1 :
                System.out.println("Janeiro");
                break;
            case 2 :
                System.out.println("Fevereiro");
                break;
            case 3 :
                System.out.println("Março");
                break;
            case 4 :
                System.out.println("Abril");
                break;
            case 5 :
                System.out.println("Maio");
                break;
            case 6 :
                System.out.println("Junho");
                break;
            case 7 :
                System.out.println("Julho");
                break;
            case 8 :
                System.out.println("Agosto");
                break;
            case 9 :
                System.out.println("Setembro");
                break;
            case 10 :
                System.out.println("Outubro");
                break;
            case 11 :
                System.out.println("Novembro");
                break;
            case 12 :
                System.out.println("Dezembro");
                break;
            default :
                System.out.println("Nunca ouvi falar de um mês com o índice " + mes);
        }*/
        
        // java 30
        
        /*long[] numero = new long[3];
        System.out.println("Insira o primeiro número");
        numero[0] = Leitor.nextLong();
        System.out.println("Insira o segundo número");
        numero[1] = Leitor.nextLong();
        System.out.println("Insira o terceiro número");
        numero[2] = Leitor.nextLong();
        for(int i = 0; i < numero.length - 1; i++){
            for(int j = 0; j < numero.length - 1; j++){
                if(numero[j] > numero[j + 1]){
                    long aux = numero[j];
                    numero[j] = numero[j+1];
                    numero[j+1] = aux;
                }
            }
	}
        System.out.println("A ordem crescente dos numeros é " + numero[0] + ", " + numero[1] + " e " + numero[2]);*/
        
        // java 31
        
        /*System.out.println("Insira o primeiro número");
        int a = Leitor.nextInt();
        System.out.println("Insira o segundo número");
        int b = Leitor.nextInt();
        System.out.println("Insira o operador: +, -, *, /");
        char c = Leitor.next().charAt(0);
        double resultado = 0;
        if (b == 0 && c == '/'){
            System.out.println(a + " não pode ser dividido por 0");
        } else if (a < b && c == '/'){
            System.out.println(a + " não pode ser dividido por um número maior que ele");
        } else{
            switch (c){
                case '+' :
                    resultado = a + b;
                    break;
                case '-' : 
                    resultado = a - b;
                    break;
                case '*' :
                    resultado = a * b;
                    break;
                case '/' :
                    resultado = a / b;
                    break;
                default :
                    System.out.println("O operador não é valido");
            }
            System.out.println("O resultado de " + a + " " + c + " " + b + " é = " + resultado);
        }*/
        
        // java 32

        /*System.out.println("Insira o primeiro número");
        int a = Leitor.nextInt();
        System.out.println("Insira o segundo número");
        int b = Leitor.nextInt();
        System.out.println("Insira o terceiro número");
        int c = Leitor.nextInt();
        if (a + b >= c){
            if (a == b && b==c){
                System.out.println("Equilátero");
            } else if (a == b || b == c || c == a){
                System.out.println("Isósceles");
            } else{
                System.out.println("Escaleno");
            }
        } else{
            System.out.println("Não é um triângulo");
        }*/
        
        // java 33
        
        /*int valor;
        System.out.println("Insira o total de horas lecionadas");
        int horas = Leitor.nextInt();
        System.out.println("Insira o seu nível profissional");
        int nivel = Leitor.nextInt();
        switch (nivel) {
            case 1:
                valor = 12;
                break;
            case 2:
                valor = 17;
                break;
            case 3:
                valor = 25;
                break;
            default:
                valor = 0;
        }
        System.out.println("Seu salário será de R$" + (horas * valor));*/
        
        // java 34
        
        /*String categoria = null;
        System.out.println("Insira a sua idade");
        int idade = Leitor.nextInt();
        if (idade > 5 && idade < 8){
            categoria = "infantil A";
        } else if (idade > 7 && idade < 11){
            categoria = "infantil B";
        } else if (idade > 10 && idade < 14){
            categoria = "juvenil A";
        } else if (idade > 13 && idade < 18){
            categoria = "infantil B";
        } else if (idade > 17 && idade < 26){
            categoria = "sênior";
        } else{
            System.out.println("idade fora da faixa etária");  
        }
        System.out.println("Sua categoria é " + categoria);*/
        
        // java 35
        
        /*double taxa = 0;
        System.out.println("horas de uso");
        int horas = Leitor.nextInt();
        System.out.println("Insira seu tipo de cliente: a para residencial, b para comercial e c para industrial");
        char tipo = Leitor.next().charAt(0);
        switch (tipo) {
            case 'a':
                taxa = 0.60;
                break;
            case 'b':
                taxa = 0.48;
                break;
            case 'c':
                taxa = 1.29;
                break;
            default:
                System.out.println("Insira uma opção válida");
        }
        System.out.println("Sua contra de luz será R$" + (taxa * horas));*/
    }
    
}
