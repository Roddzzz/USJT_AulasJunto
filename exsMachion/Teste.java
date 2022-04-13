public class Teste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Wolksvagem", 3.0, 2015);
        // Instanciando o obj carro1, da classe Carro, chamando o construtor padrao

        System.out.println("Carro 1, cujo a marca é: " + carro1.getMarca() + "\nSeu motor é: " + carro1.getMotor() + "\nE seu ano de fabricacao é: " + carro1.getAnoFabricacao());

        carro1.setMotor(3.0);
        System.out.println("motor do carro 1 vale: " + carro1.getMotor());
        carro1.setAnoFabricacao(1970);
        
    }
}
