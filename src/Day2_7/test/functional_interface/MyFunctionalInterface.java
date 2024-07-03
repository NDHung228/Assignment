package Day2_7.test.functional_interface;

@FunctionalInterface
public interface MyFunctionalInterface {
    void timX(int x);

    // Overriding toString method from Object class
    @Override
    String toString();

    // Overriding equals method from Object class
    @Override
    boolean equals(Object obj);

}
