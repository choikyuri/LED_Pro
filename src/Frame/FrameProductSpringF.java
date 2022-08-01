package Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frame.FrameGender.GenSpBr;
import Frame.FrameGender.GenSpWm;
import Set.BaseSet;
import Set.MyShop;
import Set.ProductSet;
import Set.Shop;

public class FrameProductSpringF extends JFrame {

	public static class ProSpBrF extends JFrame {
		public ProSpBrF() {
			BaseSet frame = new BaseSet();
			ProductSet set = new ProductSet();
			// �ΰ��
			JLabel lblImage = new JLabel();
			JButton lblLED = new JButton();
			JButton lblTitle = new JButton();
			frame.logoSet(lblImage, lblLED, lblTitle);
			// ��� Ÿ��Ʋ
			ImageIcon spbr = new ImageIcon("image/product/����.png");
			JLabel spBright = new JLabel(spbr);
			spBright.setBounds(115, 70, 350, 110);
			frame.add(spBright);

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
					JLabel brSet1 = new JLabel(set1);
					brSet1.setBounds(25, 25, 485, 485);
					newF.add(brSet1);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/93.png");
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
					JLabel brSet2 = new JLabel(set2);
					brSet2.setBounds(25, 25, 485, 485);
					newF.add(brSet2);
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
					JLabel brSet3 = new JLabel(set3);
					brSet3.setBounds(25, 25, 485, 485);
					newF.add(brSet3);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/108.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnAdd1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spbrf1 = new Shop("Spring Bright Set1(F)", 93,
							new JLabel(new ImageIcon("image/product/fcart/f����1.png")));
					MyShop.pCount++;
					MyShop.add(spbrf1);
				}
			});
			set.getBtnAdd2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spbrf2 = new Shop("Spring Bright Set2(F)", 134,
							new JLabel(new ImageIcon("image/product/fcart/f����2.png")));
					MyShop.pCount++;
					MyShop.add(spbrf2);
				}
			});
			set.getBtnAdd3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spbrf3 = new Shop("Spring Bright Set3(F)", 108,
							new JLabel(new ImageIcon("image/product/fcart/f����3.png")));
					MyShop.pCount++;
					MyShop.add(spbrf3);
				}
			});

			// back��ư
			JButton btnBack = new JButton();
			frame.goBack(btnBack);

			btnBack.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new GenSpBr();
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

	public static class ProSpWmF extends JFrame {
		public ProSpWmF() {
			BaseSet frame = new BaseSet();
			ProductSet set = new ProductSet();
			// �ΰ��
			JLabel lblImage = new JLabel();
			JButton lblLED = new JButton();
			JButton lblTitle = new JButton();
			frame.logoSet(lblImage, lblLED, lblTitle);
			// ��� Ÿ��Ʋ
			ImageIcon spwm = new ImageIcon("image/product/����.png");
			JLabel spWarm = new JLabel(spwm);
			spWarm.setBounds(115, 70, 350, 110);
			frame.add(spWarm);

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
					JLabel wmSet1 = new JLabel(set1);
					wmSet1.setBounds(25, 25, 485, 485);
					newF.add(wmSet1);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/79.png");
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
					JLabel wmSet2 = new JLabel(set2);
					wmSet2.setBounds(25, 25, 485, 485);
					newF.add(wmSet2);
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
					ImageIcon set3 = new ImageIcon("image/product/female/f����3.png");
					JLabel wmSet3 = new JLabel(set3);
					wmSet3.setBounds(25, 25, 485, 485);
					newF.add(wmSet3);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/97.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnAdd1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spwmf1 = new Shop("Spring Warm Set1(F)", 79,
							new JLabel(new ImageIcon("image/product/fcart/f����1.png")));
					MyShop.pCount++;
					MyShop.add(spwmf1);
				}
			});
			set.getBtnAdd2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spwmf2 = new Shop("Spring Warm Set2(F)", 116,
							new JLabel(new ImageIcon("image/product/fcart/f����2.png")));
					MyShop.pCount++;
					MyShop.add(spwmf2);
				}
			});
			set.getBtnAdd3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spwmf3 = new Shop("Spring Warm Set3(F)", 97,
							new JLabel(new ImageIcon("image/product/fcart/f����3.png")));
					MyShop.pCount++;
					MyShop.add(spwmf3);
				}
			});

			// back��ư
			JButton btnBack = new JButton();
			frame.goBack(btnBack);

			btnBack.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new GenSpWm();
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

	public static class ProSpLtF extends JFrame {
		public ProSpLtF() {
			BaseSet frame = new BaseSet();
			ProductSet set = new ProductSet();
			// �ΰ��
			JLabel lblImage = new JLabel();
			JButton lblLED = new JButton();
			JButton lblTitle = new JButton();
			frame.logoSet(lblImage, lblLED, lblTitle);
			// ��� Ÿ��Ʋ
			ImageIcon splt = new ImageIcon("image/product/����.png");
			JLabel spLight = new JLabel(splt);
			spLight.setBounds(115, 70, 350, 110);
			frame.add(spLight);

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
					JLabel ltSet1 = new JLabel(set1);
					ltSet1.setBounds(25, 25, 485, 485);
					newF.add(ltSet1);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/86.png");
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
					JLabel ltSet2 = new JLabel(set2);
					ltSet2.setBounds(25, 25, 485, 485);
					newF.add(ltSet2);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/125.png");
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
					JLabel ltSet3 = new JLabel(set3);
					ltSet3.setBounds(25, 25, 485, 485);
					newF.add(ltSet3);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/134.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnAdd1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spltf1 = new Shop("Spring Light Set1(F)", 86,
							new JLabel(new ImageIcon("image/product/fcart/f����1.png")));
					MyShop.pCount++;
					MyShop.add(spltf1);
				}
			});
			set.getBtnAdd2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spltf2 = new Shop("Spring Light Set2(F)", 125,
							new JLabel(new ImageIcon("image/product/fcart/f����2.png")));
					MyShop.pCount++;
					MyShop.add(spltf2);
				}
			});
			set.getBtnAdd3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spltf3 = new Shop("Spring Light Set3(F)", 134,
							new JLabel(new ImageIcon("image/product/fcart/f����3.png")));
					MyShop.pCount++;
					MyShop.add(spltf3);
				}
			});

			// back��ư
			JButton btnBack = new JButton();
			frame.goBack(btnBack);

			btnBack.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new GenSpBr();
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
