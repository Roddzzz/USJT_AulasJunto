import javax.swing.JOptionPane;

public class LivroDeNotasTeste {
    public static void main(String[] args) {
        
        String nomeUc = JOptionPane.showInputDialog("Digite o nome da UC");

        //new inicia a construção a objetos
        //() lista de parametros
        //variavel de ref

        LivroDeNotas livroDeNotas = new LivroDeNotas();
        
        //acessando membros do objeto
        //chamar o metodo
        
        livroDeNotas.setNomeUc(nomeUc);
        livroDeNotas.exibirMenssagem();
        System.out.println("O nome da UC é: " + livroDeNotas.getNome());

        LivroDeNotas livro2 = new LivroDeNotas();
        livro2.setNomeUc("matematica");
        livro2.exibirMenssagem();
        System.out.println("O nome do livro dois é: " + livro2.getNome());
    }
}
