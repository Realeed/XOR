public class XOR {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 7, 4, 1, 7};
        int num = array[0];
        for (int i = 1; i < array.length; i++) {
            num = num^array[i];
        }
        System.out.println(num);
    }
}
