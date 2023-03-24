import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*
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

        //KULLANICI GİRİŞİ PROGRAMI

        String userName;
        int userPassword;

        Scanner inp = new Scanner(System.in);



        System.out.println("Lütfen kulllanıcı adınızı giriniz: ");
        userName = inp.nextLine();
        System.out.println("Lütfen şifrenizi giirniz: ");
        userPassword = inp.nextInt();


        if(userName.equals("dumanliva27") && userPassword == 2727){
            System.out.println(" Tebrikler! Başarılı giriş yaptınız... ");
        }else{
            System.out.println("Üzgünüz! Hatalı giriş yaptınız...");
        }
        System.out.println("Program Bitti.");

        // SINIF GEÇME DURUMU

        String note = "AA";

        switch(note){
            case "AA":
                System.out.println("Tebrikler! Mükemmel Geçtiniz");
                break;
            case "BA":
                System.out.println("Harika! Çok İyi Geçtiniz");
                break;
            case "CB":
                System.out.println("İyi Geçtiniz");
                break;
            case "FF":
                System.out.println("Üzgünüz! Kaldınız.");
                break;
            default:
                System.out.println("Maalesef! Geçersiz Not");
        }
        System.out.println("Program Bitti!");




        int matNot, fizikNot,javaNot,lineerCebirNot;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz!");
        matNot = input.nextInt();

        System.out.println("Fizik  Notunuzu Giriniz!");
        fizikNot = input.nextInt();

        System.out.println("Java Notunuzu Giriniz!");
        javaNot = input.nextInt();

        System.out.println("Lineer Cebir Notunuzu Giriniz!");
        lineerCebirNot = input.nextInt();

        double ort  = (matNot + fizikNot + javaNot + lineerCebirNot) / 4;
        if(ort >= 55){
            System.out.print("Tebrikler! Sınıfı Geçtiniz...");
            System.out.print("\n");
            System.out.print("Ortalamanız: " + ort);
        }else{
            System.out.print("Üzgünüz! Sınıfta Kaldınız...");
            System.out.print("\n");
            System.out.print("Ortalamanız: " + ort);
        }



        // HAVA DURUMUNA GÖRE ETKİNLİK ÖNERME PROGRAMI

        System.out.print("\n");

        String  weather = "-10";

        switch(weather){
            case "weather = 25":
                System.out.println("Nicee! Let's sea");
                break;
            case  "weather = 15":
                System.out.println("No Problem! Let's cinema");
                break;
            case "Weather = -10":
                System.out.println("Voavvv! Coulddd! let's snowboarding");
                break;
            default:
                System.out.println("NoNoNo!!");
        }


         */
        // SAYILARI BÜYÜKTEN KÜÇÜĞE SIRALAYAN PROGRAM

        int k;
        int l;
        int t;

        Scanner i = new Scanner(System.in);

        System.out.print("k sayısını giriniz: ");
        k = i.nextInt();

        System.out.print("l sayısını giriniz: ");
        l = i.nextInt();

        System.out.print("t sayısını giriniz:");
        t = i.nextInt();

        if((k>l)&&(k>t)){
            if (l > t) {
                System.out.println("k>l>t");
            } else {
                System.out.println("k>t>l");
            }
        }else if((l>k)&&(l>t)){
            if(k>t){
                System.out.println("l>k>t");
            }else{
                System.out.println("l>t>k");
            }
        }else if((t>k)&&(t>l)){
            if(k>l){
                System.out.println("t>k>l");
            }
        }else{
            System.out.println("t>l>k");
        }
































    }
}