package praktek02;

public class TriangleAksi {
    public static void main(String[] args) {
        Triangle r1 = new Triangle();
        r1.alas = 8;
        r1.tinggi = 4;
        
        r1.cetakInfo();
        System.out.println("Luas triangle = "+r1.hitungLuas());
        r1.cetakLuas();
        
    }
}
