public class Programmer extends Person{

    private String companyName;

    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.companyName=companyName;
    }

    public void learn() {
        System.out.println("learn");
    }

    public void walk() {
        System.out.println("walk");
    }

    public void coding() {
        System.out.println("coding");
    }

    public void eat() {
        System.out.println("eat");
    }



    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        companyName = companyName;
    }
}