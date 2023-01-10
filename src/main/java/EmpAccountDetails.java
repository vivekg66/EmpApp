import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpAccountDetails {
    private long empAccountNum;
    private long empAdhaarNum;
    private String empPanNum;
    private EmpLeaves empLeaves;

}
