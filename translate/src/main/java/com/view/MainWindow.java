package com.view;

import com.translator.TranslationClient;
import com.translator.TranslatorServiceImpl;
import com.translator.TranslationController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private JButton translateButton;
    private JTextArea sourceTextArea;
    private JTextArea targetTextArea;

    public MainWindow() {
        setTitle("中英文双向翻译系统");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        sourceTextArea = new JTextArea(10, 30);
        targetTextArea = new JTextArea(10, 30);
        translateButton = new JButton("翻译");

        TranslationClient translationClient = new TranslationClient(new TranslatorServiceImpl());
        TranslationController controller = new TranslationController(translationClient);

        translateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sourceText = sourceTextArea.getText();
                String translatedText = controller.translate(sourceText, "en", "zh").getTranslatedText();
                targetTextArea.setText(translatedText);
            }
        });

        add(new JScrollPane(sourceTextArea), BorderLayout.NORTH);
        add(new JScrollPane(targetTextArea), BorderLayout.SOUTH);
        add(translateButton, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}