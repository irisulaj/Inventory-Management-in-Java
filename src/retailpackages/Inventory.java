package retailpackages;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.9ADF6083-2FE7-0F58-A11D-8706470240AD]
// </editor-fold> 
public class Inventory {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B32679FB-7C25-E2C6-A3DA-C0AA240FEA84]
    // </editor-fold> 
    private String Item_id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E0273FA2-6270-546C-C0F1-8502FB01E0FD]
    // </editor-fold> 
    private String Item_name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.15A5C242-0256-F54A-311A-A55C25688640]
    // </editor-fold> 
    private String Description;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FFF63BC1-DF9C-B22F-9672-679CBA0502CF]
    // </editor-fold> 
    private String Quantity;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.259320E7-8A64-F176-98F2-3F7E0E4A255B]
    // </editor-fold> 
    private String updateDate;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A2233B7F-5F0D-7C5B-C95E-298AE92EA95A]
    // </editor-fold> 
    private String Buying_price;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.768B745C-8F53-F098-53CD-D5920F41F409]
    // </editor-fold> 
    private String Selling_Price;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2571075F-F086-1C8E-32F4-CD54D7FCF50E]
    // </editor-fold> 
    private String Brand;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.08C0E681-9907-7EB9-67B5-AE2A8F17E2C1]
    // </editor-fold> 
    private ArrayList<Items> items;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.46426361-558C-1B2D-5E3C-A6EE8327B743]
    // </editor-fold> 
    public Inventory () {
    }
     public Inventory(String Item_id, String name, String description, String update_date,String brand, String bprice, String sprice, String quantity){
    
                this.Item_id = Item_id;
                this.Item_name = name;
                this.Description = description;
                this.updateDate = update_date;
                this.Brand = brand;
                this.Buying_price = bprice;
                this.Selling_Price = sprice;
                this.Quantity = quantity;
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E8B6A1DE-86C3-76A2-E373-A6F93D233F0F]
    // </editor-fold> 
    public String getBrand () {
        return Brand;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.60331493-ADE8-9227-728A-8793EEF50247]
    // </editor-fold> 
    public void setBrand (String val) {
        this.Brand = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4DF58768-CAA4-C424-C3E0-AE00230FEA81]
    // </editor-fold> 
    public String getBuying_price () {
        return Buying_price;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.01C5BC5B-BB04-8EF4-B695-188E194F69A3]
    // </editor-fold> 
    public void setBuying_price (String val) {
        this.Buying_price = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.61DEC2B1-8BD7-6A7B-380B-5767D9DCC329]
    // </editor-fold> 
    public String getDescription () {
        return Description;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4C86755A-571F-6E21-3D05-1658B4F9BADF]
    // </editor-fold> 
    public void setDescription (String val) {
        this.Description = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6D087B36-AA4E-3E85-F861-949DB85C55BC]
    // </editor-fold> 
    public String getItem_id () {
        return Item_id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A8F5E5AA-BA2F-A765-7712-4C6C6784965C]
    // </editor-fold> 
    public void setItem_id (String val) {
        this.Item_id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FBFD8068-E745-5C15-7B1A-39F062623E0F]
    // </editor-fold> 
    public String getItem_name () {
        return Item_name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BDDCDA0D-2B8E-9620-0558-8BCB2D58E544]
    // </editor-fold> 
    public void setItem_name (String val) {
        this.Item_name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F28A7261-43C8-501A-4B40-95E28E9A9C6E]
    // </editor-fold> 
    public String getQuantity () {
        return Quantity;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A2B8CAEC-C8B5-B167-7FCA-F8AA81F4BE98]
    // </editor-fold> 
    public void setQuantity (String val) {
        this.Quantity = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D5D42962-6C3E-8DF5-C07C-DA6DC1C6C2C2]
    // </editor-fold> 
    public String getSelling_Price () {
        return Selling_Price;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5A9628EA-2BA6-7C8E-8160-401F43442A70]
    // </editor-fold> 
    public void setSelling_Price (String val) {
        this.Selling_Price = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0148FEA6-FD4B-ED2D-9FE6-6DDA1CAAEB1B]
    // </editor-fold> 
    public ArrayList<Items> getItems () {
        return items;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3416026E-B813-0EE7-A071-D437189BB780]
    // </editor-fold> 
    public void setItems (ArrayList<Items> val) {
        this.items = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A90F8716-6AB4-8E35-7FB6-370DE71FFD6E]
    // </editor-fold> 
    public String getUpdateDate () {
        return updateDate;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A85CE2A1-E2FE-CC0A-772D-C1BD7F5312FE]
    // </editor-fold> 
    public void setUpdateDate (String val) {
        this.updateDate = val;
    }
    
    public String StringData(){
    return this.getItem_id() + " "+this.getItem_name();
    }
}

