public class Female extends Human implements Moves{
    @Override
    public void run() {
        info();
        System.out.println("여성이 뜁니다.");
    }
    @Override
    public void walk() {
        info();
        System.out.println("여성이 걷습니다.");
    }
    Female(String name, int age){
        this.name = name;
        this.age = age;
    }
}
