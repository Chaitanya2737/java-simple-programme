package opps;
public class inheritance {
    public static void main(String[] args) {
        // parents p = new parents();
        // p.skills();
        child2 c2 = new child2();
        c2.show();
    }
}

/**
 * Innerinhertance
 */
class parents {
    Integer skills = 10;
    String perfect = "java";

    public void skills() {
        System.out.println(skills + " " + perfect);
    }

}

class child1 extends parents {
    String perfect1 = "python";

    protected void show() {
        System.out.println(skills + " " + perfect + " " + perfect1);
    }

}


class child2 extends child1{
     String perfect2 = "javascript";
       protected void show() {
        System.out.println(skills + " " + perfect + " " + perfect1+  " "+ perfect2);
    }
}