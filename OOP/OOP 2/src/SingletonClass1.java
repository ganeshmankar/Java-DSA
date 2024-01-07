public class SingletonClass1 {
    //In singleton u canot call the constructor so u cannot create new objects
    private SingletonClass1(){

    }
    private static SingletonClass1 instance;

    public static SingletonClass1 getInstance(){
        // Check whether 1 obj only is created or not
        if (instance == null){
            instance = new SingletonClass1();
        }
        return instance;
    }
}
