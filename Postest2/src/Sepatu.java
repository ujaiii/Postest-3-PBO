public class Sepatu {
    protected String nama_sepatu;
    protected int harga;
    Sepatu(String us_name, int hrg){
        this.nama_sepatu = us_name;
        this.harga = hrg;
    }
    public void setName(String us_name){
        this.nama_sepatu = us_name;
    }
    public void sethrg(int hrg){
        this.harga = hrg;
    }
    public String getNama(){
        return nama_sepatu;
    }
    public int getharga(){
        return harga;
    }

    void tampak(){
        System.out.println("1. Merk Sepatu = " + this.nama_sepatu);
        System.out.println("2. Harga       = " + this.harga);
    }
}
