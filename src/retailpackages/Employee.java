package retailpackages;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.9CC19D4C-9A3D-2F84-BBF1-A59E2463D182]
// </editor-fold> 
public class Employee {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CCC04FC6-F131-F6C3-3FA6-44C8ED80739B]
    // </editor-fold> 
    private String Emp_id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0A93C98D-17C8-161F-1DAD-1546BFECD9E0]
    // </editor-fold> 
    private String Ename;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.62AF6739-C715-A626-5333-80C13B73FFE8]
    // </editor-fold> 
    private String Elastname;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3BF32E46-BD4F-01F6-60A5-B734183CA9E5]
    // </editor-fold> 
    private String Email; 
    
    private String Phone;
    
    private String Position;

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8EA81D9C-0DDB-9D77-B0B1-1145F864AACD]
    // </editor-fold> 
    private String Salary;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A1491064-50D5-C226-3937-C53A8BD705B9]
    // </editor-fold> 
    private String Address;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.35D06E71-3E8E-D7F1-82D8-7FD33CEBE500]
    // </editor-fold> 
    private ArrayList<Sales> sales;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.38F124A7-664E-8FB1-0E59-A65C93F6F469]
    // </editor-fold> 
    public Employee () {
    }
    public Employee(String id, String name, String lastname, String email, String phone, String address, String position, String salary){
        this.Emp_id = id;
        this.Ename = name;
        this.Elastname = lastname;
        this.Email = email;
        this.Phone = phone;
        this.Address = address;
        this.Position = position;
        this.Salary = salary;
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2F64BFB7-CDA4-DB4E-B6A9-11EF5D1F5AB5]
    // </editor-fold> 
    public String getAddress () {
        return Address;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3D005AB5-87BF-823D-C960-EBFCCD9876B7]
    // </editor-fold> 
    public void setAddress (String val) {
        this.Address = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C0FE7AA9-0A20-F6BB-7EDA-843D88605CE2]
    // </editor-fold> 
    public String getElastname () {
        return Elastname;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FFCFD571-DC9A-9CC6-BD0A-4640D0BCB9AC]
    // </editor-fold> 
    public void setElastname (String val) {
        this.Elastname = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1FC00EE0-2F2F-910A-C45B-576F9863C3B3]
    // </editor-fold> 
    public String getEmail () {
        return Email;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.188AE135-710B-DE76-DEB6-020E6E2571AA]
    // </editor-fold> 
    public void setEmail (String val) {
        this.Email = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.643B8D43-223A-BCFA-1B41-913467C70A51]
    // </editor-fold> 
    public String getEmp_id () {
        return Emp_id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.14D8E3BB-E23B-5829-F4D9-C8BDD5F0B92A]
    // </editor-fold> 
    public void setEmp_id (String val) {
        this.Emp_id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C9695E3F-5373-FDCC-832D-0DB17DDF0C86]
    // </editor-fold> 
    public String getEname () {
        return Ename;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.793F5893-E9A9-921F-3D77-476F499D8211]
    // </editor-fold> 
    public void setEname (String val) {
        this.Ename = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F7C4E1FF-2CF9-7963-A72B-56E130A7D139]
    // </editor-fold> 
    public String getSalary () {
        return Salary;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4DF41E9C-A80C-4691-78CC-2A9428C7846C]
    // </editor-fold> 
    public void setSalary (String val) {
        this.Salary = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6F6D1AE8-3C24-3C9E-7737-D7D4F3937D43]
    // </editor-fold> 
    public ArrayList<Sales> getSales () {
        return sales;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6CF87EC3-343A-17D7-1C8D-7CD2B0D8FD2A]
    // </editor-fold> 
    public void setSales (ArrayList<Sales> val) {
        this.sales = val;
    }

}

