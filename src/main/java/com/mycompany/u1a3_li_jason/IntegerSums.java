/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u1a3_li_jason;
    
/**
 *
 * @author 342360807
 */
public class IntegerSums extends javax.swing.JFrame {
    
    int[] numList = new int[20];
    int index = 0;
    
    /**
     * Creates new form IntegerSums
     */
    public IntegerSums() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLable = new javax.swing.JLabel();
        inputLable = new javax.swing.JLabel();
        inputField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        sumallButton = new javax.swing.JButton();
        sumoddButton = new javax.swing.JButton();
        sumevenButton = new javax.swing.JButton();
        outputField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Integer Sums");
        setBackground(new java.awt.Color(204, 204, 204));

        TitleLable.setBackground(new java.awt.Color(204, 204, 204));
        TitleLable.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        TitleLable.setForeground(new java.awt.Color(255, 0, 0));
        TitleLable.setText("Integer Sums");

        inputLable.setText("Enter an Integer:");

        inputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFieldActionPerformed(evt);
            }
        });

        addButton.setText("add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setText("remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        sumallButton.setText("all");
        sumallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumallButtonActionPerformed(evt);
            }
        });

        sumoddButton.setText("odd");
        sumoddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumoddButtonActionPerformed(evt);
            }
        });

        sumevenButton.setText("even");
        sumevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumevenButtonActionPerformed(evt);
            }
        });

        outputField.setEditable(false);

        listArea.setEditable(false);
        listArea.setColumns(20);
        listArea.setRows(5);
        jScrollPane1.setViewportView(listArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(removeButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(inputLable)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(sumallButton)
                                    .addComponent(sumoddButton)
                                    .addComponent(sumevenButton)))
                            .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(TitleLable)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputLable)
                            .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(removeButton))
                        .addGap(86, 86, 86)
                        .addComponent(sumallButton)
                        .addGap(18, 18, 18)
                        .addComponent(sumoddButton)
                        .addGap(18, 18, 18)
                        .addComponent(sumevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void sumevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumevenButtonActionPerformed
        outputField.setText("");
        inputField.setText("");
        
        int ans = 0;
        String arrayString = "";
        
        for (int i = 0; i <= index; i++){
            if (numList[i] % 2 == 0){
                ans += numList[i];
            }
        }
        
        for (int i = 0; i < index; i++){
            if (numList[i] % 2 == 0){
                arrayString += numList[i] + "\n";
            }
            listArea.setText(arrayString);
        }
        outputField.setText("The sum of all even numbers is "+ans);
    }//GEN-LAST:event_sumevenButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        outputField.setText("");
        String numString = inputField.getText();
        
        try{
            int num = Integer.parseInt(numString);
            boolean numArray = false;
            String arrayString = "";
            
            if (num >= 1){
                if (index != 0){
                    for (int i = 0; i < index; i++){
                        if (numList[i] == num){
                            numArray = true;
                            numList[i] = 0;
                            break;
                        }
                    }
                
                    if (numArray){ 
                        for (int i = 1; i < index; i++){
                            if (numList[i-1] == 0){
                                numList[i-1] = numList[i];
                                numList[i] = 0;
                            }
                        }
                
                        index--;
                
                        for (int i = 0; i < index; i++){
                            arrayString += numList[i] + "\n";
                        }  
                        listArea.setText(arrayString);
                    }
                    else{
                        outputField.setText("The number is not in the list.");
                    }
                }
                else{
                    outputField.setText("The list is empty.");
                }
            }
            else{
                outputField.setText("Please enter a number greater than 0");
                inputField.setText("");
            }
        }
        
        catch (Exception e){
            outputField.setText("You must enter a positive whole number.");
            inputField.setText("");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        outputField.setText("");
        String numString = inputField.getText();
        
        try{
            int num = Integer.parseInt(numString);
            String arrayString = "";
            
            if (num >= 1){
                if (index < 20){
                    numList[index++] = num;
                }
                else{
                    outputField.setText("The list is full.");
                }
            
                for (int i = 0; i < index; i++){
                    arrayString += numList[i] + "\n";      
                }   
                listArea.setText(arrayString);
            }
            else{
                outputField.setText("Please enter a number greater than 0");
                inputField.setText("");
            }
        }
        
        catch (Exception e){
            outputField.setText("You must enter a positive whole number.");
            inputField.setText("");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void sumoddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumoddButtonActionPerformed
        outputField.setText("");
        inputField.setText("");

        int ans = 0;
        String arrayString = "";
        
        for (int i = 0; i <= index; i++){
            if (numList[i] % 2 == 1){
                ans += numList[i];
            }
        }
        
        for (int i = 0; i < index; i++){
            if (numList[i] % 2 == 1){
                arrayString += numList[i] + "\n";
            }
            listArea.setText(arrayString);
        }
        outputField.setText("The sum of all odd numbers is "+ans);
    }//GEN-LAST:event_sumoddButtonActionPerformed

    private void sumallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumallButtonActionPerformed
        outputField.setText("");
        inputField.setText("");

        int ans = 0;
        String arrayString = "";
        
        for (int i = 0; i <= index; i++){
            ans += numList[i];
        }
        
        for (int i = 0; i < index; i++){
            arrayString += numList[i] + "\n";
        }
        listArea.setText(arrayString);
        outputField.setText("The sum of all numbers is "+ans);
    }//GEN-LAST:event_sumallButtonActionPerformed

    private void inputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFieldActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(IntegerSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntegerSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntegerSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntegerSums.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntegerSums().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLable;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField inputField;
    private javax.swing.JLabel inputLable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listArea;
    private javax.swing.JTextField outputField;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton sumallButton;
    private javax.swing.JButton sumevenButton;
    private javax.swing.JButton sumoddButton;
    // End of variables declaration//GEN-END:variables
}
