import java.util.Scanner;

public class arrayOperation{
    public static void main(String[] args) {

    /*    //16.	Napisz program, który wczyta od użytkownika 5 liczb rzeczywistych,
        // obliczy ich sumę, a następnie wyświetli je w odwrotnej kolejności (poziom 2).
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        int[] tab = new int[4];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = scanner.nextInt();


            int suma = 0;
            for (int s = 0; s < tab.length; s++) {
                suma += scanner.nextInt();



        }*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write 5 variables: ");

        int [] tab = new int [5];
        tab[0] = scanner.nextInt();
        tab[1] = scanner.nextInt();
        tab[2] = scanner.nextInt();
        tab[3] = scanner.nextInt();
        tab[4] = scanner.nextInt();

        System.out.println(tab[3] + tab[2] + tab[1]+ tab[0]);


     /*   //suma
        int suma = 0;
        for (int s = 0; s < tab.length; s++) {
            suma += scanner.nextInt();}
*/


        //przeczytac tablice od tyłu
        for (int i=4; i>=0;i-- ){
            System.out.print(tab[i] + " ");
        }

    }
}
