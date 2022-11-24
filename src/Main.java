import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        int girisHakki=3;
        int bakiye=1500;
        int secim;
        int miktar;

        while(girisHakki>0){
            System.out.print("Kullanıcı Adınız: ");
            String userName= klavye.nextLine();
            System.out.print("Şifreniz: ");
            String password= klavye.nextLine();

            if (userName.equals("patika")&& password.equals("dev123")) {
                System.out.println("Merhaba.X Bankasına Hoşgeldiniz.");

                    String islemler = "1.Para Çekme \n"
                            + "2.Para Yatırma \n"
                            + "3.Bakiye Sorgulama \n"
                            + "4.Çıkış yap ";

                    System.out.println(islemler);
                    System.out.println();
                    System.out.print("Hangi İşlemi Yapmak İstiyorsunuz?: ");
                    secim = klavye.nextInt();


                    switch (secim) {
                        case 1:
                            System.out.print("Çekmek İstediğiniz para miktari: ");
                            miktar = klavye.nextInt();
                            if (miktar>bakiye){
                                System.err.println("Bakiyenizde o kadar miktar yok ! ");
                                break;
                            }
                            else {
                                bakiye -= miktar;
                                System.out.println("Bakiyenizde Kalan Miktar: " + bakiye);
                            }
                            break;

                        case 2:
                            System.out.print("Yatırmak İstediğiniz Para Miktarı: ");
                            miktar = klavye.nextInt();
                            bakiye += miktar;
                            System.out.println("Yeni Bakiyeniz: " + bakiye);
                            break;

                        case 3:
                            System.out.println("Hesaptaki Bakiyeniz: " + bakiye);
                            break;

                        case 4:
                            System.out.println("Sistemden Çıkış Yapılıyor...Tekrar Görüşmek Dileğiyle...");
                            break;
                        default:
                            System.err.println("Hatalı Veri Girdiniz.");
                    }
                    break;


                }


            else{

                System.err.println("Kullanıcı Adınız Veya Şifreniz Yanlış.Lütfen Tekrar Deneyin.");
                girisHakki--;

                if (girisHakki==0){
                    System.out.println("Hesabınız Bloke Olmuştur.Lütfen Banka İle İletişme Geçiniz!");
                    break;
                }
                else {
                    System.out.println("Kalan giriş hakkınız: " +girisHakki);
                }
            }

        }

    }
}