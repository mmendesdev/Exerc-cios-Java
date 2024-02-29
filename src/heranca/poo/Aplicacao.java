package heranca.poo;

public class Aplicacao {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Matheus";

        Pessoa p2 = new Pessoa();
        p2.nome = "Maria";

        p1.receber(10);
        p1.dar(5, p2);

        System.out.println(p1.nome + " = Figurinhas:" + p1.numFigurinhas);
        System.out.println(p2.nome + " = Figurinhas:" + p2.numFigurinhas);
    }
    
}
