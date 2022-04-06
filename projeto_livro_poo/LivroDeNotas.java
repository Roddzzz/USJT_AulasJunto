public class LivroDeNotas {
    private String nomeDaUc;
    //CONSTRUTORES
    public LivroDeNotas(String nomeDaUc){
        this.setNomeUc(nomeDaUc);
    }

    //CONSTRUTOR COM PARAMETRO 
    public LivroDeNotas(){
        
    }

    //ACESSO 
    public String getNome(){
        return nomeDaUc;
    }
    
    
    //MODIFICADORES
    public void setNomeUc(String nomeDaUc){
        this.nomeDaUc = nomeDaUc;
    }
    //declarou o metodoo
    public void exibirMenssagem () {
        System.out.println("Bem vindo ao livro de notas da " + nomeDaUc);
    }
}