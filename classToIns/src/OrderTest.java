import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderTest {
    private Order order;

    @BeforeEach
    public void setUp() {
        Order order = new Order();
    }

    @Test
    void testAddItem() {
        Order order = new Order(); // orderオブジェクトを初期化
        order.addItem("Item 1");  // addItemメソッドを呼び出す
        // アサーションや他のテストコードを追加
    }

    @Test
    void testProcessOrder() {
        Order order = new Order(); // orderオブジェクトを初期化
        order.addItem("Item 1");  // addItemメソッドを呼び出す
        order.processOrder();     // processOrderメソッドを呼び出す
        // アサーションや他のテストコードを追加
    }

}
