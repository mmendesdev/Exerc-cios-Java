package heranca.poo;

public class Pessoa {
    //atributos
   String nome;
   int numFigurinhas;

   //metodos = funcao
    void receber(int numFigurinhas){
        this.numFigurinhas += numFigurinhas;
    }
    void dar(int numFigurinhas, Pessoa p){
          this.numFigurinhas -= numFigurinhas;
          p.numFigurinhas += numFigurinhas;
    }

    
}
