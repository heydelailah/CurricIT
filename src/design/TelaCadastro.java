
package design;
import classes.Nsa;
import classes.ParticipantesNsa;


import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JInternalFrame {

    public TelaCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        point_Consult = new javax.swing.JLabel();
        AnoIngr_Consult = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        situation_Consult = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idade_Consult = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        habilidade_Consult = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cargo_Consult = new javax.swing.JLabel();
        btn_consulta = new javax.swing.JButton();
        nome_consult = new javax.swing.JLabel();
        EntradaText = new javax.swing.JTextField();
        btn_remove = new javax.swing.JButton();
        salvar_Cadastral = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        password_cadastro = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        habilidade_cadastro = new javax.swing.JComboBox();
        cargo_cadastro = new javax.swing.JComboBox();
        email_Cadastro = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome_cadastro = new javax.swing.JFormattedTextField();
        sexo_cadastro = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        pass_obg = new javax.swing.JLabel();
        nome_obg = new javax.swing.JLabel();
        email_obg = new javax.swing.JLabel();
        idade_obg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idade_cadastro = new javax.swing.JFormattedTextField();
        email_Cadastro1 = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        idade_cadastro1 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        nome_cadastro1 = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        password_cadastro1 = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        habilidade_cadastro1 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        cargo_cadastro1 = new javax.swing.JComboBox();
        sexo_cadastro1 = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("NSAFORM");

        point_Consult.setText("0");

        AnoIngr_Consult.setText("AnoInsc:");

        jLabel10.setText("AnoInsc:");

        jLabel11.setText("idade:");

        jLabel16.setText("situação:");

        label.setText("pontuação:");

        situation_Consult.setText("pendente");

        jLabel1.setText("ProcurarPor");

        jLabel12.setText("cargo:");

        idade_Consult.setText("idade:");

        jLabel13.setText("habilidade:");

        habilidade_Consult.setText("habilidade:");

        jLabel15.setText("nome:");

        cargo_Consult.setText("cargo:");

        btn_consulta.setText("Consultar");
        btn_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaActionPerformed(evt);
            }
        });
        btn_consulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_consultaKeyPressed(evt);
            }
        });

        nome_consult.setText("nome:");

        EntradaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaTextActionPerformed(evt);
            }
        });
        EntradaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntradaTextKeyPressed(evt);
            }
        });

        btn_remove.setText("remover");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        btn_remove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_removeKeyPressed(evt);
            }
        });

        salvar_Cadastral.setText("sair");
        salvar_Cadastral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_CadastralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(salvar_Cadastral, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_remove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_consulta)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntradaText, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(label))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnoIngr_Consult)
                    .addComponent(idade_Consult)
                    .addComponent(habilidade_Consult)
                    .addComponent(cargo_Consult)
                    .addComponent(nome_consult)
                    .addComponent(point_Consult)
                    .addComponent(situation_Consult, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(nome_consult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargo_Consult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(habilidade_Consult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idade_Consult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AnoIngr_Consult))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(btn_consulta)
                                    .addComponent(btn_remove)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(EntradaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(situation_Consult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(point_Consult))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(salvar_Cadastral)
                .addGap(69, 69, 69))
        );

        jLabel8.setText("Password");

        password_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_cadastroActionPerformed(evt);
            }
        });
        password_cadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                password_cadastroFocusLost(evt);
            }
        });
        password_cadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_cadastroKeyPressed(evt);
            }
        });

        jLabel7.setText("sexo");

        jLabel6.setText("Habilidade");

        jLabel4.setText("Cargo");

        habilidade_cadastro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "java", "c", "delphi", "assembly" }));

        cargo_cadastro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "analista", "DBA", "programador", "estudante" }));

        email_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_CadastroActionPerformed(evt);
            }
        });
        email_Cadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_CadastroFocusLost(evt);
            }
        });
        email_Cadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                email_CadastroKeyPressed(evt);
            }
        });

        jLabel9.setText("email");

        jLabel2.setText("UserName");

        nome_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_cadastroActionPerformed(evt);
            }
        });
        nome_cadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nome_cadastroFocusLost(evt);
            }
        });

        sexo_cadastro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "masculino", "feminino" }));

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        pass_obg.setForeground(new java.awt.Color(255, 51, 51));
        pass_obg.setText("√");
        pass_obg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass_obgMouseClicked(evt);
            }
        });

        nome_obg.setForeground(new java.awt.Color(255, 51, 51));
        nome_obg.setText("√");

        email_obg.setForeground(new java.awt.Color(255, 51, 51));
        email_obg.setText("√");
        email_obg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                email_obgMouseClicked(evt);
            }
        });

        idade_obg.setForeground(new java.awt.Color(255, 51, 51));
        idade_obg.setText("√");

        jLabel5.setText("Idade");

        idade_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idade_cadastroActionPerformed(evt);
            }
        });
        idade_cadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idade_cadastroFocusLost(evt);
            }
        });
        idade_cadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idade_cadastroKeyPressed(evt);
            }
        });

        email_Cadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_Cadastro1ActionPerformed(evt);
            }
        });
        email_Cadastro1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_Cadastro1FocusLost(evt);
            }
        });
        email_Cadastro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                email_Cadastro1KeyPressed(evt);
            }
        });

        jLabel14.setText("email");

        jLabel17.setText("Idade");

        idade_cadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idade_cadastro1ActionPerformed(evt);
            }
        });
        idade_cadastro1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idade_cadastro1FocusLost(evt);
            }
        });
        idade_cadastro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idade_cadastro1KeyPressed(evt);
            }
        });

        jLabel3.setText("UserName");

        nome_cadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_cadastro1ActionPerformed(evt);
            }
        });
        nome_cadastro1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nome_cadastro1FocusLost(evt);
            }
        });

        jLabel18.setText("Password");

        password_cadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_cadastro1ActionPerformed(evt);
            }
        });
        password_cadastro1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                password_cadastro1FocusLost(evt);
            }
        });
        password_cadastro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_cadastro1KeyPressed(evt);
            }
        });

        jLabel19.setText("Habilidade");

        habilidade_cadastro1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "java", "c", "delphi", "assembly" }));

        jLabel20.setText("Cargo");

        cargo_cadastro1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "analista", "DBA", "programador", "estudante" }));

        sexo_cadastro1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "masculino", "feminino" }));

        jLabel21.setText("sexo");

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
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
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(174, 174, 174))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(habilidade_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cargo_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(sexo_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel8)))
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(email_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(nome_cadastro, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(password_cadastro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(idade_cadastro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pass_obg)
                                            .addComponent(nome_obg)
                                            .addComponent(email_obg)
                                            .addComponent(idade_obg))))
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(171, 171, 171))
                            .addComponent(jLabel21)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(habilidade_cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cargo_cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(sexo_cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18)))
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(email_Cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nome_cadastro1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(password_cadastro1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(idade_cadastro1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(email_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_obg))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idade_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(idade_obg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nome_obg)
                                    .addComponent(nome_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(password_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pass_obg)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(habilidade_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cargo_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(sexo_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(email_Cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idade_cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nome_cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(password_cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(habilidade_cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cargo_cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(sexo_cadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleName("GoldxForm");

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static int i;
public static int k; 

public int emj;     
   

/*
    Limpar campos de cadastro
    */
public void cls(){
nome_cadastro.setText(null);
password_cadastro.setText(null);
idade_cadastro.setText(null);
email_Cadastro.setText(null);
 }






//limpar entrada texto
public void clsEntrada(){
      EntradaText.setText(null);
     }
 
     
     
 //procurar nome    

public void SearchPrtc(String s){
    int ky=0;
                for(int n=0;n<Nsa.key;n++)
        if(Nsa.prtc[n].getNome().equals(s) )
       ky=1;
       
        
       switch(ky){
            case 1:{
                for(int m =0;m<Nsa.key;m++)
        if(Nsa.prtc[m].getNome().equals(s)){
             i=m;
pesq();
         }
break;

            }
            case 0:
                      JOptionPane.showMessageDialog(null,"usuário não encontrado.");

        }
        
    
    
    clsEntrada();
}
  
  
    

      
//valida obrigatorio
public void TurnOff(){
boolean a=true,b=true,c=true,d=true;
idade_obg.setVisible(a);
pass_obg.setVisible(b);
nome_obg.setVisible(c);
email_obg.setVisible(d);

  idade_obg.setForeground(Color.red);
pass_obg.setForeground(Color.red);
nome_obg.setForeground(Color.red);
email_obg.setForeground(Color.red);

}



public void TurnOn(){
boolean a,b,c,d;
a=idade_cadastro.getText().isEmpty()?true:false;
idade_obg.setVisible(a);

  b=new String(password_cadastro.getPassword()).isEmpty()?true:false;
pass_obg.setVisible(b); 
c=nome_cadastro.getText().isEmpty()?true:false;
nome_obg.setVisible(c);
d=email_Cadastro.getText().isEmpty()?true:false;
email_obg.setVisible(d);  
}




      
      //excluindo partc
public void xcluindoPrtc(String s){
   Nsa ns = new Nsa();
     ParticipantesNsa remove = new ParticipantesNsa();
        int ky=0;
                for(int n=0;n<Nsa.key;n++)
        if(Nsa.prtc[n].getNome().equals(s) )
       ky=1;
       
        
       switch(ky){
            case 1:{
              for(int m=0;m<Nsa.key;m++)
        if(Nsa.prtc[m].getNome().trim().equals(s)){
      i=m;
      remove.booble(i);
remove.ids();

lim();
for(int n=0;n<Nsa.Mb;n++)
        if(Nsa.member[n].getNome().equals(EntradaText.getText()))
         ns.booble(n);
           
         }
              
              
break;

            }
            case 0:
                      JOptionPane.showMessageDialog(null,"usuário não encontrado.");

        }
        
    
    
    clsEntrada();

    
    }
    
    






    
      //excluindo membro
public void xcluindoMember(String s){

    Nsa ns = new Nsa();
    for(int n=0;n<Nsa.Mb;n++)
        if(Nsa.member[n].getNome().equals(s))
           ns.booble(n);
    clsEntrada();

    
    }
  






      
//procurar nome no menbro
public void SearchMembro(String s){
Nsa ns = new Nsa();
          for(int m=0;m<Nsa.Mb;m++)
if(Nsa.member[m].getId().equals(s)){
ns.booble(m);
break;
}
}


public void xcluindoMembro(String s){
Nsa ns = new Nsa(); 
SearchMembro(s);
ns.booble(i);
clsEntrada();
}

      
      

      
      

//setar nome nos labels
public void pesq(){

          
     
nome_consult.setText(Nsa.prtc[i].getNome());
cargo_Consult.setText(Nsa.prtc[i].getCargo());
habilidade_Consult.setText(Nsa.prtc[i].getHabilidade());
idade_Consult.setText(Integer.toString(Nsa.prtc[i].getIdade()));
AnoIngr_Consult.setText(Nsa.prtc[i].getAnoIns());
situation_Consult.setText(Nsa.prtc[i].getSituation());
point_Consult.setText(Integer.toString(Nsa.prtc[i].getPontos()));

       }
       
       

       
     //limpar label  
public void lim(){

nome_consult.setText(null);
cargo_Consult.setText(null);
habilidade_Consult.setText(null);
idade_Consult.setText(null);
AnoIngr_Consult.setText(null);
point_Consult.setText(null);      
situation_Consult.setText(null);       
       }
       
       
       //armazenar combobox numa string
public String item(){
String Sm=(String) habilidade_cadastro.getSelectedItem();
return Sm;
}      

//blocker campo se nome for igual
   public void NoRepeatName(String repeat){
 boolean blck=true;
       for(int i=0;i<Nsa.key;i++)
   if(Nsa.prtc[i].getNome().equals(repeat)){
         JOptionPane.showMessageDialog(null,"usuário em uso!");
blck=false;
nome_cadastro.setText(null);
break;  
   }
   
   }
   
   
   
   
   
   //blocker campo se nome for igual
   public void NoRepeatEmail(String repeat){
 boolean blck=true;
       for(int i=0;i<Nsa.key;i++)
   if(Nsa.prtc[i].getNome().equals(repeat)){
         JOptionPane.showMessageDialog(null,"email em uso!");
         emj=1;
blck=false;
email_Cadastro.setText(null);
break;  
   }
   
   }
   
   
   
   
public void MudarObg(){
email_obg.setVisible(true);
email_obg.setText("limpar");
}





//blocker idade
   public void IdadeChk(){
 //MudarPass();
   }
   
   
   
   
   
public void MudarPass(){
email_obg.setVisible(true);
email_obg.setText("limpar");

}
   

  


  
  
  
  
  
  
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        if(idade_cadastro.getText().isEmpty() || new String(password_cadastro.getPassword()).isEmpty() || nome_cadastro.getText().isEmpty() || email_Cadastro.getText().isEmpty()){
     
    JOptionPane.showMessageDialog(null,"valores não podem ser nulo");  

}

   

else{
            
ParticipantesNsa cad = new ParticipantesNsa();            
//cad.Cad(id_aleat.getText(),nome_cadastro.getText(),new String(password_cadastro.getPassword()),Integer.parseInt(idade_cadastro.getText()),habilidade_cadastro.getSelectedItem().toString(),cargo_cadastro.getSelectedItem().toString(),email_Cadastro.getText(),sexo_cadastro.getSelectedItem().toString());
cls();
cad.imp();
TurnOff();
        }
    }//GEN-LAST:event_jButton1ActionPerformed





    private void password_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_cadastroActionPerformed

    private void email_CadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_CadastroKeyPressed

        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
 if(idade_cadastro.getText().isEmpty() || new String(password_cadastro.getPassword()).isEmpty() || nome_cadastro.getText().isEmpty() || email_Cadastro.getText().isEmpty())
 {
     
    JOptionPane.showMessageDialog(null,"valores não podem ser nulo");  
 }

ParticipantesNsa cad = new ParticipantesNsa();            
//cad.Cad(id_aleat.getText(),nome_cadastro.getText(),new String(password_cadastro.getPassword()),Integer.parseInt(idade_cadastro.getText()),habilidade_cadastro.getSelectedItem().toString(),cargo_cadastro.getSelectedItem().toString(),email_Cadastro.getText(),sexo_cadastro.getSelectedItem().toString());
cls();
cad.imp();
TurnOff();

    }//GEN-LAST:event_email_CadastroKeyPressed
    }
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void email_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_CadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_CadastroActionPerformed

    private void salvar_CadastralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_CadastralActionPerformed
        this.dispose();
    }//GEN-LAST:event_salvar_CadastralActionPerformed

    private void idade_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idade_cadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idade_cadastroActionPerformed

    private void nome_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_cadastroActionPerformed

    
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_cadastroActionPerformed

    private void btn_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaActionPerformed
//        SearchPrtc(EntradaText.getText());
        SearchPrtc(EntradaText.getText());


    }//GEN-LAST:event_btn_consultaActionPerformed

    private void btn_consultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_consultaKeyPressed

    }//GEN-LAST:event_btn_consultaKeyPressed

    private void EntradaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaTextActionPerformed

    private void EntradaTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaTextKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
//  SearchPrtc(EntradaText.getText());
  SearchPrtc(EntradaText.getText());
        }
    }//GEN-LAST:event_EntradaTextKeyPressed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
Nsa ns = new Nsa();

xcluindoPrtc(EntradaText.getText());    
 
            // ns.booble(n);
//ns.booble(i);
     // TODO add your handling code here:
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_removeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_removeKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_removeKeyPressed

    private void idade_cadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idade_cadastroKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_TAB){
    System.out.println("ala"); 
}     
        
