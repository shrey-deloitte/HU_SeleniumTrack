import java.io.*;
import java.util.*;


public class Student_Records {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new FileReader("C:\\Users\\shredeshpande\\Documents\\Students_Records.csv"));
            int i = 0;
            ArrayList<Student> students = new ArrayList<>();
            while (scan.hasNext()) {
                String[] str = scan.nextLine().split(",");
                if (i != 0) {
                    students.add(new Student(str[0], str[1], str[2], str[3], Integer.parseInt(str[4])));

                }
                i++;


            }
            Collections.sort(students, (a, b)-> a.getRank()-b.getRank());
            SelectedStudent(students);

            System.out.println("Successful!");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
    public static void SelectedStudent(ArrayList<Student> students) {
        try {
            PrintWriter writer = new PrintWriter(new File("C:\\Users\\shredeshpande\\Documents\\SelectedStudent.csv"));
            StringBuilder builder = new StringBuilder();
            builder.append("Name,").append("Class 10,").append("Class 12,").append("Btech,").append("Rank\n");
            for (int i = 0; i < Math.min(5, students.size()); i++) {
                builder.append(students.get(i).toString()).append("\n");
            }
            writer.write(builder.toString());
            writer.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}

class Student {
    private String name, regNo10, regNo12, btechRegNo;
    private int rank;

    public Student(String name, String regNo10, String regNo12, String btechRegNo, int rank) {
        this.name = name;
        this.regNo10 = regNo10;
        this.regNo12 = regNo12;
        this.btechRegNo = btechRegNo;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getRegNo10() {
        return regNo10;
    }

    public String getRegNo12() {
        return regNo12;
    }

    public String getBtechRegNo() {
        return btechRegNo;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return name + "," + regNo10 + "," + getRegNo12() + "," + btechRegNo + "," + rank;
    }
}