package bean;

public class User {
    private String name;
    private Integer age;
    private Car car;

    public User() {
        System.out.println("我是空参构造方法！");
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private void init() {
        System.out.println("初始方法");
    }

    private void destroy() {
        System.out.println("销毁方法");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
