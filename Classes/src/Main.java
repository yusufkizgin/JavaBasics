public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        //Value Type
        int a = 5;
        int b = 3;
        a = b;
        b=  9;
        System.out.println(a); // 3

        //Reference Type
        int numbers1[]= new int[]{1 , 2 ,  3};
        int numbers2[]= new int[]{6,7,8};
        numbers2 = numbers1;
        numbers1[1] = 15;
        System.out.println(numbers2[1]); //15



    }
}