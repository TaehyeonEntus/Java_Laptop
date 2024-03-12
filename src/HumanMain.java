public class HumanMain {
    public static void main(String[] args) {
        Male taeHyeon = new Male("김태현",22);
        Female seongWon = new Female("지성원", 23);
        taeHyeon.run();
        taeHyeon.walk();
        seongWon.run();
        seongWon.walk();
    }
}
