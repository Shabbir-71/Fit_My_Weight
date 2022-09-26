
package com.mycompany.dnd;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JFramePractice extends javax.swing.JFrame {

    // input variables
    private int age = 0;
    private int gender = 0;
    private double weight_in_kg = 0;
    private double height_in_cm = 0;
    private double height_in_feet = 0;
    private double height_in_inch = 0;
    private double physical_activity = 0;
    
    // output variables
    private double BMI = 0;
    private double BMR = 0;
    private double calorie = 0;
    String food_plan = "";
    
            
    /**
     * Creates new form JFramePractice
     */
    public JFramePractice() {
        initComponents();
        off_basic_output();
    }

    private void off_basic_output(){
        // basic output
        label_BMI.setVisible(false);
        output_BMI.setVisible(false);
        label_weight_status.setVisible(false);
        output_weight_status.setVisible(false);
        jLabel10.setVisible(false);
        jLabel13.setVisible(false);
        
        // food plan for weight loss or gain
        jLabel17.setVisible(false);
        jTextField5.setVisible(false);
        jLabel18.setVisible(false);
        jTextField6.setVisible(false);
        jLabel21.setVisible(false);
        jButton1.setVisible(false);
        jButton3.setVisible(false);

        // food plan
        jLabel16.setVisible(false);
        text_area.setVisible(false);
        jLabel20.setVisible(false);
        
        
    }

    
    private void show_basic_output(){
        // basic output
        label_BMI.setVisible(true);
        output_BMI.setVisible(true);
        label_weight_status.setVisible(true);
        output_weight_status.setVisible(true);
        jLabel10.setVisible(true);
        jLabel13.setVisible(true);
        
        // food plan for weight loss or gain
        jLabel17.setVisible(true);
        jTextField5.setVisible(true);
        jLabel18.setVisible(true);
        jTextField6.setVisible(true);
        jLabel21.setVisible(true);
        jButton1.setVisible(true);
        jButton3.setVisible(true);
        
        // food plan
        jLabel16.setVisible(true);
        text_area.setVisible(true);
        jLabel20.setVisible(true);
    }
    
    private String food_plan_method(){ // user defined method for file buffering
        String foodplan = "";
        String filename = null;
        
        if(age <= 3){
            if(calorie < 1200.0){ //1
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\01. Age 2-3 1000.txt";
            }
            else if(calorie < 1400.0){ //2
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\02. Age 2-3 1200.txt";
            }
            else{ //3
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\03. Age 2-3 1400.txt";
            }
        }
        else if(age>=4 && age<=8){
            if(calorie < 1400.0){ //4
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\04. Age 4-8 1200.txt";
            }
            else if(calorie < 1600.0){ //5
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\05. Age 4-8 1400.txt";
            }
            else if(calorie < 1800.0){ //6
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\06. Age 4-8 1600.txt";
            }
            else if(calorie < 2000.0){ //7
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\07. Age 4-8 1800.txt";
            }
            else{ //8
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\08. Age 4-8 2000.txt";
            }
        }
        else if(age>=9 && age<=13){
            if(calorie < 1800.0){ //9
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\09. Age 9-13 1600.txt";
            }
            else if(calorie < 2000.0){ //10
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\10. Age 9-13 1800.txt";
            }
            else if(calorie < 2200.0){ //11
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\11. Age 9-13 2000.txt";
            }
            else if(calorie < 2400.0){ //12
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\12. Age 9-13 2200.txt";
            }
            else if(calorie < 2600.0){ //13
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\13. Age 9-13 2400.txt";
            }
            else if(calorie < 2800.0){ //14
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\14. Age 9-13 2600.txt";
            }
            else if(calorie < 3000.0){ //15
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\15. Age 9-13 2800.txt";
            }
            else if(calorie < 3200.0){ //16
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\16. Age 9-13 3000.txt";
            }
            else{ //17
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\17. Age 9-13 3200.txt";
            }
        }
        else if(age>=14){
            if(calorie < 1800.0){ //18
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\18. Age 14+ 1600.txt";
            }
            else if(calorie < 2000.0){ //19
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\19. Age 14+ 1800.txt";
            }
            else if(calorie < 2200.0){ //20
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\20. Age 14+ 2000.txt";
            }
            else if(calorie < 2400.0){ //21
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\21. Age 14+ 2200.txt";
            }
            else if(calorie < 2600.0){ //22
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\22. Age 14+ 2400.txt";
            }
            else if(calorie < 2800.0){ //23
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\23. Age 14+ 2600.txt";
            }
            else if(calorie < 3000.0){ //24
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\24. Age 14+ 2800.txt";
            }
            else if(calorie < 3200.0){ //25
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\25. Age 14+ 3000.txt";
            }
            else{ //26
                filename = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\FitMyWeight\\ProjectData\\26. Age 14+ 3200.txt";
            }
        }
        
        StringBuffer buffer_object = new StringBuffer();
        try {
            foodplan = buffer_object.buffer(filename);
        } catch (IOException ex) {
            Logger.getLogger(JFramePractice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return foodplan;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        text_area = new javax.swing.JTextArea();
        label_BMI = new javax.swing.JLabel();
        label_weight_status = new javax.swing.JLabel();
        output_BMI = new javax.swing.JLabel();
        output_weight_status = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FitMyWeight");
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(390, 15, 500, 600));
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Age");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Years ( ≥2 )");

        jLabel3.setText("Gender");

        jLabel4.setText("Weight");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Kilograms");

        jLabel6.setText("Height");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Feet");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Inches");

        jLabel9.setText("Physical Activity");

        jRadioButton3.setText("Sedentary (little or no exercise)");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Lightly active (light exercise or sports 1-3 days per week)");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("Moderately active (moderate exercise or sports 3-5 days per week)");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("Very active (hard exercise or sports 6-7 days per week)");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Calculate BMI, Calorie Intake and Food Plan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel16.setText("Recommended daily food plan (maintenance):");

        text_area.setColumns(20);
        text_area.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        text_area.setRows(5);
        text_area.setBorder(null);
        jScrollPane2.setViewportView(text_area);

        label_BMI.setText("Your BMI:");

        label_weight_status.setText("Weight Status:");

        jLabel10.setText("Daily calorie required for current weight maintainance:");

        jLabel17.setText("Food plan for weight loss or gain:");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("kg(s)   in");

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Loss");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("week(s)");

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Gain");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel20.setText("Consulting doctor and/or nutritionist is recommended.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label_weight_status, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel1)
                                .addGap(10, 10, 10)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jRadioButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(10, 10, 10)
                                .addComponent(jRadioButton3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jRadioButton4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jRadioButton5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jRadioButton6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(454, 454, 454)
                                .addComponent(jLabel15))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(389, 389, 389)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_BMI, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(output_BMI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(211, 211, 211)
                                .addComponent(output_weight_status)
                                .addGap(75, 75, 75))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(14, 14, 14))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField1, jTextField2, jTextField3, jTextField4});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField5, jTextField6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3))
                            .addComponent(jRadioButton1))
                        .addComponent(jRadioButton2)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel9))
                            .addComponent(jRadioButton3))
                        .addComponent(jRadioButton4)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton5)
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(output_BMI)
                            .addComponent(label_BMI)
                            .addComponent(label_weight_status)
                            .addComponent(output_weight_status))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jButton1)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField1, jTextField2, jTextField3, jTextField4});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField5, jTextField6});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // taking age input
        String str = jTextField1.getText();
        age = Integer.parseInt(str);
        
        // taking weight input
        str = jTextField2.getText();
        weight_in_kg = Double.parseDouble(str);
        
        // taking height_in_feet input
        str = jTextField3.getText();
        height_in_feet = Double.parseDouble(str);
        height_in_cm = height_in_feet * 30.48;
        
        // taking height_in_inch input
        str = jTextField4.getText();
        height_in_inch = Double.parseDouble(str);
        height_in_cm += height_in_inch * 2.54;
        
        
        double height_in_meter = height_in_cm / 100.0;
        BMI = weight_in_kg / (height_in_meter * height_in_meter); // BMI Calculation
        if(gender == 1) BMR = (10.0 * weight_in_kg) + (6.25 * height_in_cm) - (5.0 * age) + 5.0; // male
        else BMR = (10.0 * weight_in_kg) + (6.25 * height_in_cm) - (5.0 * age) - 161.0; // female
        calorie = BMR * physical_activity; // daily calorie intake recommendation 
        
        
        // setting weight status
        String weight_status = "";
        if(BMI < 15)  weight_status = "Very severely underweight";
        else if(BMI>=15 && BMI<=16) weight_status = "Severely underweight";
        else if(BMI>=16 && BMI<18.5) weight_status = "Underweight";
        else if(BMI>=18.5 && BMI<25) weight_status = "Normal healthy weight";
        else if(BMI>=25 && BMI<30) weight_status = "Overweight";
        else if(BMI>=30 && BMI<35) weight_status = "Moderately obese";
        else if(BMI>=35 && BMI<40) weight_status = "Severely obese";
        else if(BMI >= 40) weight_status = "Very severely obese";
        
        food_plan = food_plan_method();
        
        show_basic_output();
        
            
        if(BMI < 18.5){ // underweight
            // weight gain
            jButton1.setVisible(false);
            jButton3.setVisible(true);
        }
        else if(BMI > 25){ // overweight
            // weight loss
            jButton1.setVisible(true);
            jButton3.setVisible(false);
        }
        else{ // healthy weight
            jButton1.setVisible(true);
            jButton3.setVisible(true);
        }
        
        //OUTPUT: printing BMI label
        output_BMI.setText(String.format("%.2f",BMI));
        //OUPUT: printing weight status
        output_weight_status.setText(weight_status);
        //OUTPUT: printing daily calorie intake
        jLabel13.setText(String.format("%.0f calories", calorie));
        
        jTextField5.setText("");
        jTextField6.setText("");
        
        //OUTPUT: foodplan printing
        jLabel16.setText("Recommended daily food plan (maintenance):");
        text_area.setText(food_plan);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected() == true){
            gender = 1;
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected() == true){
            gender = 0;
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton3.isSelected() == true){
            physical_activity = 1.2;
            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton4.isSelected() == true){
            physical_activity = 1.375;
            jRadioButton3.setSelected(false);
            jRadioButton5.setSelected(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton5.isSelected() == true){
            physical_activity = 1.55;
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton6.isSelected() == true){
            physical_activity = 1.725;
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // weight loss processing
        String str = jTextField5.getText();
        double kg = Double.parseDouble(str);
        str = jTextField6.getText();
        int week = Integer.parseInt(str);
        double weight_loss = kg / week;
        
        calorie -= ((500 * weight_loss) / 0.453592);
        
        food_plan = food_plan_method();
        
        jLabel16.setText("Recommended daily food plan (weight loss):");
        text_area.setText(food_plan);
        
        calorie += ((500 * weight_loss) / 0.453592); // restoring the maintenance calorie again
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // weight gain processing
        String str = jTextField5.getText();
        double kg = Double.parseDouble(str);
        str = jTextField6.getText();
        int week = Integer.parseInt(str);
        double weight_gain = kg / week;
        
        calorie += ((500 * weight_gain) / 0.453592);
        
        food_plan = food_plan_method();
        
        jLabel16.setText("Recommended daily food plan (weight gian):");
        text_area.setText(food_plan);
        
        calorie -= ((500 * weight_gain) / 0.453592); // restoring the maintenance calorie again
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePractice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel label_BMI;
    private javax.swing.JLabel label_weight_status;
    private javax.swing.JLabel output_BMI;
    private javax.swing.JLabel output_weight_status;
    private javax.swing.JTextArea text_area;
    // End of variables declaration//GEN-END:variables
}
