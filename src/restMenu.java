public class restMenu {
    public static void main(String[] args) {
        //2-Restoranın menüsündeki yemekleri,fiyatlarını ve
        // popülerlik derecelendirmelerini bir dizi ile tutan algoritma yazınız.
        String [] dishes = {"Mantı","Köfte","Kızartma"};
        double [] dishPrice = {30.0,50.50,25.0};
        double[] ratings ={3.5,4.0,2.0};

        System.out.println("-----Menü-----");
        for(int i = 0; i< dishes.length;i++){
            System.out.println("Yemek: " + dishes[i] + " Fiyatı: "+dishPrice[i] + " Puanı " + ratings[i]);
        }

    }
}
