/*** Program Utama ***/
public class Program{
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Membaca dua bilangan integer */
/* Menuliskan maksimum dua bilangan yang dibaca
dg memanggil fungsi */
/* Menukar kedua bilangan dengan 'prosedur' */
int a, b;
Scanner masukan=new Scanner(System.in);
System.out.print ("Maksimum dua bilangan \n");
System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
a = masukan.nextInt();
b = masukan.nextInt();
System.out.println ("Ke dua bilangan : a = "+ a +" b = "+ b);
System.out.println ("Maksimum = " + (maxab (a, b)));
System.out.print("Tukar kedua bilangan ");
tukar (a, b);
}
}