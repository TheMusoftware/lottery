/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lottery;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author musoftware
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    String listInfo  = "Please add person.";
    public void fillList(){
        if(model.isEmpty()){
            model.addElement(listInfo);
        }
        jList1.setModel(model);
    }
    public void addList(String s){
        if(model.size()==1){
            if(model.get(0).toString().contains(listInfo)){
             model.remove(0);   
            }
        }
       model.addElement(s);
       fillList();
    }
    public void removeFromList(int index){
        model.removeElementAt(index);
        fillList();
    }
    public void clearList(){
        
        model.removeAllElements();
        fillList();
    }
    public void hideResult(){
        winner1.setVisible(false);
        winner2.setVisible(false);
        winner3.setVisible(false);
        winner4.setVisible(false);
    }
    public void writeFile(String s) throws IOException{
        File file = new File("winners.txt");
        if(file.exists()) file.delete();
        FileWriter writer = new FileWriter(file);
        writer.append(s);
        writer.close();
    }
    
    public void changeLanguage(){ 
        if(!isEng){
            slogan.setText("Unlock  people's");
            
            add.setText("ADD");
            delete.setText("DELETE");
            clear.setText("CLEAR");
            importTxt.setText("IMPORT");
            lottery.setText("LOTTERY");
            if(model.size()==1 && model.getElementAt(0).toString().contains(listInfo)){
                listInfo = "Please add person.";
                clearList();
            }
            isEng = true;
        }
        else{
            slogan.setText("Şanslıyı bul");
            add.setText("EKLE");
            delete.setText("KALDIR");
            clear.setText("TEMİZLE");
            importTxt.setText("İÇE AKTAR");
            lottery.setText("ÇEKİLİŞ");
            if(model.size()==1 && model.getElementAt(0).toString().contains(listInfo)){
                listInfo = "Lütfen kişi ekleyin.";
                clearList();
            }
            isEng = false;
        }
    }
    boolean isEng = true;
    DefaultListModel model = new DefaultListModel();
    public MainPage() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        fillList();
        hideResult();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        slogan = new javax.swing.JLabel();
        language = new javax.swing.JLabel();
        peopleList = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        importTxt = new javax.swing.JButton();
        lottery = new javax.swing.JButton();
        winner1 = new javax.swing.JLabel();
        winner2 = new javax.swing.JLabel();
        winner3 = new javax.swing.JLabel();
        winner4 = new javax.swing.JLabel();
        owner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));
        setPreferredSize(new java.awt.Dimension(500, 475));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lottery/img/logo.png"))); // NOI18N

        slogan.setFont(new java.awt.Font("Zapfino", 0, 14)); // NOI18N
        slogan.setLabelFor(logo);
        slogan.setText("Unlock  people's");

        language.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lottery/img/turkishFlag.png"))); // NOI18N
        language.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                languageMouseClicked(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "tem 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        peopleList.setViewportView(jList1);

        add.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        add.setText("ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        delete.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        delete.setText("DELETE");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        clear.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        clear.setText("CLEAR");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });

        importTxt.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        importTxt.setText("IMPORT");
        importTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importTxtMouseClicked(evt);
            }
        });

        lottery.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        lottery.setText("LOTTERY");
        lottery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lotteryMouseClicked(evt);
            }
        });

        winner1.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        winner1.setText("First Winner");

        winner2.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        winner2.setText("Second Winner");

        winner3.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        winner3.setText("Third Winner");

        winner4.setFont(new java.awt.Font("Copperplate", 0, 13)); // NOI18N
        winner4.setText("All winners in winners.txt");
        winner4.setPreferredSize(new java.awt.Dimension(42, 17));

        owner.setFont(new java.awt.Font("Copperplate", 0, 10)); // NOI18N
        owner.setText("TheMusoftware ©");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(peopleList, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(slogan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logo)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(language))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lottery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(importTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(winner2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(winner1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(winner3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(winner4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 23, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(owner)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(language)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(slogan)
                        .addComponent(logo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(peopleList, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(owner))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(importTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lottery)
                        .addGap(44, 44, 44)
                        .addComponent(winner1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(winner2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(winner3)
                        .addGap(18, 18, 18)
                        .addComponent(winner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importTxtMouseClicked
       String messagePane = isEng ? "The data must be separated by a comma (,)" : "Veriler virgül (,) ile ayrılmış olmalıdır";
       String title = isEng ? "Warning" : "Uyarı";
        JOptionPane.showMessageDialog(rootPane, messagePane, title, 2);
        String path = FileChooser.chooseFile(isEng);
        Path filePath = Paths.get(path);
        
        try {
            java.util.List<String> lines = Files.readAllLines(filePath);
            for(String line : lines){
            String [] users = line.split(",");
            for(String str : users){
                addList(str);
            }
        }
            
            
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_importTxtMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
        String message = isEng ? "Enter name" : "İsim giriniz";
        String title = isEng ? "Add" : "Ekle";
       String input = JOptionPane.showInputDialog(rootPane, message, title, 2);
       addList(input);
       hideResult();
    }//GEN-LAST:event_addMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        int index = jList1.getSelectedIndex();
        removeFromList(index);
        hideResult();
        
    }//GEN-LAST:event_deleteMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
        clearList();
        hideResult();
    }//GEN-LAST:event_clearMouseClicked

    private void lotteryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lotteryMouseClicked
        hideResult();
        int luckyCount;
        String message = isEng ? "Enter the number of winners" : "Kazanan sayısını girin";
        String s = (JOptionPane.showInputDialog(message));
        try{
            luckyCount = Integer.parseInt(s);
        }
        catch(NumberFormatException e ){
            luckyCount = 1;
        }
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < luckyCount; i++){
            int index = random.nextInt(model.getSize());
            String winner = (i+1)+". "+model.getElementAt(index);
            removeFromList(index);
            switch(i){
                case 0:
                    winner1.setText(winner);
                    winner1.setVisible(true);
                    sb.append(winner);
                    sb.append("\n");
                    break;
                case 1:
                    winner2.setText(winner);
                    winner2.setVisible(true);
                    sb.append(winner);
                    sb.append("\n");
                    break;
                case 2:
                    winner3.setText(winner);
                    winner3.setVisible(true);
                    sb.append(winner);
                    sb.append("\n");
                    break;
                case 3:
                    if(luckyCount>4){
                        String info = isEng ? "All winners in winners.txt" : "Hepsi winners.txt içinde";
                        winner4.setText(info);
                        winner4.setVisible(true);
                    }
                    else{
                        winner4.setText(winner);
                        winner4.setVisible(true);
                    }
                   sb.append(winner);
                   sb.append("\n");
                    break;
                default:
                    sb.append(winner);
                    sb.append("\n");
                    break;
            }
            
        }  
        try {
            writeFile(sb.toString());
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lotteryMouseClicked

    private void languageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_languageMouseClicked
        // TODO add your handling code here:
        if(isEng){
          language.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lottery/img/usaFlag.png")));   
        }
        else{
             language.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lottery/img/turkishFlag.png")));
        }
        changeLanguage();
       
    }//GEN-LAST:event_languageMouseClicked

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton importTxt;
    private javax.swing.JList<String> jList1;
    private javax.swing.JLabel language;
    private javax.swing.JLabel logo;
    private javax.swing.JButton lottery;
    private javax.swing.JLabel owner;
    private javax.swing.JScrollPane peopleList;
    private javax.swing.JLabel slogan;
    private javax.swing.JLabel winner1;
    private javax.swing.JLabel winner2;
    private javax.swing.JLabel winner3;
    private javax.swing.JLabel winner4;
    // End of variables declaration//GEN-END:variables

    private FileWriter FileWriter(File file) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
