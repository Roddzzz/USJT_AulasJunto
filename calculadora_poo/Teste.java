import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - soma \n2 - subtracao \n3 - multiplicacao \n4 - divisao \n5 - sair"));
        } while (opcao < 1 || opcao > 5);

        if (opcao < 5){
            int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro numero"));
            int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo numero"));
            switch(opcao){
                case 1: JOptionPane.showMessageDialog(null, "A soma dos numeros é: " + c.soma(valor1, valor2));
                break;
                case 2: JOptionPane.showMessageDialog(null, "A subtracao dos numeros é: " + c.subtracao(valor1, valor2));
                break;
                case 3: JOptionPane.showMessageDialog(null, "A multiplicacao dos numeros é: " + c.multiplicao(valor1, valor2));
                break;
                case 4: JOptionPane.showMessageDialog(null, "A divisao dos numeros é: " + c.divisao(valor1, valor2));
                break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
        }
    }
}
