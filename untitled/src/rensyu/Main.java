package rensyu;

public class Main {
    public static void main(String[] args) {

        Person t = new Person("太郎",20,"男");
        Person h = new Person("花子",22,"女");
        Person j = new Person("次郎",21,"男");
        Person i = new Person("一花",24,"女");

        System.out.println(t.getName() + ": " + t.getAge() + "歳" + t.getSex());
        System.out.println(h.getName() + ": " + h.getAge() + "歳" + h.getSex());
        System.out.println(j.getName() + ": " + j.getAge() + "歳" + j.getSex());
        System.out.println(i.getName() + ": " + i.getAge() + "歳" + i.getSex());

        System.out.println("人数: " + Person.getNumber() + "人");
    }
}
