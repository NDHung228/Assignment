package extra_assignment.model;

import extra_assignment.enumeration.StatusStudent;

import java.time.LocalDate;
import java.util.Date;

public class StudentLeaving extends Student{
    private String reason;


    public StudentLeaving(int id,String name, LocalDate birthDay, String cccd, String reason) {
        super(id,name, birthDay, cccd);

        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "StudentLeaving{" +
                "reason='" + reason + '\'' +
                '}';
    }
}
