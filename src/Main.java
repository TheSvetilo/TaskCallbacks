public class Main {

    public static void main(String[] args) {

        TaskFactory factory = new TaskFactory();
        factory.showTasks();

        TaskProgressCallback callback = new TaskProgressCallback() {
            @Override
            public void updateTask(Task task) {
                factory.updateTask(task);
            }
        };

        EmployeeChain currentEmployee = new EmployeeChain(new Designer("Anna", callback));
        EmployeeChain nextEmployee = new EmployeeChain(new Programmer("Vlad", callback));
        EmployeeChain lastEmployee = new EmployeeChain(new Tester("Arch", callback));

        currentEmployee.setNextEmployee(nextEmployee);
        nextEmployee.setNextEmployee(lastEmployee);

        while (true) {
            currentEmployee.doTask(factory.getTask());
            factory.showTasks();
        }
    }

}
