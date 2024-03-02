package heranca;

import getSet.logic.condicoes.Veiculo;

// extends, herança de veiculos, mesmos atributos e funções
public class Carro extends Veiculo {
    
    private boolean quatroPortas;

    public boolean isQuatroPortas() {
        return quatroPortas;
    }

    public void setQuatroPortas(boolean quatroPortas) {
        this.quatroPortas = quatroPortas;
    }

    @Override
    public void dados(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Quatro portas: " + quatroPortas);


    }


    
}
