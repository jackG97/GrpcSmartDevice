package com.jackgallaher.smartdevice;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import com.jackgallaher.smartdevice.SmartDeviceServer;
import static java.lang.Thread.sleep;

public class PhoneGUI extends javax.swing.JFrame {

	
	public SmartDeviceServer server;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public PhoneGUI() {
		initComponents();
	}
	
	
	public PhoneGUI(SmartDeviceServer server) {
		this();
		this.server = server;
	}
	


private void initComponents() {

    JButton poweronBtn = new javax.swing.JButton();
    JButton poweroffBtn = new javax.swing.JButton();
    JButton findcontacts = new javax.swing.JButton();
    JButton addcontacts = new javax.swing.JButton();
    JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    JTextArea infoArea = new javax.swing.JTextArea();
    JTextField entercontact = new javax.swing.JTextField();
    

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    poweronBtn.setText("Power on");
    poweronBtn.setActionCommand("poweronBtn");
    poweronBtn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        	poweronBtnMouseClicked(evt);
        }

		private void poweronBtnMouseClicked(MouseEvent evt) {
			// TODO Auto-generated method stub
			
			
		}
    });
    
    poweroffBtn.setText("Power off");
    poweroffBtn.setActionCommand("powerofBtn");
    poweroffBtn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        	poweroffBtnMouseClicked(evt);
        }

		private void poweroffBtnMouseClicked(MouseEvent evt) {
			
			
		}
    });

    jScrollPane1.setBorder(null);

    infoArea.setColumns(10);
    infoArea.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
    infoArea.setForeground(new java.awt.Color(102, 102, 102));
    infoArea.setRows(5);
    infoArea.setBorder(null);
    infoArea.setOpaque(false);
    jScrollPane1.setViewportView(infoArea);

    findcontacts.setText("Contacts");
    findcontacts.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        	findcontactsMouseClicked(evt);
        }

		private void findcontactsMouseClicked(MouseEvent evt) {
			// TODO Auto-generated method stub
			
		}
    });

    addcontacts.setText("Add Contact");
    addcontacts.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        	addcontactsMouseClicked(evt);
        }

		private void addcontactsMouseClicked(MouseEvent evt) {
			// TODO Auto-generated method stub
			
		}
    });


    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(findcontacts)
                    .addGap(28, 28, 28)
                    .addComponent(addcontacts)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 587, Short.MAX_VALUE)
                    .addComponent(poweronBtn)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 587, Short.MAX_VALUE)
                    .addComponent(poweroffBtn))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE))
            .addContainerGap())
            )
    ));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent((poweronBtn)))
                        .addComponent(addcontacts)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(poweroffBtn)
                .addComponent(poweronBtn)
            .addContainerGap(13, Short.MAX_VALUE)));
    		
    

   
}
}
