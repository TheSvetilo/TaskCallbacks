public abstract class Employee {

    private String name;
    private Task.Status taskStatus;
    private TaskProgressCallback callback;

    public Employee(String name, TaskProgressCallback callback, Task.Status status) {
        this.name = name;
        this.taskStatus = status;
        this.callback = callback;
    }

    public void doTask(Task task) {
        System.out.println(name + " are doing the task #" + task.getId());
        callback.updateTask(getTaskWhenDone(task));
    }

    public abstract Task getTaskWhenDone(Task task);

    public Task.Status getTaskStatus() {
        return taskStatus;
    }

    public boolean canHandleTask(Task task) {
        return taskStatus == task.getTaskStatus();
    }
}
