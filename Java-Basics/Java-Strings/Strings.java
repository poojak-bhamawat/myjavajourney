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
    }
}