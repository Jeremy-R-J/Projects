import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class BasicJava {

    public void pnums() {
        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }

    }

    public void pnumsOdd() {

        for (int i = 1; i < 256; i = i + 2) {

            System.out.println(i);
        }
    }

    public void psums() {
        int sum = 0;
        for (int i = 1; i < 256; i++) {
            {
                sum = sum + i;
            }
            System.out.println("new number" + i + "" + "sum:" + sum);

        }
    }

    public void itarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void findmax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public void getavg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        sum = sum / array.length;
        System.out.println(sum);
    }

    public void oddary() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 256; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }

        }

        System.out.println(list);
    }

    public void greaty(int[] array, int Y) {
        int count = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Y) {
                count++;
            }
        }

        System.out.println(count);
    }

    public void sqvals(int[] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
            list.add(array[i]);
        }

        System.out.println(list);
    }

    public void elimneg(int[] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
                // list.add(array[i]);
            }

            list.add(array[i]);

        }

        System.out.println(Arrays.toString(array));
    }

    public void shiftyvals(int[] array) {

        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
            int x = (array.length - 1);
            x = array[0];
        }
        System.out.println(Arrays.toString(array));
    }

    public void maxminavg(int []array){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
            int max=array[0];
            int min=array[0];
            int avg=array[0];
            int sum=array[0];
            
            for (int i=0; i<array.length; i++){
                if (array[i]>max){
                    max=array[i];
                    }
                else if (array[i]<min){
                    min=array[i];
                    }
                    sum=sum+array[i];
                    }
                    avg=sum/array.length;
                    newArray.add(min);
                    newArray.add(max);
                    newArray.add(avg);
        System.out.println((newArray));
        }

}