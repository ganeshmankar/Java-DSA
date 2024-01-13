public class Main {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //These are enum constants
        //Public, static and final
        //Since its final you can create child enums
        //type is Week


        Week() {
            //this is not public or protected
            //why? we don't want to create new objects
            //this in not enum concept that's why

            //Internally its lie -> public static final Week Monday = new Week();
            System.out.println("Constructor calling for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hey, how are you?");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));
//        System.out.println(week);
//
//        for( Week day : Week.values()){
//            System.out.println(day);
//        }

    }
}