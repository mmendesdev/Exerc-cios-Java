package estruturaDeDados.listas.vetores;

public class vetorMain {
    public static void main(String[] args) {
        //sempre que vou utilizar uma lista de "coisas" posso usar vetor
        
        //declarando um vetor, o primeiro sempre começa com 0
        int [] vetorzao = new int[5];
        vetorzao[0] = 2;
        vetorzao[1] = 10;
        vetorzao[2] = 8;
        vetorzao[3] = 100;
        vetorzao[4] = 4;
        //declrando o valor da posição do vetor 
        System.out.println(vetorzao.length);
// saber o tamanho do vetor = nomeDoVetor.length

        for(int i = 0; i <= 9; i++){
            System.out.println(vetorzao[i]);
        }

    }
    
}
