import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class colec2 {
    public static void main(String[] args) {

        List<String> Mnome = new ArrayList<>();
        List<String> Fnome = new ArrayList<>();
        List<String> Inome = new ArrayList<>();

        Scanner leia2 = new Scanner(System.in);
        System.out.print("Quais os nomes?(nome -m/f,) ");
        String nome2 = leia2.nextLine();


        String[] nome2Sep = nome2.split(",\\s");
        Collections.addAll(Inome, nome2Sep); 


        for (String nome : Inome) {
            String[] temp = nome.split("-");
            if (temp.length == 2) {
                if (temp[1].equals("m")) {
                    Mnome.add(temp[0]);
                } else if (temp[1].equals("f")) {
                    Fnome.add(temp[0]);
                }
            }
        }

        // Ordenando as listas
        Collections.sort(Fnome);
        Collections.sort(Mnome);
        Collections.sort(Inome);

        // Exibindo os resultados
        System.out.println("Lista original: " + Inome);
        System.out.println("Nomes femininos: " + Fnome);
        System.out.println("Nomes masculinos: " + Mnome);

        leia2.close(); // Fecha o Scanner
    }
}
