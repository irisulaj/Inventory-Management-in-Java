package retailpackages;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.645D5B6D-1D89-0475-50EC-3FBA94AE5EC8]
// </editor-fold> 
public class ClothingRetailShop {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0605FFA8-F53A-4B0A-5AB6-CF62C880145A]
    // </editor-fold> 
    private String Name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.697BFEFF-15B5-826F-F33D-0D14DE0B3F7F]
    // </editor-fold> 
    private String Address;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A5D86DC0-7FB2-AC18-75C0-EAA26BFF20A0]
    // </editor-fold> 
    private ArrayList<Employee> employees;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.818ED229-B072-608B-284D-295AE48A7B2E]
    // </editor-fold> 
    private ArrayList<Items> items;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A9AEAEB1-A376-AD75-F527-9226D1BA9E04]
    // </editor-fold> 
    private Inventory Inventory;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4ACD1198-7CA8-38C3-DBF0-34D686BE47DD]
    // </editor-fold> 
    public ClothingRetailShop () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.49147E03-B5D7-A65F-F142-2BA596C8EFF4]
    // </editor-fold> 
    public String getAddress () {
        return Address;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8668CEB4-44C5-4FC5-1E58-DD01DBAA5EAC]
    // </editor-fold> 
    public void setAddress (String val) {
        this.Address = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.42CE20A6-285E-9DA4-1CF1-3ADF59301BB5]
    // </editor-fold> 
    public Inventory getInventory () {
        return Inventory;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.69FA6970-7419-ACD3-3C13-3C0ABC86E695]
    // </editor-fold> 
    public void setInventory (Inventory val) {
        this.Inventory = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.95FB26DE-E54B-ADDF-E9F6-8FA0E3F1E428]
    // </editor-fold> 
    public String getName () {
        return Name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F6CD1407-68FF-E362-4F84-D956A02B2489]
    // </editor-fold> 
    public void setName (String val) {
        this.Name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.01FF86B4-161A-59F7-5F13-B3F8AD89B578]
    // </editor-fold> 
    public ArrayList<Employee> getEmployees () {
        return employees;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A7D2BC3D-D474-7EDF-3620-E456B240C27D]
    // </editor-fold> 
    public void setEmployees (ArrayList<Employee> val) {
        this.employees = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.943B3DE9-9977-27A3-3C38-439BC32EA9B1]
    // </editor-fold> 
    public ArrayList<Items> getItems () {
        return items;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.654BEF3A-E686-4069-AEBD-98EBB0E64B2F]
    // </editor-fold> 
    public void setItems (ArrayList<Items> val) {
        this.items = val;
    }

}

