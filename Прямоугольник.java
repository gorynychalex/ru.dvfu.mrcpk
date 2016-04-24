package ru.dvfu.mrcpk;

public class Прямоугольник {

    //Свойства класса
    public int a, b;

    // Конструктор класса
    public Прямоугольник(int a, int b){
        this.a = a;
        this.b = b;
    }

    //Метод класса замена сторон прямоугольника
    public static void swapSides(Прямоугольник rectangle){
        System.out.println("Стороны были: а = " + rectangle.a + ", b= " + rectangle.b);
        int tmp = rectangle.a;
        rectangle.a = rectangle.b;
        rectangle.b = tmp;
        System.out.println("Стороны стали: а = " + rectangle.a + ", b= " + rectangle.b);
    }


    public boolean equals(Прямоугольник r){
        if(this.a == r.a && this.b == r.b){
            return true;
        } else {
            return false;
        }
    }


    public int square(){
        return a * b;
    }

}
