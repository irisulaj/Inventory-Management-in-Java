package retailpackages;

import retailpackages.Items;
import retailpackages.Employee;
import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.BD9D4A00-C9FB-3C4C-1DA3-0E6C4963D3E4]
// </editor-fold> 
public class Sales extends Items{

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4DDF1B5D-7D64-5CE5-E004-3F70EB923885]
    // </editor-fold> 
    private String sale_id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.81DD71C2-80F5-FA58-57F1-FCC23702C564]
    // </editor-fold> 
    private String sale_code;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.05AF2D1A-1ACA-D21D-66EF-1A9EF0F94723]
    // </editor-fold> 
    private String s_amount;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AC4359A4-3BE3-4A25-F5D5-505D005A221E]
    // </editor-fold> 
    private String Discount;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6AABC9A9-DD42-A88F-B8F7-806355F99684]
    // </editor-fold> 
    private String s_date;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.53219216-6934-945B-8818-EFF11DF8BB90]
    // </editor-fold> 
    private Employee employee;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D9D73FC5-4E44-E923-77AD-D33C314CE739]
    // </editor-fold> 
    private ArrayList<Items> items;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1B113C99-F685-7BD2-F8FD-8199156C5BAE]
    // </editor-fold> 
    public Sales () {
    }
 public Sales (String sale_id, String item_id, String name, String quantity, String price, String amount ) {
     
            this.sale_id = sale_id;
            this.Item_id = item_id;
            this.Item_name = name;
            this.Quantity = quantity;
            this.Selling_price = price;
            this.s_amount = amount;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.67C29288-53CB-EEBA-77AB-1E43E43C9A57]
    // </editor-fold> 
    public String getDiscount () {
        return Discount;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FF8D6FAB-5B2B-C69C-01BE-D6E2E43D324C]
    // </editor-fold> 
    public void setDiscount (String val) {
        this.Discount = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A439BBFB-C032-821D-18CB-79FDF1E0C85A]
    // </editor-fold> 
    public Employee getEmployee () {
        return employee;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F9D5684B-F2EA-D8A9-9C77-C8EB972E1D8A]
    // </editor-fold> 
    public void setEmployee (Employee val) {
        this.employee = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C945883A-73D9-0FEA-8713-DC471021278B]
    // </editor-fold> 
    public ArrayList<Items> getItems () {
        return items;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0AF79A15-FD78-88C8-5367-118641788420]
    // </editor-fold> 
    public void setItems (ArrayList<Items> val) {
        this.items = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7BAD1D8E-F48D-0441-AD6B-09C0064D052F]
    // </editor-fold> 
    public String getS_amount () {
        return s_amount;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.63EE06DD-982A-E4EB-036C-CEAA2373477C]
    // </editor-fold> 
    public void setS_amount (String val) {
        this.s_amount = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4626B618-9B94-2F9E-6A82-96452A348C49]
    // </editor-fold> 
    public String getS_date () {
        return s_date;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EE095001-D829-D80B-DC18-2D42DB3BDDE4]
    // </editor-fold> 
    public void setS_date (String val) {
        this.s_date = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CAAA4701-D001-C135-0DCB-140893CBDAA0]
    // </editor-fold> 
    public String getSale_code () {
        return sale_code;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B7B2FC38-E1B6-8BC0-D6D2-46814DF8431E]
    // </editor-fold> 
    public void setSale_code (String val) {
        this.sale_code = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8F1CF951-30C9-A70A-CA24-FFA66B4A20D9]
    // </editor-fold> 
    public String getSale_id () {
        return sale_id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6D5CA07D-7719-F28B-43CF-162D07DCFB86]
    // </editor-fold> 
    public void setSale_id (String val) {
        this.sale_id = val;
    }

}

