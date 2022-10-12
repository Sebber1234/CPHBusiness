import java.util.ArrayList;

public class Teacher extends Person {

    ArrayList<String> canTeach = new ArrayList<>();

    ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }


    @Override
    boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            currentCourses.add(course);
            return true;
        }
    else{

        return false;
        }
    }
}
