package module3.homework.hw_3_3;

import java.util.Date;

public class Course {
    private Date starDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Course(Date starDate, String name) {
        this.starDate = starDate;
        this.name = name;
    }

    public Course(int hoursDuration, String name, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.name = name;
        this.teacherName = teacherName;
    }

    public Date getStarDate() {
        return starDate;
    }

    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
