package in.Learning.Polymorphism.Keyword.Super;

public abstract class SuperKeyword {

    private int noOftries;
    SuperKeyword(){
        this.noOftries = 0;
    }

    public SuperKeyword(int noOfTries) {
        this.noOftries = noOfTries;
    }

    public int getNoOftries() {
        return noOftries;
    }
    public abstract void Learning();
}
