import javax.swing.JOptionPane;
public class Exerc01_teste {
    public static void main(String[] args) {
        int nu;
        do{int n1 = 
            Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o primeiro numero"));
        int n2 = 
            Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o segundo numero"));
        
        Object[] selecao = {"Adição", "Subtração", "Multiplicação", "Divisão",};
        Object valorSelecionado = JOptionPane.showInputDialog(null, "Selecione a operação", "Operação", JOptionPane.INFORMATION_MESSAGE, null, selecao, selecao[0]);
        
        int operacao = 0;

        if (valorSelecionado == "Adição"){
            operacao = 1;
        } else if (valorSelecionado == "Subtração"){
            operacao = 2;
        } else if (valorSelecionado == "Multiplicação"){
            operacao = 3;
        } else if (valorSelecionado == "Divisão"){
            operacao = 4;
        }

        switch (operacao){
            case 1: JOptionPane.showMessageDialog(null, n1 + n2); break;
            case 2: JOptionPane.showMessageDialog(null, n1 - n2); break;
            case 3: JOptionPane.showMessageDialog(null, n1 * n2); break;
            case 4: JOptionPane.showMessageDialog(null, n1 / n2); break;
            default: JOptionPane.showMessageDialog(null, "selecione uma operacao");
        };
        
        int opcao = JOptionPane.showConfirmDialog(null,"Deseja voltar para realizar mais operações?",
          "Escolha um",JOptionPane.YES_NO_OPTION); //0 yes 1 no
        
          nu = opcao + 0;
        } while (nu == 0);
    }
}
