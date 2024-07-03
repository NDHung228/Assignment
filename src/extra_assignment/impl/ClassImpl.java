package extra_assignment.impl;

import extra_assignment.enumeration.StatusStudent;
import extra_assignment.model.ClassStudent;
import extra_assignment.model.Student;
import extra_assignment.model.StudentLeaving;
import extra_assignment.model.Teacher;
import extra_assignment.service.ClassService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import static extra_assignment.constant.ApplicationConstant.*;

public class ClassImpl implements ClassService {

     List<Teacher> listTeacher;
    List<ClassStudent> listClass;

    public ClassImpl() {
        listTeacher = new ArrayList<>();
        listClass = new ArrayList<>();
    }


    @Override
    public void addClass(ClassStudent c) {

        if (listClass.size() >= MAX_CLASS) {
            System.out.println("Can't add class because " + MAX_CLASS + " classes in a school");

            return;
        }

        if (c.getMaxStudent() > MAX_STUDENT_IN_CLASS) {
            System.out.println("Can't create a class more than " + MAX_STUDENT_IN_CLASS + " students");
        }

        listClass.add(c);
        System.out.println("Add class success: " + c.toString());
    }

    @Override
    public void deleteClass(ClassStudent c) {
        listClass.remove(c);
        System.out.println("Delete class success: " + c.toString());
    }

    @Override
    public void dropStudentInClass(int idStudent, int idClass, String reason) {
        ClassStudent classStudent = listClass.get(idClass);

        StudentLeaving studentLeaving = null;

        // get student want to drop based on idClass
        for (Student std : classStudent.getStudents()) {
            if (std.getId() == idStudent) {
                studentLeaving = (StudentLeaving) std;
                break;
            }
        }

        if (studentLeaving == null) {
            System.out.println("Don't find student with id " + idStudent);
            return;
        }

        // update status and reason of student leaving
        studentLeaving.setReason(reason);
        studentLeaving.setStatusStudent(StatusStudent.Leaving);

    }

    @Override
    public void addStudent(Student s, int idClass) {
        ClassStudent classStudent = getClassStudentById(idClass);

        if (classStudent == null) {
            return;
        }

        if (classStudent.getStudents().size() >= MAX_STUDENT_IN_CLASS) {
            System.out.println("Can't add student in classID " + classStudent.getId() + "because " + MAX_STUDENT_IN_CLASS + " students in a class");
            return;
        }
        if (!checkAgeStudent(s.getBirthDay())) {
            System.out.println("Student don't enough age to join this class");
            return;
        }

        classStudent.addStudent(s);
        checkStatusOfClass(classStudent);
        System.out.println("Add student success: "+s.toString());
    }

    @Override
    public void editStudent(int idStudent, Student studentUpdate) {
        for (ClassStudent classStudent : listClass) {
            for (Student student : classStudent.getStudents()) {
                if (student.getId() == idStudent) {
                    System.out.println("This is information of old student: " + student.toString());
                    student = studentUpdate;
                    System.out.println("This is information of updated student: " + studentUpdate.toString());
                }
            }
        }
    }

    @Override
    public void printStudentsOfTeacher(int idTeacher) {
        Teacher teacher = getTeacherById(idTeacher);
        if (teacher == null) {
            return;
        }
        System.out.println("Printing students of teacher " + getTeacherById(idTeacher));


        for (ClassStudent classStudent : teacher.getClassStudents()) {
            for (Student student : classStudent.getStudents()) {
                System.out.println(student);
            }
        }
    }

    @Override
    public void addTeacherToClass(Teacher t, int idClass) {
        ClassStudent classStudent = getClassStudentById(idClass);

        // check class exist in school
        if (classStudent == null) {
            return;
        }


        Teacher teacher = getTeacherById(t.getIdTeacher());

        if(teacher != null) {
            if(teacher.getClassStudents() != null) {
                for(ClassStudent cs : teacher.getClassStudents()) {
                    if (cs.getId() == idClass) {
                        System.out.println("This teacher are teaching this class");
                        return ;
                    }
                }
            }



        }


        // check enough number of teacher in class

        listTeacher.add(t);
        t.addClassStudent(getClassStudentById(idClass));
        System.out.println("Add teacher " + t.getName()+" success in classID: " + idClass);

    }

    @Override
    public void printAllTeacherInSchool() {
        listTeacher.forEach(System.out::println);
    }


    private ClassStudent getClassStudentById(int id) {
        for (ClassStudent cs : listClass) {
            if (cs.getId() == id) {
                return cs;
            }
        }
        return null;
    }

    private Teacher getTeacherById(int id) {
        for (Teacher t : listTeacher) {
            if (t.getIdTeacher() == id) {
                return t;
            }
        }
        return null;
    }

    // update status of student if class enough student
    private void checkStatusOfClass(ClassStudent classStudent) {
        if (classStudent.getStudents().size() == MAX_STUDENT_IN_CLASS) {
            for (Student s : classStudent.getStudents()) {
                s.setDateOfOpening(LocalDate.now());
                s.setStatusStudent(StatusStudent.Studying);
            }
        }
    }

    private boolean checkAgeStudent(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();

        int age = Period.between(birthDate, currentDate).getYears();

        // check age of student
        return age >= MINI_AGE_STUDENT && age <= MAX_AGE_STUDENT;
    }


}
