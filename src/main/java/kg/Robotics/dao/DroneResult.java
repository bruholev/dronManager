package kg.Robotics.dao;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class DroneResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer dronNo;
    private Date dronDate ;
    private Long result;

    public DroneResult() {    }

    public DroneResult(Long id, Integer dronNo, Date dronDate, Long result) {
        this.id = id;
        this.dronNo = dronNo;
        this.dronDate = dronDate;
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDronNo() {
        return dronNo;
    }

    public void setDronNo(Integer dronNo) {
        this.dronNo = dronNo;
    }

    public Date getDronDate() {
        return dronDate;
    }

    public void setDronDate(Date dronDate) {
        this.dronDate = dronDate;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }
}
