import java.util.Calendar;
import java.util.GregorianCalendar;
public class Carro{
    //variaveis estaticas
    public static int contaCarros = 0;

    //variraveis de instancias ou atributos
    private String marca;
    private double motor;
    private int anoFabricacao;

    //Construtor padrao
    public Carro(){
        contaCarros++;
    }

    
    //construtor
    public Carro(String marca, double motor, int anoFabricacao){
        this.setAnoFabricacao(anoFabricacao);
        this.setMarca(marca);
        this.setMotor(motor);
        contaCarros++;
    }


    //getters
    public String getMarca(){
        return this.marca;
    }

    public double getMotor(){
        return this.motor;
    }

    public int getAnoFabricacao(){
        return this.anoFabricacao;
    }


    //setters
    public void setMarca(String marca){
        this.marca = marca;
    } 

    public void setMotor(double motor){
        if (motor >= 1.0 && motor <= 4.1){
            this.motor = motor;
        } else {
            this.motor = 1.0;
        }
    }

    public void setAnoFabricacao(int anoFabricacao){
        Calendar calendario = new GregorianCalendar();
        int anoAtual = calendario.get(calendario.YEAR);
        System.out.println(anoAtual);
        if (anoFabricacao > anoAtual){
            this.anoFabricacao = 1970;
        } else {
            this.anoFabricacao = anoFabricacao;
        }
    }
}