public class MeW2 {
    public static void main(String[] args) {
        String name1 = "Evans";
        String name2 = "Evans"; // will same memory reference with name1

        String name3 = new String(name1);  // will have its  memory Reference location
    }
}
