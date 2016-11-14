package Module3.HomeWork.hw_3_3;

import java.util.Date;

class Solution {
    public static void main(String[] args) {
        Course course1 = new Course(6, "Java1", "Jack");
        Course course2 = new Course(5, "Java2", "Sarah");
        Course course3 = new Course(7, "Java3", "Mikel");
        Course course4 = new Course(8, "Java5", "Bob");
        Course course5 = new Course(new Date(1476991800), "Java5");

        Course[] coursesArray = {course1};

        Student student1 = new Student("Oleg", "Franklin", 1);
        Student student2 = new Student("Maksimenko", coursesArray);

        CollegeStudent collegeStudent1 = new CollegeStudent("Alex", "Gotem", 2);
        CollegeStudent collegeStudent2 = new CollegeStudent("Haloween", coursesArray);
        CollegeStudent collegeStudent3 = new CollegeStudent("Bla", "blablov", 5, "NAU", 3, 1);

        SpecialStudent SpecialStudent1 = new SpecialStudent("Mila", "Gardeeva", 2);
        SpecialStudent SpecialStudent2 = new SpecialStudent("Brave", coursesArray);
        SpecialStudent SpecialStudent3 = new SpecialStudent("Galia", "Dontre", 2, 983152645);
    }
}
