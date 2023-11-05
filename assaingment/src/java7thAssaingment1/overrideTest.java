package java7thAssaingment1;

public class overrideTest {
    public static void main(String[] args) {
        superComputer supcomputer=new superComputer();
        supcomputer.work();
        System.out.println(supcomputer.a);
        serverComputer sercomputer=new serverComputer();
        sercomputer.work();
    }
}
