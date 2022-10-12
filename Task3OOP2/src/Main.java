import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<String> passedCourses = new ArrayList<>();
        passedCourses.add("Math");
        passedCourses.add("English");
        passedCourses.add("Biology");

        ArrayList<String> passedCourses2 = new ArrayList<>();
        passedCourses2.add("Math");
        passedCourses2.add("English");
        passedCourses2.add("Biology");
        passedCourses2.add("java 1.0");

        ArrayList<String> canTeach = new ArrayList<>();
        canTeach.add("Math");
        canTeach.add("English");
        canTeach.add("Biology");
        canTeach.add("java 1.0");

        ArrayList<String> canTeach2 = new ArrayList<>();
        canTeach.add("Biology");

        Student adam = new Student("Adam", passedCourses2);
        Student oliver = new Student("Oliver", passedCourses);
        Student sebastian = new Student("Sebastian", passedCourses2);

        Teacher jorg = new Teacher("jorg", canTeach);
        Teacher tess = new Teacher("tess", canTeach2);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(adam);
        persons.add(oliver);
        persons.add(sebastian);
        persons.add(tess);
        persons.add(jorg);

        for (Person p : persons) {
            if (!p.addCourse("java 1.0")) {
                System.out.print(p.getName());
                if (p instanceof Student) {
                    System.out.println(" Student has already passed this class.");

                }
                else{
                    System.out.println(" Can't teach this class.");
                }
                }

            }

        }
    }