package duke.task;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    protected String description;
    protected boolean isDone;
    protected String type;
    protected LocalDate period;

    /**
     * Constructor of duke.task.Task
     * @param description description of the duke.task
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Get period
     * @return date in "MMM d yyyy"
     */
    public String getPeriod() {
        return period.format(DateTimeFormatter.ofPattern("MMM d yyyy"));
    }

    /**
     * Get status icon
     * @return status icon
     */
    public String getStatusIcon() {
        return isDone? "\u2713" : "\u2718";
    }

    /**
     * Get status of the duke.task
     * @return duke.task status
     */
    public boolean getStatus() {
        return isDone;
    }

    /**
     * Set status to done
     */
    public void setStatusDone() {
        this.isDone = true;
    }

    /**
     * Set status to not done
     */
    public void setStatusNotDone() {
        this.isDone = false;
    }

    /**
     * Get the description of the duke.task
     * @return description of the duke.task
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the duke.task type
     * @return type of the duke.task
     */
    public String getType() {
        return type;
    }

    /**
     * Return status icon and description of the duke.task
     * @return status icon and description
     */
    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + getDescription();
    }
}
