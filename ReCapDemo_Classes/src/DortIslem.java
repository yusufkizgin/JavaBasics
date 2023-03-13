public class DortIslem {
    public static int Topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    public static int Cikar(int sayi1, int sayi2){
        return sayi1-sayi2;
    }
    public static int Carp(int sayi1, int sayi2){
        return sayi1*sayi2;
    }
    public static int Bol(int sayi1, int sayi2)throws Exception{
        if(sayi2 == 0){
            throw new Exception("Sayi2 = 0 Olamaz! ");
        }

        return sayi1/sayi2;
    }
}

