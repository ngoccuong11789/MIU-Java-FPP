import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {
        int[] a =  {5,6,-4,3,1};
        int[] b = {3,8,9,11};
        System.out.println(Arrays.toString(combine(a,b)));
    }
    public static int[] combine(int[] a, int[] b) {
        int len = a.length + b.length;
        int[] result = new int[len];
        for (int i = 0; i < a.length ; i++) {
            result[i] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            result[a.length + j] = b[j];
        }

        //System.out.println("Result : " + result);
        return result;
    }
}
