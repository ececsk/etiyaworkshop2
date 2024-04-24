/* 5-) Öğrenci adlarının ve notlarının olduğu bir Arraylist kullanarak belirli
not aralığı altında kalan öğrenciyi listeden silme algoritması yazınız.,
 */
import java.util.ArrayList;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        List<Integer> studentGrades = new ArrayList<>();

        studentNames.add("Ayşegül Kadiroğlu");
        studentGrades.add(35);
        studentNames.add("Burak Balıkçı");
        studentGrades.add(45);
        studentNames.add("Ece Coşkunçay");
        studentGrades.add(64);
        studentNames.add("Esat Yener");
        studentGrades.add(70);
        studentNames.add("Melodi Bayraktar");
        studentGrades.add(82);
        studentNames.add("Sevde Köycü");
        studentGrades.add(75);


        for (int i = 0; i < studentGrades.size(); i++) {
        if (studentGrades.get(i) < 65) {
            studentGrades.remove(i);
            studentNames.remove(i);
            System.out.println("Öğrenci silindi.");
            i--;
        }
    }

        System.out.println("Kalan öğrenciler:");
        for (int i = 0; i < studentNames.size(); i++) {
        System.out.println(studentNames.get(i) + ": " + studentGrades.get(i));
    }
}
}
