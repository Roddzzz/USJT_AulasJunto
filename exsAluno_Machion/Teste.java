public class Teste {
    public static void main(String[] args) {
        AlunoDeGraduação a1 = new AlunoDeGraduação();
        a1.setNome("Andreia");
        a1.setIdade(19);
        a1.setN1(10);
        a1.setN2(6);
        a1.setNFinal(6);

        System.out.println("As notas do aluno(a) " + a1.getNome() + " De " + a1.getIdade() + " são: " + "\nNOTA1: " + a1.getN1() + "\nNOTA 2: " + a1.getNFinal() + "\nNOTA FINAL: " + a1.getNFinal());

        System.out.println("ALUNO 1: \n" + a1);
    }
}