// TODO add your handling code here:
    }//GEN-LAST:event_idade_cadastroKeyPressed

    private void idade_cadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idade_cadastroFocusLost
if(idade_cadastro.getText().isEmpty()){
 boolean c;
    c=idade_cadastro.getText().isEmpty()?true:false;
  if(c==false)
  {idade_obg.setForeground(Color.green); }
 // else{idade_obg.setForeground(Color.red);}
}
  else{
        String idad="\\d+";
boolean x=idade_cadastro.getText().matches(idad);
        if(x==false){
JOptionPane.showMessageDialog(null,"apenas números!");
idade_cadastro.setText(null);
  
        }
        
}

 boolean c;
    c=idade_cadastro.getText().isEmpty()?true:false;
      //  System.out.println(c); 
    // nome_obg.setVisible(c);    
  if(c==false){
   // // nome_obg.setText("ok");
    idade_obg.setForeground(Color.green);
//nome_obg.setBackground(Color.blue);
  }else{
      idade_obg.setForeground(Color.red);

       // boolean a;
      //  a=idade_cadastro.getText().isEmpty()?true:false;
//idade_obg.setVisible(a);
// TODO add your handling code here:
    }//GEN-LAST:event_idade_cadastroFocusLost

}

    private void password_cadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_cadastroFocusLost
