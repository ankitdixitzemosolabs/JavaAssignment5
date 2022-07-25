package yourname.assignment.singleton;
public class ContructorInitialized{
    static String str;
    public ContructorInitialized(String otherStr){
        str=otherStr;
    }

    public static ContructorInitialized acessVariable(String s) {
        //static methods can only access static variables;
        str=s;
       ContructorInitialized sc = new ContructorInitialized(s);
  //        sc.str=s;
        return sc;
    }
    public static void print() {
        //get error bcz this is not static method
        System.out.println(str);
    }


}