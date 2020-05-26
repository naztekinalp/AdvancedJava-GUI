

package GUI;

import BussinessLogic.PieChart;
import CRUD.Grade;
import CRUD.GradesCRUD;
import java.awt.Color;
import java.util.ArrayList;

public class ShowGradesInternalFrame extends javax.swing.JInternalFrame {

   
    PieChart pieChart;
    GradesCRUD gCrud;
    ArrayList<Grade> list = new ArrayList();
    double[] grades = new double[7];
    ArrayList<Double> values = new ArrayList<Double>();
    ArrayList<Color> colors = new ArrayList<Color>();

    public ShowGradesInternalFrame() {
        initComponents();
        gCrud = new GradesCRUD();

        colors.add(new Color(255, 255, 255));
        colors.add(new Color(255, 183, 183));
        colors.add(new Color(255, 6, 6));
        colors.add(new Color(244, 255, 43));
        colors.add(new Color(153, 0, 153));
        colors.add(new Color(153, 153, 153));
        colors.add(new Color(0, 153, 153));
        setClosable(true);
        start();

    }

    public void start() {

        list = gCrud.getAll();
        for (int i = 0; i < list.size(); i++) {
            calculategrade((Double.parseDouble(list.get(i).getMidterm()) + Double.parseDouble(list.get(i).getMidterm()) / Double.parseDouble(list.get(i).getTotalGrade())) + "");
        }
        addPercentage();
        for (int i = 0; i < grades.length; i++) {
            if (list.size() != 0) {

                values.add(new Double(grades[i]));
            }
        }

        for (int i = 0; i < values.size(); i++) {

        }
        pieChart = new PieChart(values, colors);

        pieChart.setSize(300, 300);
        jPanelPieChart.add(pieChart);
    }

    public void calculategrade(String grade) {

        if (grade.length() > 0) {
            int g = (int) Double.parseDouble(grade);
            if (g > 90) {
                add(0);
                return;
            } else if (g >= 85) {
                add(1);
                return;
            } else if (g >= 80) {
                add(2);
                return;
            } else if (g >= 75) {
                add(3);
                return;
            } else if (g >= 70) {
                add(4);
                return;
            } else if (g >= 65) {
                add(5);
                return;
            } else if (g >= 50) {
                add(6);
            }
        }
    }

    public void add(int index) {
        if (index < 7 && index >= 0) {
            grades[index] = grades[index] + 1;
        }

    }

    public void addPercentage() {
        for (int i = 0; i < grades.length; i++) {

            grades[i] = grades[i] / 14 * 100;
        }

    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanelPieChart = new javax.swing.JPanel();

        jLabel1.setText("AA:");

        jLabel2.setText("BA:");

        jLabel3.setText("BB:");

        jLabel4.setText("CB:");

        jLabel5.setText("CC:");

        jLabel6.setText("DC:");

        jLabel7.setText("DD:");

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("66-70");

        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("61-65");

        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("90-100");

        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("86-89");

        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("81-85");

        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("76-80");

        jLabel14.setForeground(new java.awt.Color(153, 0, 153));
        jLabel14.setText("71-75");

        javax.swing.GroupLayout jPanelPieChartLayout = new javax.swing.GroupLayout(jPanelPieChart);
        jPanelPieChart.setLayout(jPanelPieChartLayout);
        jPanelPieChartLayout.setHorizontalGroup(
            jPanelPieChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        jPanelPieChartLayout.setVerticalGroup(
            jPanelPieChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jPanelPieChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel9)))
                        .addGap(0, 172, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanelPieChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }


    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelPieChart;
    
}
