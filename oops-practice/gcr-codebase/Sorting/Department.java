package SortingAlgo;

public class Department {
    private DepartmentType departmentType;

    public Department(DepartmentType departmentType) {
        this.departmentType = departmentType;
    }
    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(DepartmentType departmentType) {
        this.departmentType = departmentType;
    }

    @Override
    public String toString() {
        return departmentType.toString();
        
    }
}