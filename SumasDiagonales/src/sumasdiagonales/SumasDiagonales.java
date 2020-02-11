
package sumasdiagonales;
// DANIEL ALEXANDER CARTAGENA FERNANDEZ - 1803690
import java.util.Scanner;
public class SumasDiagonales {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
byte Tmatriz=0;
int Matriz[][], SumaD1=0, SumaD2=0,DiferM=0;
String Vmatriz=" ";
       Matriz = new int[200][200];
       System.out.println("PROGRAMA QUE SUMA LAS DIAGONALES DE UNA MATRIZ");
       System.out.println("INGRESE EL TAMAÑO DE LA MATRIZ nxn: ");
       Tmatriz=sc.nextByte();
System.out.println("INGRESE LOS VALORES DE LA MATRIZ:");
       for(short i=1;i<=Tmatriz;i++){
           for(short j=1;j<=Tmatriz;j++){
           Matriz[i][j]=sc.nextInt();
           if(i==j){
               SumaD1+=Matriz[i][j];
             }
           if(i==Tmatriz+1-j){
               SumaD2+=Matriz[i][j];
             }
           }
       }
System.out.println("VIZUALIZACION DE LA MATRIZ.");
        for(short i=1;i<=Tmatriz;i++){
            for(short j=1;j<=Tmatriz;j++){
               Vmatriz+=Matriz[i][j] + "  ";
           }
       System.out.println(Vmatriz);
       Vmatriz=" ";
       }
    DiferM=Math.abs(SumaD2-SumaD1);
        System.out.println("SUMA DIAGONAL 1:"+SumaD1);
        System.out.println("SUMA DIAGONAL 2:"+SumaD2);
        System.out.println("VALOR ABSOLUTO DE LA DIFERENCIA DE LAS DIAGONALES:"+DiferM);
    } 
}
