package org.example.dz;

public class Vstroku<T> {
    private T[] str;

    public T[] getStr() {
        return str;
    }

    public void setStr(T[] str) {
        this.str = str;
    }

    public Vstroku(T... str){
        this.str = str;
    }

    public Vstroku repEl(int i, int j, Vstroku arr){
        T temp = (T) arr.str[i];
        str[i] = str[j];
        str[j] = temp;
        return arr;
    }
}
