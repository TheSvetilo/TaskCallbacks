public class EmployeeChain {

    private Employee currentEmployee;
    private EmployeeChain nextEmployee;

    public EmployeeChain(Employee employee) {
        this.currentEmployee = employee;
    }

    public void setNextEmployee(EmployeeChain employee) {
        this.nextEmployee = employee;
    }

    public boolean doTask(Task task) {
        boolean result = false;
        if (currentEmployee.canHandleTask(task)) {
            currentEmployee.doTask(task);
            result = true;
        } else if (nextEmployee != null) {
            result = nextEmployee.doTask(task);
        }
        return result;
    }
}
