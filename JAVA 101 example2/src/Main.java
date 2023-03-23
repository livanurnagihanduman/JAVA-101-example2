public class Main {
    public static void main(String[] args) {

        int a = 5 , b = 10;
        boolean compera = a == b;

        if(compera){
            System.out.println("Eşittir.");
        }else{
            System.out.println("Eşit Değildir.");
        }
        System.out.println("Program Bitti!");



        int x = 550;
        int y = 330;
        int z = 440;

        if ((x<y) && (x<z)){
            System.out.println(x);
        }else{
            System.out.println();
        }
        if((y<x) && (y<z)){
            System.out.println(y);
        }else{
            System.out.println();
        }
        if((z<x) && (z<y)){
            System.out.println(z);
        }else{
            System.out.println();
        }

        int day = 1;
        if(day == 1){
            System.out.println("Bugün Pazartesi");
        }else if(day == 2){
            System.out.println("Bugün Salı");
        }else if(day == 3){
            System.out.println("Bugün Çarşamba");
        }else if(day == 4){
            System.out.println("Bugün Perşembe");
        }else if(day == 5){
            System.out.println("Bugün Cuma");
        }else if(day == 6){
            System.out.println("Bugün Cumartesi");
        }else if(day == 7){
            System.out.println("Bugün Pazar");
        }
        System.out.println("Program Bitti!");


        int dayx = 8;
        switch(dayx){
            case 1:
                System.out.println("Bugün Pazartesi");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                break;
            case 5:
                System.out.println("Bugün Cuma");
                break;
            case 6:
                System.out.println("Bugün Cumartesi");
                break;
            case 7:
                System.out.println("Bugün Pazar");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!");
            }
            System.out.println("Program Bitti!");

        //HESAP MAKİNESİ PROGRAMI

        String islem = "wfdsknf";
        int c = 15,d = 5;

        switch(islem){
            case "topla":
                System.out.println(c+d);
                break;
            case "cikar":
                System.out.println(c-d);
                break;
            case "carp":
                System.out.println(c*d);
                break;
            case "bol":
                System.out.println(c/d);
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!");
        }
            System.out.println("Program Bitti!");



















    }
}