package UdemyInterface;

public class Main {
    
    
    public static void main(String[] args) {
  
        
        IMuhendis muhendis1 = new PcMuhendisi(false,false);
        
      
        
        MakineMuhendisi muhendis2 = new MakineMuhendisi(true,false);
        
        String[] tecrube = {};
        String[] referans = {"Ahmet Mehmet","Tevfik Zaim"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.31));
        muhendis2.is_tecrubesi(tecrube);
        muhendis2.referans_getir(referans);
        muhendis2.calis();
        
        
        
        
        
        
    }
    
}
