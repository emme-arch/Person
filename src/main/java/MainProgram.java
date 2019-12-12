public class MainProgram {
    public static void main(String[] args) {
        Person person = new Person("Ryan", 30, "male", new String[]{"being a hard", "agile", "ssd hard drives"});
        String greeting = person.hello();
        System.out.println(greeting);
    }

}