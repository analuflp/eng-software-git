public class atividadeEngSoftware {

    public static void main(String[] args) {

        Soma soma = new Soma();


        int valor1 = 10;
        int valor2 = 10;


        soma.somarDoisNumeros(valor1, valor2);

        int resultadoSoma = soma.getResultado();
        System.out.println("Meu nome é Ana e a soma de " + valor1 + " e " + valor2 + " é " + resultadoSoma);
    }
}
