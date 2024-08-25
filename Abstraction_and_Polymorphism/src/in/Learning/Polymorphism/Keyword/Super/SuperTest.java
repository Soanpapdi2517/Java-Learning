package in.Learning.Polymorphism.Keyword.Super;

public class SuperTest extends SuperKeyword{
    SuperTest(){
        super(4);
    }

    @Override
    public void Learning() {
        System.out.println(super.getNoOftries());
        System.out.println("Learning Super keyword");
    }

    public static void main(String[] args) {
        SuperTest st = new SuperTest();
        st.Learning();
    }
}
