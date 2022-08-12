package FunctionalI;

@FunctionalInterface
public interface SecondI {
    boolean checkSomething2(String isOK, String isSuccess);

    static SecondI assertI() {
        return (str0, str1) -> str1.equals(str0);
    }
}
