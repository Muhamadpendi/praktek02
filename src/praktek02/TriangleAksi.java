package praktek02;

public class TriangleAksi {
    public static void main(String[] args) {
        Triangle r1 = new Triangle();
        r1.alas = 8;
        r1.tinggi = 4;
        
        r1.cetakInfo();
        System.out.println("Luas triangle = "+r1.hitungLuas());
        r1.cetakLuas();
        
        Triangle r2 = new Triangle();
        r2.cetakInfo();
        Triangle r3 = new Triangle(50,30);
        r3.cetakInfo();
        
    }
}
