package logic.estruturaSwitch;

public class Main {
     
    public enum DiaDaSemana {
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO,
        DOMINGO
    } 
    public static void main(String[] args) {
         
        DiaDaSemana Dia = DiaDaSemana.SEGUNDA;
        
        switch (Dia) {
            case SEGUNDA:
                System.out.println(1);
        switch (Dia) {
            case TERCA:
            System.out.println("Dentista");
        switch (Dia) {
            case QUARTA:
            System.out.println("Dentista");
        switch (Dia) {
            case QUINTA:
            System.out.println("Dentista");
        switch (Dia) {
            case SEXTA:
            System.out.println("Dentista");   
        
            default:
                break;
        }
        
        
            default:
                break;
        }
    System.out.println(10);
    }
    
}
