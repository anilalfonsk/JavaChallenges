package com.aak.blindsevenfive.threads;

public class MyCallable {
    public static void main(String[] args) {
        try{
            try{
                throw new Exception("Exception");
            }finally {
                System.out.println("Inner Finally");
            }
        }catch (Exception e){
            System.out.println("Catch");
        }finally {
            System.out.println("Finally");
        }
    }

}
