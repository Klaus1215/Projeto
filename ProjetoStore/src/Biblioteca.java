
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.SwingWorker;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author thiag
 */
public class Biblioteca extends javax.swing.JFrame {
    
    String recTextNome;
    String recTextSenha;
    String recTextEmail;
    String jogo1 = null;
    String jogo2 = null;
    String jogo3 = null;
    private static ArrayList<String> jogos1 = new ArrayList<>();

    /**
     * Creates new form Biblioteca
     *
     * @param nome
     * @param senha
     * @param email
     */
    public Biblioteca(String nome, String senha, String email) {
        initComponents();
        this.recTextNome = nome;
        this.recTextSenha = senha;
        this.recTextEmail = email;
    }
    
    private Biblioteca() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void adicionarbiblioteca(ArrayList jogos) {
        jogos1 = jogos;
        for (String j : jogos1) {
            biblioteca.addItem(j);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        altUsuario = new javax.swing.JButton();
        voltarLogin = new javax.swing.JButton();
        acao = new javax.swing.JComboBox<>();
        estrategia = new javax.swing.JComboBox<>();
        Gratuitos = new javax.swing.JLabel();
        Ação = new javax.swing.JLabel();
        Estratégia = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        BIBLIOTECA = new javax.swing.JLabel();
        biblioteca = new javax.swing.JComboBox<>();
        gratis = new javax.swing.JComboBox<>();
        pesquisarJogo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jogar = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 51, 255));

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        altUsuario.setForeground(new java.awt.Color(51, 51, 255));
        altUsuario.setText("👤 Usuário");
        altUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altUsuarioActionPerformed(evt);
            }
        });

        voltarLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        voltarLogin.setForeground(new java.awt.Color(51, 51, 255));
        voltarLogin.setText("←");
        voltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(voltarLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(altUsuario))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(altUsuario)
                .addComponent(voltarLogin))
        );

        acao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Uncharted 4", "God of war", "The BookWalker", "Outer Wilds" }));
        acao.setMinimumSize(new java.awt.Dimension(118, 22));
        acao.setPreferredSize(new java.awt.Dimension(118, 22));
        acao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acaoActionPerformed(evt);
            }
        });

        estrategia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Risk", "Runeterra", "Marvel Snap", "Midnight Sun" }));
        estrategia.setPreferredSize(new java.awt.Dimension(118, 22));
        estrategia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estrategiaActionPerformed(evt);
            }
        });

        Gratuitos.setBackground(new java.awt.Color(255, 255, 255));
        Gratuitos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Gratuitos.setForeground(new java.awt.Color(255, 255, 255));
        Gratuitos.setText("Gratuitos");

        Ação.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ação.setForeground(new java.awt.Color(255, 255, 255));
        Ação.setText("Ação");

        Estratégia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Estratégia.setForeground(new java.awt.Color(255, 255, 255));
        Estratégia.setText("Estratégia");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        BIBLIOTECA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BIBLIOTECA.setForeground(new java.awt.Color(255, 255, 255));
        BIBLIOTECA.setText("BIBLIOTECA DE JOGOS");

        biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bibliotecaActionPerformed(evt);
            }
        });

        gratis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Valorant", "Counter Strike 2", "Dota", "Apex Legends" }));
        gratis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gratisActionPerformed(evt);
            }
        });

        pesquisarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarJogoActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 255, 204));
        jLabel10.setText("🔍");

        jogar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jogar.setForeground(new java.awt.Color(51, 51, 255));
        jogar.setText("Jogar");
        jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarActionPerformed(evt);
            }
        });

        progressBar.setBackground(new java.awt.Color(255, 255, 255));
        progressBar.setForeground(new java.awt.Color(0, 255, 204));
        progressBar.setMaximum(10);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pesquisarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(138, 138, 138))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(Ação)
                                .addGap(101, 101, 101)
                                .addComponent(Estratégia)
                                .addGap(82, 82, 82)
                                .addComponent(Gratuitos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(acao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(estrategia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(gratis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(biblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jogar))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(BIBLIOTECA)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ação)
                    .addComponent(Estratégia)
                    .addComponent(Gratuitos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estrategia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gratis, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BIBLIOTECA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jogar)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(biblioteca)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void acaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acaoActionPerformed
        String selecao = acao.getSelectedItem().toString();
        
        switch (selecao) {
            case "Uncharted 4" -> {
                jogo1 = "Uncharted 4";
                jogo2 = "Criada pela premiada desenvolvedora Naughty Dog, a série UNCHARTED"
                        + "\n" + "é uma experiência cinematográfica de ação e aventura em que você pode revelar mistérios"
                        + "\n" + "históricos enquanto viaja pelos mais variados e deslumbrantes ambientes renderizados.";
                jogo3 = "120";
            }
            case "God of war" -> {
                jogo1 = "God of war";
                jogo2 = "Com a vingança contra os deuses do Olimpo em um passado distante, "
                        + "\n" + "Kratos agora vive como um mortal no reino dos deuses e monstros nórdicos. "
                        + "\n" + "É nesse mundo duro e implacável que ele deve lutar para sobreviver... e ensinar seu filho a fazer o mesmo.";
                jogo3 = "240";
            }
            case "The BookWalker" -> {
                jogo1 = "The BookWalker";
                jogo2 = "Você joga como Etienne Quist, um escritor que vira um ladrão capaz de mergulhar nos livros"
                        + "\n" + "Use seus poderes e navegue entre realidade e mundos literários para roubar itens"
                        + "\n" + "lendários, como o Martelo de Thor e a Excalibur, e recuperar sua capacidade de escrever.";
                jogo3 = "57.90";
            }
            case "Outer Wilds" -> {
                jogo1 = "Outer Wilds";
                jogo2 = "O Outer Wilds é um jogo de mistério de mundo aberto que é ambientado em um sistema solar"
                        + "\n" + "fadado a um loop temporal perpétuo.";
                jogo3 = "100";
            }
            default ->
                throw new AssertionError();
        }
        
        Detalhes frame2 = new Detalhes(jogo1, jogo2, jogo3, recTextNome, recTextSenha, recTextEmail);
        frame2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_acaoActionPerformed

    private void bibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bibliotecaActionPerformed

    }//GEN-LAST:event_bibliotecaActionPerformed

    private void pesquisarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarJogoActionPerformed
        String pesquisar = pesquisarJogo.getText();
        
        switch (pesquisar) {
            case "Uncharted 4", "uncharted 4" -> {
                jogo1 = "Uncharted 4";
                jogo2 = "Criada pela premiada desenvolvedora Naughty Dog, a série UNCHARTED"
                        + "\n" + "é uma experiência cinematográfica de ação e aventura em que você pode revelar mistérios"
                        + "\n" + "históricos enquanto viaja pelos mais variados e deslumbrantes ambientes renderizados.";
                jogo3 = "120";
            }
            case "God of war", "god of war" -> {
                jogo1 = "God of war";
                jogo2 = "Com a vingança contra os deuses do Olimpo em um passado distante, "
                        + "\n" + "Kratos agora vive como um mortal no reino dos deuses e monstros nórdicos. "
                        + "\n" + "É nesse mundo duro e implacável que ele deve lutar para sobreviver... e ensinar seu filho a fazer o mesmo.";
                jogo3 = "240";
            }
            case "The BookWalker", "the bookwalker" -> {
                jogo1 = "The BookWalker";
                jogo2 = "Você joga como Etienne Quist, um escritor que vira um ladrão capaz de mergulhar nos livros"
                        + "\n" + "Use seus poderes e navegue entre realidade e mundos literários para roubar itens"
                        + "\n" + "lendários, como o Martelo de Thor e a Excalibur, e recuperar sua capacidade de escrever.";
                jogo3 = "57.90";
            }
            case "Outer Wilds", "outer wilds" -> {
                jogo1 = "Outer Wilds";
                jogo2 = "O Outer Wilds é um jogo de mistério de mundo aberto que é ambientado em um sistema solar"
                        + "\n" + "fadado a um loop temporal perpétuo.";
                jogo3 = "100";
            }
            case "Valorant", "valorant" -> {
                jogo1 = "VALORANT";
                jogo2 = "Um jogo de tiro tático 5x5 com personagens originais"
                        + "\n" + "Você terá 13 rodadas para atacar e defender com disparos certeiros "
                        + "\n" + "e habilidades táticas. Com apenas uma vida por rodada";
                jogo3 = "Gratuito";
            }
            case "Counter Strike 2", "counter strike 2" -> {
                jogo1 = "Counter Strike 2";
                jogo2 = "O Counter-Strike 2 é um jogo de tiro em primeira pessoa tático desenvolvido"
                        + "\n" + "e publicado pela Valve. É o quinto título principal da série Counter-Strike "
                        + "\n" + "Com apenas uma vida por rodada";
                jogo3 = "Gratuito";
            }
            case "Apex Legends", "apex legends" -> {
                jogo1 = "Apex Legends";
                jogo2 = "um jogo de de tiro de heróis e heroínas grátis"
                        + "\n" + "Explore uma variedade crescente de Lendas,"
                        + "\n" + "cada uma com personalidade, vantagens e habilidades únicas";
                jogo3 = "Gratuito";
            }
            case "Dota", "dota" -> {
                jogo1 = "DOTA";
                jogo2 = "Dota 2 é um videogame multijogador online de arena de batalha"
                        + "\n" + "desenvolvido pela Valve Corporation. O jogo foi lançado oficialmente"
                        + "\n" + "em 2013 e está disponível como um título free-to-play";
                jogo3 = "Gratuito";
            }
            case "Risk", "risk" -> {
                jogo1 = "RISK";
                jogo2 = "É a versão digital oficial do icônico jogo de tabuleiro RISK"
                        + "\n" + "Nele, você enfrenta oponentes em uma guerra estratégica, com várias opções de jogabilidade"
                        + "\n" + "e habilidades táticas.";
                jogo3 = "12.80";
            }
            case "Marvel Snap", "marvel snap" -> {
                jogo1 = "Marvel Snap";
                jogo2 = "MARVEL SNAP é um jogo de cartas colecionáveis rápido e premiado com mecânicas inovadoras"
                        + "\n" + "que foi chamado de \"acessível e totalmente brilhante\""
                        + "\n" + "e \"um dos melhores jogos de cartas\" da atualidade.";
                jogo3 = "9.70";
            }
            case "Midnight Sun", "midnight sun" -> {
                jogo1 = "Midnight Sun";
                jogo2 = "Marvel's Midnight Suns é um RPG tático que mostra você lutando "
                        + "\n" + "ao lado e forjando amizades com heróis icônicos da Marvel"
                        + "\n" + "cada uma com personalidade, vantagens e habilidades únicas";
                jogo3 = "170.90";
            }
            case "Runeterra", "runeterra" -> {
                jogo1 = "Runeterra";
                jogo2 = "Neste jogo de cartas de estratégia, a habilidade define o seu sucesso"
                        + "\n" + "Misture e combine campeões icônicos, aliados e regiões de Runeterra"
                        + "\n" + "para desbloquear sinergias de cartas únicas e superar seu oponente.";
                jogo3 = "Gratuito";
            }
            default -> {
                PopUp erro = new PopUp();
                erro.setVisible(true);
                erro.menErro.setText("Jogo não encontrado!!!");
                erro.tutorial.setText(" ");
                erro.setVisible(true);
                throw new AssertionError();
            }
        }
        
        Detalhes frame2 = new Detalhes(jogo1, jogo2, jogo3, recTextNome, recTextSenha, recTextEmail);
        frame2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pesquisarJogoActionPerformed

    private void gratisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gratisActionPerformed
        String selecao = gratis.getSelectedItem().toString();
        
        switch (selecao) {
            case "Valorant" -> {
                jogo1 = "VALORANT";
                jogo2 = "Um jogo de tiro tático 5x5 com personagens originais"
                        + "\n" + "Você terá 13 rodadas para atacar e defender com disparos certeiros "
                        + "\n" + "e habilidades táticas. Com apenas uma vida por rodada";
                jogo3 = "Gratuito";
            }
            case "Counter Strike 2" -> {
                jogo1 = "Counter Strike 2";
                jogo2 = "O Counter-Strike 2 é um jogo de tiro em primeira pessoa tático desenvolvido"
                        + "\n" + "e publicado pela Valve. É o quinto título principal da série Counter-Strike "
                        + "\n" + "Com apenas uma vida por rodada";
                jogo3 = "Gratuito";
            }
            case "Apex Legends" -> {
                jogo1 = "Apex Legends";
                jogo2 = "um jogo de de tiro de heróis e heroínas grátis"
                        + "\n" + "Explore uma variedade crescente de Lendas,"
                        + "\n" + "cada uma com personalidade, vantagens e habilidades únicas";
                jogo3 = "Gratuito";
            }
            case "Dota" -> {
                jogo1 = "DOTA";
                jogo2 = "Dota 2 é um videogame multijogador online de arena de batalha"
                        + "\n" + "desenvolvido pela Valve Corporation. O jogo foi lançado oficialmente"
                        + "\n" + "em 2013 e está disponível como um título free-to-play";
                jogo3 = "Gratuito";
            }
            default ->
                throw new AssertionError();
        }
        
        Detalhes frame2 = new Detalhes(jogo1, jogo2, jogo3, recTextNome, recTextSenha, recTextEmail);
        frame2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gratisActionPerformed

    private void estrategiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estrategiaActionPerformed
        String selecao = estrategia.getSelectedItem().toString();
        
        switch (selecao) {
            case "Risk" -> {
                jogo1 = "RISK";
                jogo2 = "É a versão digital oficial do icônico jogo de tabuleiro RISK"
                        + "\n" + "Nele, você enfrenta oponentes em uma guerra estratégica, com várias opções de jogabilidade"
                        + "\n" + "e habilidades táticas.";
                jogo3 = "12.80";
            }
            case "Marvel Snap" -> {
                jogo1 = "Marvel Snap";
                jogo2 = "MARVEL SNAP é um jogo de cartas colecionáveis rápido e premiado com mecânicas inovadoras"
                        + "\n" + "que foi chamado de \"acessível e totalmente brilhante\""
                        + "\n" + "e \"um dos melhores jogos de cartas\" da atualidade.";
                jogo3 = "9.70";
            }
            case "Midnight Sun" -> {
                jogo1 = "Midnight Sun";
                jogo2 = "Marvel's Midnight Suns é um RPG tático que mostra você lutando "
                        + "\n" + "ao lado e forjando amizades com heróis icônicos da Marvel"
                        + "\n" + "cada uma com personalidade, vantagens e habilidades únicas";
                jogo3 = "170.90";
            }
            case "Runeterra" -> {
                jogo1 = "Runeterra";
                jogo2 = "Neste jogo de cartas de estratégia, a habilidade define o seu sucesso"
                        + "\n" + "Misture e combine campeões icônicos, aliados e regiões de Runeterra"
                        + "\n" + "para desbloquear sinergias de cartas únicas e superar seu oponente.";
                jogo3 = "Gratuito";
            }
            default ->
                throw new AssertionError();
        }
        
        Detalhes frame2 = new Detalhes(jogo1, jogo2, jogo3, recTextNome, recTextSenha, recTextEmail);
        frame2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_estrategiaActionPerformed

    private void altUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altUsuarioActionPerformed
        InfoUsuario conta = new InfoUsuario(recTextNome, recTextSenha, recTextEmail);
        conta.setVisible(true);
    }//GEN-LAST:event_altUsuarioActionPerformed

    private void jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarActionPerformed
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i < 11; i++) {
                    progressBar.setValue(i);
                    
                    Thread.sleep(500);
                }
                
                return null;
            }
            
            @Override
            protected void done() {
                //FRAME DO JOGO!!! FAZER (Lembrar de fazer isso como erro no login);
                JogoAberto jogoAberto = new JogoAberto();
                String recCboxB = biblioteca.getSelectedItem().toString();
                
                switch (recCboxB) {
                    case "Uncharted 4": {
                        ImageIcon icon = new ImageIcon("C:\\Users\\thiag\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoStore\\src\\Imagens\\uncharted4.png");
                        jogoAberto.jogoLabel(icon);
                        jogoAberto.setVisible(true);
                        break;
                    }
                    case "God of war": {
                        ImageIcon icon = new ImageIcon("C:\\Users\\thiag\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoStore\\src\\Imagens\\uncharted4.png");
                        jogoAberto.jogoLabel(icon);
                        jogoAberto.setVisible(true);
                        break;
                    }
                    case "The BookWalker": {
                        ImageIcon icon = new ImageIcon("C:\\Users\\thiag\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoStore\\src\\Imagens\\uncharted4.png");
                        jogoAberto.jogoLabel(icon);
                        jogoAberto.setVisible(true);
                        break;
                    }
                    case "Outer Wilds": {
                        ImageIcon icon = new ImageIcon("C:\\Users\\thiag\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoStore\\src\\Imagens\\uncharted4.png");
                        jogoAberto.jogoLabel(icon);
                        jogoAberto.setVisible(true);
                        break;
                    }
                    case "VALORANT": {
                        ImageIcon icon = new ImageIcon("C:\\Users\\thiag\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoStore\\src\\Imagens\\valorant.png");
                        jogoAberto.jogoLabel(icon);
                        jogoAberto.setVisible(true);
                        break;
                    }
                    case "Counter Strike 2": {
                        ImageIcon icon = new ImageIcon("C:\\Users\\thiag\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoStore\\src\\Imagens\\uncharted4.png");
                        jogoAberto.jogoLabel(icon);
                        jogoAberto.setVisible(true);
                        break;
                    }
                    case "Apex Legends": {
                        ImageIcon icon = new ImageIcon("C:\\Users\\thiag\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoStore\\src\\Imagens\\uncharted4.png");
                        jogoAberto.jogoLabel(icon);
                        jogoAberto.setVisible(true);
                        break;
                    }
                    case "DOTA": {
                        ImageIcon icon = new ImageIcon("C:\\Users\\thiag\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoStore\\src\\Imagens\\uncharted4.png");
                        jogoAberto.jogoLabel(icon);
                        jogoAberto.setVisible(true);
                        break;
                    }
                    case "RISK": {
                        ImageIcon icon = new ImageIcon("C:\\Users\\thiag\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoStore\\src\\Imagens\\uncharted4.png");
                        jogoAberto.jogoLabel(icon);
                        jogoAberto.setVisible(true);
                        break;
                        
                    }
                    case "Marvel Snap": {
                        ImageIcon icon = new ImageIcon("C:\\Users\\thiag\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoStore\\src\\Imagens\\uncharted4.png");
                        jogoAberto.jogoLabel(icon);
                        jogoAberto.setVisible(true);
                        break;
                    }
                    case "Midnight Sun": {
                        ImageIcon icon = new ImageIcon("C:\\Users\\thiag\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoStore\\src\\Imagens\\uncharted4.png");
                        jogoAberto.jogoLabel(icon);
                        jogoAberto.setVisible(true);
                        break;
                    }
                    case "Runeterra": {
                        ImageIcon icon = new ImageIcon("C:\\Users\\thiag\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoStore\\src\\Imagens\\uncharted4.png");
                        jogoAberto.jogoLabel(icon);
                        jogoAberto.setVisible(true);
                        break;
                    }
                    default:
                        throw new AssertionError();
                }
                
            }
        };
        worker.execute();
    }//GEN-LAST:event_jogarActionPerformed

    private void voltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarLoginActionPerformed
        Menu menu = new Menu(recTextNome, recTextSenha, recTextEmail);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_voltarLoginActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Biblioteca().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ação;
    private javax.swing.JLabel BIBLIOTECA;
    private javax.swing.JLabel Estratégia;
    private javax.swing.JLabel Gratuitos;
    private javax.swing.JComboBox<String> acao;
    private javax.swing.JButton altUsuario;
    public javax.swing.JComboBox<String> biblioteca;
    private javax.swing.JComboBox<String> estrategia;
    private javax.swing.JComboBox<String> gratis;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jogar;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField pesquisarJogo;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JButton voltarLogin;
    // End of variables declaration//GEN-END:variables

    void setVisibility(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}