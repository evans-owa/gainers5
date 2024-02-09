public class MeW3 {
    public static void main(String[] args) {

        // immutability of a String
        // instatiation without using the new keyword
        //
        String str1 = "value one";
        String str2 = str1;

        // only with immutable objects like String
        str2 = "Value two"; // ome thing as str2 = new String("Value two");



        System.out.println(str1);
        System.out.println(str2);
    }
}
