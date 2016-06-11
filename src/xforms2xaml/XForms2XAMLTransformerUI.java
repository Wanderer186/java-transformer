package xforms2xaml;

import java.io.IOException;
import javax.swing.JFileChooser;
import javax.xml.transform.TransformerException;

/**
 *
 * @author sittova
 */
public class XForms2XAMLTransformerUI extends javax.swing.JFrame {
    
    /**
     * Creates new form XFormsTransformerUI
     */
    public XForms2XAMLTransformerUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xFormsFilenameInput = new javax.swing.JTextField();
        xFormsFilenameChooseButton = new javax.swing.JButton();
        validateButton = new javax.swing.JButton();
        transformButton = new javax.swing.JButton();
        messageAreaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageArea = new javax.swing.JTextArea();
        xamlFilenameInput = new javax.swing.JTextField();
        xamlFilenameChooseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("xforms2xaml/Bundle"); // NOI18N
        setTitle(bundle.getString("windowTitle")); // NOI18N
        setResizable(false);

        xFormsFilenameInput.setText(bundle.getString("XForms2XAMLTransformerUI.xFormsFilenameInput.text")); // NOI18N

        xFormsFilenameChooseButton.setText(bundle.getString("XFormsValidatorUI.inputFileButton.text")); // NOI18N
        xFormsFilenameChooseButton.setName("inputFileButton"); // NOI18N
        xFormsFilenameChooseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xFormsFilenameChooseButtonActionPerformed(evt);
            }
        });

        validateButton.setText(bundle.getString("XFormsValidatorUI.text")); // NOI18N
        validateButton.setName(""); // NOI18N
        validateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateButtonActionPerformed(evt);
            }
        });

        transformButton.setText(bundle.getString("XForms2XAMLTransformerUI.transformButton.text")); // NOI18N
        transformButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transformButtonActionPerformed(evt);
            }
        });

        messageAreaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageAreaLabel.setText(bundle.getString("XForms2XAMLTransformerUI.messageAreaLabel.text")); // NOI18N

        messageArea.setColumns(20);
        messageArea.setRows(5);
        jScrollPane1.setViewportView(messageArea);

        xamlFilenameInput.setText(bundle.getString("XForms2XAMLTransformerUI.xamlFilenameInput.text")); // NOI18N

        xamlFilenameChooseButton.setText(bundle.getString("XForms2XAMLTransformerUI.xamlFilenameChooseButton.text")); // NOI18N
        xamlFilenameChooseButton.setToolTipText(bundle.getString("XForms2XAMLTransformerUI.xamlFilenameChooseButton.toolTipText")); // NOI18N
        xamlFilenameChooseButton.setName("inputFileButton"); // NOI18N
        xamlFilenameChooseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xamlFilenameChooseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(messageAreaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xamlFilenameChooseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(xFormsFilenameChooseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xFormsFilenameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(validateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(transformButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(xamlFilenameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xFormsFilenameChooseButton)
                    .addComponent(xFormsFilenameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xamlFilenameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xamlFilenameChooseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transformButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageAreaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xFormsFilenameChooseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xFormsFilenameChooseButtonActionPerformed
        //JFileChooser provides a simple mechanism for the user to choose a file.
        JFileChooser chooser = new JFileChooser();
        //Pops up an "Open File" file chooser dialog. 
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			//Set a text in the message area to read the filepath.
			xFormsFilenameInput.setText(chooser.getSelectedFile().getAbsolutePath());
		}
    }//GEN-LAST:event_xFormsFilenameChooseButtonActionPerformed

    private void validateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateButtonActionPerformed
		String xFormsFilename = xFormsFilenameInput.getText();
		
		if (xFormsFilename.isEmpty()) {
			addMessage("Choose XForms input file");
		} else {
			try {
			   XFormsTransformer transformer = new XFormsTransformer();

			   addMessage("Input XForms file is " + (transformer.validate(xFormsFilename) ? "" : "not ") + "valid");
			} catch (IOException ex) {
				addMessage("Input XForms file not exist");
			}
		}
    }//GEN-LAST:event_validateButtonActionPerformed

    private void transformButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transformButtonActionPerformed
        String xFormsFilename = xFormsFilenameInput.getText();
		String xamlFilename = xamlFilenameInput.getText();

		if (xFormsFilename.isEmpty()) {
			addMessage("Choose XForms input file");
		} else if (xamlFilename.isEmpty()) {
			addMessage("Choose XAML output file");
		} else {
			try {
				XFormsTransformer transformer = new XFormsTransformer();
				
				if (transformer.validate(xFormsFilename)) {
					transformer.transformToXAML(xFormsFilename, xamlFilename);
					addMessage("Transformation completed");
				} else {
					addMessage("Input XForms file is invalid");
				}
			} catch (IOException ex) {
				addMessage("Input XForms file not exist");
			} catch (TransformerException ex) {
				addMessage(ex.getMessage()); // unexpected error
			}
		}
    }//GEN-LAST:event_transformButtonActionPerformed

    private void xamlFilenameChooseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xamlFilenameChooseButtonActionPerformed
        //JFileChooser provides a simple mechanism for the user to choose a file.
        JFileChooser chooser = new JFileChooser();
        //Pops up an "Open File" file chooser dialog.
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			//Set a text in the message area to read the filepath.
			xamlFilenameInput.setText(chooser.getSelectedFile().getAbsolutePath());
		}
    }//GEN-LAST:event_xamlFilenameChooseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(XForms2XAMLTransformerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XForms2XAMLTransformerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XForms2XAMLTransformerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XForms2XAMLTransformerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XForms2XAMLTransformerUI().setVisible(true);
            }
        });
    }

	protected void addMessage(String message) {
		messageArea.setText(messageArea.getText() + message + "\n");
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea messageArea;
    private javax.swing.JLabel messageAreaLabel;
    private javax.swing.JButton transformButton;
    private javax.swing.JButton validateButton;
    private javax.swing.JButton xFormsFilenameChooseButton;
    private javax.swing.JTextField xFormsFilenameInput;
    private javax.swing.JButton xamlFilenameChooseButton;
    private javax.swing.JTextField xamlFilenameInput;
    // End of variables declaration//GEN-END:variables
}