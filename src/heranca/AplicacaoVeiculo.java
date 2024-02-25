package heranca;

public class AplicacaoVeiculo {
    public static void main(String[] args) {
        
        Carro c = new Carro();
        c.buzinar();
        c.dados();

        Caminhao cam = new Caminhao();
        cam.buzinar();

        Moto m = new Moto();
        m.buzinar();


    }
    
}
