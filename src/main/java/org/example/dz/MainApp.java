package org.example.dz;

import org.example.metod.wildcard.Stats1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        //Vstroku arr = new Vstroku((String)"one", (int)2, (boolean)false);
        Object[] array = new Object[]{(String)"one", (int)2, (boolean)false};
        //Arrays.stream(arr.getStr()).forEach(System.out::println);
        //System.out.println();
        //Vstroku arr1 = new Vstroku();
        //arr1 = arr.repEl(0, 2, arr);
        //Arrays.stream(arr1.getStr()).forEach(System.out::println);

        InAList aL = new InAList();
        ArrayList<Object> aList = aL.inArList(array);
        Arrays.stream(aList.toArray()).forEach(System.out::println);
    }



}
