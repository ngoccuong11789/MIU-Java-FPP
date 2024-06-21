package Lesson8.arraybasedlist;

import java.util.Arrays;

public class MyStringList {
    private final int INITIAL_LENGTH = 4;
    private String[] strArray;
    private int size;

    public MyStringList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    // Add an element in last
    public void add(String s) {
        // if(s==null) throw new NullPointerException();
        if (s.equals(null))
            return;
        if (size == strArray.length)
            resize(); // Array is full
        strArray[size] = s;
        size++;
        // strArray[size++] = s;
    }

    public String get(int i) {
        if (i < 0 || i > size - 1) {
            // throw new IndexOutOfBoundsException("Invalid index i" + i);
            return null;
        }
        return strArray[i];
    }

    public boolean find(String s) {
        if (s == null)
            return false;
        for (int i = 0; i < size; i++)// for (String test : strArray)
        {
            if (s.equals(strArray[i]))
                return true;

        }
        return false; // The element is not in the list
    }

    /*
     * public void insert(String s, int pos){ if(pos > size-1 || pos<0 )
     * return;//allowed to add 0 to size-1 if(s==null) return; if(pos ==
     * strArray.length-1||size+1 > strArray.length) { resize(); } String[] temp =
     * new String[strArray.length]; System.arraycopy(strArray,0,temp,0,pos); // src,
     * spos,des,dspos,number of elements temp[pos] = s;
     * System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos); strArray =
     * temp; ++size; }
     */
    // can insert the elements 0 to size position
    public void insert(String s, int pos) {
        if (pos < 0 || pos > size)
            return;
        // If the array gets full
        if (pos >= strArray.length) {
            resize();
        }
        String[] temp = new String[strArray.length];
        for (int i = 0; i < pos; i++)
            temp[i] = strArray[i];
        temp[pos] = s;
        for (int i = pos + 1; i < strArray.length; i++)
            temp[i] = strArray[i - 1];

        strArray = temp;
        ++size;
    }

    public boolean remove(String s) {
        if (size == 0)
            return false; // the list is empty
        if (s == null)
            return false;
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (strArray[i].equals(s)) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return false; // s is not found in the list
        String[] temp = new String[strArray.length];

        System.arraycopy(strArray, 0, temp, 0, index);
        System.arraycopy(strArray, index + 1, temp, index, strArray.length - (index + 1));
        strArray = temp;
        --size;
        return true;
    }

    private void resize() {
        System.out.println("resizing");
        int len = strArray.length;// Original array length
        int newlen = 2 * len; // Twice the original length
        // String[] temp = new String[newlen];
        // System.arraycopy(strArray,0,temp,0,len);
        // strArray = temp;
        strArray = Arrays.copyOf(strArray, newlen);


    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(strArray[i] + ", ");
        }
        sb.append(strArray[size - 1] + "]");
        return sb.toString();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        /*
         * if(size==0) return false; else return true;
         */

        return (size == 0);

    }

    /*
     * public Object clone() {
     *
     * String[] temp = Arrays.copyOf(strArray, size); //String[] temp =
     * strArray.clone(); return temp;
     *
     * }
     */
    public static void main(String[] args) {
        MyStringList l = new MyStringList();
        l.add("Bob");
        l.add("Steve");
        l.add("Susan");
        l.add("Mark");
        l.insert("Renuka", 4); // Position reached the length
        l.insert("Mohanraj", 5); // Position reached the length
        System.out.println(l);
        l.add("Dave");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.remove("Mark");
        l.remove("Bob");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.insert("Richard", 3);
        System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
        l.insert("Tonya", 0);
        System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
        // String[] x = (String[]) l.clone();
        // System.out.println(Arrays.toString(x));


    }

}
