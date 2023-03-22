public class sepatu_cewe extends Sepatu{
    private String warna;
    private String jenis_sepatu;
    sepatu_cewe(String nama, int hrg, String warna, String jenis_sepatu){
        super(nama, hrg);
        this.warna = warna;
        this.jenis_sepatu = jenis_sepatu;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public String getWarna(){
        return warna;
    }
    public void setjenis(String jenis){
        this.jenis_sepatu = jenis;
    }
    public String getJenis(){
        return jenis_sepatu;
    }

    @Override
    public void tampak(){
        System.out.println("=================================");
        super.tampak();
        System.out.println("3. Warna       = " + this.warna);
        System.out.println("4. jenis       = " + this.jenis_sepatu);
        System.out.println("=================================");
    }
}
