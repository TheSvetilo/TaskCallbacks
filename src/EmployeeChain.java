public class EmployeeChain {

    private Employee currentEmployee;
    private EmployeeChain nextEmployee;

    public EmployeeChain(Employee employee) {
        this.currentEmployee = employee;
    }

    public void setNextEmployee(EmployeeChain employee) {
        this.nextEmployee = employee;
    }

    public void doTask(Task task) {
        if (task.getTaskStatus() == currentEmployee.getTaskStatus()) {
            currentEmployee.doTask(task);
        } else if (nextEmployee != null) {
            nextEmployee.doTask(task);
        } else {
            throw new IllegalArgumentException("Task can't be handled");
        }
    }
}
