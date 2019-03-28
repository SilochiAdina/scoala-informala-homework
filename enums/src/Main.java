public class Main {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }
        Season summer = Season.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            default:
                System.out.println("Is it summer yet?");
        }

    }
}
//public static void main(String[] args) {
//    System.out.println(getSeason(Months.APRIL));
//    private static Season getSeason(Months );
//    switch (Months){
//        case DECEMBER;
//        case JANUARY;
//        case FEBRUARY;
//        return Season.WINTER;
//
//    }
////    for (Months months : Months.values()){
////        System.out.println(months.name()+" "+ months.ordinal());
////    }
//
//}
//
//    private static boolean getSeason(Months april) {
//    }
//}