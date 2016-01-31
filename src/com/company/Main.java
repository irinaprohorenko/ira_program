package com.company;

public class Main {
    private int x = 0;

    public Main(int x){
        this.setX(x);
    }

    public Main(){
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public void printX(int x){
        System.out.println("This is local variable: " + x);
        System.out.println("This is object field: " + this.getX() + "\n");
    }

    public static void main(String[] args) {
        int x = 0;
        Main main = new Main();
        main.printX(x);

        main.setX(5);
        main.printX(x);

        x = 10;
        main.printX(x);

        Main main2 = new Main(2);

        int x2 = 4;
        main2.printX(x2);

        main.printX(x);
    }
}
