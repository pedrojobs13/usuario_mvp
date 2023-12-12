package com.pss.gestaousuarios.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author pedro
 */
public class IncluirUsuariosView extends javax.swing.JFrame {

    private JButton btnFechar;
    private JButton btnSalvar;
    private JLabel lblNome;
    private JLabel lblSalario;
    private JLabel lblEstado; // Adicionei um JLabel para o estado
    private JTextField txtNome;
    private JTextField txtSalario;
    private JTextField txtEstado;
    private JTextField txtTipo; // Adicionei um JTextField para o tipo do usuário

    public IncluirUsuariosView() {
        initComponents();
        this.setLocationRelativeTo(null); // Centraliza a janela
    }

    private void initComponents() {

        lblNome = new JLabel();
        lblSalario = new JLabel();
        lblEstado = new JLabel(); // Inicializa o label do estado
        txtNome = new JTextField();
        txtSalario = new JTextField();
        txtEstado = new JTextField();
        btnSalvar = new JButton();
        btnFechar = new JButton();
        txtTipo = new JTextField(); // Inicializa o campo do tipo do usuário

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Incluir Usuário");

        lblNome.setText("Nome:");

        lblSalario.setText("Salário:");

        lblEstado.setText("Estado:"); // Configura o texto do label do estado

        btnSalvar.setText("Salvar");

        btnFechar.setText("Fechar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNome)
                        .addComponent(lblSalario)
                        .addComponent(lblEstado)) // Adiciona o label do estado ao layout
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                        .addComponent(txtNome)
                        .addComponent(txtEstado)
                        .addComponent(txtTipo)) // Adiciona o campo do tipo do usuário ao layout
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(181, Short.MAX_VALUE)
                    .addComponent(btnSalvar)
                    .addGap(18, 18, 18)
                    .addComponent(btnFechar)
                    .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNome)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSalario)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstado)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar)
                        .addComponent(btnFechar))
                    .addGap(78, 78, 78))
        );

        pack();
    }

    public JButton getBtnFechar() {
        return btnFechar;
    }

    public JButton getBtnSalvar() {
        return btnSalvar;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public JTextField getTxtSalario() {
        return txtSalario;
    }

    public JTextField getTxtEstado() {
        return txtEstado;
    }

    // Método adicionado para obter o campo de texto do tipo do usuário
    public JTextField getTxtTipo() {
        return txtTipo;
    }
}
