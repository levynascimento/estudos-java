package site.levy.maratonajava.introducao;

public class Arrays03 {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        int [] numbers2 = new int[] {1,2,3,4,5};
        int [] numbers3 = {1,2,3,4,5};


//        for (int i = 0; i < numbers2.length; i++) {
//            System.out.println(numbers2[i]);
//        }

        for (int num: numbers3) {
            System.out.println(num);
        }
    }
}
