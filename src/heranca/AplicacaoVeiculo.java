package heranca;

public class AplicacaoVeiculo {
    public static void main(String[] args) {
        
        System.out.println("CARROS: ");
        Carro carros = new Carro();
        carros.setMarca("BMW");
        carros.setModelo("Z4");
        carros.setAno(2020);
        carros.dados();
        
        System.out.println("MOTOCICLETAS: ");
        Moto motos = new Moto();
        motos.setMarca("HONDA");
        motos.setModelo("150");
        motos.setAno(2024);
        motos.dados();

        System.out.println("CAMINHÕES: ");
        Caminhao cam = new Caminhao();
        cam.setMarca("MERCEDES");
        cam.setModelo("Onibus");
        cam.setAno(2015);
        cam.dados();

        
    }
}
