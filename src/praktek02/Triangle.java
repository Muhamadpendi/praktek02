package praktek02;
public class Triangle {
 double alas;
 double tinggi;

    public Triangle() {
        alas=8;
        tinggi=4;
    }
 
 void cetakInfo(){
    System.out.println("=====================");
    System.out.println("Alas : "+alas);
    System.out.println("Tinggi : "+tinggi);
    System.out.println("=====================");
 }

 double hitungLuas(){
     double luas;
     luas=0.5*alas*tinggi;
     return luas;
 }
 void cetakLuas(){
     System.out.println("Luasnya adalah:"+hitungLuas());
 }
}
