package Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frame.FrameGender.GenSpBr;
import Frame.FrameGender.GenSpWm;
import Frame.FrameGender.GenWiBr;
import Frame.FrameGender.GenWiCo;
import Frame.FrameGender.GenWiDp;
import Set.BaseSet;
import Set.MyShop;
import Set.ProductSet;
import Set.Shop;

public class FrameProductWinterF extends JFrame {

	public static class ProWiDpF extends JFrame {
		public ProWiDpF() {
			BaseSet frame = new BaseSet();
			ProductSet set = new ProductSet();
			// �ΰ��
			JLabel lblImage = new JLabel();
			JButton lblLED = new JButton();
			JButton lblTitle = new JButton();
			frame.logoSet(lblImage, lblLED, lblTitle);
			// ��� Ÿ��Ʋ
			ImageIcon widp = new ImageIcon("image/product/�ܵ�.png");
			JLabel wiDeep = new JLabel(widp);
			wiDeep.setBounds(115, 70, 350, 110);
			frame.add(wiDeep);

			frame.add(set.getLblSet1());
			frame.add(set.getLblSet2());
			frame.add(set.getLblSet3());
			frame.add(set.getBtnAdd1());
			frame.add(set.getBtnAdd2());
			frame.add(set.getBtnAdd3());
			frame.add(set.getBtnShow1());
			frame.add(set.getBtnShow2());
			frame.add(set.getBtnShow3());

			set.getBtnShow1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set1");
					ImageIcon set1 = new ImageIcon("image/product/female/f�ܵ�1.png");
					JLabel dpSet1 = new JLabel(set1);
					dpSet1.setBounds(25, 25, 485, 485);
					newF.add(dpSet1);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/108.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set2");
					ImageIcon set2 = new ImageIcon("image/product/female/f�ܵ�2.png");
					JLabel dpSet2 = new JLabel(set2);
					dpSet2.setBounds(25, 25, 485, 485);
					newF.add(dpSet2);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/86.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set3");
					ImageIcon set3 = new ImageIcon("image/product/female/f�ܵ�3.png");
					JLabel dpSet3 = new JLabel(set3);
					dpSet3.setBounds(25, 25, 485, 485);
					newF.add(dpSet3);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/116.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnAdd1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop widpf1 = new Shop("Winter Deep Set1(F)", 108,
							new JLabel(new ImageIcon("image/product/fcart/f�ܵ�1.png")));
					MyShop.pCount++;
					MyShop.add(widpf1);
				}
			});
			set.getBtnAdd2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop widpf2 = new Shop("Winter Deep Set2(F)", 86,
							new JLabel(new ImageIcon("image/product/fcart/f�ܵ�2.png")));
					MyShop.pCount++;
					MyShop.add(widpf2);
				}
			});
			set.getBtnAdd3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop widpf3 = new Shop("Winter Deep Set3(F)", 116,
							new JLabel(new ImageIcon("image/product/fcart/f�ܵ�3.png")));
					MyShop.pCount++;
					MyShop.add(widpf3);
				}
			});

			// back��ư
			JButton btnBack = new JButton();
			frame.goBack(btnBack);

			btnBack.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new GenWiDp();
					frame.dispose();
				}
			});
			// main��ư
			JButton btnMain = new JButton();
			frame.goMain(btnMain);
			// ���ȿ�� ó��
			JLabel effect = new JLabel();
			frame.backEffect(effect);

			frame.setVisible(true);
		}
	}

	public static class ProWiCoF extends JFrame {
		public ProWiCoF() {
			BaseSet frame = new BaseSet();
			ProductSet set = new ProductSet();
			// �ΰ��
			JLabel lblImage = new JLabel();
			JButton lblLED = new JButton();
			JButton lblTitle = new JButton();
			frame.logoSet(lblImage, lblLED, lblTitle);
			// ��� Ÿ��Ʋ
			ImageIcon wico = new ImageIcon("image/product/����.png");
			JLabel wiCool = new JLabel(wico);
			wiCool.setBounds(115, 70, 350, 110);
			frame.add(wiCool);

			frame.add(set.getLblSet1());
			frame.add(set.getLblSet2());
			frame.add(set.getLblSet3());
			frame.add(set.getBtnAdd1());
			frame.add(set.getBtnAdd2());
			frame.add(set.getBtnAdd3());
			frame.add(set.getBtnShow1());
			frame.add(set.getBtnShow2());
			frame.add(set.getBtnShow3());

			set.getBtnShow1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set1");
					ImageIcon set1 = new ImageIcon("image/product/female/f����1.png");
					JLabel coSet1 = new JLabel(set1);
					coSet1.setBounds(25, 25, 485, 485);
					newF.add(coSet1);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/116.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set2");
					ImageIcon set2 = new ImageIcon("image/product/female/f����2.png");
					JLabel coSet2 = new JLabel(set2);
					coSet2.setBounds(25, 25, 485, 485);
					newF.add(coSet2);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/134.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set3");
					ImageIcon set3 = new ImageIcon("image/product/female/f����3.png");
					JLabel coSet3 = new JLabel(set3);
					coSet3.setBounds(25, 25, 485, 485);
					newF.add(coSet3);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/125.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnAdd1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop wicof1 = new Shop("Winter Cool Set1(F)", 116,
							new JLabel(new ImageIcon("image/product/fcart/f����1.png")));
					MyShop.pCount++;
					MyShop.add(wicof1);
				}
			});
			set.getBtnAdd2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop wicof2 = new Shop("Winter Cool Set2(F)", 134,
							new JLabel(new ImageIcon("image/product/fcart/f����2.png")));
					MyShop.pCount++;
					MyShop.add(wicof2);
				}
			});
			set.getBtnAdd3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop wicof3 = new Shop("Winter Cool Set3(F)", 125,
							new JLabel(new ImageIcon("image/product/fcart/f����3.png")));
					MyShop.pCount++;
					MyShop.add(wicof3);
				}
			});

			// back��ư
			JButton btnBack = new JButton();
			frame.goBack(btnBack);

			btnBack.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new GenWiCo();
					frame.dispose();
				}
			});
			// main��ư
			JButton btnMain = new JButton();
			frame.goMain(btnMain);
			// ���ȿ�� ó��
			JLabel effect = new JLabel();
			frame.backEffect(effect);

			frame.setVisible(true);
		}
	}

	public static class ProWiBrF extends JFrame {
		public ProWiBrF() {
			BaseSet frame = new BaseSet();
			ProductSet set = new ProductSet();
			// �ΰ��
			JLabel lblImage = new JLabel();
			JButton lblLED = new JButton();
			JButton lblTitle = new JButton();
			frame.logoSet(lblImage, lblLED, lblTitle);
			// ��� Ÿ��Ʋ
			ImageIcon wibr = new ImageIcon("image/product/�ܺ�.png");
			JLabel wiBight = new JLabel(wibr);
			wiBight.setBounds(115, 70, 350, 110);
			frame.add(wiBight);

			frame.add(set.getLblSet1());
			frame.add(set.getLblSet2());
			frame.add(set.getLblSet3());
			frame.add(set.getBtnAdd1());
			frame.add(set.getBtnAdd2());
			frame.add(set.getBtnAdd3());
			frame.add(set.getBtnShow1());
			frame.add(set.getBtnShow2());
			frame.add(set.getBtnShow3());

			set.getBtnShow1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set1");
					ImageIcon set1 = new ImageIcon("image/product/female/f�ܺ�1.png");
					JLabel brSet1 = new JLabel(set1);
					brSet1.setBounds(25, 25, 485, 485);
					newF.add(brSet1);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/108.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set2");
					ImageIcon set2 = new ImageIcon("image/product/female/f�ܺ�2.png");
					JLabel brSet2 = new JLabel(set2);
					brSet2.setBounds(25, 25, 485, 485);
					newF.add(brSet2);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/116.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set3");
					ImageIcon set3 = new ImageIcon("image/product/female/f�ܺ�3.png");
					JLabel brSet3 = new JLabel(set3);
					brSet3.setBounds(25, 25, 485, 485);
					newF.add(brSet3);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/93.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnAdd1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop wibrf1 = new Shop("Winter Bright Set1(F)", 108,
							new JLabel(new ImageIcon("image/product/fcart/f�ܺ�1.png")));
					MyShop.pCount++;
					MyShop.add(wibrf1);
				}
			});
			set.getBtnAdd2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop wibrf2 = new Shop("Winter Bright Set2(F)", 116,
							new JLabel(new ImageIcon("image/product/fcart/f�ܺ�2.png")));
					MyShop.pCount++;
					MyShop.add(wibrf2);
				}
			});
			set.getBtnAdd3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop wibrf3 = new Shop("Winter Bright Set3(F)", 93,
							new JLabel(new ImageIcon("image/product/fcart/f�ܺ�3.png")));
					MyShop.pCount++;
					MyShop.add(wibrf3);
				}
			});

			// back��ư
			JButton btnBack = new JButton();
			frame.goBack(btnBack);

			btnBack.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new GenWiBr();
					frame.dispose();
				}
			});
			// main��ư
			JButton btnMain = new JButton();
			frame.goMain(btnMain);
			// ���ȿ�� ó��
			JLabel effect = new JLabel();
			frame.backEffect(effect);

			frame.setVisible(true);
		}
	}
}