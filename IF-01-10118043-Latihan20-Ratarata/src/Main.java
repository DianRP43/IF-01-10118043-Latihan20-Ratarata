
import java.util.Scanner;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static  double rata;
    public static void main(String[] args) {
        double nilai = 0;
        int i;
// TODO code application logic here
        System.out.print("Masukan Banyak nya Mahasiswa : ");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        
        for (int j = 1; j <= i; j++) {
            System.out.print("Nilai Mahasiswa ke-"+j+" : ");
            nilai = nilai + scanner.nextDouble();
           
        }
        rata = nilai / i;
        System.out.println("Maka, Rata rata nilai adalah "+ rata);
        
    }
    
}
