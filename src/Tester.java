public class Tester extends Employee {

    public Tester(String name, TaskProgressCallback callback) {
        super(name, callback, Task.Status.TEST);
    }

    @Override
    public Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                task.getDescription(),
                Task.Status.CLOSED,
                task.getDesignLink(),
                task.getBuildLink()
        );
    }
}
