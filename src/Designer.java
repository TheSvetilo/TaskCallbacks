public class Designer extends Employee {

    public Designer(String name, TaskProgressCallback callback) {
        super(name, callback, Task.Status.OPEN);
    }

    @Override
    public Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                task.getDescription(),
                Task.Status.READY_TO_GO,
                getDesignLink(task),
                ""
        );
    }

    private String getDesignLink(Task task) {
        return "https://figma.com/ourProject/mockup?id=" + task.getId();
    }
}

