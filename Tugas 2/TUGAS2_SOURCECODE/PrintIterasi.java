//NIM           : 13020200206
//Nama          : Putri Muliana
// Tanggal/Hari :Sabtu, 19 Maret 2022
// Waktu        : 22:01 PM

import java.util.Scanner;
/* Baca N, */
/* Print i = 1 s/d N dengan ITERATE */
public class PrintIterasi {

public static void main(String[] args) {


int N;
int i;
Scanner masukan=new Scanner(System.in);

System.out.print ("Nilai N >0 = "); 
N = masukan.nextInt();
i = 1; 

System.out.print ("Print i dengan ITERATE : \n");
for (;;){
System.out.println(i); 
if (i == N)

break;
else {
i++; 
}
} 
}
}