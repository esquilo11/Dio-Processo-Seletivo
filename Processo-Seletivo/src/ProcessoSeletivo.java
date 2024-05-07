import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        String candidatos [] = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
            entrandoEmContato(candidato);
        }
    }

    public static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
                if(continuarTentando){
                    tentativasRealizadas++;
                }
                else{
                    System.out.println("CONTATO REALIZADO COM SUCESSO");
                }

        }while(continuarTentando && tentativasRealizadas <3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        }
        else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MAXIMO TENTATIVAS " + tentativasRealizadas);
        }
    }

    public static boolean atender(){
        if(Random().nextInt(3) == 1){
            return true;
        }else{
            return false;
        }

    }
// ----------------------------------------------------------------------------------------------------------------------------------------
    // public static void imprimirSelecionados(){
    //     String candidatos [] = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

    //     System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

    //     for(int indice=0; indice < candidatos.length; indice++){
    //         System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
    //     }

    //     System.out.println("Forma abreviada For Each");

    //     for(String candidato: candidatos){
    //         System.out.println("O candidato selecionado foi " + candidato);
    //     }

    // }
// ----------------------------------------------------------------------------------------------------------------------------------------
    // public static void selecaoCandidatos(){
    //     String candidatos [] = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE", "RICARDO", "ANDRE"};

    //     int candidatosSelecionados = 0;
    //     int canditatoAtual = 0;
    //     double salarioBase = 2000.0;

    //     while ((candidatosSelecionados < 5) && (canditatoAtual < candidatos.length)){
    //         String candidato = candidatos[canditatoAtual];
    //         double salarioPretendido = valorPretendido();

    //         System.out.println("O candidato " + candidato + " Solicitou o valor pretendido de " + salarioPretendido);

    //         if(salarioBase >= salarioPretendido){
    //             System.out.println("O candidato " + candidato + " Foi selecionado para a vaga ");
    //             candidatosSelecionados++;
    //         }
    //         canditatoAtual++;
    //     }

    // }
// ----------------------------------------------------------------------------------------------------------------------------------------
    // public static double valorPretendido(){
    //     return ThreadLocalRandom.current().nextDouble(1800, 2200);
    // } 


    // public static void analisarCandidato(double salarioPretendido){
    //     double salarioBase = 2000.0;

    //     if (salarioBase > salarioPretendido) {
    //         System.out.println("LIGAR PARA O CANDIDATO");
    //     }
    //     else if (salarioBase == salarioPretendido){
    //         System.out.println("LIGAR PARA CANDIDATO COM CONTRAPROPOSTA");
    //     }
    //     else{
    //         System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
    //     }
    // }
}
