public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();

        myList.add("America");

        myList.add(0, "Canada");

        myList.add("Russia");

        myList.add("France");

        myList.add(2, "America");

        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println("(" + i + ")" + myList.get(i));
        }
    }
}
