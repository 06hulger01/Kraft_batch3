package day_41_inheritanceAndAccesModifier;

public class ChildClass extends ParentClass {
    int z=5;


    public void metotChild(){
        int z=50;
        System.out.println(this.z);
       // parentStaticMethod();
    }
}
