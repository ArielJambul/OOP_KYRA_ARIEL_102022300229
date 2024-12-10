import java.time.LocalDate;

public class Task {
    // TO DO: Lengkapi atribut-atribut private kelas Task
    private final LocalDate dueDate;
    private String title;
    private String priority;
    private String status;

    // TO DO: Buat constructor untuk kelas Task
    public Task (String status, String title, String priority, LocalDate dueDate) {
        this.dueDate = dueDate;
        this.title = title;
        this.priority = priority;
        this.status = status;
    }
    // TO DO: Buat getter untuk title
    public String title() {
        return title;
    }

    // TO DO: Buat getter untuk priority
    public String priority() {
        return priority;
    }

    // TO DO: Buat getter untuk dueDate
    public LocalDate dueDate(){
        return dueDate;
    }

    // TO DO: Buat getter untuk status
    public String status() {
        return status;
    }
    
    // TO DO: Buat setter untuk status
    public void setStatus(String status) {
        this.status = status;
    }
}