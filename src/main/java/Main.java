import java.io.PrintStream;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

//        "{}|[]|()", ""


        StudentBuilder studentBuilder = new StudentBuilder();

        studentBuilder.id = "";
        System.out.println(studentBuilder);
        PrintStream logger = System.out;

        logger.print(MessageFormat
                .format("Test info {0} and {1}\n", 1, 2));

        StudentBuilder studentBuilder1 = new StudentBuilder()
                .setArr(null)
                .setChildren(5)
                .setDob(new Date());

        Student student = studentBuilder1
                .build();

        Student student2 = studentBuilder1
                .build();

        System.out.println(UUID.randomUUID().toString());

    }

    public static class Student {

        static int counter;

        String id;
        String name;
        Date dob;
        int children;
        int[] arr;
    }


    public static class StudentBuilder {

        String id;
        String name;
        Date dob;
        Date dateOfCreation;
        int children;
        int[] arr;

        public Student build() {
            Student student = new Student();
            student.id = UUID.randomUUID().toString();
//            student.dateOfCreation =
            return student;
        }

        public String getId() {
            return id;
        }

        public StudentBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Date getDob() {
            return dob;
        }

        public StudentBuilder setDob(Date dob) {
            this.dob = dob;
            return this;
        }

        public int getChildren() {
            return children;
        }

        public StudentBuilder setChildren(int children) {
            this.children = children;
            return this;
        }

        public int[] getArr() {
            return arr;
        }

        public StudentBuilder setArr(int[] arr) {
            this.arr = arr;
            return this;
        }

        @Override
        public String toString() {
            return MessageFormat
                    .format("Student'{'id=''{0}'', name=''{1}'', dob={2}, children={3}, arr={4}'}'",
                            id, name, dob, children, Arrays.toString(arr));
        }
    }


}
