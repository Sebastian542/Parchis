package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.JRadioButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;

public class Panel1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private Canvas canvas_1;
	private JRadioButton rdbtnNewRadioButton;
	private JPopupMenu popupMenu;
	private Graphics g;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel1 frame = new Panel1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
	}
	


	/**
	 * Create the frame.
	 */
	public Panel1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		popupMenu = new JPopupMenu();
		addPopup(contentPane, popupMenu);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.insets = new Insets(0, 0, 5, 5);
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridx = 7;
		gbc_textField_15.gridy = 0;
		contentPane.add(textField_15, gbc_textField_15);
		
		textField_16 = new JTextField();
		textField_16.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.insets = new Insets(0, 0, 5, 5);
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.gridx = 8;
		gbc_textField_16.gridy = 0;
		contentPane.add(textField_16, gbc_textField_16);
		textField_16.setColumns(10);
		
		textField_90 = new JTextField();
		textField_90.setColumns(10);
		textField_90.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_90 = new GridBagConstraints();
		gbc_textField_90.insets = new Insets(0, 0, 5, 5);
		gbc_textField_90.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_90.gridx = 9;
		gbc_textField_90.gridy = 0;
		contentPane.add(textField_90, gbc_textField_90);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.insets = new Insets(0, 0, 5, 5);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 7;
		gbc_textField_14.gridy = 1;
		contentPane.add(textField_14, gbc_textField_14);
		
		textField_17 = new JTextField();
		textField_17.setBackground(Color.RED);
		GridBagConstraints gbc_textField_17 = new GridBagConstraints();
		gbc_textField_17.insets = new Insets(0, 0, 5, 5);
		gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_17.gridx = 8;
		gbc_textField_17.gridy = 1;
		contentPane.add(textField_17, gbc_textField_17);
		textField_17.setColumns(10);
		
		
		textField_89 = new JTextField();
		textField_89.setColumns(10);
		textField_89.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_89 = new GridBagConstraints();
		gbc_textField_89.insets = new Insets(0, 0, 5, 5);
		gbc_textField_89.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_89.gridx = 9;
		gbc_textField_89.gridy = 1;
		contentPane.add(textField_89, gbc_textField_89);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 7;
		gbc_textField_13.gridy = 2;
		contentPane.add(textField_13, gbc_textField_13);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBackground(Color.RED);
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.insets = new Insets(0, 0, 5, 5);
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.gridx = 8;
		gbc_textField_18.gridy = 2;
		contentPane.add(textField_18, gbc_textField_18);
		
		textField_88 = new JTextField();
		textField_88.setColumns(10);
		textField_88.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_88 = new GridBagConstraints();
		gbc_textField_88.insets = new Insets(0, 0, 5, 5);
		gbc_textField_88.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_88.gridx = 9;
		gbc_textField_88.gridy = 2;
		contentPane.add(textField_88, gbc_textField_88);
		
		canvas_1 = new Canvas();
		GridBagConstraints gbc_canvas_1 = new GridBagConstraints();
		gbc_canvas_1.insets = new Insets(0, 0, 5, 5);
		gbc_canvas_1.gridx = 2;
		gbc_canvas_1.gridy = 3;
		contentPane.add(canvas_1, gbc_canvas_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 7;
		gbc_textField_6.gridy = 3;
		contentPane.add(textField_6, gbc_textField_6);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBackground(Color.RED);
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 8;
		gbc_textField_19.gridy = 3;
		contentPane.add(textField_19, gbc_textField_19);
		
		textField_87 = new JTextField();
		textField_87.setColumns(10);
		textField_87.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_87 = new GridBagConstraints();
		gbc_textField_87.insets = new Insets(0, 0, 5, 5);
		gbc_textField_87.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_87.gridx = 9;
		gbc_textField_87.gridy = 3;
		contentPane.add(textField_87, gbc_textField_87);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(Color.RED);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 7;
		gbc_textField_5.gridy = 4;
		contentPane.add(textField_5, gbc_textField_5);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBackground(Color.RED);
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.insets = new Insets(0, 0, 5, 5);
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.gridx = 8;
		gbc_textField_20.gridy = 4;
		contentPane.add(textField_20, gbc_textField_20);
		
		textField_86 = new JTextField();
		textField_86.setColumns(10);
		textField_86.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_86 = new GridBagConstraints();
		gbc_textField_86.insets = new Insets(0, 0, 5, 5);
		gbc_textField_86.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_86.gridx = 9;
		gbc_textField_86.gridy = 4;
		contentPane.add(textField_86, gbc_textField_86);
	
		
		rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBackground(Color.GRAY);
		
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.fill = GridBagConstraints.VERTICAL;
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 2;
		gbc_rdbtnNewRadioButton.gridy = 5;

		contentPane.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 7;
		gbc_textField_4.gridy = 5;
		contentPane.add(textField_4, gbc_textField_4);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBackground(Color.RED);
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.insets = new Insets(0, 0, 5, 5);
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.gridx = 8;
		gbc_textField_21.gridy = 5;
		contentPane.add(textField_21, gbc_textField_21);
		
		textField_85 = new JTextField();
		textField_85.setColumns(10);
		textField_85.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_85 = new GridBagConstraints();
		gbc_textField_85.insets = new Insets(0, 0, 5, 5);
		gbc_textField_85.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_85.gridx = 9;
		gbc_textField_85.gridy = 5;
		contentPane.add(textField_85, gbc_textField_85);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 7;
		gbc_textField_2.gridy = 6;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBackground(Color.RED);
		GridBagConstraints gbc_textField_22 = new GridBagConstraints();
		gbc_textField_22.insets = new Insets(0, 0, 5, 5);
		gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_22.gridx = 8;
		gbc_textField_22.gridy = 6;
		contentPane.add(textField_22, gbc_textField_22);
		
		textField_84 = new JTextField();
		textField_84.setColumns(10);
		textField_84.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_84 = new GridBagConstraints();
		gbc_textField_84.insets = new Insets(0, 0, 5, 5);
		gbc_textField_84.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_84.gridx = 9;
		gbc_textField_84.gridy = 6;
		contentPane.add(textField_84, gbc_textField_84);
		
		textField_7 = new JTextField();
		textField_7.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 0;
		gbc_textField_7.gridy = 7;
		contentPane.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 7;
		contentPane.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 2;
		gbc_textField_9.gridy = 7;
		contentPane.add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 3;
		gbc_textField_10.gridy = 7;
		contentPane.add(textField_10, gbc_textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 4;
		gbc_textField_11.gridy = 7;
		contentPane.add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 5;
		gbc_textField_12.gridy = 7;
		contentPane.add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 6;
		gbc_textField_1.gridy = 7;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 7;
		gbc_textField_3.gridy = 7;
		contentPane.add(textField_3, gbc_textField_3);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBackground(Color.RED);
		GridBagConstraints gbc_textField_23 = new GridBagConstraints();
		gbc_textField_23.insets = new Insets(0, 0, 5, 5);
		gbc_textField_23.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_23.gridx = 8;
		gbc_textField_23.gridy = 7;
		contentPane.add(textField_23, gbc_textField_23);
		
		textField_83 = new JTextField();
		textField_83.setColumns(10);
		textField_83.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_83 = new GridBagConstraints();
		gbc_textField_83.insets = new Insets(0, 0, 5, 5);
		gbc_textField_83.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_83.gridx = 9;
		gbc_textField_83.gridy = 7;
		contentPane.add(textField_83, gbc_textField_83);
		
		textField_82 = new JTextField();
		textField_82.setColumns(10);
		textField_82.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_82 = new GridBagConstraints();
		gbc_textField_82.insets = new Insets(0, 0, 5, 5);
		gbc_textField_82.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_82.gridx = 10;
		gbc_textField_82.gridy = 7;
		contentPane.add(textField_82, gbc_textField_82);
		
		textField_81 = new JTextField();
		textField_81.setColumns(10);
		textField_81.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_81 = new GridBagConstraints();
		gbc_textField_81.insets = new Insets(0, 0, 5, 5);
		gbc_textField_81.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_81.gridx = 11;
		gbc_textField_81.gridy = 7;
		contentPane.add(textField_81, gbc_textField_81);
		
		textField_80 = new JTextField();
		textField_80.setColumns(10);
		textField_80.setBackground(Color.GREEN);
		GridBagConstraints gbc_textField_80 = new GridBagConstraints();
		gbc_textField_80.insets = new Insets(0, 0, 5, 5);
		gbc_textField_80.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_80.gridx = 12;
		gbc_textField_80.gridy = 7;
		contentPane.add(textField_80, gbc_textField_80);
		
		textField_79 = new JTextField();
		textField_79.setColumns(10);
		textField_79.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_79 = new GridBagConstraints();
		gbc_textField_79.insets = new Insets(0, 0, 5, 5);
		gbc_textField_79.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_79.gridx = 13;
		gbc_textField_79.gridy = 7;
		contentPane.add(textField_79, gbc_textField_79);
		
		textField_78 = new JTextField();
		textField_78.setColumns(10);
		textField_78.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_78 = new GridBagConstraints();
		gbc_textField_78.insets = new Insets(0, 0, 5, 5);
		gbc_textField_78.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_78.gridx = 14;
		gbc_textField_78.gridy = 7;
		contentPane.add(textField_78, gbc_textField_78);
		
		textField_77 = new JTextField();
		textField_77.setColumns(10);
		textField_77.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_77 = new GridBagConstraints();
		gbc_textField_77.insets = new Insets(0, 0, 5, 5);
		gbc_textField_77.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_77.gridx = 15;
		gbc_textField_77.gridy = 7;
		contentPane.add(textField_77, gbc_textField_77);
		
		textField_76 = new JTextField();
		textField_76.setColumns(10);
		textField_76.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_76 = new GridBagConstraints();
		gbc_textField_76.insets = new Insets(0, 0, 5, 0);
		gbc_textField_76.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_76.gridx = 16;
		gbc_textField_76.gridy = 7;
		contentPane.add(textField_76, gbc_textField_76);
		
		textField_92 = new JTextField();
		textField_92.setColumns(10);
		textField_92.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_92 = new GridBagConstraints();
		gbc_textField_92.insets = new Insets(0, 0, 5, 5);
		gbc_textField_92.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_92.gridx = 0;
		gbc_textField_92.gridy = 8;
		contentPane.add(textField_92, gbc_textField_92);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBackground(Color.BLUE);
		GridBagConstraints gbc_textField_31 = new GridBagConstraints();
		gbc_textField_31.insets = new Insets(0, 0, 5, 5);
		gbc_textField_31.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_31.gridx = 1;
		gbc_textField_31.gridy = 8;
		contentPane.add(textField_31, gbc_textField_31);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBackground(Color.BLUE);
		GridBagConstraints gbc_textField_30 = new GridBagConstraints();
		gbc_textField_30.insets = new Insets(0, 0, 5, 5);
		gbc_textField_30.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_30.gridx = 2;
		gbc_textField_30.gridy = 8;
		contentPane.add(textField_30, gbc_textField_30);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBackground(Color.BLUE);
		GridBagConstraints gbc_textField_29 = new GridBagConstraints();
		gbc_textField_29.insets = new Insets(0, 0, 5, 5);
		gbc_textField_29.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_29.gridx = 3;
		gbc_textField_29.gridy = 8;
		contentPane.add(textField_29, gbc_textField_29);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBackground(Color.BLUE);
		GridBagConstraints gbc_textField_28 = new GridBagConstraints();
		gbc_textField_28.insets = new Insets(0, 0, 5, 5);
		gbc_textField_28.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_28.gridx = 4;
		gbc_textField_28.gridy = 8;
		contentPane.add(textField_28, gbc_textField_28);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBackground(Color.BLUE);
		GridBagConstraints gbc_textField_27 = new GridBagConstraints();
		gbc_textField_27.insets = new Insets(0, 0, 5, 5);
		gbc_textField_27.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_27.gridx = 5;
		gbc_textField_27.gridy = 8;
		contentPane.add(textField_27, gbc_textField_27);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBackground(Color.BLUE);
		GridBagConstraints gbc_textField_26 = new GridBagConstraints();
		gbc_textField_26.insets = new Insets(0, 0, 5, 5);
		gbc_textField_26.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_26.gridx = 6;
		gbc_textField_26.gridy = 8;
		contentPane.add(textField_26, gbc_textField_26);
		
		textField_25 = new JTextField();
		textField_25.setBackground(Color.BLUE);
		GridBagConstraints gbc_textField_25 = new GridBagConstraints();
		gbc_textField_25.insets = new Insets(0, 0, 5, 5);
		gbc_textField_25.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_25.gridx = 7;
		gbc_textField_25.gridy = 8;
		contentPane.add(textField_25, gbc_textField_25);
		textField_25.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBackground(Color.CYAN);
		GridBagConstraints gbc_textField_24 = new GridBagConstraints();
		gbc_textField_24.insets = new Insets(0, 0, 5, 5);
		gbc_textField_24.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_24.gridx = 8;
		gbc_textField_24.gridy = 8;
		contentPane.add(textField_24, gbc_textField_24);
		
		textField_41 = new JTextField();
		textField_41.setBackground(Color.GREEN);
		GridBagConstraints gbc_textField_41 = new GridBagConstraints();
		gbc_textField_41.insets = new Insets(0, 0, 5, 5);
		gbc_textField_41.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_41.gridx = 9;
		gbc_textField_41.gridy = 8;
		contentPane.add(textField_41, gbc_textField_41);
		textField_41.setColumns(10);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBackground(Color.GREEN);
		GridBagConstraints gbc_textField_62 = new GridBagConstraints();
		gbc_textField_62.insets = new Insets(0, 0, 5, 5);
		gbc_textField_62.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_62.gridx = 10;
		gbc_textField_62.gridy = 8;
		contentPane.add(textField_62, gbc_textField_62);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBackground(Color.GREEN);
		GridBagConstraints gbc_textField_63 = new GridBagConstraints();
		gbc_textField_63.insets = new Insets(0, 0, 5, 5);
		gbc_textField_63.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_63.gridx = 11;
		gbc_textField_63.gridy = 8;
		contentPane.add(textField_63, gbc_textField_63);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBackground(Color.GREEN);
		GridBagConstraints gbc_textField_64 = new GridBagConstraints();
		gbc_textField_64.insets = new Insets(0, 0, 5, 5);
		gbc_textField_64.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_64.gridx = 12;
		gbc_textField_64.gridy = 8;
		contentPane.add(textField_64, gbc_textField_64);
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBackground(Color.GREEN);
		GridBagConstraints gbc_textField_66 = new GridBagConstraints();
		gbc_textField_66.insets = new Insets(0, 0, 5, 5);
		gbc_textField_66.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_66.gridx = 13;
		gbc_textField_66.gridy = 8;
		contentPane.add(textField_66, gbc_textField_66);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBackground(Color.GREEN);
		GridBagConstraints gbc_textField_67 = new GridBagConstraints();
		gbc_textField_67.insets = new Insets(0, 0, 5, 5);
		gbc_textField_67.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_67.gridx = 14;
		gbc_textField_67.gridy = 8;
		contentPane.add(textField_67, gbc_textField_67);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBackground(Color.GREEN);
		GridBagConstraints gbc_textField_65 = new GridBagConstraints();
		gbc_textField_65.insets = new Insets(0, 0, 5, 5);
		gbc_textField_65.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_65.gridx = 15;
		gbc_textField_65.gridy = 8;
		contentPane.add(textField_65, gbc_textField_65);
		
		textField_75 = new JTextField();
		textField_75.setColumns(10);
		textField_75.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_75 = new GridBagConstraints();
		gbc_textField_75.insets = new Insets(0, 0, 5, 0);
		gbc_textField_75.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_75.gridx = 16;
		gbc_textField_75.gridy = 8;
		contentPane.add(textField_75, gbc_textField_75);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_33 = new GridBagConstraints();
		gbc_textField_33.insets = new Insets(0, 0, 5, 5);
		gbc_textField_33.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_33.gridx = 0;
		gbc_textField_33.gridy = 9;
		contentPane.add(textField_33, gbc_textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_34 = new GridBagConstraints();
		gbc_textField_34.insets = new Insets(0, 0, 5, 5);
		gbc_textField_34.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_34.gridx = 1;
		gbc_textField_34.gridy = 9;
		contentPane.add(textField_34, gbc_textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_35 = new GridBagConstraints();
		gbc_textField_35.insets = new Insets(0, 0, 5, 5);
		gbc_textField_35.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_35.gridx = 2;
		gbc_textField_35.gridy = 9;
		contentPane.add(textField_35, gbc_textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_36 = new GridBagConstraints();
		gbc_textField_36.insets = new Insets(0, 0, 5, 5);
		gbc_textField_36.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_36.gridx = 3;
		gbc_textField_36.gridy = 9;
		contentPane.add(textField_36, gbc_textField_36);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBackground(Color.BLUE);
		GridBagConstraints gbc_textField_32 = new GridBagConstraints();
		gbc_textField_32.insets = new Insets(0, 0, 5, 5);
		gbc_textField_32.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_32.gridx = 4;
		gbc_textField_32.gridy = 9;
		contentPane.add(textField_32, gbc_textField_32);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_37 = new GridBagConstraints();
		gbc_textField_37.insets = new Insets(0, 0, 5, 5);
		gbc_textField_37.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_37.gridx = 5;
		gbc_textField_37.gridy = 9;
		contentPane.add(textField_37, gbc_textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_38 = new GridBagConstraints();
		gbc_textField_38.insets = new Insets(0, 0, 5, 5);
		gbc_textField_38.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_38.gridx = 6;
		gbc_textField_38.gridy = 9;
		contentPane.add(textField_38, gbc_textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_39 = new GridBagConstraints();
		gbc_textField_39.insets = new Insets(0, 0, 5, 5);
		gbc_textField_39.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_39.gridx = 7;
		gbc_textField_39.gridy = 9;
		contentPane.add(textField_39, gbc_textField_39);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBackground(Color.YELLOW);
		GridBagConstraints gbc_textField_68 = new GridBagConstraints();
		gbc_textField_68.insets = new Insets(0, 0, 5, 5);
		gbc_textField_68.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_68.gridx = 8;
		gbc_textField_68.gridy = 9;
		contentPane.add(textField_68, gbc_textField_68);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_54 = new GridBagConstraints();
		gbc_textField_54.insets = new Insets(0, 0, 5, 5);
		gbc_textField_54.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_54.gridx = 9;
		gbc_textField_54.gridy = 9;
		contentPane.add(textField_54, gbc_textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_55 = new GridBagConstraints();
		gbc_textField_55.insets = new Insets(0, 0, 5, 5);
		gbc_textField_55.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_55.gridx = 10;
		gbc_textField_55.gridy = 9;
		contentPane.add(textField_55, gbc_textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_56 = new GridBagConstraints();
		gbc_textField_56.insets = new Insets(0, 0, 5, 5);
		gbc_textField_56.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_56.gridx = 11;
		gbc_textField_56.gridy = 9;
		contentPane.add(textField_56, gbc_textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_57 = new GridBagConstraints();
		gbc_textField_57.insets = new Insets(0, 0, 5, 5);
		gbc_textField_57.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_57.gridx = 12;
		gbc_textField_57.gridy = 9;
		contentPane.add(textField_57, gbc_textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_58 = new GridBagConstraints();
		gbc_textField_58.insets = new Insets(0, 0, 5, 5);
		gbc_textField_58.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_58.gridx = 13;
		gbc_textField_58.gridy = 9;
		contentPane.add(textField_58, gbc_textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_59 = new GridBagConstraints();
		gbc_textField_59.insets = new Insets(0, 0, 5, 5);
		gbc_textField_59.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_59.gridx = 14;
		gbc_textField_59.gridy = 9;
		contentPane.add(textField_59, gbc_textField_59);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_60 = new GridBagConstraints();
		gbc_textField_60.insets = new Insets(0, 0, 5, 5);
		gbc_textField_60.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_60.gridx = 15;
		gbc_textField_60.gridy = 9;
		contentPane.add(textField_60, gbc_textField_60);
		
		textField_61 = new JTextField();
		textField_61.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_61 = new GridBagConstraints();
		gbc_textField_61.insets = new Insets(0, 0, 5, 0);
		gbc_textField_61.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_61.gridx = 16;
		gbc_textField_61.gridy = 9;
		contentPane.add(textField_61, gbc_textField_61);
		textField_61.setColumns(10);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_40 = new GridBagConstraints();
		gbc_textField_40.insets = new Insets(0, 0, 5, 5);
		gbc_textField_40.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_40.gridx = 7;
		gbc_textField_40.gridy = 10;
		contentPane.add(textField_40, gbc_textField_40);
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBackground(Color.YELLOW);
		GridBagConstraints gbc_textField_69 = new GridBagConstraints();
		gbc_textField_69.insets = new Insets(0, 0, 5, 5);
		gbc_textField_69.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_69.gridx = 8;
		gbc_textField_69.gridy = 10;
		contentPane.add(textField_69, gbc_textField_69);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_53 = new GridBagConstraints();
		gbc_textField_53.insets = new Insets(0, 0, 5, 5);
		gbc_textField_53.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_53.gridx = 9;
		gbc_textField_53.gridy = 10;
		contentPane.add(textField_53, gbc_textField_53);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 7;
		gbc_textField.gridy = 11;
		contentPane.add(textField, gbc_textField);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBackground(Color.YELLOW);
		GridBagConstraints gbc_textField_70 = new GridBagConstraints();
		gbc_textField_70.insets = new Insets(0, 0, 5, 5);
		gbc_textField_70.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_70.gridx = 8;
		gbc_textField_70.gridy = 11;
		contentPane.add(textField_70, gbc_textField_70);
		
		textField_52 = new JTextField();
		textField_52.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_52 = new GridBagConstraints();
		gbc_textField_52.insets = new Insets(0, 0, 5, 5);
		gbc_textField_52.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_52.gridx = 9;
		gbc_textField_52.gridy = 11;
		contentPane.add(textField_52, gbc_textField_52);
		textField_52.setColumns(10);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_42 = new GridBagConstraints();
		gbc_textField_42.insets = new Insets(0, 0, 5, 5);
		gbc_textField_42.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_42.gridx = 7;
		gbc_textField_42.gridy = 12;
		contentPane.add(textField_42, gbc_textField_42);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBackground(Color.YELLOW);
		GridBagConstraints gbc_textField_71 = new GridBagConstraints();
		gbc_textField_71.insets = new Insets(0, 0, 5, 5);
		gbc_textField_71.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_71.gridx = 8;
		gbc_textField_71.gridy = 12;
		contentPane.add(textField_71, gbc_textField_71);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBackground(Color.YELLOW);
		GridBagConstraints gbc_textField_51 = new GridBagConstraints();
		gbc_textField_51.insets = new Insets(0, 0, 5, 5);
		gbc_textField_51.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_51.gridx = 9;
		gbc_textField_51.gridy = 12;
		contentPane.add(textField_51, gbc_textField_51);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_43 = new GridBagConstraints();
		gbc_textField_43.insets = new Insets(0, 0, 5, 5);
		gbc_textField_43.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_43.gridx = 7;
		gbc_textField_43.gridy = 13;
		contentPane.add(textField_43, gbc_textField_43);
		
		textField_72 = new JTextField();
		textField_72.setColumns(10);
		textField_72.setBackground(Color.YELLOW);
		GridBagConstraints gbc_textField_72 = new GridBagConstraints();
		gbc_textField_72.insets = new Insets(0, 0, 5, 5);
		gbc_textField_72.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_72.gridx = 8;
		gbc_textField_72.gridy = 13;
		contentPane.add(textField_72, gbc_textField_72);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_50 = new GridBagConstraints();
		gbc_textField_50.insets = new Insets(0, 0, 5, 5);
		gbc_textField_50.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_50.gridx = 9;
		gbc_textField_50.gridy = 13;
		contentPane.add(textField_50, gbc_textField_50);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_44 = new GridBagConstraints();
		gbc_textField_44.insets = new Insets(0, 0, 5, 5);
		gbc_textField_44.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_44.gridx = 7;
		gbc_textField_44.gridy = 14;
		contentPane.add(textField_44, gbc_textField_44);
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		textField_73.setBackground(Color.YELLOW);
		GridBagConstraints gbc_textField_73 = new GridBagConstraints();
		gbc_textField_73.insets = new Insets(0, 0, 5, 5);
		gbc_textField_73.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_73.gridx = 8;
		gbc_textField_73.gridy = 14;
		contentPane.add(textField_73, gbc_textField_73);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_49 = new GridBagConstraints();
		gbc_textField_49.insets = new Insets(0, 0, 5, 5);
		gbc_textField_49.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_49.gridx = 9;
		gbc_textField_49.gridy = 14;
		contentPane.add(textField_49, gbc_textField_49);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_45 = new GridBagConstraints();
		gbc_textField_45.insets = new Insets(0, 0, 5, 5);
		gbc_textField_45.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_45.gridx = 7;
		gbc_textField_45.gridy = 15;
		contentPane.add(textField_45, gbc_textField_45);
		
		textField_74 = new JTextField();
		textField_74.setColumns(10);
		textField_74.setBackground(Color.YELLOW);
		GridBagConstraints gbc_textField_74 = new GridBagConstraints();
		gbc_textField_74.insets = new Insets(0, 0, 5, 5);
		gbc_textField_74.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_74.gridx = 8;
		gbc_textField_74.gridy = 15;
		contentPane.add(textField_74, gbc_textField_74);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_48 = new GridBagConstraints();
		gbc_textField_48.insets = new Insets(0, 0, 5, 5);
		gbc_textField_48.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_48.gridx = 9;
		gbc_textField_48.gridy = 15;
		contentPane.add(textField_48, gbc_textField_48);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_46 = new GridBagConstraints();
		gbc_textField_46.insets = new Insets(0, 0, 0, 5);
		gbc_textField_46.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_46.gridx = 7;
		gbc_textField_46.gridy = 16;
		contentPane.add(textField_46, gbc_textField_46);
		
		textField_91 = new JTextField();
		textField_91.setColumns(10);
		textField_91.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_91 = new GridBagConstraints();
		gbc_textField_91.insets = new Insets(0, 0, 0, 5);
		gbc_textField_91.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_91.gridx = 8;
		gbc_textField_91.gridy = 16;
		contentPane.add(textField_91, gbc_textField_91);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBackground(Color.GRAY);
		GridBagConstraints gbc_textField_47 = new GridBagConstraints();
		gbc_textField_47.insets = new Insets(0, 0, 0, 5);
		gbc_textField_47.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_47.gridx = 9;
		gbc_textField_47.gridy = 16;
		//contentPane.add(textField_47, gbc_textField_47);
		
		
		

	
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
