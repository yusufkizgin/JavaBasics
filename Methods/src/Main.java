public class Main {
    public static void main(String[] args) {
        SayiBul(2);
    }
    public static void SayiBul(int a){
        int[] sayilar = {1 , 3 , 5 , 8 , 6};
        int aranacak = a;
        boolean varMi = false;

        for (int s: sayilar) {
            if (s == aranacak) {
                varMi = true;
                break;
            }
        }
        if(varMi)
            mesajVer("Sayi Mevcuttur: " + aranacak);
        else
            mesajVer("Sayi Mevcut Degildir: "+ aranacak);
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}