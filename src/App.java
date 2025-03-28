
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try{

        System.out.println("Informe nomes separados por espaço e depois informe a posição do nome que vc quer ver: ");
        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);

        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Posição inválida!");

        }

        catch (InputMismatchException e){

            System.out.println("Insira apenas NÚMEROS para definir a posição!");
            
        }
        sc.close();
    }
}
