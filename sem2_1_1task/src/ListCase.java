import java.util.ArrayList;
public class ListCase<T> {

    private final ArrayList<T> firstList;
    private final ArrayList<T> secondList;

    public ListCase (ArrayList<T> firstList,ArrayList<T> secondList) {
            this.firstList = firstList;
            this.secondList = secondList;
    }

    public ArrayList<T> getFirstList () {
            return firstList;
    }

    public ArrayList<T> getSecondList () {
            return secondList;
    }

    public ArrayList<T> getEqualPositions() {

        if(firstList == null && secondList == null) {
            return null;
        }
        else if(firstList == null || secondList == null) {
            return null;
        }

        ArrayList<T> list1 = new ArrayList<>(getFirstList());
        ArrayList<T> list2 = new ArrayList<>(getSecondList());
        ArrayList<T> EqualPositions = new ArrayList<>();

        for (T t : list1) {
            for (int j = 0; j < list2.size(); j++) {
                for (T listOfEqualPositions : EqualPositions) {
                    if (listOfEqualPositions == list2.get(j)) {
                        list2.remove(j);
                        j--;
                    }
                }

                if (t == list2.get(j)) {
                    EqualPositions.add(t);
                    list2.remove(j);
                    if (j != 0) j--;
                }
            }
        }
        return EqualPositions;
    }

    public ArrayList<T> getUniquePositionsOf1List () {

        ArrayList<T> list1 = new ArrayList<>(getFirstList());
        ArrayList<T> list2 = new ArrayList<>(getEqualPositions());

        for (T t : list2) {
            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(j) == t) {
                    list1.remove(j);
                    if (j != 0) j--;
                }
            }
        }
        return new ArrayList<>(list1);
    }

    public ArrayList<T> getUniquePositionsOf2List () {

        ArrayList<T> list1 = new ArrayList<>(getEqualPositions());
        ArrayList<T> list2 = new ArrayList<>(getSecondList());

        for (T t : list1) {
            for (int j = 0; j < list2.size(); j++) {
                if (list2.get(j) == t) {
                    list2.remove(j);
                    if (j != 0) j--;
                }
            }
        }
        return new ArrayList<>(list2);
    }

}
