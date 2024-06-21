import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//    }
public static void main(String[] args) {
    //Scanner input = new Scanner(System.in);
   // Find max/min among 3 inputs x, y, z using Ternary operator
//    int b1 = 100, b2 = 55, b3 = 19;
//    int max = b1 > b2 ? (b1 > b2)
//    double power = Math.pow(2, 3);
//    String s1 = "ABC";
//    s1 = "bcd";
//    System.out.println("s1 = " + s1);
//    System.out.println("Hello".substring(1));
//    System.out.println("123".substring(1));
//
//    System.out.println("Z_Z".length());
//    Random random = new Random();
//
//    // Get a random number x in the range 1 to 9
//    int x = 1 + random.nextInt(9);
//    // random number between 1 and 9 (inclusive)
//
//    // Get a random number y in the range 3 to 14
//    int y = 3 + random.nextInt(12); // random number between 3 and 14 (inclusive)
//
//    // Compute π^x
//    double result1 = Math.pow(Math.PI, x);
//
//    // Compute y^π
//    double result2 = Math.pow(y, Math.PI);
//
//    // Print results with two digits after decimal
//    System.out.printf("π^%d = %.2f%n", x, result1);
//    System.out.printf("%d^π = %.2f%n", y, result2);

//    String s1 = "Java";
//    String s2 = "Android";
//    int com = s1.compareTo(s2);
//    System.out.println(com);

//    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//    System.out.println("Enter username");
//
//    String userName = myObj.nextLine();  // Read user input
//    System.out.println("Username is: " + userName);
//    //String someString = "elephant";
//    char someChar = 'e';
//    int count = 0;
//
//    for (int i = 0; i < userName.length(); i++) {
//        if (userName.charAt(i) == someChar) {
//            count++;
//        }
//    }
//
//    System.out.println("Count is: " + count);

    int[] a =  {5,6,-4,3,1};
    int[] b = {3,8,9,11};

    combine(a, b);
    //String cd = Arrays.toString("Hello,strings can be fun. They have many uses.".split("	|,"));
    String t = "Hello,strings can be fun. They have many uses.";
    String[] result = t.split(",| |\\. |\\.");
    //System.out.println("a = " + cd);
    System.out.println("result = " + Arrays.toString(result));

//    String records = "231A,Light Bulb,123,Wilco,1.75:"+
//            "113D,Hairbrush,19,Aamco,3.75:" +
//            "521W,Shampoo,24,Acme,6.95:" +
//            "440Q,Dishwashing Detergent,20,Wilco,1.75:" +
//            "009G,Toothbrush,77,Wilco,0.85:" +
//            "336C,Comb,34,Wilco,0.99:" +
//            "523E,Paper Pad Set,109,Congdon and Chrome,2.45:" +
//            "888A,Fake Diamond Ring,111,AmericusDiamond,3.95:" +
//            "176A,Romance Nove1 1,20,Barnes and Noble,3.50:" +
//            "176B,Romance Nove1 2,20,Barnes and Noble,3.50:" +
//            "176C,Romance Nove1 3,20,Barnes and Noble,3.50:" +
//            "500D,Floss,44,Wilco,1.25:" +
//            "135B,Ant Farm,5,Wilco,8.00:" +
//            "211Q,Bicycle,9,Schwinn,75.95:" +
//            "932V,Pen Set,50,Congdon and Chrome,9.95:" +
//            "678Q,Pencil 50,123,Congdon and Chrome,9.95:" +
//            "239A,Colored Pencils,25,Congdon and Chrome,4.75:" +
//            "975B,Shower Curtain,25,Wilco,6.50:" +
//            "870K,Dog Bowl,15,Wilco,4.75:" +
//            "231S,Cat Bowl,15,Wilco,4.75:" +
//            "562M,Kitty Litter,15,Wilco,3.25:" +
//            "777X,Dog Bone,15,Wilco,4.15:" +
//            "933W,Cat Toy,15,Wilco,2.35:" +
//            "215A,Hair Ball,0,Little Jimmy,0.00:";


    String[] values = {"horse", "dog", "cat", "horse", "dog", "cat", "meo"};
    int count = 0;
    for (int i = 0; i < values.length; i++) {
        for(int j = i + 1; j < values.length; j++) {
            if(values[i].equals(values[j])) {
                count += 1;
            }
        }
    }
    System.out.println("count : " + count);

    int[] duplicateValues =  new int[count];
    int indexDuplicateValues = 0;
    for (int i = 0; i < values.length; i++) {
        for(int j = i + 1; j < values.length; j++) {
            if(values[i].equals(values[j])) {
                duplicateValues[indexDuplicateValues] = i;
                indexDuplicateValues += 1;
            }
        }
    }

    int leng = values.length - count;
    String[] newArray = new String[leng];
    int index = 0;

//    for (int i = 0; i < values.length; i++) {
//        // Bỏ qua các phần tử cần xóa
//        boolean skip = false;
//        for (int removeIndex : duplicateValues) {
//            if (i == removeIndex) {
//                skip = true;
//                break;
//            }
//        }
//        if (skip) continue;
//
//        // Thêm phần tử vào mảng mới
//        newArray[index++] = values[i];
//    }

    for(int i = 0; i < values.length; i++) {
        boolean toRemove = false;
        for (int j = 0 ; j < duplicateValues.length; j++) {
            if (i == j) {
                toRemove = true;
                break;
            }
        }
        if (toRemove) continue;
        newArray[index++] = values[i];
    }

    for (int k = 0; k < newArray.length; k++) {
        System.out.println("newArray : " + newArray[k]);
    }





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

        for(int k = 0 ; k < result.length; k++) {
            System.out.println("Result : " + result[k]);
        }

        //System.out.println("Result : " + result);
        return result;
    }



}