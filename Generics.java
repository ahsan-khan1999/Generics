public class Generics {
    public static void main(String[] args){

        TestGenerics<Integer> testGenerics = new TestGenerics<>(1);
        System.out.println(testGenerics.getT());
        testGenerics.setT(2);
        TestGenerics.display();
        TestGenerics<String> testGenericsI = new TestGenerics<>("t");

        System.out.println(testGenericsI.getT());
        testGenericsI.setT("as");
        TestGenerics.display();


    }
}
