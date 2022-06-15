public class App {


     public static void main(String[] args) throws Exception {
        
      dikdortgen d1= new dikdortgen();
    
    d1.setGenislik(10);
    d1.setYukseklik(20);


    
    
      
    System.out.println("d1 genislik= "+d1.getGenislik());
    System.out.println("d1 yukseklik= "+d1.getYukseklik());

      int d1alan=d1.alanhesapla();
      System.out.println("d1 alan: "+d1alan);
      int cevre=d1.cevrehesapla();
      System.out.println("d1 cevre= "+cevre);
      
      
      

     
    dikdortgen d2 = new dikdortgen(5,15);

    System.out.println("d2 genislik= "+d2.getGenislik());
    System.out.println("d2 yukseklik= "+d2.getYukseklik());

      int d2alan=d2.alanhesapla();
      System.out.println("d2 alan: "+d2alan);
      int cevre2=d2.cevrehesapla();
      System.out.println("d2 cevre= "+cevre2);


   
    }
}
