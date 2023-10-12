import java.util.ArrayList;

public class Java2DArrayList {

    public static void main(String[] args) {
        // 2D ArrayList = a dynamic list of lists.
        // 				change size of these lists during runtime
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList<String>();

        bakeryList.add("Pasta");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList<String>();

        produceList.add("Tomatoes");
        produceList.add("Cheese");
        produceList.add("Peppers");

        ArrayList<String> drinksList = new ArrayList<String>();

        drinksList.add("Soda");
        drinksList.add("Wine");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(1));

//        for (int i = 0; i<food.size(); i++) {
//            System.out.println(food.get(i));
//        }

    }
}