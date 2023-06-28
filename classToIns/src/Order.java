import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void processOrder() {
        // 注文処理の実装
        System.out.println("注文が処理されました。");
        for (String item : items) {
            System.out.println(item);
        }
        items.clear();
    }

    public List<String> getItems() {
        return items;
    }



}
