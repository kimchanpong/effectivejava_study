package main.java.item01;

/** Chapter1. 생성자 대신 static 팩토리 메소드를 고려해 볼 것 */
public class Item01 {
    String name;
    String address;

    public Item01() {}

    private static final Item01 GOODS_NIGHT = new Item01();

    public Item01(String name) {
        this.name = name;
    }

    public static Item01 withName(String name) {
        return new Item01(name);
    }

    public static Item01 withAddress(String address) {
        Item01 item = new Item01();
        item.address = address;
        return item;
    }

    public static Item01 getItem01() {
        return GOODS_NIGHT;
    }

    public static void main(String[] args) {
        Item01 item = new Item01("ChanHo");
        Item01 item2 = Item01.withName("ChanHo");
        Item01 item3 = Item01.getItem01();
        System.out.println("test1");
    }
}