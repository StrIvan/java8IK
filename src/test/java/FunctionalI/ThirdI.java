package FunctionalI;


@FunctionalInterface
public interface ThirdI {
    String checkSomething3(String sex, int howMuch, String word);


    static ThirdI personaCheck() {
        return (sex, weight, name) -> {
            System.out.println("Name is " + name);
            System.out.println("Sex is " + sex);
            return String.valueOf((weight));
        };
    }
}
