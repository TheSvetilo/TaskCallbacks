public class TaskFactory {

    private static final int SIZE = 5;
    private Task[] tasks;

    public TaskFactory() {
        tasks = new Task[SIZE];
        for (int i = 0; i < SIZE; i++) {
            tasks[i] = new Task(
                    i,
                    "Task description: #" + i,
                    Task.Status.OPEN,
                    "",
                    ""
            );
        }
    }

    public Task getTask() {
        Task result = null;
        for (Task task : tasks) {
            if (task.getTaskStatus() != Task.Status.CLOSED) {
                result = task;
                break;
            }
        }
        if (result == null) {
            result = tasks[0];
        }
        return result;
    }

    public void showTasks() {
        System.out.println("--- Task Info ---");
        for (Task task : tasks) {
            System.out.println("Task #" + task.getId() + ". " + task.getDescription() +
                    ". \nDesign link: " + task.getDesignLink() + ". Build link " + task.getBuildLink() + ".");
        }
    }

    public void updateTask(Task task) {
        for (int i = 0; i < SIZE; i++) {
            if (tasks[i].getId() == task.getId()) {
                tasks[i] = task;
                break;
            }
        }
    }
}
