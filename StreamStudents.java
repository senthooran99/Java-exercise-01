import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStudents {
    public static void main(String[] args) {

        //Print upper cases names in sorted order
        List<Student> StudentList = StudentsList();
        List<String> studentNames = StudentList.stream().map(e -> e.getName()).sorted()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(studentNames);

        //Registration no starts with 2019
        List<String> studentRegNo = StudentList.stream().map(e -> e.getRegNo())
                .filter(s -> s.startsWith("2019"))
                .collect(Collectors.toList());
        System.out.println();
        System.out.println(studentRegNo);

    }
    public static List<Student> StudentsList() {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("senthooran S.", "2019/E/132");
        Student student2 = new Student("Jathavan M.", "2019/E/009");
        Student student3 = new Student("Kabilan M.", "2018/E/011");
        Student student4 = new Student("Thuva V.", "2018/E/012");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        return students;
    }
}