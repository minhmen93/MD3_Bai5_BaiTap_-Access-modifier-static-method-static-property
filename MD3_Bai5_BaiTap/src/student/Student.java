package student;

public class Student {
    private String name = "Jonh";
   private   String classer = "CO2";
    public Student(){

    }

    public Student(String name, String classer) {
        this.name = name;
        this.classer = classer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasser() {
        return classer;
    }

    public void setClasser(String classer) {
        this.classer = classer;
    }
}
