package DataStructures;
import Basics.arrayFunctions;
//import Sort.bubbleSort;

public class Array {
    arrayFunctions array = new arrayFunctions();
    int list[];
    //public static void main(String args[]) {
    public void array(String str){
        switch(str){
            case "" : list = array.read();
                    array.show(list, list.length);
            break;
            case "Random": list = array.readRandom();
                    array.show(list, list.length);
            break;
        }
    }

    public void start(String str){
        switch(str){
            case "BubbleSort" : var bubble = new Sort.bubbleSort();
                    bubble.sort(list,list.length);
                    System.out.println("After Sorting...");
                    array.show(list,list.length);
            break;
            default : System.out.println("There is No Such type of Sorting... as "+str);
        }
    }
}
