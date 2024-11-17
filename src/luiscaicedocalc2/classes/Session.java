package luiscaicedocalc2.classes;

import java.util.List;
import java.time.LocalDate;

/**
 * @author Luis Carlos Caicedo Giraldo
 */
public class Session {
    private String username;
    private LocalDate creationDate;
    private List<Operation> operations;

    public Session() {}
    
    public Session(String username, LocalDate creationDate) {
        this.username = username;
        this.creationDate = creationDate;
    }
    
     public Session(String username, LocalDate creationDate, List<Operation> operations) {
        this.username = username;
        this.creationDate = creationDate;
        this.operations = operations;
    }

    public String getUsername() { return this.username; }
    public void setUsername(String username) { this.username = username; }

    public LocalDate getCreationDate() { return this.creationDate; }
    public void setCreationDate(LocalDate creationDate) { this.creationDate = creationDate; }

    public List<Operation> getOperations() { return this.operations; }
    public void setOperations(List<Operation> operations) { this.operations = operations; }

    @Override
    public String toString() {
        return "Session{" + "username=" + this.username + ", creationDate=" + this.creationDate + ", operations=" + this.operations + '}';
    }
}
