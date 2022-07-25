package yourname.assingment.main;
import yourname.assignment.data.A;
import yourname.assignment.singleton.ContructorInitialized;

public class MainCLass {

    public static void main(String[] args) {
        A obj =new A();
        //global variables which can get default values.
        obj.disp();
        //local variables which are not initialized and does not get any default values.
        obj.show();
        //static methods can only access static variables.
        ContructorInitialized obj1 = new ContructorInitialized("ankit");
        obj1.acessVariable("ankit");
        obj1.print();

    }

}