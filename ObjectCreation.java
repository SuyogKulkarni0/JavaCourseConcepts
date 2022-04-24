class ObjectCreation {
    static ObjectCreation obj; // Creating a global static object
    static {
        System.out.println(obj);
        obj = new ObjectCreation();
    }

    public static void main(String[] args) {
        System.out.println(obj);
    }
}