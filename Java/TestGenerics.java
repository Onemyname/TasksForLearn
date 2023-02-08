public class TestGenerics {
    public static void main(String[] args) {
        ValueObject object1 = new ValueObject<>(false);
        object1.printValueToConsole();
        System.out.println(object1.isValue());

        ValueObject object2 = new ValueObject<>(42f);
        object2.printValueToConsole();
        System.out.println(object2.isValue());
    }
}

class ValueObject<T> {
    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    private T name;


    public ValueObject(T name) {
        this.name = name;
    }

    public void printValueToConsole() {
        System.out.println(getName());
    }

    public Class<?> isValue() {
        return this.name.getClass();
    }
}
