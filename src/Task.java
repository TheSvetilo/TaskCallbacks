public class Task {

    private int id;
    private String description;
    private Status status;
    private String designLink;
    private String buildLink;

    public Task(int id, String description, Status status, String designLink, String buildLink) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.designLink = designLink;
        this.buildLink = buildLink;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDesignLink() {
        return designLink;
    }

    public String getBuildLink() {
        return buildLink;
    }

    public Status getTaskStatus() {
        return this.status;
    }

    enum Status {
        OPEN,
        READY_TO_GO,
        TEST,
        CLOSED
    }
}
