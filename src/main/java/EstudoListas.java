import java.util.ArrayList;

public class EstudoListas {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>(); //Cria um novo ArrayList vazio que guarda Integer
        ArrayList<String> nomesPessoas = new ArrayList<>();

        //Adicionando elementos no Array
        numeros.add(10); //equivale ao push
        numeros.add(20);
        numeros.add(30);

        System.out.println(numeros.get(2));//Equivalente ao array[]

        numeros.set(0,500); //Alterando o valor pelo index

        System.out.println(numeros.get(0));

        numeros.remove(0); //Remove o elemento da posição 0 e assim encurta a List

        System.out.println(numeros.size()); //Equivale ao .length

        for (int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }

        System.out.println("-----------");

        for (int numero: numeros) {
            System.out.println(numero);
        }

        System.out.println(numeros.contains(20)); //Pergunta a minha List se ela contém o valor e retorna um boolean
        System.out.println(numeros.contains(500));

        System.out.println(numeros.indexOf(2));//Pergunta qual valor está em tal posição -> esse método lê a List da esquerda para direita
        System.out.println(numeros.lastIndexOf(3)); // lê a List da direita para a esquerda

    }
}
