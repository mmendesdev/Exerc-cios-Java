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
            case SEGUNDA : System.out.println(1); break;
            case TERCA : System.out.println(2); break;
            case QUARTA : System.out.println(3); break;
            case QUINTA : System.out.println(4); break;
    
        }
    }
    
}
