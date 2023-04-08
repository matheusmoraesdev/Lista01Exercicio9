import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) throws Exception {
      double graus_f;
      double celsius;
    
    Scanner reader = new Scanner(System.in);
        System.out.print("Digite em Fahrenheit a temperatura que deseja transformar em celsius: ");
            graus_f = reader.nextDouble();
        reader.close();

        celsius = (graus_f - 32) / 1.8;

    System.out.println("O resultado é : " + celsius + "° celsius");

    }
}
