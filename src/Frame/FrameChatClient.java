package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameChatClient extends JFrame implements Runnable {

	// ȭ�鱸�� : Ŭ���̾�Ʈ�� �޼����� JFrame���� ����(send_bt) -> ������ CopyClient������ ����
	JTextArea area; // ä�� ���� ���
	JTextField input; // �޼��� �Է�
	JButton send_bt; // �޼��� ���۹�ư
	JPanel south_p;
	// ���� ������ ���� ��ü��
	Socket s;
	BufferedReader in;
	PrintWriter out;
	Thread t;

	public FrameChatClient() {
		area = new JTextArea();
		this.add(area);

		// BorderLayout ��ġ�̿�
		south_p = new JPanel(new BorderLayout());// �г� ����
		south_p.add(input = new JTextField()); // �г��� ��� �Է»��� �߰�
		south_p.add(send_bt = new JButton("������"), BorderLayout.EAST); // �гο� ��ư �߰�

		this.add(south_p, BorderLayout.SOUTH);

		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				out.println("xx:~X");
			}

		});

		send_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �޼����� ������ �Ѿ�� �޼��� ������
				sendData();

			}
		});
		Toolkit tk = Toolkit.getDefaultToolkit();

		setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 200, ((int) tk.getScreenSize().getHeight()) / 2 - 300,
				400, 600);
		setVisible(true);
		area.setBackground(new Color(226, 224, 222));
		connected(); // �����ڿ��� �޼��带 ȣ���Ͽ� ������ ���ӿ�û

		t = new Thread(this);
		t.start(); // �޼��� ���
	}

	private void connected() {

		try {
			// ��������
			s = new Socket("192.168.219.107", 8888);
			out = new PrintWriter(s.getOutputStream(), true); // true : append(�߰�)
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FrameChatClient();
	}

	@Override
	public void run() {
		// �޼����� �����ϸ� ȭ�鿡 �Ѹ�
		while (true) {
			try {
				String msg = in.readLine();// ������
				if (msg.equals("xx:~X"))
					break;
				if (msg != null)
					area.append(msg + "\r\n");// �����쿡�� ������������ �ѱ�
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		closed(); // �����ִ� ��Ʈ�� ��� �ݱ�
	}

	// �ۼ��� �޼��� ����
	public void sendData() {

		String msg = input.getText().trim();
		if (msg.length() > 0) {
			out.println(msg);
		}
		input.setText("");// û��
	}

	// closed
	public void closed() {
		try {
			if (out != null)
				out.close();
			if (in != null)
				in.close();
			if (s != null)
				s.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}