// boolean b;
//    b=new String(password_cadastro.getPassword()).isEmpty()?true:false;
  //      pass_obg.setVisible(b);  
   boolean c;
    c=new String(password_cadastro.getPassword()).isEmpty()?true:false;
      //  System.out.println(c); 
    // nome_obg.setVisible(c);    
  if(c==false){
   // // nome_obg.setText("ok");
    pass_obg.setForeground(Color.green);
//nome_obg.setBackground(Color.blue);
  }else{
      pass_obg.setForeground(Color.red);      
// TODO add your handling code here:
    }//GEN-LAST:event_password_cadastroFocusLost
    }
    private void nome_cadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome_cadastroFocusLost
    
        boolean c;
    c=nome_cadastro.getText().isEmpty()?true:false;
      //  System.out.println(c); 
    // nome_obg.setVisible(c);    
  if(c==false){
   // // nome_obg.setText("ok");
    nome_obg.setForeground(Color.green);
//nome_obg.setBackground(Color.blue);
  }else{
      nome_obg.setForeground(Color.red);

  }


        NoRepeatName(nome_cadastro.getText()); 
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_cadastroFocusLost
    
    private void email_CadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_CadastroFocusLost

        
        boolean d;
    d=email_Cadastro.getText().isEmpty()?true:false;
     
    if(d==false){
   // // nome_obg.setText("ok");
    email_obg.setForeground(Color.green);
//nome_obg.setBackground(Color.blue);
  }else{
      email_obg.setForeground(Color.red);

  }
