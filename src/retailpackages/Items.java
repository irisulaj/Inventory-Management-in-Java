package retailpackages;


import retailpackages.Inventory;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.60564954-6327-879E-7AB6-2ED653758146]
// </editor-fold> 
public class Items {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8D670A56-8A5F-184E-6093-C752113E5F9F]
    // </editor-fold> 
    protected String Item_id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.80FF7429-6BF6-5C19-B00F-B5560B178F12]
    // </editor-fold> 
    protected String Item_name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C9E78DE3-FE04-504B-C0E1-F0F15FADC2D0]
    // </editor-fold> 
    private String Description;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9D335CDC-B0F1-9E98-3807-46EF77B210FD]
    // </editor-fold> 
    private String Received_date;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CD1E7FFF-D15A-0EB5-F05B-3357D8B94864]
    // </editor-fold> 
    private String Buying_price;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C81CF310-B01C-537A-BC4D-CA5C194F4310]
    // </editor-fold> 
    protected String Selling_price;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.916A7F34-854B-06E6-F8DE-44A323308709]
    // </editor-fold> 
    private String Brand;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2E34F7DD-E4D6-0F9E-5627-7BA4F1341635]
    // </editor-fold> 
    protected String Quantity;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.796AC44C-A38A-1B1C-E69F-A47F99F017ED]
    // </editor-fold> 
    private Inventory Inventory;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.959C5547-AAB9-5816-2CBA-4D457741F9DD]
    // </editor-fold> 
    public Items () {
    }
     public Items (String Item_id, String name, String description, String received_date,String brand, String bprice, String sprice, String quantity){
    
                this.Item_id = Item_id;
                this.Item_name = name;
                this.Description = description;
                this.Received_date = received_date;
                this.Brand = brand;
                this.Buying_price = bprice;
                this.Selling_price = sprice;
                this.Quantity = quantity;
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.ABC3399D-E6F4-DC46-75E8-81B478D12914]
    // </editor-fold> 
    public String getBrand () {
        return Brand;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E3CE55AA-9E98-B44D-158B-A097B8A3797F]
    // </editor-fold> 
    public void setBrand (String val) {
        this.Brand = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4709C381-0D28-F418-8FC3-C479058499AE]
    // </editor-fold> 
    public String getBuying_price () {
        return Buying_price;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7DA51D35-85E0-7066-5064-89EAA4598DA3]
    // </editor-fold> 
    public void setBuying_price (String val) {
        this.Buying_price = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.22A3ADBB-FCAD-27A6-3ED7-BBE0E1DFDA39]
    // </editor-fold> 
    public String getDescription () {
        return Description;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2F657ABA-9C65-7EBF-5866-6EB5943E78AE]
    // </editor-fold> 
    public void setDescription (String val) {
        this.Description = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6B9C0F41-B50F-BBC7-BFF5-DC73FFAFA82B]
    // </editor-fold> 
    public Inventory getInventory () {
        return Inventory;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EA628640-EF1C-042A-3718-2B4B2E3BCD9F]
    // </editor-fold> 
    public void setInventory (Inventory val) {
        this.Inventory = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9D72F2CA-6383-9838-0732-9086DFCDC419]
    // </editor-fold> 
    public String getItem_id () {
        return Item_id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.86720F72-0932-09C0-F0CC-46A0758A84C0]
    // </editor-fold> 
    public void setItem_id (String val) {
        this.Item_id = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.70447169-89FE-A23C-69BD-5491018B4CE3]
    // </editor-fold> 
    public String getItem_name () {
        return Item_name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8BBF16F6-B6DE-D82E-5D28-DC7138763742]
    // </editor-fold> 
    public void setItem_name (String val) {
        this.Item_name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4918B3C3-81D1-DA99-F411-0BF2C7076F78]
    // </editor-fold> 
    public String getQuantity () {
        return Quantity;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BF9954F0-EC24-2473-CD73-C578A2B025D9]
    // </editor-fold> 
    public void setQuantity (String val) {
        this.Quantity = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.828B03AB-1408-8A0E-B569-551EA4D5F6D4]
    // </editor-fold> 
    public String getReceived_date () {
        return Received_date;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.90C158E2-ACC2-FA9E-9E46-5E1CB1DAF8FF]
    // </editor-fold> 
    public void setReceived_date (String val) {
        this.Received_date = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.938B91BB-7C94-1C89-B742-1030145EE64B]
    // </editor-fold> 
    public String getSelling_price () {
        return Selling_price;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F3F89CBC-2A64-2C98-47A8-7B8FCE3ACBD9]
    // </editor-fold> 
    public void setSelling_price (String val) {
        this.Selling_price = val;
    }

}

