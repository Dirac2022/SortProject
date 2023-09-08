/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uni.aed.gui;

import Generator.GenerateNumber;
import java.awt.Color;
import java.util.Comparator;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uni.aed.Comparator.DecimalComparator;
import uni.aed.Comparator.IntegerComparator;
//import uni.aed.ordenamiento.Ordenamiento;
import uni.aed.Validator.Validator;
import uni.aed.ordenamiento.Sort;

/**
 *
 * @author mitch
 */
public class SortJFrame extends javax.swing.JFrame {

    ImageIcon icono;
    DefaultListModel modeloList1 = new DefaultListModel();
    DefaultListModel modeloList2 = new DefaultListModel();
    
    String [] columnas = {"Sort Algorithm", "# swaps", "# comparisons", "Running time (ns)"};
    String datos [][];
    DefaultTableModel modeloTabla;
    boolean descendente = false;
    
    /**
     * Creates new form SortJFrame
     */
    public SortJFrame() {
        initComponents();
        icono = new ImageIcon("C:\\Users\\mitch\\OneDrive\\Documentos\\NetBeansProjects\\SortProject\\src\\main\\java\\uni\\aed\\icons\\iconBatman.png");
        listInicial.setModel(modeloList1);
        listOrdenada.setModel(modeloList2);
        modeloTabla = new DefaultTableModel(datos, columnas);
        tabla.setModel(modeloTabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTypeValue = new javax.swing.ButtonGroup();
        btnGroupInput = new javax.swing.ButtonGroup();
        panelInput = new javax.swing.JPanel();
        lblChooseSort = new javax.swing.JLabel();
        cboxSort = new javax.swing.JComboBox<>();
        lblMsgInput = new javax.swing.JLabel();
        txtValues = new javax.swing.JTextField();
        cboxSorting = new javax.swing.JComboBox<>();
        rbtnInteger = new javax.swing.JRadioButton();
        rbtnDecimal = new javax.swing.JRadioButton();
        btnGenerate = new javax.swing.JButton();
        rbtnManual = new javax.swing.JRadioButton();
        rbtnRandom = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtArraySize = new javax.swing.JTextField();
        panelSorting = new javax.swing.JPanel();
        scrollpnList1 = new javax.swing.JScrollPane();
        listInicial = new javax.swing.JList<>();
        scrollpList2 = new javax.swing.JScrollPane();
        listOrdenada = new javax.swing.JList<>();
        btnSort = new javax.swing.JButton();
        chboxDescending = new javax.swing.JCheckBox();
        btnCleanLists = new javax.swing.JButton();
        panelStatistics = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnCleanTable = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Algoritmo de Ordenamiento Burbuja");

        lblChooseSort.setText("Choose sort algorithm");

        cboxSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bubble", "Insertion", "Binary Insertion", "Selection", "Merge", "Shell", "QuickSort" }));
        cboxSort.setEnabled(false);

        lblMsgInput.setText("Enter the values to be sorted:");

        txtValues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValuesActionPerformed(evt);
            }
        });

        cboxSorting.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bubble", "Insertion", "Binary Insertion", "Selection", "MergeSort", "QuickSort", "Shell" }));

        btnGroupTypeValue.add(rbtnInteger);
        rbtnInteger.setText("Integer");
        rbtnInteger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnIntegerActionPerformed(evt);
            }
        });

        btnGroupTypeValue.add(rbtnDecimal);
        rbtnDecimal.setText("Decimal");
        rbtnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDecimalActionPerformed(evt);
            }
        });

        btnGenerate.setText("Generate");
        btnGenerate.setEnabled(false);
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        btnGroupInput.add(rbtnManual);
        rbtnManual.setSelected(true);
        rbtnManual.setText("Manual");
        rbtnManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnManualActionPerformed(evt);
            }
        });

        btnGroupInput.add(rbtnRandom);
        rbtnRandom.setText("Aleatorio");
        rbtnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRandomActionPerformed(evt);
            }
        });

        jLabel1.setText("Array size, by default, is 1");

        txtArraySize.setEditable(false);

        javax.swing.GroupLayout panelInputLayout = new javax.swing.GroupLayout(panelInput);
        panelInput.setLayout(panelInputLayout);
        panelInputLayout.setHorizontalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChooseSort, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboxSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboxSorting, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(91, 91, 91))
            .addGroup(panelInputLayout.createSequentialGroup()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addComponent(lblMsgInput, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnManual, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addComponent(txtValues, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnInteger, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addComponent(btnGenerate)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArraySize, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelInputLayout.setVerticalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChooseSort)
                    .addComponent(cboxSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxSorting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMsgInput)
                    .addComponent(rbtnManual)
                    .addComponent(rbtnRandom))
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtValues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rbtnInteger)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnDecimal)))
                .addGap(18, 18, 18)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerate)
                    .addComponent(jLabel1)
                    .addComponent(txtArraySize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        scrollpnList1.setViewportView(listInicial);

        scrollpList2.setViewportView(listOrdenada);

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        chboxDescending.setText("Descending");
        chboxDescending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chboxDescendingActionPerformed(evt);
            }
        });

        btnCleanLists.setText("Clean");
        btnCleanLists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanListsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSortingLayout = new javax.swing.GroupLayout(panelSorting);
        panelSorting.setLayout(panelSortingLayout);
        panelSortingLayout.setHorizontalGroup(
            panelSortingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSortingLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(scrollpnList1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(panelSortingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chboxDescending, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCleanLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87)
                .addComponent(scrollpList2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        panelSortingLayout.setVerticalGroup(
            panelSortingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpList2)
            .addGroup(panelSortingLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnSort)
                .addGap(18, 18, 18)
                .addComponent(chboxDescending)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCleanLists)
                .addContainerGap(52, Short.MAX_VALUE))
            .addComponent(scrollpnList1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabla);

        btnCleanTable.setText("Clean");
        btnCleanTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelStatisticsLayout = new javax.swing.GroupLayout(panelStatistics);
        panelStatistics.setLayout(panelStatisticsLayout);
        panelStatisticsLayout.setHorizontalGroup(
            panelStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCleanTable, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );
        panelStatisticsLayout.setVerticalGroup(
            panelStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatisticsLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnCleanTable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStatisticsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelSorting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(panelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(panelSorting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(panelStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClose)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValuesActionPerformed
        
        String texto = txtValues.getText();
        
        if (btnGroupTypeValue.getSelection() == null){
            JOptionPane.showMessageDialog(rootPane, "Elija un tipo de dato", 
                    "Advertencia", JOptionPane.INFORMATION_MESSAGE, icono);
        }
        
        if(rbtnInteger.isSelected()){
            try{
                Integer value = Integer.parseInt(texto);
                modeloList1.addElement(texto);
                txtValues.setText("");
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar un tipo entero", 
                                            "Error en tipo de dato", JOptionPane.WARNING_MESSAGE, icono);
                txtValues.selectAll();
                      
            }
        }
        if(rbtnDecimal.isSelected()){
            try{
                Double value = Double.parseDouble(texto);
                modeloList1.addElement(texto);
                txtValues.setText("");
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar un tipo decimal", 
                                            "Error en tipo de dato", JOptionPane.WARNING_MESSAGE, icono);
            }
        }
        
    }//GEN-LAST:event_txtValuesActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        
        if (btnGroupTypeValue.getSelection() == null){
            JOptionPane.showMessageDialog(rootPane, "Elija un tipo de dato", 
                    "Advertencia", JOptionPane.INFORMATION_MESSAGE, icono);
        }
        else {
            
            Comparator comp;
            Integer N = listInicial.getModel().getSize();
            if(N.equals(0)){
                JOptionPane.showMessageDialog(rootPane, "La lista esta vacía", 
                            "Advertencia", JOptionPane.INFORMATION_MESSAGE, icono);
                return ;
            }

            Object [] X = new Object [N];
            
            if (rbtnInteger.isSelected()){
                comp = new IntegerComparator();
                X = new Integer [N];
                for(int i = 0; i < N; i++)
                    X[i] = Integer.parseInt(listInicial.getModel().getElementAt(i));
            }
            else {
                comp = new DecimalComparator();
                X = new Double [N];
                for(int i = 0; i < N; i++)
                    X[i] = Double.parseDouble(listInicial.getModel().getElementAt(i));
            }
            
            //Ordenamiento ord = new Ordenamiento();
            Sort sort = new Sort();
            switch(cboxSorting.getSelectedIndex()){
                case 0 ->{
                    sort.bubble(X, comp);
                    System.out.println("Se ejecutó método bubble");
                }

                case 1 -> {
                    sort.insertion(X, comp);
                    System.out.println("Se ejecutó método insertion");
                }

                case 2 -> {
                    sort.binaryInsertion(X, comp);
                    System.out.println("Se ejecutó método binary insertion");
                }

                case 3 -> {
                    sort.selection(X, comp);
                    System.out.println("Se ejecutó método selection");
                }

                case 4 -> {
                    sort.mergeSort(X, comp);
                    System.out.println("Se ejecutó método mergeSort");
                }

                case 5 -> {
                    sort.quickSort(X, comp);
                    System.out.println("Se ejecutó el método quickSort ");
                }

                case 6 -> {
                    sort.shellSort((Integer[]) X);
                    System.out.println("Se ejecutó el método Shell ");
                }
            }

            modeloList2.removeAllElements();

            if(descendente)
                for (int i = N - 1; i >= 0 ; i--)
                    modeloList2.addElement(X[i]);
            else
                for (int i = 0; i < N ; i++)
                    modeloList2.addElement(X[i]);

            listOrdenada.setModel(modeloList2);

            String sortAlgorithm = cboxSorting.getSelectedItem().toString();
            int swaps = sort.getIntercambios();
            int comparisons = sort.getComparaciones();
            long runningTime = sort.getRunningTime();

            String [] newRow = new String[4];
            newRow[0] = sortAlgorithm;
            newRow[1] = String.valueOf(swaps); 
            newRow[2] = String.valueOf(comparisons); 
            newRow[3] = String.valueOf(runningTime);

            modeloTabla.addRow(newRow);
            tabla.setModel(modeloTabla);
        }
        
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnCleanListsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanListsActionPerformed
        modeloList1.removeAllElements();
        modeloList2.removeAllElements();
    }//GEN-LAST:event_btnCleanListsActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void chboxDescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chboxDescendingActionPerformed
       
        descendente = (descendente) ? false : true;
    }//GEN-LAST:event_chboxDescendingActionPerformed

    private void btnCleanTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanTableActionPerformed
        modeloTabla = new DefaultTableModel(datos, columnas);
        tabla.setModel(modeloTabla);
    }//GEN-LAST:event_btnCleanTableActionPerformed

    private void rbtnIntegerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnIntegerActionPerformed
        txtValues.setEditable(true);
    }//GEN-LAST:event_rbtnIntegerActionPerformed

    private void rbtnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDecimalActionPerformed
        txtValues.setEditable(true);
    }//GEN-LAST:event_rbtnDecimalActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        int n;
        try {
            n = Integer.parseInt(txtArraySize.getText());
        } catch (NullPointerException e) {
            n = 1;
        } catch (NumberFormatException e){
            n = 1;
        }
        
        GenerateNumber gen = new GenerateNumber();
        Object [] X = gen.generateArray(n);
        //
        for (int i = 0; i < X.length; i++) {
            modeloList1.add(i, X[i].toString());
        }
        
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void rbtnRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRandomActionPerformed
        txtValues.setEditable(false);
        btnGenerate.setEnabled(true);
        txtArraySize.setEditable(true);
        
        
    }//GEN-LAST:event_rbtnRandomActionPerformed

    private void rbtnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnManualActionPerformed
        btnGenerate.setEnabled(false);
        txtArraySize.setEditable(false);
        txtValues.setEditable(true);
    }//GEN-LAST:event_rbtnManualActionPerformed

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
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCleanLists;
    private javax.swing.JButton btnCleanTable;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGenerate;
    private javax.swing.ButtonGroup btnGroupInput;
    private javax.swing.ButtonGroup btnGroupTypeValue;
    private javax.swing.JButton btnSort;
    private javax.swing.JComboBox<String> cboxSort;
    private javax.swing.JComboBox<String> cboxSorting;
    private javax.swing.JCheckBox chboxDescending;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblChooseSort;
    private javax.swing.JLabel lblMsgInput;
    private javax.swing.JList<String> listInicial;
    private javax.swing.JList<String> listOrdenada;
    private javax.swing.JPanel panelInput;
    private javax.swing.JPanel panelSorting;
    private javax.swing.JPanel panelStatistics;
    private javax.swing.JRadioButton rbtnDecimal;
    private javax.swing.JRadioButton rbtnInteger;
    private javax.swing.JRadioButton rbtnManual;
    private javax.swing.JRadioButton rbtnRandom;
    private javax.swing.JScrollPane scrollpList2;
    private javax.swing.JScrollPane scrollpnList1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtArraySize;
    private javax.swing.JTextField txtValues;
    // End of variables declaration//GEN-END:variables
}
