import java.util.ArrayList;
import java.util.List;

public class StudentBO {

    List<StudentVO> students;

    public StudentBO() {
        this.students = new ArrayList<>();
        students.add(new StudentVO(1,"Robert"));
        students.add(new StudentVO(2,"Alex"));
    }

    public void deleteStudent(int roll){
        students.remove(roll-1);
    }

    public void addStudent(StudentVO student) {
        students.add(student);
    }

    public void updateStudent(StudentVO student) {
        StudentVO studentVO = students.get(student.getRoll()-1);
        studentVO.setName(student.getName());
        studentVO.setRoll(student.getRoll());
    }

    public void getAllStudents() {
        for(StudentVO studentVO : students) {
            System.out.println(studentVO);
        }
    }

    public StudentVO getStudent(int roll) {
        return students.get(roll-1);
    }
}
