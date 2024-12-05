package com.fundamentos.cs.interprete;

import javax.swing.*;

import java.awt.BorderLayout;
import java.io.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    private static final String EXTENSION = "digimon";
    private static final String DIRBASE = "src/test/resources/";

    public static void main(String[] args) throws IOException {
        // Crear la interfaz gráfica con JTextArea para mostrar la salida de la consola
        JFrame frame = new JFrame("Salida de la Consola");
        JTextArea textArea = new JTextArea(20, 40);
        textArea.setEditable(false);  // No editable
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);


        // Crear un botón para abrir un archivo
        JButton openButton = new JButton("Abrir archivo");
        frame.add(openButton, BorderLayout.NORTH);

        // Acción del botón "Abrir archivo": abrir un JFileChooser para seleccionar un archivo
        openButton.addActionListener(e -> {
            // Crear un JFileChooser para seleccionar un archivo
            JFileChooser fileChooser = new JFileChooser(DIRBASE);
            fileChooser.setDialogTitle("Seleccionar archivo Digimon");
            fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos Digimon", EXTENSION));
            
            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                // Llamar a runMain con el archivo seleccionado
                try {
                    runMain(new String[]{selectedFile.getName()}, textArea);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        // Configuración de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // Redirigir la salida de System.out y System.err a JTextArea
        PrintStream printStream = new PrintStream(new TextAreaOutputStream(textArea));
        System.setOut(printStream);  // Redirige la salida estándar
        System.setErr(new PrintStream(new TextAreaOutputStream(textArea) {
            @Override
            public void write(int b) throws IOException {
                super.write(b);  // Escribe los errores en el JTextArea
            }
        }));  // Redirige la salida de errores

        // Ejecutar el código inicial
        runMain(args, textArea);
    }

    private static void runMain(String[] args, JTextArea textArea) throws IOException {
        // Limpiar el JTextArea antes de ejecutar
        textArea.setText("");

        String files[] = args.length == 0 ? new String[]{"test." + EXTENSION} : args;
        for (String file : files) {
            //System.out.println("START: " + file);

            try {
                CharStream in = CharStreams.fromFileName(DIRBASE + file);
                DigitalLexer lexer = new DigitalLexer(in);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                DigitalParser parser = new DigitalParser(tokens);
                DigitalParser.ProgramContext tree = parser.program();
                DigitalCustomVisitor visitor = new DigitalCustomVisitor();
                visitor.visit(tree);
            } catch (Exception e) {
                // Capturar y mostrar los errores en el JTextArea
                System.err.println("Error procesando el archivo " + file + ": " + e.getMessage());
            }

            //System.out.println("FINISH: " + file);
        }
    }

    // Clase para redirigir la salida a un JTextArea
    static class TextAreaOutputStream extends java.io.OutputStream {
        private JTextArea textArea;

        public TextAreaOutputStream(JTextArea textArea) {
            this.textArea = textArea;
        }

        @Override
        public void write(int b) throws IOException {
            textArea.append(String.valueOf((char) b));
            textArea.setCaretPosition(textArea.getDocument().getLength());  // Desplazarse automáticamente
        }
    }
}
