import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o seu nome ? ");
        String nome = entrada.nextLine();

        System.out.println("Qual é a sua idade ?");
        int idade = entrada.nextInt();

        System.out.println("Qual é a sua altura (m) ?");
        double altura = entrada.nextDouble();

        System.out.println("Qual é seu peso ? ");
        double peso = entrada.nextDouble();

        double IMC = peso / (altura * altura);

        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
        System.out.printf("Olá, meu nome é %s e tenho %d anos.\n", nome, idade);
        System.out.println("E meu IMC é: " + IMC);
        System.out.printf("E meu IMC é: %.2f\n", IMC);

        if (IMC < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (IMC >= 17 && IMC <= 18.49) {
            System.out.println("Abaixo do peso");
        } else if (IMC >= 18.5 && IMC <= 24.99) {
            System.out.println("Eutrofia");
        } else if (IMC >= 25 && IMC <= 29.99) {
            System.out.println("Acima do peso");
        } else if (IMC >= 30 && IMC <= 34.99) {
            System.out.println("Obesidade I");
        } else if (IMC >= 35 && IMC <= 39.99) {
            System.out.println("Obesidade II (Severa)");
        } else {
            System.out.println("Obesidade III(Mórbida");
        }

        //Switch

        System.out.println("Escolha uma dieta:");
        System.out.println("1 - Água;");
        System.out.println("2 - Fruta;");
        System.out.println("3 - Batata.");
        int dieta = entrada.nextInt();

        switch (dieta) {
            case 1:
                System.out.println("Você escolheu a dieta da água!");
                break;
            case 2:
                System.out.println("Você escolheu a dieta da fruta!");
                break;
            case 3:
                System.out.println("Você escolheu a dieta da batata!");
                break;
            default:
                System.out.println("Essa dieta não existe!");
        }

        System.out.println("Você têm quantos alimentos preferidos ?");
        int totalAlimentos = entrada.nextInt();

        for (int i = 0; i < totalAlimentos; i++){
            System.out.println(i);
        }

        int i = 0;

        while (i < totalAlimentos) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        } while (i <= totalAlimentos);

    }
}
