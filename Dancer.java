public class Dancer extends Person {

        private String GroupName;

        public void learn() {
            System.out.println("learn");
        }

        public void walk() {
            System.out.println("walk");
        }

        public void coding() {
            System.out.println("dancing");
        }

        public void eat() {
            System.out.println("eat");
        }

    public Dancer(String name, String designation,String groupName) {

        super(name, designation);
        this.GroupName=groupName;
    }
    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }
}
