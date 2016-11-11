package Module3.HomeWork.hw_3_3;

import java.util.Date;

class Solution {
    public static void main(String[] args) {
        Date starDate = new Date(20161020);

        Course course1 = new Course(6, "Java1", "Jack");
        Course course2 = new Course(5, "Java2", "Sarah");
        Course course3 = new Course(7, "Java3", "Mikel");
        Course course4 = new Course(starDate, "Java4");
        Course course5 = new Course(8, "Java5", "Bob");

        Course[] coursesArray = {course1};

        Student student1 = new Student("Oleg", "Franklin", 1);
        Student student2 = new Student("Maksimenko", coursesArray);

        CollegeStudent collegeStudent1 = new CollegeStudent("Alex", "Gotem", 2);
        CollegeStudent collegeStudent2 = new CollegeStudent("Haloween", coursesArray);
        CollegeStudent collegeStudent3 = new CollegeStudent("Bla", 91, 3);

        SpecialStudent SpecialStudent1 = new SpecialStudent("Mila", "Gardeeva", 2);
        SpecialStudent SpecialStudent2 = new SpecialStudent("Brave", coursesArray);
        SpecialStudent SpecialStudent3 = new SpecialStudent(983152645);
    }
}
