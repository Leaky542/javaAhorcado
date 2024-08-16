import java.util.Scanner;
public class Ahorcado {
     public static void main(String[] args) throws Exception {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean fueAdivinada = false;

        // Arreglo
        char[] letrasEncontradas = new char[palabraSecreta.length()];

        // Bucle
        for(int i = 0; i < letrasEncontradas.length; i++){
            letrasEncontradas[i] = '_';
        }

        while(!fueAdivinada && intentos < intentosMaximos){
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasEncontradas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra: ");
            // Usamos el scanner para pedir la letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letrasCorrecta = false;
            for(int i = 0; i < palabraSecreta.length(); i++){
                if(palabraSecreta.charAt(i) == letra){
                    letrasEncontradas[i] = letra;
                    letrasCorrecta = true;
                }
            }
            if(!letrasCorrecta){
                intentos++;
                System.out.println("Letra incorrecta, te quedan " + (intentosMaximos - intentos) + " intentos");
            }
            if(String.valueOf(letrasEncontradas).equals(palabraSecreta)){
                fueAdivinada = true;
                System.out.println("Ganaste, la palabra era: " + palabraSecreta);
            }
    }
    scanner.close();
}
}
