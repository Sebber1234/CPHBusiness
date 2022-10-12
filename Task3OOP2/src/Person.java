public abstract class Person {


    private String name;

    public Person(String name){
        this.name = name;

    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    boolean addCCourse(String course){
        return true;
    }

    abstract boolean addCourse(String course);
}
