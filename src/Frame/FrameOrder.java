package Frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Set.BaseSet;
import Set.MyShop;

public class FrameOrder extends JFrame {

	public FrameOrder() {
		BaseSet frame = new BaseSet();

		ImageIcon order = new ImageIcon("image/frame/ordertitle.png");
		JLabel lblOrder = new JLabel(order);
		lblOrder.setBounds(115, 70, 350, 85);
		frame.add(lblOrder);

		int total = 0;
		for (int i = 0; i < MyShop.buylist.size(); i++) {
			total += MyShop.buylist.get(i).getPrice();
		}

		// ��Ʈ
		Font txtFont = (new Font("Noto Sans KR Medium", Font.PLAIN, 15));
		Font numFont = (new Font("Will&Grace", Font.PLAIN, 15));

		// �ֹ�����
		JPanel orderList = new JPanel();
		orderList.setLayout(new GridLayout(1, 5));
		orderList.setBounds(30, 190, 530, 120);
		orderList.setBackground(new Color(226, 224, 222));
		orderList.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY), "�ֹ�����", TitledBorder.LEADING,
				TitledBorder.TOP, new Font("Noto Sans KR Medium", Font.BOLD, 20), new Color(000, 000, 000)));
		frame.add(orderList);

		String orderInfo = "";
		for (int i = 0; i < MyShop.buylist.size(); i++) {
			switch (i) {
			case 0:
				orderInfo += "\n- " + MyShop.buylist.get(i).getName();
				break;
			case 1:
				orderInfo += "\n- " + MyShop.buylist.get(i).getName();
				break;
			case 2:
				orderInfo += "\n- " + MyShop.buylist.get(i).getName();
				break;
			case 3:
				orderInfo += "\n- " + MyShop.buylist.get(i).getName();
				break;
			case 4:
				orderInfo += "\n- " + MyShop.buylist.get(i).getName();
				break;
			}
		}

		TextArea MyShopping = new TextArea("�ֹ���ǰ�� :" + orderInfo + "\n\n�����ݾ� : " + total + ",000��", 0, 0,
				TextArea.SCROLLBARS_VERTICAL_ONLY);
		MyShopping.setFont(txtFont);
		orderList.add(MyShopping);

		// ����� �Է�
		JPanel deliver = new JPanel(); // ����� �г� ����
		deliver.setLayout(new GridLayout(6, 3, 10, 10));
		deliver.setBounds(30, 338, 530, 230); // ���γ���
		deliver.setBackground(new Color(226, 224, 222));
		deliver.setBorder(new TitledBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY)), // �׵θ�����
				"�������", // ����
				TitledBorder.LEADING, // �ؽ�Ʈ ���Ĺ�� : ��������
				TitledBorder.TOP, // �ؽ�Ʈ ǥ�� ��ġ : ���
				new Font("Noto Sans KR Medium", Font.BOLD, 20), new Color(000, 000, 000))); // ����

		// ����
		TextField name = new TextField("", 30);
		name.setFont(txtFont);
		Label cName = new Label("�ֹ��� ����");
		cName.setFont(txtFont);
		deliver.add(cName);
		deliver.add(name);

		// �ּ�
		TextField adress = new TextField("", 30);
		adress.setFont(txtFont);
		Label cAddress = new Label("�ּ�");
		cAddress.setFont(txtFont);
		deliver.add(cAddress);
		deliver.add(adress);

		// ��ȭ��ȣ
		TextField phone = new TextField("", 30);
		phone.setFont(txtFont);
		Label cPhone = new Label("��ȭ��ȣ");
		cPhone.setFont(txtFont);
		deliver.add(cPhone);
		deliver.add(phone);

		// ��۽� ��û����
		TextField demand = new TextField("����� �����ٶ��ϴ�.", 30);
		demand.setFont(txtFont);
		Label cDemand = new Label("��۽� ��û����");
		cDemand.setFont(txtFont);
		deliver.add(cDemand);
		deliver.add(demand);

		// �����ϱ� ��ư
		ImageIcon pay = new ImageIcon("image/frame/pay.png");
		ImageIcon payon = new ImageIcon("image/frame/payon.png");
		JButton btnPay = new JButton();
		frame.ButtonSet(btnPay, pay, payon);
		btnPay.setBounds(250, 670, 80, 80);
		frame.add(btnPay);

		btnPay.setVisible(false);

		btnPay.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�ֹ��� �Ϸ�Ǿ����ϴ�.");
				MyShop.clear();
				frame.dispose();
				new FrameStart();
			}
		});

		// �Ϸ�
		JButton btnInput = new JButton("�Է�");
		// btn.setBackground(Color.ORANGE);
		btnInput.setBackground(new Color(207, 207, 207)); // ��ư ������
		btnInput.setForeground(Color.BLACK); // ���ڻ�
		btnInput.setBorderPainted(false); // ��ư �׵θ� ��Ȱ��ȭ
		// btn.setOpaque(true); //������
		frame.add(btnInput);
		btnInput.setBounds(200, 512, 180, 40);
		btnInput.setEnabled(false);

		frame.add(deliver);

		btnInput.addActionListener(new ActionListener() {
			// "���� : " + name.getText() + "\n\n" +
			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null,
						name.getText() + "���� ����� �Է��� �Ϸ�Ǿ����ϴ�.  \n\n" + "�ּ� : " + adress.getText() + "\n\n" + "��ȭ��ȣ : "
								+ phone.getText() + "\n\n" + "��û���� : " + demand.getText());
				btnPay.setVisible(true);
			}
		});

		// �Ϸ� ��ư Ȱ��ȭ
		adress.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) { // ���ڸ� ĥ�� �Է��� �� �ְ� Ǯ����

				if (btnInput.getText().equals("")) { // ������ ������
					btnInput.setEnabled(false); // ��ư ���

				}
			}
		});
		demand.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void focusGained(FocusEvent e) {
				if (demand.getText().equals("����� �����ٶ��ϴ�.")) {
					demand.setText("");
				}
			}
		});

		// ��������
		JPanel payment = new JPanel();
		payment.setLayout(new FlowLayout());
		payment.setBounds(30, 590, 530, 70);
		payment.setBackground(new Color(226, 224, 222));
		payment.setBorder(new TitledBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY)), // �׵θ�����
				"��������", // ����
				TitledBorder.LEADING, // �ؽ�Ʈ ���Ĺ��:��������
				TitledBorder.TOP, // �ؽ�Ʈ ǥ�� ��ġ : ���
				new Font("Noto Sans KR Medium", Font.BOLD, 20), new Color(000, 000, 000)));
		add(payment);

		new Label("��������").setFont(txtFont);
		CheckboxGroup group = new CheckboxGroup();
		Checkbox card = new Checkbox("ī��", group, true);
		Checkbox deposit = new Checkbox("�������Ա�", group, false);
		Checkbox kakaopay = new Checkbox("kakaoPay", group, false);

		payment.add(card);
		payment.add(deposit);
		payment.add(kakaopay);
		frame.add(payment);

		phone.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) { // ���ڸ� ĥ�� �Է��� �� �ְ� Ǯ����

				if (btnInput.getText().equals("")) { // ������ ������
					btnInput.setEnabled(false); // ��ư ���

				} else {
					btnInput.setEnabled(true);// �׷��� ������ ��ư Ȱ��ȭ
				}
			}
		});

		JLabel lblImage = new JLabel();
		JButton lblLED = new JButton();
		JButton lblTitle = new JButton();
		frame.logoSet(lblImage, lblLED, lblTitle);

		// back��ư
		JButton btnBack = new JButton();
		frame.goBack(btnBack);

		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameCart();
				frame.dispose();
			}
		});

		// main��ư
		JButton btnMain = new JButton();
		frame.goMain(btnMain);

		JLabel effect = new JLabel();
		frame.backEffect(effect);

		frame.setVisible(true);
	}// ������
}// Ŭ����