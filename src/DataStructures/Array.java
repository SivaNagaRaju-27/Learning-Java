package DataStructures;
import Basics.arrayFunctions;
//import Sort.bubbleSort;

public class Array extends arrayFunctions {
    //arrayFunctions array = new arrayFunctions();
    int list[];
    //public static void main(String args[]) {
    public void array(String str){
        switch(str){
            case "" : list = read();
                    show(list, list.length);
            break;
            case "Random": list = readRandom();
                    show(list, list.length);
            break;
        }
    }

    public void start(String str){
        switch(str){
            case "BubbleSort" : var bubble = new sort.bubbleSort();
                    bubble.sort(list,list.length);
                    System.out.println("After Sorting...");
                    show(list,list.length);
            break;
            default : System.out.println("There is No Such type of Sorting... as "+str);
        }
    }
}
