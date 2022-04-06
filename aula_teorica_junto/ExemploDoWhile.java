import javax.swing.JOptionPane;

public class ExemploDoWhile {
    public static void main(String[] args) {
        double nota1, nota2;
        int contador = 
            Integer.parseInt(JOptionPane.showInputDialog("Digite quantos alunos tem"));
        do {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
            JOptionPane.showMessageDialog(null, "Média: " + ((nota1 + nota2) / 2));
            contador = contador - 1;
        } while (contador >= 1);
        double a = 1500;
    }
}
