package RT;
public class ClassKill {
    private String name;
    private int age;



    public ClassKill(String name, int age) {
        this.name = name;
        this.age = age;
    }  

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        return "Luiz come: " + age + ", Gosta de pessoas com nome: " + name ;
    }   

}
