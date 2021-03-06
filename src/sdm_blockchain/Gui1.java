/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sdm_blockchain;

import com.google.gson.GsonBuilder;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author João Ferreira
 */
public class Gui1 extends javax.swing.JFrame {

    /**
     * Creates new form Gui
     */
    public Gui1() {
        initComponents();
        try{
            Warehouse order0 = new Warehouse(0, 0, "Genesis Block" ,0);
            blockchain.add(new Block(order0,"0"));               
        }
        catch(NoSuchAlgorithmException a){
                
        }
        catch(UnsupportedEncodingException b){
                
        }
        StartBlockChain(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AddBlockButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        WarehouseID2 = new javax.swing.JLabel();
        Operation2 = new javax.swing.JLabel();
        Quantity2 = new javax.swing.JLabel();
        WarehouseText = new javax.swing.JTextField();
        QuantityText = new javax.swing.JTextField();
        TotalStock2 = new javax.swing.JLabel();
        TotalStockText = new javax.swing.JTextField();
        OperationOption = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(122, 130, 149));
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(40, 103, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/resized-image-Promo.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");

        AddBlockButton.setBackground(new java.awt.Color(122, 130, 149));
        AddBlockButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddBlockButton.setText("Add Block");
        AddBlockButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddBlockButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AddBlockButton.setMargin(new java.awt.Insets(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AddBlockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(AddBlockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -10, 220, 410));

        jPanel4.setBackground(new java.awt.Color(40, 103, 160));

        WarehouseID2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        WarehouseID2.setText("Warehouse ID");

        Operation2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Operation2.setText("Operation");

        Quantity2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Quantity2.setText("Quantity");

        WarehouseText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        WarehouseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarehouseIDTextActionPerformed(evt);
            }
        });

        QuantityText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        TotalStock2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TotalStock2.setText("Total Stock");

