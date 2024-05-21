/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import Dashboard.IndividualPrinting12;
import config.dbConnector;
import function.editgrade;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class grades extends javax.swing.JInternalFrame {
    private Connection connect;

  
   public grades() {

        initComponents();
    
        displayData();
          this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); 
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI(); 
        bi.setNorthPane(null);
        
         
    }

    public void displayData(){
       try{
           dbConnector dbc = new dbConnector();
           ResultSet rs = dbc.getData("SELECT g_id,s_id,c_id,g_prelim,g_midterm,g_prefinal,g_final FROM tbl_grade");
          userTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(SQLException ex){
           System.out.println("Errors: "+ex.getMessage());
        
       }
  }
    
     
    
     public  String action;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();

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
        jLabel11.setText("Grades");

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

        jPanel2.setBackground(new java.awt.Color(151, 188, 98));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Print (4).png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 30, 30);

        userTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray));
        userTable.setOpaque(false);
        jScrollPane1.setViewportView(userTable);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(ref, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(276, Short.MAX_VALUE))
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
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
        editgrade ed= new  editgrade ();
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
      
    }//GEN-LAST:event_searchActionPerformed

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked


    int rowindex = userTable.getSelectedRow();
    if (rowindex < 0) {
        JOptionPane.showMessageDialog(null, "Please Select an Item");
    } else {
        TableModel model = userTable.getModel();
        
        // Check if the rowindex is within the bounds of the table model data
        if (rowindex < model.getRowCount()) {
            editgrade ed = new editgrade();

         String studentId = String.valueOf(model.getValueAt(rowindex, 1));
            dbConnector dbc = new dbConnector();

            // Retrieve the student's first name and last name based on the student ID
            String studentInfoQuery = "SELECT s_fname, s_lname FROM tbl_studentlist WHERE s_id = '" + studentId  + "'";
            try {
                ResultSet studentInfo = dbc.getData(studentInfoQuery);
                if (studentInfo.next()) {
                    String studentFirstName = studentInfo.getString("s_fname");
                    String studentLastName = studentInfo.getString("s_lname");
                    
                    // Display student ID, first name, and last name in the editgrade form
                    ed.id1.setText(String.valueOf(model.getValueAt(rowindex, 0)));
                     ed.stu.setText(studentId);
                   ed.id4.setText(String.valueOf(model.getValueAt(rowindex, 2)));
                    ed.s_fname.setText(studentFirstName); // Display student's first name
                    ed.s_lname.setText(studentLastName); // Display student's last name
                  // Assuming subject ID is in column 6
                     ed.pre.setText(String.valueOf(model.getValueAt(rowindex, 3)));
                    ed.mid.setText(String.valueOf(model.getValueAt(rowindex, 4)));
                    ed.pref.setText(String.valueOf(model.getValueAt(rowindex, 5)));
                    ed.fi.setText(String.valueOf(model.getValueAt(rowindex, 6)));
                
                    ed.setVisible(true);
                    ed.action = "Update";
                    ed.label.setText("UPDATE");
                } else {
                    JOptionPane.showMessageDialog(null, "Student Information not found!");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid row index selected");
        }
    }

    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(new Color (0, 168, 107));
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(new Color (151,188,98));
    }//GEN-LAST:event_editMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
int rowIndex = userTable.getSelectedRow();
if(rowIndex < 0){
JOptionPane.showMessageDialog(null, "Please select data first from the table!");
}else{
TableModel model = userTable.getModel();
Object value = model.getValueAt(rowIndex, 0);
String id = value.toString();
  int a =JOptionPane.showConfirmDialog(null, "Are you sure to delete ID: "+id);
if(a== JOptionPane. YES_OPTION){
dbConnector dbc = new dbConnector();
int g_id = Integer.parseInt(id);
dbc.deleteData(g_id, "tbl_grade");
displayData();
}
}

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

        int rowindex = userTable.getSelectedRow();
        if(rowindex < 0){
            JOptionPane.showMessageDialog(null, "Please select an Item!");
        }else{

            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = userTable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_grade WHERE g_id  = "+tbl.getValueAt(rowindex,0)+"");
                if(rs.next()){
                    IndividualPrinting12 ipt = new IndividualPrinting12 ();
                    
                    ipt.ids.setText(""+rs.getInt("g_id"));
                    ipt.pre.setText(""+rs.getString("g_prelim"));
                    ipt.mid.setText(""+rs.getString("g_midterm"));
                    ipt.fi.setText(""+rs.getString("g_preFinal"));
                     ipt.pref.setText(""+rs.getString("g_final"));
                     
                    ipt.setVisible(true);
                    this.dispose();
                }

            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
     delete.setBackground(new Color (0, 168, 107));
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
      delete.setBackground(new Color (151,188,98));
    }//GEN-LAST:event_deleteMouseExited

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
      jPanel2.setBackground(new Color (0, 168, 107));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        jPanel2.setBackground(new Color (151,188,98));
    }//GEN-LAST:event_jPanel2MouseExited

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
    ResultSet resultSet = dbc.searchData("tbl_grade", searchTerm);

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel ref;
    private javax.swing.JTextField search;
    javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
