import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {         
            // faca um programa que converta metros para centimetros
            // passo1 - solicitar valor em metros
            double numeroMetros;
            double numeroCentimetros;
            Scanner teclado = new Scanner(System.in);
            System.out.print("Digite o numero em metros ");
            numeroMetros = teclado.nextDouble();            
            teclado.close();
            //passo2 multiplicar valor por 100
        numeroCentimetros = numeroMetros * 100;
            System.out.print ("O resultado em é " + numeroCentimetros );
            System.out.print ("centímetros");
            


        
    }
}