        TotalStockText.setEditable(false);
        TotalStockText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TotalStockText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalStockTextActionPerformed(evt);
            }
        });

        OperationOption.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        OperationOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "add", "remove" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Operation2)
                    .addComponent(Quantity2)
                    .addComponent(WarehouseID2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalStock2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(WarehouseText, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(QuantityText)
                    .addComponent(TotalStockText)
                    .addComponent(OperationOption, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WarehouseID2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WarehouseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Operation2)
                    .addComponent(OperationOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quantity2)
                    .addComponent(QuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalStock2)
                    .addComponent(TotalStockText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 22, 360, 350));

        jPanel5.setBackground(new java.awt.Color(122, 130, 149));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TotalStockTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalStockTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalStockTextActionPerformed

    private void WarehouseIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarehouseIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WarehouseIDTextActionPerformed

       
    
    public void  StartBlockChain() {
        AddBlockButton.addActionListener((e->{
            
            String Operation = new String();
            int opt;
                      
            opt = OperationOption.getSelectedIndex();
            //System.out.println(opt);
            if(opt==0){
                Operation="add";
            }
            else if(opt==1){
                Operation = "remove";
            }
            
            if(WarehouseText.getText().equals("") || QuantityText.getText().equals("") || Integer.parseInt(WarehouseText.getText()) > 5){
                JOptionPane.showMessageDialog(null, "Please fill in correctly");
            }
            else{
                
   //Warehouse1             
                if(Integer.parseInt(WarehouseText.getText()) == 1){
                    if(Operation.equals("add")){                                  
                        Warehouse order = new Warehouse(1, Integer.parseInt(QuantityText.getText()), Operation, totstock1 + Integer.parseInt(QuantityText.getText()));
                        totstock1=order.getNewTotalStock();                
                        TotalStockText.setText(String.valueOf(order.getNewTotalStock()));

                        try{
                            blockchain.add(new Block(order,blockchain.get(blockchain.size()-1).getHash()));

                            String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
                            System.out.println(blockchainJson);
                        }
                        catch(NoSuchAlgorithmException a){

                        }
                        catch(UnsupportedEncodingException b){

                        }
                    }
                    else if(Operation.equals("remove") && totstock1 > Integer.parseInt(QuantityText.getText())){
                        Warehouse order = new Warehouse(1, Integer.parseInt(QuantityText.getText()), Operation, totstock1 - Integer.parseInt(QuantityText.getText()));
                        totstock1=order.getNewTotalStock();                
                        TotalStockText.setText(String.valueOf(order.getNewTotalStock()));

                        try{
                            blockchain.add(new Block(order,blockchain.get(blockchain.size()-1).getHash()));

                            String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
                            System.out.println(blockchainJson);

                        }
                        catch(NoSuchAlgorithmException a){

                        }
                        catch(UnsupportedEncodingException b){

                        }
                    }
                    else if(Operation.equals("remove") && totstock1 < Integer.parseInt(QuantityText.getText())){
                        TotalStockText.setText(String.valueOf(totstock1));
                        JOptionPane.showMessageDialog(null, "Not enough stock in warehouse 1");                   
                    }
                }
            
//Warehouse2
                if(Integer.parseInt(WarehouseText.getText()) == 2){
                    if(Operation.equals("add")){                                  
                        Warehouse order = new Warehouse(2, Integer.parseInt(QuantityText.getText()), Operation, totstock2 + Integer.parseInt(QuantityText.getText()));
                        totstock2=order.getNewTotalStock();                
                        TotalStockText.setText(String.valueOf(order.getNewTotalStock()));

                        try{
                            blockchain.add(new Block(order,blockchain.get(blockchain.size()-1).getHash()));

                            String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
                            System.out.println(blockchainJson);
                        }
                        catch(NoSuchAlgorithmException a){

                        }
                        catch(UnsupportedEncodingException b){

                        }
                    }
                    else if(Operation.equals("remove") && totstock2 > Integer.parseInt(QuantityText.getText())){
                        Warehouse order = new Warehouse(2, Integer.parseInt(QuantityText.getText()), Operation, totstock2 - Integer.parseInt(QuantityText.getText()));
                        totstock2=order.getNewTotalStock();                
                        TotalStockText.setText(String.valueOf(order.getNewTotalStock()));

                        try{
                            blockchain.add(new Block(order,blockchain.get(blockchain.size()-1).getHash()));

                            String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
                            System.out.println(blockchainJson);

                        }
                        catch(NoSuchAlgorithmException a){

                        }
                        catch(UnsupportedEncodingException b){

                        }
                    }
                    else if(Operation.equals("remove") && totstock2 < Integer.parseInt(QuantityText.getText())){
                        TotalStockText.setText(String.valueOf(totstock2));
                        JOptionPane.showMessageDialog(null, "Not enough stock in warehouse 2");   
                    }
                }
//warehouse3
                if(Integer.parseInt(WarehouseText.getText()) == 3){
                    if(Operation.equals("add")){                                  
                        Warehouse order = new Warehouse(3, Integer.parseInt(QuantityText.getText()), Operation, totstock3 + Integer.parseInt(QuantityText.getText()));
                        totstock3=order.getNewTotalStock();                
                        TotalStockText.setText(String.valueOf(order.getNewTotalStock()));

                        try{
                            blockchain.add(new Block(order,blockchain.get(blockchain.size()-1).getHash()));

                            String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
                            System.out.println(blockchainJson);
                        }
                        catch(NoSuchAlgorithmException a){

                        }
                        catch(UnsupportedEncodingException b){

                        }
                    }
                    else if(Operation.equals("remove") && totstock3 > Integer.parseInt(QuantityText.getText())){
                        Warehouse order = new Warehouse(3, Integer.parseInt(QuantityText.getText()), Operation, totstock3 - Integer.parseInt(QuantityText.getText()));
                        totstock3=order.getNewTotalStock();                
                        TotalStockText.setText(String.valueOf(order.getNewTotalStock()));

                        try{
                            blockchain.add(new Block(order,blockchain.get(blockchain.size()-1).getHash()));

                            String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
                            System.out.println(blockchainJson);
                        }
                        catch(NoSuchAlgorithmException a){

                        }
                        catch(UnsupportedEncodingException b){

                        }
                    }
                    else if(Operation.equals("remove") && totstock3 < Integer.parseInt(QuantityText.getText())){
                        TotalStockText.setText(String.valueOf(totstock3));
                        JOptionPane.showMessageDialog(null, "Not enough stock in warehouse 3");   
                    }
                }
                
                
 //warehouse4
                if(Integer.parseInt(WarehouseText.getText()) == 4){
                    if(Operation.equals("add")){                                  
                        Warehouse order = new Warehouse(4, Integer.parseInt(QuantityText.getText()), Operation, totstock4 + Integer.parseInt(QuantityText.getText()));
                        totstock4=order.getNewTotalStock();                
                        TotalStockText.setText(String.valueOf(order.getNewTotalStock()));

                        try{
                            blockchain.add(new Block(order,blockchain.get(blockchain.size()-1).getHash()));

                            String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
                            System.out.println(blockchainJson);
                        }
                        catch(NoSuchAlgorithmException a){

                        }
                        catch(UnsupportedEncodingException b){

                        }
                    }
                    else if(Operation.equals("remove") && totstock4 > Integer.parseInt(QuantityText.getText())){
                        Warehouse order = new Warehouse(4, Integer.parseInt(QuantityText.getText()), Operation, totstock4 - Integer.parseInt(QuantityText.getText()));
                        totstock4=order.getNewTotalStock();                
                        TotalStockText.setText(String.valueOf(order.getNewTotalStock()));

                        try{
                            blockchain.add(new Block(order,blockchain.get(blockchain.size()-1).getHash()));

                            String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
                            System.out.println(blockchainJson);
                        }
                        catch(NoSuchAlgorithmException a){

                        }
                        catch(UnsupportedEncodingException b){

                        }
                    }
                    else if(Operation.equals("remove") && totstock4 < Integer.parseInt(QuantityText.getText())){
                        TotalStockText.setText(String.valueOf(totstock4));
                        JOptionPane.showMessageDialog(null, "Not enough stock in warehouse 4");   
                    }
                }
                
 //warehouse5
                if(Integer.parseInt(WarehouseText.getText()) == 5){
                    if(Operation.equals("add")){                                  
                        Warehouse order = new Warehouse(5, Integer.parseInt(QuantityText.getText()), Operation, totstock5 + Integer.parseInt(QuantityText.getText()));
                        totstock5=order.getNewTotalStock();                
                        TotalStockText.setText(String.valueOf(order.getNewTotalStock()));

                        try{
                            blockchain.add(new Block(order,blockchain.get(blockchain.size()-1).getHash()));

                            String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
                            System.out.println(blockchainJson);
                        }
                        catch(NoSuchAlgorithmException a){

                        }
                        catch(UnsupportedEncodingException b){

                        }
                    }
                    else if(Operation.equals("remove") && totstock5 > Integer.parseInt(QuantityText.getText())){
                        Warehouse order = new Warehouse(5, Integer.parseInt(QuantityText.getText()), Operation, totstock5 - Integer.parseInt(QuantityText.getText()));
                        totstock5=order.getNewTotalStock();                
                        TotalStockText.setText(String.valueOf(order.getNewTotalStock()));

                        try{
                            blockchain.add(new Block(order,blockchain.get(blockchain.size()-1).getHash()));

                            String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
                            System.out.println(blockchainJson);
                        }
                        catch(NoSuchAlgorithmException a){

                        }
                        catch(UnsupportedEncodingException b){

                        }
                    }
                    else if(Operation.equals("remove") && totstock5 < Integer.parseInt(QuantityText.getText())){
                        TotalStockText.setText(String.valueOf(totstock5));
                        JOptionPane.showMessageDialog(null, "Not enough stock in warehouse 5");   
                    }
                }                
                
                
            
                try{
                    isChainValid();
                }
                 catch(NoSuchAlgorithmException a){

                }
                catch(UnsupportedEncodingException b){

                }  
            }         
               
        })); 
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBlockButton;
    private javax.swing.JLabel Operation2;
    private javax.swing.JComboBox<String> OperationOption;
    private javax.swing.JLabel Quantity2;
    private javax.swing.JTextField QuantityText;
    private javax.swing.JLabel TotalStock2;
    private javax.swing.JTextField TotalStockText;
    private javax.swing.JLabel WarehouseID2;
    private javax.swing.JTextField WarehouseText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
 
    int totstock1=0;
    int totstock2=0;
    int totstock3=0;
    int totstock4=0;
    int totstock5=0;
    
    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    
    public static Boolean isChainValid() throws NoSuchAlgorithmException, UnsupportedEncodingException{
        Block currentBlock;
        Block previousBlock;
        
        for (int i=1; i<blockchain.size(); i++){
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i-1);
            
            if(!currentBlock.getHash().equals(currentBlock.calculateHash())){
                System.out.println("chain is NOT valid!!!");
                return false;
            }
            if(!previousBlock.getHash().equals(currentBlock.getPreviousHash())){
                System.out.println("chain is NOT valid!!!");
                return false;
            }
        }
        System.out.println("chain is valid!!!");
        return true;
    }
    
//    public static void changeChainHash()throws NoSuchAlgorithmException, UnsupportedEncodingException{
//        Iterator<Block> iterator = blockchain.iterator();
//        iterator.next();
//        Block ChangeBlock = iterator.next();
//        ChangeBlock.setHash("12389asd123456qweertasd");          
//    }
//    
//    public static void changeChainData() throws NoSuchAlgorithmException, UnsupportedEncodingException{
//        Iterator<Block> iterator = blockchain.iterator();
//        iterator.next();
//        iterator.next();
//        Block ChangeBlock = iterator.next();
//        ChangeBlock.setData("Corrupted Data!!!"); 
//        ChangeBlock.calculateHash();
//        ChangeBlock.setHash("18273921");
//    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui1().setVisible(true);
            }
        });       
    }
}