NoRepeatEmail(email_Cadastro.getText()); 

//email_obg.setVisible(d);
     //     nome_obg.setText("ok");
    //nome_obg.setForeground(Color.blue);
// TODO add your handling code here:
    }//GEN-LAST:event_email_CadastroFocusLost

    private void email_obgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_obgMouseClicked
    email_Cadastro.setEditable(true);
    email_obg.setVisible(false);
    email_obg.setText("Obrigatório");
    // TODO add your handling code here:
    }//GEN-LAST:event_email_obgMouseClicked

    private void pass_obgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_obgMouseClicked
boolean d;
    d=password_cadastro.getText().isEmpty()?true:false;
     
    if(d==false){
   // // nome_obg.setText("ok");
    pass_obg.setForeground(Color.green);
//nome_obg.setBackground(Color.blue);
  }else{
      pass_obg.setForeground(Color.red);

  }     

//   password_cadastro.setEditable(true);    
    //    pass_obg.setVisible(false);
   // pass_obg.setText("Obrigatório");
// TODO add your handling code here:
    }//GEN-LAST:event_pass_obgMouseClicked

    private void password_cadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_cadastroKeyPressed
 if(evt.getKeyCode()==KeyEvent.VK_ENTER){
 if(idade_cadastro.getText().isEmpty() || new String(password_cadastro.getPassword()).isEmpty() || nome_cadastro.getText().isEmpty() || email_Cadastro.getText().isEmpty())
 {
     
    JOptionPane.showMessageDialog(null,"valores não podem ser nulo");  
 }

ParticipantesNsa cad = new ParticipantesNsa();            
//cad.Cad(id_aleat.getText(),nome_cadastro.getText(),new String(password_cadastro.getPassword()),Integer.parseInt(idade_cadastro.getText()),habilidade_cadastro.getSelectedItem().toString(),cargo_cadastro.getSelectedItem().toString(),email_Cadastro.getText(),sexo_cadastro.getSelectedItem().toString());
cls();
cad.imp();
TurnOff();

    }                                         
            // TODO add your handling code here:
    }//GEN-LAST:event_password_cadastroKeyPressed

    private void email_Cadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_Cadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_Cadastro1ActionPerformed

    private void email_Cadastro1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_Cadastro1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_email_Cadastro1FocusLost

    private void email_Cadastro1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_Cadastro1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_Cadastro1KeyPressed

    private void idade_cadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idade_cadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idade_cadastro1ActionPerformed

    private void idade_cadastro1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idade_cadastro1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_idade_cadastro1FocusLost

    private void idade_cadastro1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idade_cadastro1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_idade_cadastro1KeyPressed

    private void nome_cadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_cadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_cadastro1ActionPerformed

    private void nome_cadastro1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome_cadastro1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_cadastro1FocusLost

    private void password_cadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_cadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_cadastro1ActionPerformed

    private void password_cadastro1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_cadastro1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_password_cadastro1FocusLost

    private void password_cadastro1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_cadastro1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_cadastro1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2KeyPressed
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnoIngr_Consult;
    private javax.swing.JTextField EntradaText;
    private javax.swing.JButton btn_consulta;
    private javax.swing.JButton btn_remove;
    private javax.swing.JLabel cargo_Consult;
    private javax.swing.JComboBox cargo_cadastro;
    private javax.swing.JComboBox cargo_cadastro1;
    private javax.swing.JFormattedTextField email_Cadastro;
    private javax.swing.JFormattedTextField email_Cadastro1;
    private javax.swing.JLabel email_obg;
    private javax.swing.JLabel habilidade_Consult;
    private javax.swing.JComboBox habilidade_cadastro;
    private javax.swing.JComboBox habilidade_cadastro1;
    private javax.swing.JLabel idade_Consult;
    private javax.swing.JFormattedTextField idade_cadastro;
    private javax.swing.JFormattedTextField idade_cadastro1;
    private javax.swing.JLabel idade_obg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JFormattedTextField nome_cadastro;
    private javax.swing.JFormattedTextField nome_cadastro1;
    private javax.swing.JLabel nome_consult;
    private javax.swing.JLabel nome_obg;
    private javax.swing.JLabel pass_obg;
    private javax.swing.JPasswordField password_cadastro;
    private javax.swing.JPasswordField password_cadastro1;
    private javax.swing.JLabel point_Consult;
    private javax.swing.JButton salvar_Cadastral;
    private javax.swing.JComboBox sexo_cadastro;
    private javax.swing.JComboBox sexo_cadastro1;
    private javax.swing.JLabel situation_Consult;
    // End of variables declaration//GEN-END:variables
/*
    private void pesq(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/

   
    }
