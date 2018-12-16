package List;
import java.lang.Object;
//import com.sun.xml.internal.xsom.impl.parser.DelayedRef;
//import org.omg.CORBA.ExceptionList;
import java.util.Arrays;

 public class MyList<Element> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
     private Object[] elements;

     private MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    private void addElement(int e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }

    private Element getElement(int i){
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException("index: " + i + " ,size " + i);
        }
        return (Element) elements[i];
    }

     public static class myTest{
         public static void main(String[] args){
             MyList<Integer> listInterger = new MyList<>();
             listInterger.addElement(1);
             listInterger.addElement(2);
             listInterger.addElement(3);
             listInterger.addElement(4);
             listInterger.addElement(5);

             System.out.println("element 4: "+listInterger.getElement(4));
             System.out.println("element 1: "+listInterger.getElement(1));
             System.out.println("element 2: "+listInterger.getElement(2));

             if (listInterger.size > 6)

                 //listInterger.getElement(6);
                 System.out.println("element 6: " + listInterger.getElement(6));
             else System.out.println("No element with index 6");
             }
         }
     }

 

