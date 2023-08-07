public class Singer extends Person {

    private String brandName;

    public Singer(String name, String designation,String brandName) {
        super(name, designation);
        this.brandName=brandName;
    }

    public void learn() {
        System.out.println("learn");
    }

    public void walk() {
        System.out.println("walk");
    }
    public void eat() {
        System.out.println("eat");
    }

    public void singing() {
        System.out.println("singing");
    }
    public void playGitar() {
        System.out.println("playGitar");
    }
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}

