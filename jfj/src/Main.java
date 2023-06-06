import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        static ArrayList<Integer> getTable(int N){
            ArrayList<Integer> table = new ArrayList<>();
            for (int i =1 ; i<11;i++){
                table.add(9*i);
            }
            return table;
        }

    }
}