/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StoreChainManagerRole;

import Business.Organization.Organization;
import Business.Organization.Store;
import Business.Organization.StoreChain;
import java.awt.CardLayout;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;


public class ManageStoresJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStoresJPanel
     */
    private JPanel userProcessContainer;
    private StoreChain storeChain;

    ManageStoresJPanel(JPanel userProcessContainer, StoreChain storeChain) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.storeChain = storeChain;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        storesJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        locationTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        latitudeTxt = new javax.swing.JTextField();
        longitudeTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));

        storesJTable.setBackground(new java.awt.Color(51, 0, 51));
        storesJTable.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        storesJTable.setForeground(new java.awt.Color(0, 255, 50));
        storesJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(storesJTable);

        backJButton.setBackground(new java.awt.Color(51, 0, 51));
        backJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        backJButton.setForeground(new java.awt.Color(0, 255, 50));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        addJButton.setBackground(new java.awt.Color(51, 0, 51));
        addJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        addJButton.setForeground(new java.awt.Color(0, 255, 50));
        addJButton.setText("Add Store");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 50));
        jLabel1.setText("Name:");

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 50));
        jLabel2.setText("Location:");

        nameTxt.setBackground(new java.awt.Color(51, 0, 51));
        nameTxt.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(0, 255, 50));
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        locationTxt.setBackground(new java.awt.Color(51, 0, 51));
        locationTxt.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        locationTxt.setForeground(new java.awt.Color(0, 255, 50));
        locationTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTxtActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 0, 51));
        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 50));
        jLabel3.setText("Latitude:");

        jLabel4.setBackground(new java.awt.Color(51, 0, 51));
        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 50));
        jLabel4.setText("Longitude:");

        latitudeTxt.setBackground(new java.awt.Color(51, 0, 51));
        latitudeTxt.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        latitudeTxt.setForeground(new java.awt.Color(0, 255, 50));
        latitudeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latitudeTxtActionPerformed(evt);
            }
        });

        longitudeTxt.setBackground(new java.awt.Color(51, 0, 51));
        longitudeTxt.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        longitudeTxt.setForeground(new java.awt.Color(0, 255, 50));
        longitudeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longitudeTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(locationTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameTxt)
                            .addComponent(latitudeTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(longitudeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addJButton)))
                .addContainerGap(314, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(latitudeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(longitudeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(addJButton))
                .addContainerGap(219, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        boolean nameFlag = false;
        boolean locFlag = false;
        if (nameTxt.getText().isEmpty()) {
            nameFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter name", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (locationTxt.getText().isEmpty()) {
            locFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter location", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (latitudeTxt.getText().isEmpty()){
            locFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter location", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (longitudeTxt.getText().isEmpty()){
            locFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter location", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        if (!nameFlag & !locFlag){
            try {
                //String loc[] = getLatLongPositions(locationTxt.getText());
                Store store = new Store();
                store.setName(nameTxt.getText());
                store.setLocation(locationTxt.getText());
                store.setLatitude(Double.parseDouble(latitudeTxt.getText()));
                store.setLongitude(Double.parseDouble(longitudeTxt.getText()));
                
                storeChain.addStore(store);
                JOptionPane.showMessageDialog(null, "Store added successfully.");
                nameTxt.setText("");
                locationTxt.setText("");
                latitudeTxt.setText("");
                longitudeTxt.setText("");
                populateTable();
            } catch (Exception ex) {
               // Logger.getLogger(ManageStoresJPanel.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null, "Invalid address. Please enter a valid address");
               return;
            }
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void locationTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTxtActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void latitudeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latitudeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_latitudeTxtActionPerformed

    private void longitudeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longitudeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_longitudeTxtActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) storesJTable.getModel();

        model.setRowCount(0);

        for (Store store : storeChain.getStoreChain()) {
            Object[] row = new Object[2];
            row[0] = store;
            row[1] = store.getLocation();
            model.addRow(row);
        }
    }

    public static String[] getLatLongPositions(String address) throws Exception {
        int responseCode = 0;
        String api = "http://maps.googleapis.com/maps/api/geocode/xml?address=AIzaSyCq12TgWNIPGQTRbeB8Lkh2E-rn939ikLM" + URLEncoder.encode(address, "UTF-8") + "&sensor=true";
        URL url = new URL(api); 
        HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
        httpConnection.connect();
        responseCode = httpConnection.getResponseCode();
        if (responseCode == 200) {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();;
            Document document = builder.parse(httpConnection.getInputStream());
            XPathFactory xPathfactory = XPathFactory.newInstance();
            XPath xpath = xPathfactory.newXPath();
            XPathExpression expr = xpath.compile("/GeocodeResponse/status");
            String status = (String) expr.evaluate(document, XPathConstants.STRING);
            if (status.equals("OK")) {
                expr = xpath.compile("//geometry/location/lat");
              String latitude = (String) expr.evaluate(document, XPathConstants.STRING);
               expr = xpath.compile("//geometry/location/lng");
               String longitude = (String) expr.evaluate(document, XPathConstants.STRING);
             return new String[]{latitude, longitude};
           } else {
              throw new Exception("Error from the API - response status: " + status);
           }
       }
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField latitudeTxt;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JTextField longitudeTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTable storesJTable;
    // End of variables declaration//GEN-END:variables
}
