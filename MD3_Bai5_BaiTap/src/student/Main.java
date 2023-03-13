package student;

public class Main {
    public static void main(String[] args) {

    Student test = new Student();
    System.out.println("In ra tên học sinh "+ test.getName());
    System.out.println("In ra Lớp :"+test.getClasser());
    test.setName(" mến ");
    System.out.println("In ra tên học sinh "+ test.getName());
    test.setClasser(" ABC ");
    System.out.println("In ra Lớp :"+test.getClasser());
    }
}
