
import java.util.Scanner;

public class soal2m {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = 0;
        System.out.println("Masukkan angkamu: ");
        angka = input.nextInt();
        if (angka % 2 == 0){
            System.out.println("Angka tersebut genap");
        } else
            System.out.println("Angka tersebut ganjil ");
    }
}
