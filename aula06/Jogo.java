import java.util.Random;

public class Jogo {
    public static void main(String[] args) throws InterruptedException {
        Personagem cacador = new Personagem("Cacador", 10, 0, 0);
        Personagem soneca = new Personagem("Soneca", 2, 6, 8);
        Random gerador = new Random();

        while (true){
            System.out.println("<======================>");

            int oqfazer = gerador.nextInt(3) + 1;
            switch(oqfazer){
                case 1: cacador.cacar();
                    break;
                case 2: cacador.comer();
                    break;
                case 3: cacador.dormir();
                    break;
            }

            double atividadeSoneca = gerador.nextDouble();
            if (atividadeSoneca <= 0.7){
                soneca.dormir();
            } else if (atividadeSoneca <= 0.85){
                soneca.comer();
            } else {
                soneca.cacar();
            }

            System.out.println("<=====================>");

            Thread.sleep(2000);
        }

    }
}
