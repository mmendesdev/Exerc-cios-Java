package logic.condicoes;
import java.util.Scanner;

//descubra se o usuario pode votar para eleição

public class SeMain {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            System.out.println("Olá, desubra se voce pode votar, DIGITE SUA IDADE: ");
            int idade = entrada.nextInt();
            if(idade < 18){
                System.out.println(
                    "NÃO PODE VOTAR!!"
                );   
            }else{
                System.out.println(
                    "PODE VOTAR!!"
                );
            }
            entrada.close();
        }
}
