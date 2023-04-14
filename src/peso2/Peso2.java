package peso2;
import java.util.Scanner;
public class Peso2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entre9_8y10_2 = 0;
        int masDe10_2 = 0;
        int menosDe9_8 = 0;
        int b = 0;
System.out.println("Ingrese el peso de las piezas en kilogramos (para terminar ingresar 0):");

        while (true) {
            System.out.print("Peso de la pieza: ");
            double peso = sc.nextDouble();
             if (peso == 0) {
                          break;
            }
            b++;
          if (peso >= 9.8 && peso <= 10.2) {
                entre9_8y10_2 ++;
            } else if (peso > 10.2) {
               masDe10_2++;
            } else {
                menosDe9_8++;
            }
        }
        sc.close();
        System.out.println("numero de piezas con peso entre 9.8 Kg y 10.2 Kg: " + entre9_8y10_2 );
        System.out.println("numero de piezas con peso mayor a 10.2 Kg: " + masDe10_2);
        System.out.println("numero de piezas con peso menor a 9.8 Kg: " + menosDe9_8);
        System.out.println("numero de total de piezas procesadas: " + b);
    }
}