import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    private static void getWarning(){
        System.out.println("Значения карт должны лежать в пределах от 0 до 9! Попробуйте снова");
    }

    public static boolean checkEnter (LinkedList<String> arr, ArrayDeque<Integer> deck) {
        AtomicBoolean err = new AtomicBoolean(true);
        arr.forEach(x -> {
            try{
                deck.add(Integer.parseInt(x));
            }
            catch (NumberFormatException e){
                getWarning();
                err.set(false);
            }
        });
        deck.forEach(digit ->{
            if(digit > 9 || digit < 0){
                getWarning();
                err.set(false);
            }
        });
        return err.get();
    }

    private static boolean gameRound(){
        int count = 0;
        boolean res = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите колоду 1: ");
        String input1 = in.nextLine();
        if (input1.equals("exit")) return false;
        LinkedList<String> arr1 = new LinkedList<>();
        ArrayDeque<Integer> deck1 = new ArrayDeque<>();
        ArrayDeque<Integer> deck2 = new ArrayDeque<>();
        Collections.addAll(arr1, input1.split("\\s+"));
        if(!checkEnter(arr1, deck1)) return true;

        arr1.clear();
        System.out.print("Введите колоду 2: ");
        input1 = in.nextLine();
        if (input1.equals("exit")) return false;
        Collections.addAll(arr1, input1.split("\\s+"));
        if(!checkEnter(arr1, deck2)) return true;
        arr1.forEach(x -> deck2.add(Integer.parseInt(x)));
        deck1.forEach(digit ->{
            if(digit > 9 || digit < 0) getWarning();
        });

        for (int i = 0; i < 106; i++) {
            count++;
            if (deck1.getFirst() > deck2.getFirst() || ((deck1.getFirst() == 0) && (deck2.getFirst() == 9))) {
                deck1.add(deck1.getFirst());
                deck1.add(deck2.getFirst());
            } else if (deck1.getFirst() < deck2.getFirst() || ((deck1.getFirst() == 9) && (deck2.getFirst() == 0))) {
                deck2.add(deck2.getFirst());
                deck2.add(deck1.getFirst());
            }
            deck1.pollFirst();
            deck2.pollLast();

            if (deck1.size() == 0) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (deck2.size() == 0) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("Botva!");
        return true;
    }
    public static void main(String[] args) {
        boolean cont = true;
        do{
            cont = gameRound();
        } while (cont);
    }
}