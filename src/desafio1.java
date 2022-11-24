import java.util.Scanner;
public class desafio1 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner (System.in);
        int num1;
        int num2;

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scan.nextInt();
        if (num1 == num2) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }

    }
}
