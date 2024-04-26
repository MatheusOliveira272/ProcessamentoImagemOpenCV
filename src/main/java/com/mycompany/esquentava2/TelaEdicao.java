/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.esquentava2;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import nu.pattern.OpenCV;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.objdetect.Objdetect;

/**
 *
 * @author Matheus
 */
public class TelaEdicao extends javax.swing.JFrame {

    private File arquivo;
    private File imageEditando;

    public TelaEdicao() {
        initComponents();
        setLocationRelativeTo(this);//colocar a tela no meio na hora de abrir
    }

    // Salvar a nova imagem em um arquivo temporário
    public File salvarImagemTemp(Mat imagem) {

        // Diretório padrão para salvar a imagem temporária dentro da pasta do projeto
        String diretorioPadrao = System.getProperty("user.dir") + File.separator + "ImagensTemporarias";

        // Crie o diretório se ele não existir
        File diretorio = new File(diretorioPadrao);
        if (!diretorio.exists()) {
            diretorio.mkdirs(); // Cria o diretório e todos os diretórios pai se não existirem
        }

        // Crie o arquivo dentro do diretório padrão
        File novaImagemFile = new File(diretorio, "temp.jpg");

        // Salve a imagem
        Imgcodecs.imwrite(novaImagemFile.getAbsolutePath(), imagem);

        // Retorne o arquivo
        return novaImagemFile;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jLabel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jButton1.setText("Selecionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("P&B");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Girar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("Inverter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Altura Atual: ");

        jLabel5.setText("Largura Atual:");

        jLabel3.setText("Largura:");

        jButton5.setText("Recortar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Altura:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(29, 29, 29))))
        );

        jButton7.setBackground(new java.awt.Color(0, 102, 51));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Salvar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Restalrar Tudo");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Localizar Rostos");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(48, 48, 48))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton2)
                        .addGap(45, 45, 45)
                        .addComponent(jButton4)
                        .addGap(61, 61, 61)
                        .addComponent(jButton3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9))
                            .addComponent(jSlider1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton9)
                        .addComponent(jButton8)))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jLabel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel1PropertyChange

    }//GEN-LAST:event_jLabel1PropertyChange

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        // Cria um seletor de arquivos
        JFileChooser jFileChooser = new JFileChooser();

        // Exibe o seletor de arquivos e aguarda a seleção do usuário
        int result = jFileChooser.showSaveDialog(this);

        // Verifica se o usuário clicou no botão "Salvar"
        if (result == JFileChooser.APPROVE_OPTION) {
            // Obtém o caminho completo do arquivo escolhido pelo usuário
            File file = jFileChooser.getSelectedFile();
            String filePath = file.getAbsolutePath();

            // Verifica se o arquivo já possui uma extensão de imagem
            String fileName = file.getName();
            if (!fileName.toLowerCase().endsWith(".jpg") && !fileName.toLowerCase().endsWith(".png") && !fileName.toLowerCase().endsWith(".bmp")) {
                // Adiciona a extensão .jpg por padrão se não estiver presente
                filePath += ".jpg";
            }

            // Salva a imagem editada no local especificado pelo usuário
            ImageIcon imageIcon = (ImageIcon) jLabel1.getIcon(); // Obtém o ícone exibido no jLabel1
            BufferedImage bufferedImage = (BufferedImage) imageIcon.getImage(); // Converte o ícone em BufferedImage
            try {
                ImageIO.write(bufferedImage, "jpg", new File(filePath)); // Salva o BufferedImage como um arquivo de imagem
                JOptionPane.showMessageDialog(this, "Imagem salva com sucesso em: " + filePath);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar a imagem: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        OpenCV.loadLocally();

        String imagePath = imageEditando.getPath();//2304
        Mat image = Imgcodecs.imread(imagePath);//2304
        // Obtém a largura e altura inseridas pelo usuário
        int larguraDesejada = Integer.parseInt(jTextField1.getText());
        int alturaDesejada = Integer.parseInt(jTextField2.getText());

        // Obtém as dimensões da imagem original
        int larguraOriginal = image.cols();
        int alturaOriginal = image.rows();

        // Calcula a proporção da imagem original
        double proporcaoOriginal = (double) larguraOriginal / alturaOriginal;

        // Calcula a nova largura e altura mantendo a proporção original
        int novaLargura, novaAltura;

        //isso era para cortar proporcional mas não faz sentido na lógica que quero...
        //        if (larguraDesejada / alturaDesejada > proporcaoOriginal) {
        //            novaLargura = (int) (alturaDesejada * proporcaoOriginal);
        //            novaAltura = alturaDesejada;
        //        } else {
        //            novaLargura = larguraDesejada;
        //            novaAltura = (int) (larguraDesejada / proporcaoOriginal);
        //        }
        // Calcula as coordenadas x e y com base na nova largura e altura
        int x = (larguraOriginal - larguraDesejada) / 2; // Centraliza horizontalmente
        int y = (alturaOriginal - alturaDesejada) / 2; // Centraliza verticalmente

        // Extrai a região de interesse (ROI) da imagem
        Rect roi = new Rect(x, y, larguraDesejada, alturaDesejada);
        Mat croppedImage = new Mat(image, roi);

        try {
            // Exibir a imagem recortada
            jLabel1.setIcon(new ImageIcon(mat2BufferedImage(croppedImage)));
            imageEditando = salvarImagemTemp(croppedImage);
            jLabel6.setText(String.valueOf(larguraDesejada));
            jLabel7.setText(String.valueOf(alturaDesejada));
        } catch (Exception ex) {
            Logger.getLogger(TelaEdicao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        OpenCV.loadLocally();

        //        String imagePath = arquivo.getPath();
        //        Mat image = Imgcodecs.imread(imagePath);
        String imagePath = imageEditando.getPath();//2304
        Mat image = Imgcodecs.imread(imagePath);//2304
        Mat imageEspelhada = new Mat();
        Core.flip(image, imageEspelhada, WIDTH);
        try {
            jLabel1.setIcon(new ImageIcon(mat2BufferedImage(imageEspelhada)));
            imageEditando = salvarImagemTemp(imageEspelhada);
        } catch (Exception ex) {
            Logger.getLogger(TelaEdicao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        OpenCV.loadLocally();

        //        String imagePath = arquivo.getPath();
        String imagePath = imageEditando.getPath();
        Mat image = Imgcodecs.imread(imagePath);

        double angulo = 90; // Angulo de rotação
        double escala = 1.0; // Escala de rotação

        // Calcula o centro da imagem
        Point center = new Point(image.cols() / 2.0, image.rows() / 2.0);

        // Calcula a largura e altura da imagem após a rotação
        int novaLargura = (int) (image.cols() * Math.abs(Math.cos(Math.toRadians(angulo))) + image.rows() * Math.abs(Math.sin(Math.toRadians(angulo))));
        int novaAltura = (int) (image.cols() * Math.abs(Math.sin(Math.toRadians(angulo))) + image.rows() * Math.abs(Math.cos(Math.toRadians(angulo))));

        // Cria uma matriz para a imagem rotacionada
        Mat novaImagem = new Mat(novaAltura, novaLargura, image.type());

        // Cria uma matriz de rotação
        Mat rotationMatrix = Imgproc.getRotationMatrix2D(center, angulo, escala);

        // Ajusta a matriz de rotação para o centro da nova imagem
        rotationMatrix.put(0, 2, rotationMatrix.get(0, 2)[0] + novaLargura / 2.0 - center.x);
        rotationMatrix.put(1, 2, rotationMatrix.get(1, 2)[0] + novaAltura / 2.0 - center.y);

        // Aplica a rotação na imagem original e salva o resultado na nova imagem
        Imgproc.warpAffine(image, novaImagem, rotationMatrix, novaImagem.size());

        try {
            jLabel1.setIcon(new ImageIcon(mat2BufferedImage(novaImagem)));

            // Atualizar a variável imageEditando com o novo arquivo de imagem
            imageEditando = salvarImagemTemp(novaImagem);
            jLabel6.setText(String.valueOf(novaImagem.width()));
            jLabel7.setText(String.valueOf(novaImagem.height()));

        } catch (Exception ex) {
            Logger.getLogger(TelaEdicao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        OpenCV.loadLocally();

        //        String imagePath = arquivo.getPath();
        //        Mat image = Imgcodecs.imread(imagePath);
        String imagePath = imageEditando.getPath();//2304
        Mat image = Imgcodecs.imread(imagePath);//2304
        Mat grayImage = new Mat();
        Imgproc.cvtColor(image, grayImage, Imgproc.COLOR_BGR2GRAY);
        try {
            jLabel1.setIcon(new ImageIcon(mat2BufferedImage(grayImage)));
            imageEditando = salvarImagemTemp(grayImage);
        } catch (Exception ex) {
            Logger.getLogger(TelaEdicao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        var jFileChooser = new JFileChooser(); //seletor de arquivos
        var result = jFileChooser.showOpenDialog(this); // abrir o filechooser e esperar um resultado
        if (JFileChooser.APPROVE_OPTION == result) {
            arquivo = jFileChooser.getSelectedFile();
            imageEditando = jFileChooser.getSelectedFile();//2304
            ImageIcon imageIcon = new ImageIcon(arquivo.toString());
            jLabel1.setIcon(imageIcon);

            // Obtém as dimensões da imagem
            int larguraOriginal = imageIcon.getIconWidth();
            int alturaOriginal = imageIcon.getIconHeight();

            // Atualiza as labels com os valores de largura e altura originais
            jLabel6.setText(String.valueOf(larguraOriginal));
            jLabel7.setText(String.valueOf(alturaOriginal));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged

        OpenCV.loadLocally();

        //        String imagePath = arquivo.getPath();
        //        Mat image = Imgcodecs.imread(imagePath);
        String imagePath = imageEditando.getPath();//2304
        Mat image = Imgcodecs.imread(imagePath);//2304
        Mat image2 = new Mat();
        var tamanho = Integer.valueOf(jSlider1.getValue());
        if (tamanho == 50) {
            try {
                jLabel1.setIcon(new ImageIcon(mat2BufferedImage(image2)));
            } catch (Exception ex) {
                Logger.getLogger(TelaEdicao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            var largura = image.height();
            var novalarguraPixel = largura * tamanho / 100;
            var altura = image.width();
            var novaAlturaPixel = altura * tamanho / 100;

            Imgproc.resize(image, image2, new Size(novaAlturaPixel, novalarguraPixel), 0, 0, Imgproc.INTER_AREA);

        }

        try {
            jLabel1.setIcon(new ImageIcon(mat2BufferedImage(image2)));
            // Atualizar a variável imageEditando com o novo arquivo de imagem

        } catch (Exception ex) {
            Logger.getLogger(TelaEdicao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //imageEditando = salvarImagemTemp(image2);
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja "
                + "desfazer todas as edições?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (confirmacao == JOptionPane.YES_OPTION) {
            // O usuário confirmou que deseja desfazer todas as edições

            imageEditando = arquivo;
            String imagePath = imageEditando.getPath();
            Mat image = Imgcodecs.imread(imagePath);
            try {
                jLabel1.setIcon(new ImageIcon(mat2BufferedImage(image)));
                imageEditando = salvarImagemTemp(image);

                // Atualizar a variável imageEditando com o novo arquivo de imagem
                jLabel6.setText(String.valueOf(image.width()));
                jLabel7.setText(String.valueOf(image.height()));
            } catch (Exception ex) {
                Logger.getLogger(TelaEdicao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            // O usuário cancelou a operação
            // Não faz nada
        }


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        OpenCV.loadLocally();
        String imagePath = imageEditando.getPath();
        Mat image = Imgcodecs.imread(imagePath);
        MatOfRect facesDetect = new MatOfRect();
        CascadeClassifier cascadeClassifier = new CascadeClassifier();
        int minFaceSize = Math.round(image.rows() * 0.1f);
        cascadeClassifier.load("./src/main/resources/haarcascades"
                + "/haarcascade_frontalface_alt.xml");
        cascadeClassifier.detectMultiScale(image,
                facesDetect,
                1.1,
                3,
                Objdetect.CASCADE_SCALE_IMAGE,
                new Size(minFaceSize, minFaceSize),
                new Size());

        Rect[] facesArray = facesDetect.toArray();

        // Desenha retângulos ao redor dos rostos detectados na imagem
        for (Rect face : facesArray) {
            Imgproc.rectangle(image, face.tl(), face.br(),
                    new Scalar(0, 0, 255), 3);
        }

        try {
            jLabel1.setIcon(new ImageIcon(mat2BufferedImage(image)));
            imageEditando = salvarImagemTemp(image);
        } catch (Exception ex) {
            Logger.getLogger(TelaEdicao.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Verifica se rostos foram detectados
        if (facesArray.length > 0) {
            // Rostos foram detectados
            JOptionPane.showMessageDialog(this, "Rostos detectados: " + facesArray.length);
        } else {
            // Nenhum rosto foi detectado
            JOptionPane.showMessageDialog(this, "Nenhum rosto foi detectado. \n Verifique se a"
                    + " imagem está na posição horizontal e se não está invertida.");
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    //função para converter mat para Buffered e assim poder exibir como icon
    static BufferedImage mat2BufferedImage(Mat matrix) throws Exception {
        MatOfByte mob = new MatOfByte();
        Imgcodecs.imencode(".jpg", matrix, mob);
        byte ba[] = mob.toArray();
        BufferedImage bi = ImageIO.read(new ByteArrayInputStream(ba));
        return bi;
    }

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
            java.util.logging.Logger.getLogger(TelaEdicao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEdicao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEdicao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEdicao.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEdicao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
