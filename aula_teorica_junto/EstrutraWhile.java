import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class EstrutraWhile{
    public static void main(String[] args) {
        int qtdAlunos = 
            parseInt(showInputDialog("Digite a quantidade de alunos"));
        int contador = 1;
        while (contador <= qtdAlunos){
            int nota1 = 
            parseInt(showInputDialog("Digite a primeira nota"));
        int nota2 = 
            parseInt(showInputDialog("Digite a primeira nota"));
        double media;
        media = (nota1 * nota2) / 2.;
        showMessageDialog(null, String.format("A media do aluno eh: %.2f", media));
        contador++;
        }
    }
}