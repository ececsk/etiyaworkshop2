import java.util.Scanner;

/*1-) Bir mağazanın günlük satış miktarını, ürün adı ve fiyatını
bir dizi olarak tutan ve toplam satış gelirini hesaplayan bir algoritma yazınız.
 */
public class Question1 {
    public static void main(String[] args) {

    int[] salesQuantity={10,8,23};
    String[] products={"Tablet","Mobile Phone","Notebook"};
    double[] price={200,150,500};
    double salesincome=0;
    int totalSales=0;
    for(int i=0;i<products.length;i++){
        totalSales+=salesQuantity[i];
        salesincome+=salesQuantity[i]*price[i];
    }
    System.out.println("Günlük "+totalSales+" adet satış yapıldı. Toplam satış geliri: "+salesincome+"TL");

    }
}