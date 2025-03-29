package application;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws Exception {
 
        //primeiroMetodo();
        segundoMetodo();
    }

    public static void primeiroMetodo(){

        Scanner sc = new Scanner(System.in);

        try{

        System.out.println("Informe nomes separados por espaço e depois informe a posição do nome que vc quer ver: ");
        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);

        }

        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(); //caso eu queira ver a pilha dos métodos chamados
            System.out.println("Posição inválida!");

        }

        catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("Insira apenas NÚMEROS para definir a posição!");
            
        }
        
        sc.close();

    }

    public static void segundoMetodo(){

        // o Scanner pode ler arquivos
        File file = new File("C:\\tempo\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
        finally {
            if(sc != null){
                sc.close();
            }
        }
    }

}
