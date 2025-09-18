package OOP;

public class OOP {
    
    public static void main(String[] args) {
        
        Buku buku1 = new Buku();
        buku1.namaBuku = "Cara menjadi Pria Seajati";
        buku1.penulis = "wahyu";
        buku1.penerbit = "PT Cahaya mentari";
        buku1.tahunTerbit = 2025;
        
        
        Buku buku2 = new Buku();
        buku2.namaBuku = "Python Tutorial";
        buku2.penulis = "Wahyu";   
        buku2.penerbit = "PT Citra Jaya";
        buku2.tahunTerbit = 2020;
        
        buku1.infoBuku();
        buku2.infoBuku();
    
        
         
    }
    
}

