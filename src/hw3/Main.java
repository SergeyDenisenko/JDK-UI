package hw3;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 3, 5, 7, 9};
        Integer[] arr2 = {1, 3, 5, 7, 9};

        System.out.println(Compare.<Integer,Integer>compareArrays(arr1, arr2));

        Pair<String, Integer> pair = new Pair<>("Hello", 123);
        System.out.println(pair);
    }
}
