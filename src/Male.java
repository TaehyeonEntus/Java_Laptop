public class Male extends Human implements Moves{
    @Override
    public void run() {
        info();
        System.out.println("남성이 뜁니다.");
    }
    @Override
    public void walk() {
        info();
        System.out.println("남성이 걷습니다.");
    }
    Male(String name, int age){
        this.name = name;
        this.age = age;
    }
}
