public class Main {
    public static void main(String[] args) {
        //1-) Bir mağazanın günlük satış miktarını, ürün adı ve fiyatını bir dizi olarak tutan
        // ve toplam satış gelirini hesaplayan bir algoritma yazınız.
        int [] dailySale = {10,30,5};
        String [] productName = {"Defter","Kitap","Telefon"};
        double [] price = {5.0, 15.50, 549.99};

        double total= 0;

        for (int i = 0; i < dailySale.length; i++) {
            double dailyRevenue = dailySale[i] * price[i];
            total += dailyRevenue;
            System.out.println(productName[i] + " ürününden " + dailySale[i] + " adet satıldı. Toplam satış geliri: " + dailyRevenue);
        }

        // Toplam satış gelirinin yazdırılması
        System.out.println("Toplam satış geliri: " + total);


    }
}