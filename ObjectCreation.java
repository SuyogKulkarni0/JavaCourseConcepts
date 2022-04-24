class ObjectCreation {
    static ObjectCreation obj; // Creating a global static object
    int a;
    static {
        System.out.println(obj);
        obj = new ObjectCreation();
    }

    public static void main(String[] args) {
        System.out.println(obj);
        ObjectCreation obj2 = new ObjectCreation(); // creating a object with local variable
        System.out.println(obj2.a = 100); // Assigning value to a non-static variable using a object
    }

}