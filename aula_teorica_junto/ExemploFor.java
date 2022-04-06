import java.util.Scanner;
public class ExemploFor {
    public static void main(String[] args) {
        int resposta = 4;
        do {
        System.out.println("Digite seu primeiro numero aqui");
        Scanner leitor = new Scanner(System.in);
        int n1 = leitor.nextInt();
        
        
        System.out.println("Digite seu segundo numero aqui");
        Scanner leitor2 = new Scanner(System.in);
        int n2 = leitor2.nextInt();

        System.out.println("Selecione sua operação");
        System.out.println("1) Adição");
        System.out.println("2) Subtração");
        System.out.println("3) Multiplicação");
        System.out.println("4) Divisão");
        System.out.println("5) Sair");
        System.out.println();
        Scanner leitor3 = new Scanner(System.in);
        int operacao = leitor3.nextInt();

        switch(operacao){
            case 1:
            System.out.println();
            System.out.println("O resultado da soma dos dois numeros é:");
            System.out.println();
            System.out.println(n1 + n2);
             break;
            case 2:
            System.out.println();
            System.out.println("O resultado da subtração dos dois numeros é:");
            System.out.println();
            System.out.println(n1 - n2);
             break;
            case 3:
            System.out.println();
            System.out.println("O resultado da multiplicação dos dois numeros é:");
            System.out.println();
            System.out.println(n1 * n2); 
             break;
            case 4:
            System.out.println();
            System.out.println("O resultado da divisão dos dois numeros é:");
            System.out.println();
            System.out.println(n1 / n2);
             break;
            default:
            System.out.println();
            System.out.println("Digite uma operação valida!");
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Deseja repetir o processo novamente?");
        System.out.println("Digite 1 para sim");
        System.out.println("Digite 2 para não");
        System.out.println();
        Scanner leitor4 = new Scanner(System.in);
        int loop = leitor4.nextInt();


        if (operacao == 5){
            resposta = 5;
            System.out.println("Até mais!");
        } else if(loop == 2){
            resposta = 5;
            System.out.println("Até mais!");
        }



    }while (resposta != 5);
        
    }
}
