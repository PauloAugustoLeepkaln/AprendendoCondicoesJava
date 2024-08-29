import java.util.Scanner;

public class Exemploscanner1 {
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
        altura = sc.nextDouble();
        {

            System.out.println(nome + " sua idade é: " + idade + " e seu peso é: " + peso + " e sua altura é: " + altura);
        }

    }

    }



