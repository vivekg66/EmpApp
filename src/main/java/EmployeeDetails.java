import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDetails {

    private int empId;
    private String empName;
    private String empEmail;
    private String empAddress;
    private long empNumber;
   private EmpAccountDetails empAccountDetails;
   private EmpLeaves empLeaves;

}
