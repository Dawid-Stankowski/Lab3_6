public class Main {

    public static void main(String[] args) {
        String str1 = new String("Test");
        String str2 = new String("Test");

        // Porównaj za pomocą operatora ==
        System.out.println("Porównanie za pomocą operatora ==:");
        System.out.println(str1 == str2);
        System.out.println();

        // Porównaj za pomocą metody equals
        System.out.println("Porównanie za pomocą metody equals:");
        System.out.println(str1.equals(str2));
        System.out.println();
    }
}