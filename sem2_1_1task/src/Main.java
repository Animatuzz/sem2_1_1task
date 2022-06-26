import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of positions in the first list: "); //В консоли не отображается русский язык, хотя стоит UTF-8, да и не важно
        Integer numberOf1ListCells = scanner.nextInt();
        System.out.println("Number of positions in the second list: ");
        Integer numberOf2ListCells = scanner.nextInt();

        for(int i = 0; i < numberOf1ListCells; i++){
            Integer s = scanner.nextInt();
            list1.add(s);
        }

        for(int i = 0; i < numberOf2ListCells; i++){
            Integer s = scanner.nextInt();
            list2.add(s);
        }

        ListCase<Integer> listCase = new ListCase<>(list1, list2);

        System.out.println(listCase.getEqualPositions());
        System.out.println(listCase.getUniquePositionsOf1List());
        System.out.println(listCase.getUniquePositionsOf2List());
    }
}