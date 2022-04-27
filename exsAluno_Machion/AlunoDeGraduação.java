public class AlunoDeGraduação extends Pessoa {
    private double n1, n2, nFinal;

    public AlunoDeGraduação(){}
    
    public AlunoDeGraduação(String nome, int idade, double n1, double n2, double nFinal){
        super(nome, idade);
        setN1(n1);
        setN2(n2);
        setNFinal(nFinal);
    }

    public double getN1(){
        return this.n1;
    }
    
    public double getN2(){
        return this.n2;
    }

    public double getNFinal(){
        return this.nFinal;
    }

    public void setN1(double n1){
        this.n1 = n1;
    }

    public void setN2(double n2){
        this.n2 = n2;
    }

    public void setNFinal(double nFinal){
        this.nFinal = nFinal;
    }

    @Override
    public String toString(){
        return super.toString() + "\n[" + this.n1 + ", " + this.n2 + ", " + this.nFinal + "]";
    }
    //Super se refernecia a classe pai, ou, superclass.
    //no caso esta chamando o metdo toString da classe pai.
}
