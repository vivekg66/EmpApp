public class Main {
    public static void main(String[] args) {


        EmpLeaves empLeaves1 = new EmpLeaves(2,10);
        EmpAccountDetails empAccountDetails1 = new EmpAccountDetails(18011,
                445990321,"ram3092",empLeaves1);


        EmployeeDetails e1 = new EmployeeDetails(2,"ram","ram@gmail.com",
                "KR road",1234,empAccountDetails1,empLeaves1);

        e1.getEmpAccountDetails().getEmpAccountNum();
        e1.getEmpAccountDetails().getEmpLeaves().getNumOfLeavesTaken();
        e1.getEmpLeaves().setNumOfLeavesLeft(12);

    }
}
