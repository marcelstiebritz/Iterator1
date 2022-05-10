import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //ArrayList wird erstellt
        ArrayList<Integer> numbers = new ArrayList<>();
        //Zahlen 12,8,2,23 werden hizugefügt
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        // Ein neuer Iterator wird erzeugt
        Iterator<Integer> iterator = numbers.iterator();
        //Wird ausgeführt solange das Array noch ein nächstes Element hat.
        while (iterator.hasNext()){
            // i wird der nächste werde vom Iterator zugewiesen
            Integer i = iterator.next();
            // Wenn i kleiner 10 ist
            if (i<10){
                // wird das Element entfernt
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
