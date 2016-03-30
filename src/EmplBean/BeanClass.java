/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmplBean;

/**
 *
 * @author Nirmal Harsha
 */
public class BeanClass {

    private int Empid;
    private String EmpName;
    private String EmpDept;
    private double EmpSal;

    public BeanClass(int Empid, String EmpName, String EmpDept,
            double EmpSal) {
        this.Empid = Empid;
        this.EmpName = EmpName;
        this.EmpDept = EmpDept;
        this.EmpSal = EmpSal;
    }

    public String getEmpDept() {
        return EmpDept;
    }

    public void setEmpDept(String EmpDept) {
        this.EmpDept = EmpDept;
    }

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int Empid) {
        this.Empid = Empid;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public double getEmpSal() {
        return EmpSal;
    }

    public void setEmpSal(double EmpSal) {
        this.EmpSal = EmpSal;
    }

    public String toString() {
    return String.valueOf (this.Empid) + "\t" + this.EmpName + "\t\t" + this.EmpDept + "\t\t\t" + String.valueOf(this.EmpSal);
    }

}
