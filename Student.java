class Student {

    String name = "Yash Narote";
    int rollNo = 1;

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
