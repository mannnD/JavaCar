public class Hello {
    public static void main(String [] args)
    {
        System.out.println("Hello World");
        Car x = new Car();
        x.setName("Himalaya");
        System.out.println(x.getName());
        x.setYear("2021");
        System.out.println(x.getYear());
        System.out.println(x.model());
    }
}
