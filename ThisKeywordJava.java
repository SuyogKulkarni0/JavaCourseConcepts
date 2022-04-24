public class ThisKeywordJava {
    int a;

    ThisKeywordJava() {
        System.out.println(this);// this point to the reference of the object
        // created here so it will have address of that particular object stored in it.
    }

    public static void main(String[] args) {
        new ThisKeywordJava();
        new ThisKeywordJava();

    }

}
