import java.util.Locale;
import java.util.Scanner;

public class Appilcation {

    public static void main(String[] args) {

        System.out.println("DESAFIO: Atletas Java");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int totalHomens = 0;
        int totalMulheres = 0;  
        double somaAlturaMulheres = 0;
        double somaAltura = 0;  
        String nomeMaisAlto = "";
        double maiorAltura = 0;
        double pesoMedio = 0;
        double alturaMediaMulheres = 0;
        double porcentagemHomens = 0;
        double porcentagemMulheres = 0;        
        
        System.out.print("Qual a quantidade de Atletas: ");
        int n = sc.nextInt();
    }

}
