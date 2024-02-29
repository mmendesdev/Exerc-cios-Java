package tabuada;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número para ver sua tabuada: ");
        int valor = entrada.nextInt();

        for(int i = 0; i <=10; i++){
            System.out.println(valor + " X " + i + " = " + (i * valor));




        entrada.close();
        }
    }    
}
