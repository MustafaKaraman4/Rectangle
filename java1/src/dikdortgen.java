public class dikdortgen {

    private int genislik;
    private int yukseklik;

public dikdortgen(){

this.genislik=0;
this.yukseklik=0;
}

public dikdortgen(int w, int h){

this.genislik=w;
this.yukseklik=h;
}

    public int alanhesapla(){
        return(this.genislik*this.yukseklik);
 }
    public int cevrehesapla(){

        return(2*(this.genislik+this.yukseklik));
    }


    public void setGenislik(int w){

        this.genislik=w;
    }
    public void setYukseklik(int h){

        this.yukseklik=h;
    }

    public int getGenislik(){

        return this.genislik;
    }

public int getYukseklik(){

    return this.yukseklik;
}
}