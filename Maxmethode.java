package com.bridgelab;

public class Maxmethode<X extends Comparable<X>> {
    X a,b,c;
    public Maxmethode(X a, X b, X c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public X maxnum(){
        return  Maxmethode. maxnum(a ,b ,c );
    }
    public static <X extends Comparable<X>> X maximum (X a,X b,X c){
        X max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        printmax(a, b, c,max);
            return max;
    }
    public static <X> void printMax(X a ,X b ,X c,X max){
        System.out.println("Max of %s,%s and %s is %s \n" + a +" "+ b +" "+ c +" is : "+ max);
    }
    public static void main(String[] args) {
        Integer aInt=2, bInt=3,cInt=4;
        Float aF1=6.6f, bF1=8.8f,cF1=7.7f;
        String aStr="pear",bStr="apple",cStr="orange";

        new Maxmethode(aInt , bInt ,cInt).maxnum();
        new Maxmethode(aF1 , bF1 ,cF1).maxnum();
        new Maxmethode<>(aStr , bStr ,cStr).maxnum();
    }
}

