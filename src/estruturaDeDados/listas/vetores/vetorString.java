package estruturaDeDados.listas.vetores;

public class vetorString {
    public static void main(String[] args) {
        
        String[] estados = new String[5];

        estados[0] = "PI";
        estados[1] = "CE";
        estados[2] = "SP";
        estados[3] = "RJ";
        estados[4] = "MT";
        estados[5] = "TC";

        for(int i = 0; i <= estados.length; i ++){
            System.out.println("Estados " + 1 + ":" + estados[i]);
        }
    }
    
}
