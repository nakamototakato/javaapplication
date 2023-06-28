public class Main {
    public static void main(String[] args) {
        // インスタンスの生成
         Sample0603Student student1 = new Sample0603Student();
         Sample0603Student student2 = new Sample0603Student();
         // それぞれのインスタンスに名前を設定
         student1.setName("Yamamoto Ichiro");
         student2.setName("Yamada Hanako");
         // それぞれのインスタンスから名前を取得
         System.out.println(student1.name);
         System.out.println(student2.name);
    }
}