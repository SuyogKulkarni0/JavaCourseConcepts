public class ReferencingInStaticMethod {
    static ReferencingInStaticMethod obj = new ReferencingInStaticMethod();
    // creating a static global object and assigning a address using new variable
    static {
        System.out.println(ReferencingInStaticMethod.obj);
        // Printing the previously i.e globally assigned address
        obj = ReferencingInStaticMethod.Init();
        // Calling Static method and reassigning the address
    }

    public static void main(String[] args) {
        System.out.println(obj);
    }

    static ReferencingInStaticMethod Init() {
        return new ReferencingInStaticMethod();
        // returning the newly created address
    }

}
