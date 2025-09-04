package maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        /*
        int, double, char, float, byte , short , long , boolean
         */

        int age = 18;
        long NumeroGrande = 10000000L;
        double SalarioDouble = 2500;
        float SalarioFloat = 2000.50F; //para indicar que é float,é necessario um 'f' no final do numero
        byte IdadeByte = 10;
        short IdadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'a';
        String frase = "Olá, veja  a minha primeira String!";

        System.out.println("A idade é de " + age + " anos");
        System.out.println(frase);
    }
}
