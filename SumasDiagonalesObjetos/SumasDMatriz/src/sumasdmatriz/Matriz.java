
package sumasdmatriz;

import java.util.Scanner;


public class Matriz {
    
    int[][] Mt=new int[200][200] ;
    int SumaD1,SumaD2;
    Scanner sc=new Scanner(System.in);
    byte Tm=0;
    //CONSTRUCTOR
    public Matriz(){
        System.out.println("INGRESE EL TAMAÑO DE LA MATRIZ: ");
        Tm=sc.nextByte();
    }
    
    //METODOS
    
    public void GMatriz(){
        System.out.println("INGRESE LOS VALORES DE LA MATRIZ:");
        for (int i = 1; i <= Tm; i++) {
            for (int j = 1; j <= Tm; j++) {
                Mt[i][j]=sc.nextInt();
           if(i==j){
               SumaD1+=Mt[i][j];
             }
           if(i==Tm+1-j){
               SumaD2+=Mt[i][j];
             }
            }
        }
    }
    
    public void VMatriz(){
        String Vmt=" ";
        System.out.println("VIZUALIZACION DE LA MATRIZ.");
        for(short i=1;i<=Tm;i++){
            for(short j=1;j<=Tm;j++){
               Vmt+=Mt[i][j] + "  ";
            }
            System.out.println(Vmt);
            Vmt=" ";
        }   
    } 
    
    public void DiferenciaD(){
        int DiferM;
        DiferM=Math.abs(SumaD2-SumaD1);
        System.out.println("SUMA DIAGONAL 1:"+SumaD1);
        System.out.println("SUMA DIAGONAL 2:"+SumaD2);
        System.out.println("VALOR ABSOLUTO DE LA DIFERENCIA DE LAS DIAGONALES:"+DiferM);
    }
   
}