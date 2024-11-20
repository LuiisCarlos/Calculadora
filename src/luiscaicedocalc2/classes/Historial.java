package luiscaicedocalc2.classes;

import java.util.List;
import java.time.LocalDate;

/**
 * @author Luis Carlos Caicedo Giraldo
 */
public class Historial {
    private String username;
    private LocalDate creationDate;
    private Integer type;
    private List<Operation> operations;

    public Historial() {}
    
     public Historial(String username, LocalDate creationDate, Integer type, List<Operation> operations) {
        this.username = username;
        this.creationDate = creationDate;
        this.type = type;
        this.operations = operations;
    }

    public String getUsername() { return this.username; }
    public void setUsername(String username) { this.username = username; }

    public LocalDate getCreationDate() { return this.creationDate; }
    public void setCreationDate(LocalDate creationDate) { this.creationDate = creationDate; }

    public Integer getType() { return type; }
    public void setType(Integer type) { this.type = type; }
    
    public List<Operation> getOperations() { return this.operations; }
    public void setOperations(List<Operation> operations) { this.operations = operations; }

    @Override
    public String toString() {
        return "Session{" + "username=" + username + ", creationDate=" + creationDate + ", type=" + type + ", operations=" + operations + '}';
    }
}
