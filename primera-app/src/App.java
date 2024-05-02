import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      Scanner scanner = new Scanner(System.in);

      String palabraSecreta = "termotanque";
      int IntentosMaximos = 7;
      int intentos = 0;
      boolean palabraAdivinada = false;

      char[] letrasAdivinadas = new char [palabraSecreta.length()];

      for (int i = 0; i < letrasAdivinadas.length; i++) {
        letrasAdivinadas[i]='_';
      }

      while (!palabraAdivinada && intentos < IntentosMaximos) {
        System.err.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + "( " + palabraSecreta.length() + " letras )");

        System.out.println("mete una letra");

        char letra = Character.toLowerCase(scanner.next().charAt(0));

        boolean letraCorrecta = false;
          for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i)==letra) {
              letrasAdivinadas[i] = letra;
              letraCorrecta=true;
            }
          }
          if (!letraCorrecta) {
            intentos++;
            System.out.println("Incorrecto, te quedan "+ (IntentosMaximos - intentos) + " intentos");
          }

          if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
            palabraAdivinada=true;
            System.out.println("Felicidades has adivinado la palabra "+ palabraSecreta);
          }
      }
      if (!palabraAdivinada) {
        System.out.println("perdise");      
      }
    scanner.close();
  }   
  
}