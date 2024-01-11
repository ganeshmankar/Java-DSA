public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Daughter daughter = new Daughter(30);
//        Parent daughter1 = new Daughter(30);

        daughter.career();

//        Parent mom = new Parent(45);
// Cannot create objects like this of Abstract class

        Parent.hello();

    }
}
