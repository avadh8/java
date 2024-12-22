class University{

    private String universityName;

    public University(String universityName) {
        this.universityName = universityName;
    }

    class Department{

        private String departmentName;
        private String departmentHead;

        public Department(String departmentName, String departmentHead) {
            this.departmentName = departmentName;
            this.departmentHead = departmentHead;
        }

        public void displayDepartmentDetail(){
            System.out.println("University: " + universityName);
            System.out.println("Department: " + departmentName);
            System.out.println("Head of Department: " + departmentHead);
        }
    }
}


public class InnerClassEx {

    public static void main(String[] args) {

        University u = new University("GTU");

        University.Department it = u.new Department("IT","damu");
        University.Department cs = u.new Department("CS", "avadh");

        cs.displayDepartmentDetail();
        System.out.println();
        it.displayDepartmentDetail();
    }
}
