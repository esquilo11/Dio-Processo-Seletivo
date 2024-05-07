import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int parametro1;
        int parametro2;
        int repeticoes;

        try {
            System.out.println("APRESENTE OS PARAMETROS");
            parametro1 = scanner.nextInt();
            parametro2 = scanner.nextInt();
            validarParametros(parametro1, parametro2);
            repeticoes = parametro2 - parametro1;

        } catch (Exception e) {
            System.out.println("O SEGUNDO PARAMETRO DEVE SER MAIOR QUE O PRIMEIRO");
            System.out.println("RE-INSIRA OS PARAMETROS NO FORMATO SOLICITADO");
            parametro1 = scanner.nextInt();
            parametro2 = scanner.nextInt();
            repeticoes = parametro2 - parametro1;
        }

        System.out.println("INICIANDO CONTAGEM");
            Contar(repeticoes);
            scanner.close();

    }

    public static void Contar(int repeticoes){
        for(int contador = 0; contador < repeticoes; contador++){
            System.out.println("Imprimindo o numero " + (contador +1));
        }
    }

    public static void validarParametros(int parametro1, int parametro2) throws ParametrosInvalidosExeption{
        if (parametro1 > parametro2){
            throw new ParametrosInvalidosExeption();
        }
    }
}