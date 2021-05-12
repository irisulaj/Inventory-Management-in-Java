/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailpackages;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author iri_s
 */
public class Functions {
    
     //function that clears input fields when we cancel input or after we have added a set of inputs
        
        public static void ClearItems(JLabel label, JTextField inputText1, JTextField inputText2, JTextField inputText3,
              JTextField inputText4, JTextField inputText5, JTextField inputText6, JTextField inputText7, JTextField inputText8){
       
        inputText1.setText("");
        inputText2.setText("");
        inputText3.setText("");    
        inputText4.setText("");
        inputText5.setText("");
        inputText6.setText("");
        inputText7.setText("");
        inputText8.setText("");
        label.setVisible(false);
        inputText1.requestFocus();
        }
        
         public static void ClearSaleEntries(JTextField inputText1, JTextField inputText2, JTextField inputText3,
              JTextField inputText4, JTextField inputText5, JTextField inputText6, JTextField inputText7, JTextField inputText8){
       
        inputText1.setText("");
        inputText2.setText("");
        inputText3.setText("");    
        inputText4.setText("");
        inputText5.setText("");
        inputText6.setText("");
        inputText7.setText("");
        inputText8.setText("");  
      
        
 
 
        }
}
