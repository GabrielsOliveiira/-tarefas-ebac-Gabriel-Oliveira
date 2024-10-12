import java.util.Arrays;
import java.util.ArrayList;

public class TarefasColecoes {
    public static void main(String[] args) {
        TarefasColecoes tarefa = new TarefasColecoes();
        tarefa.TarefaParte1();
        tarefa.TarefaParte2();
    }

    public void TarefaParte1(){
        String nomes = "Maria, João, Marcos, Andre, Leticia, Millene, Carlos, Bruno";
        System.out.println(nomes);
        String [] nomesSeparados = nomes.split(", ");
        Arrays.sort(nomesSeparados);
        for (String i : nomesSeparados){
            System.out.println(i);
        }
    }

    public void TarefaParte2(){
        System.out.println("\n--------------------\n");

        String nomes = "Maria - f, João - m, Marcos - m, Andre - m, Leticia - f, Millene - f, Carlos - m, Bruno - m";

        System.out.println(nomes);

        String [] nomesSeparados = nomes.split(", ");
        ArrayList<String> homens = new ArrayList<>();
        ArrayList<String> mulheres = new ArrayList<>();

        for (String i : nomesSeparados){

            if ((i.charAt(i.length() - 1) == 'm')){
                homens.add(i);
            }
            else {
                mulheres.add(i);
            }
        }

        Ler(homens);
        System.out.println("--------------");
        Ler(mulheres);
        
    }

    public void Ler(ArrayList<String> ler){
        for (String i : ler){
            System.out.println(i);
        }
    }


}
