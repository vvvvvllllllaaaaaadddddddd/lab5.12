public class ThirdTask {
    public static void main(String[] args) {
        int array1[] = new int[3];
        int array2[] = new int[3];
        int array3[] = new int[3];
        double mid1 = 0, mid2 = 0, mid3 = 0;
        for (int i = 0; i < 3; i++) {
            array1[i] = (int) Math.round(Math.random() * 3);
            mid1 = mid1 + array1[i];
            System.out.print(array1[i] + " ");
        }
        for (int i = 0; i < 3; i++) {
            array2[i] = (int) Math.round(Math.random() * 3);
            mid2 = mid2 + array2[i];
            System.out.print(array2[i] + " ");
        }
        for (int i = 0; i < 3; i++) {
            array3[i] = (int) Math.round(Math.random() * 3);
            mid3 = mid3 + array3[i];
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        System.out.println(mid1 = mid1 / 3);
        System.out.println(mid2 = mid2 / 3);
        System.out.println(mid3 = mid3 / 3);

        if (mid1 > mid2 && mid1 > mid3) {
            System.out.println("Середнє арифметичне першого масиву є найбільшим");
        } else if (mid2 > mid1 && mid2 > mid3) {
            System.out.println("Середнє арифметичне другого масиву є найбільшим");
        } else if (mid3 > mid1 && mid3 > mid2) {
            System.out.println("Середнє арифметичне третього масиву є найбільшим");
        }
    }
}
