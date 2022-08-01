package Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Set.BaseSet;

public class FrameLogin extends JFrame {

	public FrameLogin() {

		BaseSet frame = new BaseSet();

		// �ʷΰ� �̹���
		ImageIcon oflogo = new ImageIcon("image/frame/��.png"); // �׸��ҷ�����
		JLabel lblPCSR = new JLabel(oflogo); // �׸� ���̱�
		lblPCSR.setSize(350, 350);
		lblPCSR.setLocation(125, 50);
		frame.add(lblPCSR);

		// ���� �̹���
		ImageIcon title = new ImageIcon("image/frame/����.png"); // �׸��ҷ�����
		ImageIcon titleon = new ImageIcon("image/frame/����on.png");
		JButton titlePCSR = new JButton(title);
		frame.ButtonSet(titlePCSR, title, titleon);
		titlePCSR.setSize(400, 200);
		titlePCSR.setLocation(30, 500);
		frame.add(titlePCSR);

		// ���� �̹���
		ImageIcon line = new ImageIcon("image/frame/line.png"); // �׸��ҷ�����
		JLabel lblLine = new JLabel(line); // �׸� ���̱�
		lblLine.setSize(600, 1);
		lblLine.setLocation(0, 480);
		frame.add(lblLine);

		// �� �ΰ� �̹���
		ImageIcon tName = new ImageIcon("image/frame/����.png");
		ImageIcon tNameon = new ImageIcon("image/frame/����on.png");
		JButton teamName = new JButton();
		frame.ButtonSet(teamName, tName, tNameon);
		teamName.setSize(90, 240);
		teamName.setLocation(470, 480);
		frame.add(teamName);

		Font f1 = new Font("Noto Sans KR Medium", Font.BOLD, 15);

		// id ����
		ImageIcon id = new ImageIcon("image/frame/id.png");
		JLabel lbId = new JLabel(id);
		lbId.setBounds(100, 698, 40, 40);
		lbId.setFont(f1);
		frame.add(lbId);

		// id �Է�â
		JTextField idBox = new JTextField();
		idBox.setBounds(150, 705, 180, 30);
		idBox.setFont(f1);
		frame.add(idBox);

		// pw ����
		ImageIcon pw = new ImageIcon("image/frame/pw.png");
		JLabel lbPw = new JLabel(pw);
		lbPw.setBounds(99, 740, 40, 40);
		lbPw.setFont(f1);
		frame.add(lbPw);

		// pw �Է�â
		JPasswordField pwBox = new JPasswordField();
		pwBox.setBounds(150, 745, 180, 30);
		pwBox.setFont(f1);
		frame.add(pwBox);

		// login ��ư
		ImageIcon login = new ImageIcon("image/frame/login.png");
		ImageIcon loginon = new ImageIcon("image/frame/loginon.png");
		JButton btnLogin = new JButton();
		frame.ButtonSet(btnLogin, login, loginon);
		btnLogin.setBounds(340, 703, 110, 75);
		frame.add(btnLogin);

		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (idBox.getText().equals("LED") && pwBox.getText().equals("123")) {
					JOptionPane.showMessageDialog(null, "ȯ���մϴ�!");
					new FrameStart();
				} else {
					if (idBox.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "���̵� �Է����ּ���.");
					} else {
						if (!idBox.getText().equals("LED")) {
							JOptionPane.showMessageDialog(null, "�������� �ʴ� ���̵��Դϴ�.");
						} else {
							if (pwBox.getText().equals("")) {
								JOptionPane.showMessageDialog(null, "��й�ȣ�� �Է����ּ���.");
							} else {
								JOptionPane.showMessageDialog(null, "��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
							}
						}
					}
				}
			}
		});

		// ���ȿ�� ó��
		JLabel effect = new JLabel();
		frame.backEffect(effect);

		frame.setVisible(true);
	}
}