//NIM           : 13020200206
//Nama          : Putri Muliana
// Tanggal/Hari :Sabtu, 19 Maret 2022
// Waktu        : 22:01 PM

import java.util.Scanner;
/* Baca N, */
/* Print i = 1 s/d N dengan while (ringkas) */
public class PrintWhile1 {

public static void main(String[] args) {

int N;
int i = 1;
Scanner masukan=new Scanner(System.in);

System.out.print ("Nilai N >0 = ");
N = masukan.nextInt();
System.out.print ("Print i dengan WHILE (ringkas): \n");
while (i <= N){
System.out.println (i++);
} 
}
}