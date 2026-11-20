class Encapsulation {

    private int age = 20;

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        System.out.println("Age: " + obj.getAge());
    }
}
