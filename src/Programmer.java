public class Programmer extends Employee {

    public Programmer(String name, TaskProgressCallback callback) {
        super(name, callback, Task.Status.READY_TO_GO);
    }

    @Override
    public Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                task.getDescription(),
                Task.Status.TEST,
                task.getDesignLink(),
                getBuildLink(task)
        );
    }

    private String getBuildLink(Task task) {
        return "https:/git.com/ourProject/task?id=" + task.getId();
    }
}
