/*2-) Restoranın menüsündeki yemekleri, fiyatlarını ve popülerlik derecelendirmelerini
bir dizi ile tutan algoritma yazınız.*/
public class Question2 {
    public static void main(String[] args) {
        String[][] restaurant = new String[3][3];
        restaurant[0][0] = "Pizza";
        restaurant[0][1] = "50";
        restaurant[0][2] = "5";

        restaurant[1][0] = "Hamburger";
        restaurant[1][1] = "70";
        restaurant[1][2] = "4";

        restaurant[2][0] = "Salad";
        restaurant[2][1] = "30";
        restaurant[2][2] = "2";

        for (int i = 0; i < restaurant.length; i++){
            System.out.println("Menu: " + restaurant[i][0] + ", Price: " + restaurant[i][1] + ", Popularity: " + restaurant[i][2]);
        }
    }
}