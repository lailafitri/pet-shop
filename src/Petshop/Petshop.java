/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Petshop;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Petshop extends javax.swing.JFrame {

    public ArrayList jeniskebutuhan = new ArrayList();
    public ArrayList harga = new ArrayList();
    public ArrayList jumlah = new ArrayList();
    public ArrayList subtotal = new ArrayList();   
    
    public Petshop() {
        initComponents();
    }
    
 
    private void HargaCat1(){
        int harga = 0;
        int pilihan = cbCat1.getSelectedIndex();
        switch(pilihan){
            case 1:
                harga = 100000;
                break;
            case 2:
                harga = 200000;
                break;
            case 3:
                harga = 300000;
                break;
            case 4:
                harga = 400000;
                break;
        }
        txthargaCat1.setText("" +harga);
    }
    
        private void HargaCat2(){
        int harga = 0;
        int pilihan = cbCat2.getSelectedIndex();
        switch(pilihan){
            case 1:
                harga = 120000;
                break;
            case 2:
                harga = 220000;
                break;
            case 3:
                harga = 320000;
                break;
            case 4:
                harga = 420000;
                break;
        }
        txthargaCat2.setText("" +harga);
    }

    private void HargaDog1(){
        int harga = 0;
        int pilihan = cbDog1.getSelectedIndex();
        switch(pilihan){
            case 1:
                harga = 100000;
                break;
            case 2:
                harga = 200000;
                break;
            case 3:
                harga = 300000;
                break;
            case 4:
                harga = 400000;
                break;
        }
        txthargaDog1.setText("" +harga);
    }
    
        private void HargaDog2(){
        int harga = 0;
        int pilihan = cbDog2.getSelectedIndex();
        switch(pilihan){
            case 1:
                harga = 120000;
                break;
            case 2:
                harga = 220000;
                break;
            case 3:
                harga = 320000;
                break;
            case 4:
                harga = 420000;
                break;
        }
        txthargaDog2.setText("" +harga);
    }
    
        private void setTabel(){
            int total=0;
            double pajak=0;
            int bayar=0;
            
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Jenis");
            tbl.addColumn("Harga");
            tbl.addColumn("Jumlah");
            tbl.addColumn("Subtotal");
            
            for (int n = 0; n < jeniskebutuhan.size() ; n++) {
                total = total+Integer.parseInt(subtotal.get(n).toString());
                
                tbl.addRow(new Object[]{
                    jeniskebutuhan.get(n),
                    harga.get(n),
                    jumlah.get(n),
                    subtotal.get(n),
                });
            }
            
            //bayar
            pajak = total * 0.02;
            bayar = (int) (total+pajak);
            
            tbldata.setModel(tbl);
            txttotalCat.setText("" + total);
            txtpajakCat.setText("" + pajak);
            txttotalbayarCat.setText("" + bayar);
            
            tabeldata.setModel(tbl);
            txttotalDog.setText("" + total);
            txtpajakDog.setText("" + pajak);
            txttotalbayarDog.setText("" + bayar);
        }
        
        private boolean cekKosong(boolean kebutuhan){
            boolean hasil=true;
            
            if (kebutuhan==true) {
                if (txtjmlhCat1.getText().isEmpty() == true) {
                    JOptionPane.showMessageDialog(null,"Jumlah belum terisi!");
                    hasil=true;
                }
            }else{
                if (txtjmlhCat2.getText().isEmpty() == true) {
                    JOptionPane.showMessageDialog(null,"Jumlah belum terisi!");
                }
            }
            return false;
        }
        private boolean kosong (boolean perawatan) {
            boolean hasil=true;
            
            if (perawatan==true) {
                if (txtjmlhDog1.getText().isEmpty() == true) {
                    JOptionPane.showMessageDialog(null,"Jumlah belum terisi!");
                    hasil=true;
                }
            }else{
                if (txtjmlhDog2.getText().isEmpty() == true) {
                    JOptionPane.showMessageDialog(null,"Jumlah belum terisi!");
                }                
            }
            return false;
        }
        
        private boolean DataTable(String data){
            boolean hasil=jeniskebutuhan.contains(data);
            if (hasil==true) JOptionPane.showMessageDialog(null, "Kebutuhan telah ditambahkan.");
                return hasil;
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodypanel = new javax.swing.JPanel();
        menupanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCat = new javax.swing.JButton();
        btnDog = new javax.swing.JButton();
        btnContactUs = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        mainpanel = new javax.swing.JPanel();
        isiHome = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        isiCat = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btntmbhCat1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btntmbhCat2 = new javax.swing.JButton();
        cbCat1 = new javax.swing.JComboBox<>();
        txthargaCat1 = new javax.swing.JTextField();
        txtjmlhCat1 = new javax.swing.JTextField();
        txtsubtotalCat1 = new javax.swing.JTextField();
        btnCat2 = new javax.swing.JButton();
        cbCat2 = new javax.swing.JComboBox<>();
        txtsubtotalCat2 = new javax.swing.JTextField();
        txthargaCat2 = new javax.swing.JTextField();
        txtjmlhCat2 = new javax.swing.JTextField();
        btnCat1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txttotalbayarCat = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtpajakCat = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txttotalCat = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        isiDog = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cbDog1 = new javax.swing.JComboBox<>();
        txthargaDog1 = new javax.swing.JTextField();
        txtjmlhDog1 = new javax.swing.JTextField();
        txtsubtotalDog1 = new javax.swing.JTextField();
        btntmbhDog1 = new javax.swing.JButton();
        btnDog1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cbDog2 = new javax.swing.JComboBox<>();
        txthargaDog2 = new javax.swing.JTextField();
        txtjmlhDog2 = new javax.swing.JTextField();
        txtsubtotalDog2 = new javax.swing.JTextField();
        btntmbhDog2 = new javax.swing.JButton();
        btnDog2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        txttotalDog = new javax.swing.JTextField();
        txtpajakDog = new javax.swing.JTextField();
        txttotalbayarDog = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        isiContactUs = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelcabang = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menupanel.setBackground(new java.awt.Color(102, 0, 0));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("La Petshop");

        btnCat.setBackground(new java.awt.Color(255, 204, 204));
        btnCat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCat.setForeground(new java.awt.Color(153, 0, 0));
        btnCat.setText("Cat");
        btnCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatActionPerformed(evt);
            }
        });

        btnDog.setBackground(new java.awt.Color(255, 204, 255));
        btnDog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDog.setForeground(new java.awt.Color(153, 0, 0));
        btnDog.setText("Dog");
        btnDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDogActionPerformed(evt);
            }
        });

        btnContactUs.setBackground(new java.awt.Color(255, 204, 255));
        btnContactUs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnContactUs.setForeground(new java.awt.Color(153, 0, 0));
        btnContactUs.setText("Contact Us");
        btnContactUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactUsActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(153, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnContactUs))
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menupanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menupanelLayout.createSequentialGroup()
                        .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCat, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDog, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menupanelLayout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addGap(69, 69, 69))))
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(85, 85, 85)
                .addComponent(btnCat)
                .addGap(31, 31, 31)
                .addComponent(btnDog)
                .addGap(34, 34, 34)
                .addComponent(btnContactUs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(87, 87, 87))
        );

        mainpanel.setBackground(new java.awt.Color(102, 102, 102));
        mainpanel.setLayout(new java.awt.CardLayout());

        isiHome.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Optimized-97005-white_background-animals-dog-cat-baby_animals.jpg"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setText("La Petshop");

        javax.swing.GroupLayout isiHomeLayout = new javax.swing.GroupLayout(isiHome);
        isiHome.setLayout(isiHomeLayout);
        isiHomeLayout.setHorizontalGroup(
            isiHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isiHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(316, 316, 316))
            .addGroup(isiHomeLayout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        isiHomeLayout.setVerticalGroup(
            isiHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isiHomeLayout.createSequentialGroup()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainpanel.add(isiHome, "card5");

        isiCat.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Cat");

        jLabel3.setText("Jenis Kebutuhan");

        jLabel4.setText("Harga");

        jLabel5.setText("Jumlah");

        jLabel6.setText("Subtotal");

        btntmbhCat1.setText("Tambahkan");
        btntmbhCat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntmbhCat1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Jenis Perawatan");

        jLabel8.setText("Harga");

        jLabel9.setText("Jumlah kucing");

        jLabel10.setText("Subtotal");

        btntmbhCat2.setText("Tambahkan");
        btntmbhCat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntmbhCat2ActionPerformed(evt);
            }
        });

        cbCat1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilihan", "Dry food", "Wet food", "Milk", "Vitamin" }));
        cbCat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCat1ActionPerformed(evt);
            }
        });

        txthargaCat1.setEditable(false);
        txthargaCat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaCat1ActionPerformed(evt);
            }
        });

        txtjmlhCat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjmlhCat1ActionPerformed(evt);
            }
        });

        txtsubtotalCat1.setEditable(false);
        txtsubtotalCat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubtotalCat1ActionPerformed(evt);
            }
        });

        btnCat2.setText("ok");
        btnCat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCat2ActionPerformed(evt);
            }
        });

        cbCat2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilihan", "Grooming", "Potong kuku", "Cukur bulu", "Vaksin" }));
        cbCat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCat2ActionPerformed(evt);
            }
        });

        txtsubtotalCat2.setEditable(false);

        txthargaCat2.setEditable(false);

        btnCat1.setText("ok");
        btnCat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCat1ActionPerformed(evt);
            }
        });

        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Jenis", "Harga", "Jumlah", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(tbldata);

        jLabel11.setText("Total");

        txttotalbayarCat.setEditable(false);
        txttotalbayarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalbayarCatActionPerformed(evt);
            }
        });

        jLabel12.setText("Pajak");

        txtpajakCat.setEditable(false);

        jLabel13.setText("Total Bayar");

        txttotalCat.setEditable(false);
        txttotalCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalCatActionPerformed(evt);
            }
        });

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tak berjudul8_20200614164253.png"))); // NOI18N
        jLabel38.setText("jLabel38");

        javax.swing.GroupLayout isiCatLayout = new javax.swing.GroupLayout(isiCat);
        isiCat.setLayout(isiCatLayout);
        isiCatLayout.setHorizontalGroup(
            isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isiCatLayout.createSequentialGroup()
                .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(isiCatLayout.createSequentialGroup()
                            .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(isiCatLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(54, 54, 54))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, isiCatLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(isiCatLayout.createSequentialGroup()
                                    .addComponent(txtjmlhCat2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnCat2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtsubtotalCat2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiCatLayout.createSequentialGroup()
                                    .addComponent(txthargaCat2)
                                    .addGap(3, 3, 3))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, isiCatLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel7)
                            .addGap(6, 6, 6)
                            .addComponent(cbCat2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiCatLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(isiCatLayout.createSequentialGroup()
                                .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiCatLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(isiCatLayout.createSequentialGroup()
                                .addComponent(txtjmlhCat1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCat1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtsubtotalCat1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthargaCat1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCat1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(isiCatLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btntmbhCat1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btntmbhCat2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isiCatLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiCatLayout.createSequentialGroup()
                                .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiCatLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(60, 60, 60)))
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttotalCat, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(isiCatLayout.createSequentialGroup()
                                .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtpajakCat, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttotalbayarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(isiCatLayout.createSequentialGroup()
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(isiCatLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(78, Short.MAX_VALUE))))
            .addGroup(isiCatLayout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        isiCatLayout.setVerticalGroup(
            isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isiCatLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isiCatLayout.createSequentialGroup()
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txthargaCat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjmlhCat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCat1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsubtotalCat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btntmbhCat1)
                        .addGap(58, 58, 58)
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txthargaCat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(isiCatLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotalCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpajakCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isiCatLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtjmlhCat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCat2))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(19, 19, 19)
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsubtotalCat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btntmbhCat2))
                    .addGroup(isiCatLayout.createSequentialGroup()
                        .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(isiCatLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(isiCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(txttotalbayarCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(183, 183, 183))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiCatLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)))
                        .addComponent(jLabel15)))
                .addGap(31, 31, 31))
        );

        mainpanel.add(isiCat, "card2");

        isiDog.setBackground(new java.awt.Color(255, 204, 204));

        jLabel14.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("Dog");

        jLabel16.setText("Jenis Kebutuhan");

        jLabel17.setText("Harga");

        jLabel18.setText("Jumlah");

        jLabel19.setText("Subtotal");

        cbDog1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilihan", "Dry food", "Wet food", "Milk", "Vitamin" }));
        cbDog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDog1ActionPerformed(evt);
            }
        });

        txtsubtotalDog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubtotalDog1ActionPerformed(evt);
            }
        });

        btntmbhDog1.setText("Tambahkan");
        btntmbhDog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntmbhDog1ActionPerformed(evt);
            }
        });

        btnDog1.setText("ok");
        btnDog1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDog1ActionPerformed(evt);
            }
        });

        jLabel20.setText("Jenis Perawatan");

        jLabel21.setText("Harga");

        jLabel22.setText("Subtotal");

        jLabel23.setText("Jumlah Anjing");

        cbDog2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilihan", "Grooming", "Potong kuku", "Cukur bulu", "Vaksin" }));
        cbDog2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDog2ActionPerformed(evt);
            }
        });

        txtjmlhDog2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjmlhDog2ActionPerformed(evt);
            }
        });

        btntmbhDog2.setText("Tambahkan");
        btntmbhDog2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntmbhDog2ActionPerformed(evt);
            }
        });

        btnDog2.setText("ok");
        btnDog2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDog2ActionPerformed(evt);
            }
        });

        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Jenis", "Harga", "Jumlah", "Subtotal"
            }
        ));
        jScrollPane2.setViewportView(tabeldata);

        jLabel24.setText("Total");

        jLabel25.setText("Pajak");

        jLabel26.setText("Total Bayar");

        javax.swing.GroupLayout isiDogLayout = new javax.swing.GroupLayout(isiDog);
        isiDog.setLayout(isiDogLayout);
        isiDogLayout.setHorizontalGroup(
            isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiDogLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isiDogLayout.createSequentialGroup()
                        .addComponent(txtjmlhDog2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDog2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(isiDogLayout.createSequentialGroup()
                        .addComponent(txtjmlhDog1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDog1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txthargaDog1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbDog1, javax.swing.GroupLayout.Alignment.LEADING, 0, 195, Short.MAX_VALUE))
                    .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbDog2, javax.swing.GroupLayout.Alignment.LEADING, 0, 193, Short.MAX_VALUE)
                        .addComponent(btntmbhDog1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsubtotalDog1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txthargaDog2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btntmbhDog2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsubtotalDog2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isiDogLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(41, 41, 41)
                        .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpajakDog, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotalDog, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotalbayarDog, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiDogLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(136, 136, 136)
                .addComponent(jLabel39)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiDogLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(475, 475, 475))
        );
        isiDogLayout.setVerticalGroup(
            isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isiDogLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel14)
                .addGap(50, 50, 50)
                .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isiDogLayout.createSequentialGroup()
                        .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cbDog1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txthargaDog1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtjmlhDog1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDog1))
                        .addGap(5, 5, 5)
                        .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtsubtotalDog1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btntmbhDog1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cbDog2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotalDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txthargaDog2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpajakDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isiDogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDog2)
                            .addComponent(txtjmlhDog2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(txttotalbayarDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(isiDogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtsubtotalDog2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btntmbhDog2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiDogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jLabel39)
                        .addGap(109, 109, 109))))
        );

        mainpanel.add(isiDog, "card5");

        isiContactUs.setBackground(new java.awt.Color(204, 204, 204));

        tabelcabang.setBackground(new java.awt.Color(102, 102, 102));
        tabelcabang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelcabang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Pontianak", "Jalan Urai Bawadi",  new Integer(628000001)},
                {"Jakarta", "Jalan Pancasila",  new Integer(628000002)},
                {"Bandung", "Jalan Merdeka", null}
            },
            new String [] {
                "Cabang", "Alamat", "Kontak"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelcabang);

        jLabel29.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel29.setText("Contact Us");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Instagram");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("@La.Petshop");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("E- mail");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("la_petshop@gmail.com");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(jLabel35))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Twitter");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("@La_Petshop");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel36.setFont(new java.awt.Font("Viner Hand ITC", 2, 18)); // NOI18N
        jLabel36.setText("Terimakasih Sudah Berkunjung!");

        jLabel37.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Contact Us");

        jLabel40.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel40.setText("Contact Us");

        javax.swing.GroupLayout isiContactUsLayout = new javax.swing.GroupLayout(isiContactUs);
        isiContactUs.setLayout(isiContactUsLayout);
        isiContactUsLayout.setHorizontalGroup(
            isiContactUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiContactUsLayout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addGroup(isiContactUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiContactUsLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(333, 333, 333))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiContactUsLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel40)
                        .addGap(135, 135, 135))))
            .addGroup(isiContactUsLayout.createSequentialGroup()
                .addGroup(isiContactUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isiContactUsLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel29))
                    .addGroup(isiContactUsLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(isiContactUsLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel36)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        isiContactUsLayout.setVerticalGroup(
            isiContactUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiContactUsLayout.createSequentialGroup()
                .addGroup(isiContactUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isiContactUsLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(isiContactUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiContactUsLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiContactUsLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(67, 67, 67)))
                        .addComponent(jLabel37))
                    .addGroup(isiContactUsLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(isiContactUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addGap(27, 27, 27))
        );

        mainpanel.add(isiContactUs, "card4");

        javax.swing.GroupLayout bodypanelLayout = new javax.swing.GroupLayout(bodypanel);
        bodypanel.setLayout(bodypanelLayout);
        bodypanelLayout.setHorizontalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodypanelLayout.createSequentialGroup()
                .addComponent(menupanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE))
        );
        bodypanelLayout.setVerticalGroup(
            bodypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodypanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(menupanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttotalbayarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalbayarCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalbayarCatActionPerformed

    private void btnCat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCat1ActionPerformed
        try{
            int hargacat1 = Integer.parseInt(txthargaCat1.getText());
            int jumlahcat1 = Integer.parseInt(txtjmlhCat1.getText());
            txtsubtotalCat1.setText(" "+(hargacat1*jumlahcat1));
        }
        catch(NumberFormatException e){
            txtsubtotalCat1.setText("0");
        }
    }//GEN-LAST:event_btnCat1ActionPerformed

    private void cbCat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCat2ActionPerformed
        // TODO add your handling code here:
        HargaCat2();
    }//GEN-LAST:event_cbCat2ActionPerformed

    private void btnCat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCat2ActionPerformed
        try{
            int hargacat2 = Integer.parseInt(txthargaCat2.getText());
            int jumlahcat2 = Integer.parseInt(txtjmlhCat2.getText());
            txtsubtotalCat2.setText(" "+(hargacat2*jumlahcat2));
        }
        catch(NumberFormatException e){
            txtsubtotalCat2.setText("0");
        }
    }//GEN-LAST:event_btnCat2ActionPerformed

    private void txtjmlhCat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjmlhCat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjmlhCat1ActionPerformed

    private void cbCat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCat1ActionPerformed
        HargaCat1();
    }//GEN-LAST:event_cbCat1ActionPerformed

    private void btntmbhCat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntmbhCat2ActionPerformed
        // TODO add your handling code here:
        if (cekKosong(false)==false) {
            String jenisItem = cbCat2.getSelectedItem().toString();
            if (DataTable(jenisItem)==false) {
                int  hrg = Integer.parseInt(txthargaCat2.getText());
                int jlh = Integer.parseInt(txtjmlhCat2.getText());
                txtsubtotalCat2.setText(""+(hrg*jlh));

                jeniskebutuhan.add(jenisItem);
                harga.add(txthargaCat2.getText());
                jumlah.add(txtjmlhCat2.getText());
                subtotal.add(txtsubtotalCat2.getText());

                setTabel();
            }
        }
        cbCat2.setSelectedIndex(0);
        txthargaCat2.setText("");
        txtjmlhCat2.setText("");
        txtsubtotalCat2.setText("");
    }//GEN-LAST:event_btntmbhCat2ActionPerformed

    private void btntmbhCat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntmbhCat1ActionPerformed
        // TODO add your handling code here:
        if (cekKosong(true)==false) {
            String jenisItem = cbCat1.getSelectedItem().toString();
            if (DataTable(jenisItem)==false) {
                int  hrg = Integer.parseInt(txthargaCat1.getText());
                int jlh = Integer.parseInt(txtjmlhCat1.getText());
                txtsubtotalCat1.setText(""+(hrg*jlh));

                jeniskebutuhan.add(jenisItem);
                harga.add(txthargaCat1.getText());
                jumlah.add(txtjmlhCat1.getText());
                subtotal.add(txtsubtotalCat1.getText());
                
                //panggil 
                setTabel();
            }
        }
        cbCat1.setSelectedIndex(0);
        txthargaCat1.setText("");
        txtjmlhCat1.setText("");
        txtsubtotalCat1.setText("");
    }//GEN-LAST:event_btntmbhCat1ActionPerformed

    private void btnDog2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDog2ActionPerformed
        // TODO add your handling code here:
        try{
            int hargadog2 = Integer.parseInt(txthargaDog2.getText());
            int jumlahdog2 = Integer.parseInt(txtjmlhDog2.getText());
            txtsubtotalDog2.setText(" "+(hargadog2*jumlahdog2));
        }
        catch(NumberFormatException e){
            txtsubtotalDog2.setText("0");
        }
    }//GEN-LAST:event_btnDog2ActionPerformed

    private void btntmbhDog2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntmbhDog2ActionPerformed
        if (kosong(false)==false) {
            String jenisItem = cbDog2.getSelectedItem().toString();
            if (DataTable(jenisItem)==false) {
                int  hrg = Integer.parseInt(txthargaDog2.getText());
                int jlh = Integer.parseInt(txtjmlhDog2.getText());
                txtsubtotalDog2.setText(""+(hrg*jlh));

                jeniskebutuhan.add(jenisItem);
                harga.add(txthargaDog2.getText());
                jumlah.add(txtjmlhDog2.getText());
                subtotal.add(txtsubtotalDog2.getText());

                setTabel();
            }
        }
        cbDog2.setSelectedIndex(0);
        txthargaDog2.setText("");
        txtjmlhDog2.setText("");
        txtsubtotalDog2.setText("");
    }//GEN-LAST:event_btntmbhDog2ActionPerformed

    private void txtjmlhDog2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjmlhDog2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjmlhDog2ActionPerformed

    private void cbDog2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDog2ActionPerformed
        // TODO add your handling code here:
        HargaDog2();
    }//GEN-LAST:event_cbDog2ActionPerformed

    private void btnDog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDog1ActionPerformed
        // TODO add your handling code here:
        try{
            int hargadog1 = Integer.parseInt(txthargaDog1.getText());
            int jumlahdog1 = Integer.parseInt(txtjmlhDog1.getText());
            txtsubtotalDog1.setText(" "+(hargadog1*jumlahdog1));
        }
        catch(NumberFormatException e){
            txtsubtotalDog1.setText("0");
        }
    }//GEN-LAST:event_btnDog1ActionPerformed

    private void btntmbhDog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntmbhDog1ActionPerformed
        if (kosong(true)==false) {
            String jenisItem = cbDog1.getSelectedItem().toString();
            if (DataTable(jenisItem)==false) {
                int  hrg = Integer.parseInt(txthargaDog1.getText());
                int jlh = Integer.parseInt(txtjmlhDog1.getText());
                txtsubtotalDog1.setText(""+(hrg*jlh));

                jeniskebutuhan.add(jenisItem);
                harga.add(txthargaDog1.getText());
                jumlah.add(txtjmlhDog1.getText());
                subtotal.add(txtsubtotalDog1.getText());

                setTabel();
            }
        }
        cbDog1.setSelectedIndex(0);
        txthargaDog1.setText("");
        txtjmlhDog1.setText("");
        txtsubtotalDog1.setText("");
    }//GEN-LAST:event_btntmbhDog1ActionPerformed

    private void txtsubtotalDog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubtotalDog1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubtotalDog1ActionPerformed

    private void cbDog1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDog1ActionPerformed
        // TODO add your handling code here:
        HargaDog1();
    }//GEN-LAST:event_cbDog1ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnContactUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactUsActionPerformed
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();

        mainpanel.add(isiContactUs);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_btnContactUsActionPerformed

    private void btnDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDogActionPerformed

        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();

        mainpanel.add(isiDog);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_btnDogActionPerformed

    private void btnCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatActionPerformed
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();

        mainpanel.add(isiCat);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_btnCatActionPerformed

    private void txthargaCat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaCat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaCat1ActionPerformed

    private void txtsubtotalCat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubtotalCat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubtotalCat1ActionPerformed

    private void txttotalCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalCatActionPerformed


    
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
            java.util.logging.Logger.getLogger(Petshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Petshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Petshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Petshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Petshop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodypanel;
    private javax.swing.JButton btnCat;
    private javax.swing.JButton btnCat1;
    private javax.swing.JButton btnCat2;
    private javax.swing.JButton btnContactUs;
    private javax.swing.JButton btnDog;
    private javax.swing.JButton btnDog1;
    private javax.swing.JButton btnDog2;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btntmbhCat1;
    private javax.swing.JButton btntmbhCat2;
    private javax.swing.JButton btntmbhDog1;
    private javax.swing.JButton btntmbhDog2;
    private javax.swing.JComboBox<String> cbCat1;
    private javax.swing.JComboBox<String> cbCat2;
    private javax.swing.JComboBox<String> cbDog1;
    private javax.swing.JComboBox<String> cbDog2;
    private javax.swing.JPanel isiCat;
    private javax.swing.JPanel isiContactUs;
    private javax.swing.JPanel isiDog;
    private javax.swing.JPanel isiHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JPanel menupanel;
    private javax.swing.JTable tabelcabang;
    private javax.swing.JTable tabeldata;
    private javax.swing.JTable tbldata;
    private javax.swing.JTextField txthargaCat1;
    private javax.swing.JTextField txthargaCat2;
    private javax.swing.JTextField txthargaDog1;
    private javax.swing.JTextField txthargaDog2;
    private javax.swing.JTextField txtjmlhCat1;
    private javax.swing.JTextField txtjmlhCat2;
    private javax.swing.JTextField txtjmlhDog1;
    private javax.swing.JTextField txtjmlhDog2;
    private javax.swing.JTextField txtpajakCat;
    private javax.swing.JTextField txtpajakDog;
    private javax.swing.JTextField txtsubtotalCat1;
    private javax.swing.JTextField txtsubtotalCat2;
    private javax.swing.JTextField txtsubtotalDog1;
    private javax.swing.JTextField txtsubtotalDog2;
    private javax.swing.JTextField txttotalCat;
    private javax.swing.JTextField txttotalDog;
    private javax.swing.JTextField txttotalbayarCat;
    private javax.swing.JTextField txttotalbayarDog;
    // End of variables declaration//GEN-END:variables
}
