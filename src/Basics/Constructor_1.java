package Basics;

class shape {
    double length;
    double width;
    double height;

    shape(double side){
        length = width = height = side;
    }

    shape(double l, double side){
        length = l;
        width = height = side;
    }

    shape(double l, double w, double h){
        length = l;
        width = w;
        height = h;
    }

    double volume(){
        return length*width*height;
    }
}

public class Constructor_1 {
    public static void main(String args[]) throws java.io.IOException{
        shape cube = new shape(10);
        shape cuboid = new shape(12.5,10);
        shape cuboid1 = new shape(11,12.5,9);

        System.out.println("The volume of a cube: "+cube.volume());
        System.out.println("The volume of the cuboid: "+cuboid.volume());
        System.out.println("The volume of the cuboid1: "+cuboid1.volume());
    }
}
