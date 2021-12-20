package org.example.dz;

import java.util.ArrayList;

public class InAList {
    private Object[] obj;

    public InAList(){
        this.obj = obj;
    }

    public ArrayList inArList(Object[] obj1) {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int a=0; a<obj1.length; a++){
            arrayList.add(a, obj1[a]);
        }
        return arrayList;
    }
}
