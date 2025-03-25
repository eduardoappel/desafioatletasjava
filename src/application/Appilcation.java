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

        for (int i = 1; i <= n; i++) {

            System.out.println("Digite os dados do atleta numero " + i +":"); 

            System.out.print("Digite o nome do Atleta: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Digite o sexo: ");
            double sexo = sc.nextLine().charAt(0);
            while( sexo != 'M' && sexo != 'F'){
                System.out.print("Valor invalido! Favor digitar M ou F: ");
                sexo = sc.nextLine().charAt(0);
            }

            System.out.print("Digite a altura: ");
            double altura = sc.nextDouble();
            while( altura <= 0){
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                altura = sc.nextDouble();
            }
            System.out.print("Digite o peso: ");
            double peso = sc.nextDouble();                       
            while( peso <= 0){
                System.out.printf("Valor invalido! Favor digitar um valor positivo: ");
                peso = sc.nextDouble();
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
                nomeMaisAlto = nome;
            }
            somaAltura += altura;

            if (sexo == 'M') {
                totalHomens++;
            } else {
                totalMulheres++;
                somaAlturaMulheres += altura;
            }

            pesoMedio += peso;

            porcentagemHomens = (totalHomens * 100) / n;
         
            if (totalMulheres == 0) {
                alturaMediaMulheres = 0;
            } else {
                alturaMediaMulheres = somaAlturaMulheres / totalMulheres;
            }

        }        

        sc.close();
    }

}
