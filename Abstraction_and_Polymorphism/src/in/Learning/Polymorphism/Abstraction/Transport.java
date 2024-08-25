package in.Learning.Polymorphism.Abstraction;

public interface Transport {
    void transported();
    //Interfaces are commonly used to create contract based classes
    // it is same as Classes
    // interfaces are like grandparents which says "Mere jitne bhi bacche hoge sb me ye chiz honi chahiye jo bhi yaha me batau"
    //Interfaces are used to define functionality in a parent and further its child
    // if we define functionality on parent for example in this Vehicle class
    // it will automatically applies in its subclasses like Car and Bike.
    // and if we don't do that it will ask you to define in Car or Bike child classes

    // we can add multiple interfaces in java by using "implements" keyword,
    // but we can only add single parent class at a time by using "extend" keyword
}
