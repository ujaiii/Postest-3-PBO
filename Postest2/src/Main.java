import java.util.*;
public class Main {
    private static ArrayList<Sepatu> sepatu = new ArrayList<>();
    private static ArrayList<sepatu_cewe> data_cewe = new ArrayList<>();
    private static ArrayList<sepatu_cowo> data_cowo = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    static void sleep(int sec){
        try {
            Thread.currentThread().sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        while(true){    
            System.out.println("================");
            System.out.println("   Menu Admin   ");
            System.out.println("================");
            System.out.println("1. Tambah sepatu");
            System.out.println("2. Tampil sepatu");
            System.out.println("3. Update sepatu");
            System.out.println("4. hapus  sepatu");
            System.out.println("5. keluar");
            System.out.print("Masukkan pilihan >> ");
            int pilihan = input.nextInt();
            switch(pilihan){
                case 1:
                    nambah();
                    break;
                case 2:
                    lihat();
                    break;
                case 3:
                    update();
                    break; 
                case 4:
                    delete();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("=================");
                    System.out.println("pilihan tidak ada");
                    System.out.println("=================");
                    break;
            }
        }
        
    }
    private static void nambah(){
        System.out.println("=======================");
        System.out.println("1. Tambah  Sepatu Biasa");
        System.out.println("2. Tambah  Sepatu Cewe ");
        System.out.println("3. Tambah  Sepatu Cowo ");
        System.out.println("=======================");
        System.out.print("Masukkan pilihan >> ");int pilih = input.nextInt();
        switch(pilih){
            case 1:
                System.out.print("Masukkan nama sepatu >> ");
                String nama_sepatu = input.next();
                System.out.print("Masukkan harga  >> ");
                int hrg = input.nextInt();
                Sepatu sepatu_baru = new Sepatu(nama_sepatu, hrg);
                sepatu.add(sepatu_baru);
                System.out.println("data telah ditambahkan");
                sleep(1);
                break;
            case 2:
                System.out.print("Masukkan nama sepatu >> ");
                String nama = input.next();
                System.out.print("Masukkan harga       >> ");
                int harga = input.nextInt();
                System.out.print("Masukkan warna       >> ");
                String warna = input.next();
                sepatu_cewe data_baru = new sepatu_cewe(nama, harga, warna, "sepatu cewe");
                data_cewe.add(data_baru);
                System.out.println("data telah ditambahkan");
                sleep(1);
                break;
            case 3:
                System.out.print("Masukkan nama sepatu >> ");
                String nm = input.next();
                System.out.print("Masukkan harga       >> ");
                int hr = input.nextInt();
                System.out.print("Masukkan warna       >> ");
                String wr = input.next();
                sepatu_cowo new_data = new sepatu_cowo(nm, hr, wr,"sepatu laki-laki");
                data_cowo.add(new_data);
                System.out.println("data telah ditambahkan");
                sleep(1);
                break;
            default:
                System.out.println("=================");
                System.out.println("pilihan tidak ada");
                System.out.println("=================");
                break;
        }
    }
    private static void lihat(){
        System.out.println("Lihat data");
        System.out.println("==========================");
        System.out.println("1. Lihat data Sepatu biasa");
        System.out.println("2. Lihat data Sepatu  cewe");
        System.out.println("3. Lihat data Sepatu  cowo");
        System.out.println("==========================");
        System.out.print("Masukkan pilihan >> ");int pil = input.nextInt();
        switch(pil){
            case 1:
                System.out.println("Lihat data");
                for(int i =0; i < sepatu.size(); i++){
                    sepatu.get(i).tampak();
                }
                System.out.println("");
                sleep(1);
                break;
            case 2:
                System.out.println("Lihat data");
                for(int i =0; i < data_cewe.size(); i++){
                    data_cewe.get(i).tampak();
                }
                System.out.println("");
                sleep(1);
                break;
            case 3:
                for(int i =0; i < data_cowo.size(); i++){
                    data_cowo.get(i).tampak();
                }
                System.out.println("");
                sleep(1);
                break;
            default:
                System.out.println("===================");
                System.out.println(" Pilihan tidak ada ");
                System.out.println("===================");
                break;
        }        
    }
    private static void update(){
        System.out.println("===========");
        System.out.println("Update Data");
        System.out.println("===========");
        System.out.println("===========================");
        System.out.println("1. Update data sepatu biasa");
        System.out.println("2. Update data sepatu  cewe");
        System.out.println("3. Update data sepatu  cowo");
        System.out.println("===========================");
        System.out.print("Masukkan pilihan >> ");int p = input.nextInt();
        switch(p){
            case 1: 
                System.out.print("Masukkan nama sepatu >> ");String carisepatu = input.next();
                for(int i = 0; i < sepatu.size(); i++){
                    if(sepatu.get(i).getNama().equals(carisepatu)){
                        System.out.print("Masukkan nama sepatu baru  >> ");
                        sepatu.get(i).setName(input.next());
                        System.out.print("masukkan harga sepatu baru >> ");
                        sepatu.get(i).sethrg(input.nextInt());
                        break;
                    }
                    else{
                        System.out.println("data salah");
                        sleep(1);
                    }
                }
                sleep(1);
                break;
            case 2:
                System.out.print("Masukkan nama sepatu >> ");String cari = input.next();
                for(int i = 0; i < data_cewe.size(); i++){
                    if(data_cewe.get(i).getNama().equals(cari)){
                        System.out.print("Masukkan nama sepatu baru  >> ");
                        data_cewe.get(i).setName(input.next());
                        System.out.print("masukkan harga sepatu baru >> ");
                        data_cewe.get(i).sethrg(input.nextInt());
                        System.out.print("Masukkan warna sepatu baru >> ");
                        data_cewe.get(i).setWarna(input.next());
                        break;
                    }
                    else{
                        System.out.println("data salah");
                        sleep(1);
                    }
                }
                sleep(1);
                break;
            case 3:
                System.out.print("Masukkan nama sepatu >> ");String cr = input.next();
                for(int i = 0; i < data_cowo.size(); i++){
                    if(data_cowo.get(i).getNama().equals(cr)){
                        System.out.print("Masukkan nama sepatu baru  >> ");
                        data_cowo.get(i).setName(input.next());
                        System.out.print("masukkan harga sepatu baru >> ");
                        data_cowo.get(i).sethrg(input.nextInt());
                        System.out.print("Masukkan warna sepatu baru >> ");
                        data_cowo.get(i).setWarna(input.next());
                        break;
                    }
                    else{
                        System.out.println("data salah");
                        sleep(1);
                    }
                }
                sleep(1);
                break;
            default:
                System.out.println("===================");
                System.out.println(" Pilihan tidak ada ");
                System.out.println("===================");
                break;
        }
    }
    private static void delete(){
        System.out.println("====================");
        System.out.println("    hapus data      ");
        System.out.println("====================");
        System.out.println("1.Hapus sepatu biasa");
        System.out.println("2.Hapus sepatu cowo");
        System.out.println("3.Hapus sepatu cewe");
        System.out.println("===================");
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                System.out.print("Masukkan nama sepatu >>> ");
                String spt = input.next();
                for(Sepatu spatu : Main.sepatu){
                    if(spatu.getNama().equals(spt)){
                        sepatu.remove(spatu);
                    }
                }
                System.out.println("Data telah dihapus");
                sleep(1);
                break;
            case 2:
                System.out.print("Masukkan nama sepatu >>> ");
                String sp = input.next();
                for(Sepatu spatu : Main.sepatu){
                    if(spatu.getNama().equals(sp)){
                        sepatu.remove(spatu);
                    }
                }
                System.out.println("Data telah dihapus");
                sleep(1);
                break;
            case 3:
                System.out.print("Masukkan nama sepatu >>> ");
                String P = input.next();
                for(Sepatu spatu : Main.sepatu){
                    if(spatu.getNama().equals(P)){
                        sepatu.remove(spatu);
                    }
                }
                System.out.println("Data telah dihapus");
                sleep(1);
                break;
            default:
                System.out.println("=================");
                System.out.println("Pilihan tidak ada");
                System.out.println("=================");
        }
    }
}
