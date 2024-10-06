public class Modulo10 {

    Float num = 1f;
    Float num2 = 1f;
    Float num3 = 7f;
    Float num4 = 8f;

    public Float notaFinal(Float num, Float num2, Float num3, Float num4){
        Float resultado = (num + num2 + num3 + num4)/4;
        return resultado;
    }

    public static void main(String[] args) {

        Modulo10 modulo = new Modulo10();

        Float mediaFinal = modulo.notaFinal(modulo.num, modulo.num2, modulo.num3, modulo.num4);

        if (mediaFinal >= 7f){

            System.out.println("Aprovado");

        } else if (mediaFinal >= 5f){

            System.out.println("Recuperação");

        } else {

            System.out.println("Reprovado");

        }
    }
}
