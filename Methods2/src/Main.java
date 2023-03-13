public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava Çok Güzel";
        System.out.println(mesaj.substring(0,9));
        int a  = toplam(9 ,80 ,571);
        System.out.println(a);
    }
    public static void ekle(){
        System.out.println("Mesaj Eklendi");
    }
    public static void sil(){
        System.out.println("Mesaj Silindi");
    }
    public static void güncelle(){
        System.out.println("Mesaj Güncellendi");
    }
    public static int toplam(int... sayilar){
        int toplam = 0;
        for (int s:sayilar) {
            toplam+=s;
        }
        return toplam;
    }

}