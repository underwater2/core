package hello.core.singleton;

public class SingletonService {
    // 싱글톤 패턴을 적용한 예제 코드

    // 해당 class의 인스턴스가 단 하나만 있어야하기 때문에 인스턴스를 static으로 선언 (자바가 뜰 때 생성됨)
    private static final SingletonService instance = new SingletonService();

    // 이 객체 인스턴스가 필요하면 오직 이 메서드로만 조회할 수 있다. 호출하면 항상 같은 인스턴스를 반환한다.
    public static SingletonService getInstance() {
        return instance;
    }

    // 다른 클래스에서
    // SingletonService singletonService = new SingletonService();
    // 하지 못하도록 private 생성자를 만들어준다.
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
