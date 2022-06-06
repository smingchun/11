package cn.wolfcode.feign.fallback;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateBetween {
    public static void main(String[] args) throws ParseException {
        /*int[] ints = {1, 6, 3, 5, 6, 2, 9, 2, 0};
        for (int i = 0; i < ints.length-1; i++) {
            for (int j = i+1; j < ints.length; j++) {
                if (ints[i]>ints[j]) {
                    int temp;
                    temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ints));*/

        Date date = new Date(System.currentTimeMillis());

        Calendar instance = Calendar.getInstance();
        instance.setTime(date);

        System.out.println(instance.getTime());
        instance.add(Calendar.DAY_OF_MONTH,-7);
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.getTime());
       /* String abc = "abc";
        String s1 = new String("abc");
        String s2 = new String("abc");
        Integer integer = 10;
        Integer integer1 = 10;
        Integer integer2 = -129;
        Integer integer13 = -129;
        System.out.println(integer == integer1);
        System.out.println( integer2 == integer13);*/

    }
}
