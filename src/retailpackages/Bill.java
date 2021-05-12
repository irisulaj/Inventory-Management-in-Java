/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailpackages;

/**
 *
 * @author iri_s
 */
public class Bill {
    
    private String amount;
    
    private String discount;
    
    private String cash;
    
    private String payable;
    
     private String balance;
     
    public Bill(){
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }

    public String getPayable() {
        return payable;
    }

    public void setPayable(String payable) {
        this.payable = payable;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
    
   public String StringData(){
    return "<html>   &nbsp  &nbsp &nbsp  Amount Due: "+this.getAmount() + "<br/>"+
                   " &nbsp &nbsp &nbsp ---------------------------------------<br/>"+
                   "  &nbsp &nbsp &nbsp Discount:  "+this.getDiscount() + "<br/>"+
                   "  &nbsp &nbsp &nbsp ---------------------------------------<br/>"+
                   "  &nbsp &nbsp &nbsp Cash:      "+this.getCash()+ "<br/>"+
                   "  &nbsp &nbsp &nbsp ---------------------------------------<br/>"+
                   " &nbsp &nbsp &nbsp Payable:   "+this.getPayable()+ "<br/>"+
                   "  &nbsp &nbsp &nbsp ---------------------------------------<br/>"+
                   "   &nbsp &nbsp &nbsp Balance:   "+this.getBalance() + "</html>";
    }
}
