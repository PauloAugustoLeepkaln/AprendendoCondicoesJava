import java.sql.SQLOutput;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        String nome = "";
        Integer idade = 0;
        Double peso = 0.0;
        Double altura = 0.0;
        Double IMC = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva seu nome :");
        nome = sc.next();

        System.out.println("Informe sua idade");
        idade = sc.nextInt();

        System.out.println("Informe seu peso");
        peso = sc.nextDouble();

        System.out.println("Informe sua altura");
        altura = sc.nextDouble();{
            altura = altura / 100;
        }

        if(peso > 0){
            IMC = peso / (altura * altura);
        }

        if(IMC < 18.4) {
            System.out.println("Magreza, IMC: " +IMC);
        } else if(IMC > 18.5 && IMC < 24.9) {
            System.out.println("Normal, IMC: "+IMC);
        } else if(IMC > 25 && IMC < 29.9 ){
            System.out.println("Sobrepeso, IMC: "+IMC);
        } else if(IMC > 30 && IMC < 34.9){
            System.out.println("Obesidade 1, IMC: "+IMC);
        } else if(IMC > 35 && IMC < 39.9) {
            System.out.println("Obesidade 2, IMC: " + IMC);
        }

    }


}



