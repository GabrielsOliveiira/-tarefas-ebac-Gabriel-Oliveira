public class tarefaCalculoMedio {
    Float nota1 = 90f;
    Float nota2 = 98f;
    Float nota3 = 97f;
    Float nota4 = 92f;

    public Float media(Float nota1, Float nota2, Float nota3, Float nota4){
        Float resultado = (nota1 + nota2 + nota3 + nota4)/4;
        return resultado;
    }


    public static void main(String[] args){

        tarefaCalculoMedio calculo = new tarefaCalculoMedio();

        float mediaFinal = calculo.media(calculo.nota1, calculo.nota2, calculo.nota3, calculo.nota4);

        System.out.println(mediaFinal);

    }

}