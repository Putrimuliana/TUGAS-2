//NIM           : 13020200206
//Nama          : Putri Muliana
// Tanggal/Hari :Sabtu, 19 Maret 2022
// Waktu        : 22:19 PM 

/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */

import java.util.Scanner;
public class If1 {

public static void main(String[] args) {

Scanner masukan=new Scanner(System.in);
int a;

System.out.print ("Contoh IF satu kasus \n");
System.out.print ("Ketikkan suatu nilai integer : ");
a = masukan.nextInt();
if (a >= 0)
System.out.print ("\nNilai a positif "+ a);
}
}