public class Strings{
    public static void main(String[] args) {
        String name = "John Doe";
        String city = "New York";

        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("Doe"));
        System.out.println(name.charAt(7));
        System.out.println(name + city);
        System.out.println(name.concat(city));

        // Numbers and Strings
        int x = 10;
        int y = 20;
        int z = x + y; //z will be 30(an integer)

        String a = "10";
        String b = "20";
        String c = a + b; //c will be "1020"(a string)

        String p = "10";
        int q = 20;
        String r = p + q; //r will be "1020"(a string)
    }
}