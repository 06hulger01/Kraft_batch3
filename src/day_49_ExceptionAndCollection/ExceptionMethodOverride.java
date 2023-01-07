package day_49_ExceptionAndCollection;

public class ExceptionMethodOverride {

    public void methodParent(){};

    public void methodParent2() throws Exception{};

}
class child extends ExceptionMethodOverride{

    @Override
    public void methodParent() throws ArithmeticException{}//it can declare unchecked exception

    @Override
    public void methodParent2() throws ArithmeticException{}//same-subclass class-no exception
}

