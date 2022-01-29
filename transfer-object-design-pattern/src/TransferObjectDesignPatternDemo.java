public class TransferObjectDesignPatternDemo {

    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();

        System.out.println("Loading details of all students from dataBase");
        studentBO.getAllStudents();

        StudentVO studentVO = new StudentVO(1,"Radhika");
        studentBO.updateStudent(studentVO);

        System.out.println("Updated student detail for roll " + studentVO.getRoll());
        System.out.println(studentBO.getStudent(studentVO.getRoll()));

        System.out.println("Deleting student with roll no " + studentVO.getRoll());
        studentBO.deleteStudent(studentVO.getRoll());

        System.out.println("Loading details of all students from dataBase");
        studentBO.getAllStudents();

    }
}
