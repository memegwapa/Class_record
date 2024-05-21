/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import Dashboard.IndividualPrinting1;
import config.dbConnector;
import function.editsub;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class sample extends javax.swing.JInternalFrame {

    /**
     * Creates new form sample
     */
    public sample() {
        
        initComponents();
        displayData();
           this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); 
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI(); 
        bi.setNorthPane(null);
    }
  public void displayData(){
       try{
           dbConnector dbc = new dbConnector();
           ResultSet rs = dbc.getData("SELECT* FROM tbl_subject");
          userTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(SQLException ex){
           System.out.println("Errors: "+ex.getMessage());
        
       }
  }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        ref = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Add = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        print = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(957, 732));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(151, 188, 98));
        panel.setForeground(new java.awt.Color(255, 51, 51));
        panel.setPreferredSize(new java.awt.Dimension(654, 593));

        ref.setBackground(new java.awt.Color(151, 188, 98));
        ref.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refMouseExited(evt);
            }
        });
        ref.setLayout(null);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh (3).png"))); // NOI18N
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ref.add(jLabel8);
        jLabel8.setBounds(0, 0, 30, 30);

        Add.setBackground(new java.awt.Color(151, 188, 98));
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddMouseExited(evt);
            }
        });
        Add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add User Group Woman Man (1).png"))); // NOI18N
        Add.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Subjects");

        search.setBackground(new java.awt.Color(151, 188, 98));
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(151, 188, 98));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit (3).png"))); // NOI18N
        edit.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        delete.setBackground(new java.awt.Color(151, 188, 98));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        delete.add(jLabel3);
        jLabel3.setBounds(0, 0, 30, 30);

        print.setBackground(new java.awt.Color(151, 188, 98));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });
        print.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Print (4).png"))); // NOI18N
        print.add(jLabel2);
        jLabel2.setBounds(0, 0, 30, 30);

        userTable.setOpaque(false);
        jScrollPane1.setViewportView(userTable);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(ref, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(202, 202, 202)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ref, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refMouseClicked
        displayData();
    }//GEN-LAST:event_refMouseClicked

    private void refMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refMouseEntered
        ref.setBackground(new Color (0, 168, 107));
    }//GEN-LAST:event_refMouseEntered

    private void refMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refMouseExited
        ref.setBackground(new Color (151,188,98));
    }//GEN-LAST:event_refMouseExited

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        editsub ed= new  editsub ();
        ed.setVisible(true);
        ed.action="Add";
        ed.label.setText("SAVE");
    }//GEN-LAST:event_AddMouseClicked

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        Add.setBackground(new Color (0, 168, 107));
    }//GEN-LAST:event_AddMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        Add.setBackground(new Color (151,188,98));
    }//GEN-LAST:event_AddMouseExited

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int rowindex= userTable.getSelectedRow();
        if(rowindex<0){
            JOptionPane.showMessageDialog(null,"Please Select an Item");
        }else{
            TableModel model=userTable.getModel();
            editsub ed= new editsub ();
            ed.ids.setText(""+model.getValueAt(rowindex,0));
            ed.sub.setText(""+model.getValueAt(rowindex,1));
            ed.tea.setText(""+model.getValueAt(rowindex,2));
            ed.scd1.setSelectedItem(model.getValueAt(rowindex,3));
             
            ed.setVisible(true);
            ed.action="Update";
            ed.label.setText("UPDATE");

        }

    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(new Color (0, 168, 107));
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(new Color (151,188,98));
    }//GEN-LAST:event_editMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int rowIndex =userTable.getSelectedRow();
        if (rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select data first from the table!");
        } else {
            TableModel model =userTable.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int option = JOptionPane.showConfirmDialog(null, "Are you sure to delete ID: " + id);
            if (option == JOptionPane.YES_OPTION) {
                dbConnector dbc = new dbConnector();
                int ids= Integer.parseInt(id);
                dbc.deleteData(ids, "tbl_subject");
                displayData();
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked

        int rowindex = userTable.getSelectedRow();
        if(rowindex < 0){
            JOptionPane.showMessageDialog(null, "Please select an Item!");
        }else{

            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = userTable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_subject WHERE c_id  = "+tbl.getValueAt(rowindex,0)+"");
                if(rs.next()){
                    IndividualPrinting1 ipt = new IndividualPrinting1 ();
                    ipt.ids.setText(""+rs.getInt("c_id"));
                    ipt.sub.setText(""+rs.getString("c_name"));
                    ipt.tea.setText(""+rs.getString("c_teacher"));
                    ipt.scd1.setText(""+rs.getString("c_schedule"));
                     
                     ipt.setVisible(true);
                     this.dispose();
                }
                   
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }

    }//GEN-LAST:event_printMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
     delete.setBackground(new Color (0, 168, 107));
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
       delete.setBackground(new Color (151,188,98));
    }//GEN-LAST:event_deleteMouseExited

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
       print.setBackground(new Color (0, 168, 107));
    }//GEN-LAST:event_printMouseEntered

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
    print.setBackground(new Color (151,188,98));
    }//GEN-LAST:event_printMouseExited

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
                                   
    int rowIndex = userTable.getSelectedRow();
    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please select data first from the table!");
    } else {
        TableModel model = userTable.getModel();
        Object value = model.getValueAt(rowIndex, 0);
        String id = value.toString();
        int a = JOptionPane.showConfirmDialog(null, "Are you sure to delete ID: " + id);
        if (a == JOptionPane.YES_OPTION) {
            dbConnector dbc = new dbConnector();
            int c_id = Integer.parseInt(id);
            dbc.deleteData(c_id, "tbl_subject");
            displayData();
        }
    }


    }//GEN-LAST:event_deleteMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
      
    // Assuming you have a JTextField named 'searchField' where users enter their search term
    String searchTerm = search.getText();

    // Check if the search term is empty
    if (searchTerm.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a search term.");
        return; // Exit the method if the search term is empty
    }

    // Perform the search
    dbConnector dbc = new dbConnector();
    ResultSet resultSet = dbc.searchData("tbl_subject", searchTerm);

    // Process the search results, e.g., display them in a table or list
    // Example: Display the search results using the custom method
  //  displaySearchResults(resultSet);

    }//GEN-LAST:event_searchMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel print;
    private javax.swing.JPanel ref;
    private javax.swing.JTextField search;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
