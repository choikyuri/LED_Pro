package Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frame.FrameGender.GenAuDp;
import Frame.FrameGender.GenAuMt;
import Frame.FrameGender.GenAuWm;
import Frame.FrameGender.GenSpBr;
import Frame.FrameGender.GenSpWm;
import Set.BaseSet;
import Set.MyShop;
import Set.ProductSet;
import Set.Shop;

public class FrameProductAutumnF {

	public static class ProAuMtF extends JFrame {
		public ProAuMtF() {
			BaseSet frame = new BaseSet();
			ProductSet set = new ProductSet();
			// �ΰ��
			JLabel lblImage = new JLabel();
			JButton lblLED = new JButton();
			JButton lblTitle = new JButton();
			frame.logoSet(lblImage, lblLED, lblTitle);
			// ��� Ÿ��Ʋ
			ImageIcon aumt = new ImageIcon("image/product/����.png");
			JLabel auMute = new JLabel(aumt);
			auMute.setBounds(115, 70, 350, 110);
			frame.add(auMute);

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
					JLabel mtSet1 = new JLabel(set1);
					mtSet1.setBounds(25, 25, 485, 485);
					newF.add(mtSet1);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/125.png");
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
					Shop aumtf1 = new Shop("Autumn Mute Set1(F)", 125,
							new JLabel(new ImageIcon("image/product/fcart/f����1.png")));
					MyShop.pCount++;
					MyShop.add(aumtf1);
				}
			});
			set.getBtnAdd2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop aumtf2 = new Shop("Autumn Mute Set2(F)", 116,
							new JLabel(new ImageIcon("image/product/fcart/f����2.png")));
					MyShop.pCount++;
					MyShop.add(aumtf2);
				}
			});
			set.getBtnAdd3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop aumtf3 = new Shop("Autumn Mute Set3(F)", 108,
							new JLabel(new ImageIcon("image/product/fcart/f����3.png")));
					MyShop.pCount++;
					MyShop.add(aumtf3);
				}
			});

			// back��ư
			JButton btnBack = new JButton();
			frame.goBack(btnBack);

			btnBack.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new GenAuMt();
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

	public static class ProAuWmF extends JFrame {
		public ProAuWmF() {
			BaseSet frame = new BaseSet();
			ProductSet set = new ProductSet();
			// �ΰ��
			JLabel lblImage = new JLabel();
			JButton lblLED = new JButton();
			JButton lblTitle = new JButton();
			frame.logoSet(lblImage, lblLED, lblTitle);
			// ��� Ÿ��Ʋ
			ImageIcon auwm = new ImageIcon("image/product/����.png");
			JLabel auWarm = new JLabel(auwm);
			auWarm.setBounds(115, 70, 350, 110);
			frame.add(auWarm);

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
					ImageIcon set2 = new ImageIcon("image/product/female/f����2.png");
					JLabel wmSet2 = new JLabel(set2);
					wmSet2.setBounds(25, 25, 485, 485);
					newF.add(wmSet2);
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
					ImageIcon set3 = new ImageIcon("image/product/female/f����3.png");
					JLabel wmSet3 = new JLabel(set3);
					wmSet3.setBounds(25, 25, 485, 485);
					newF.add(wmSet3);
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
					Shop auwmf1 = new Shop("Autumn Warm Set1(F)", 108,
							new JLabel(new ImageIcon("image/product/fcart/f����1.png")));
					MyShop.pCount++;
					MyShop.add(auwmf1);
				}
			});
			set.getBtnAdd2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop auwmf2 = new Shop("Autumn Warm Set2(F)", 86,
							new JLabel(new ImageIcon("image/product/fcart/f����2.png")));
					MyShop.pCount++;
					MyShop.add(auwmf2);
				}
			});
			set.getBtnAdd3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop auwmf3 = new Shop("Autumn Warm Set3(F)", 93,
							new JLabel(new ImageIcon("image/product/fcart/f����3.png")));
					MyShop.pCount++;
					MyShop.add(auwmf3);
				}
			});

			// back��ư
			JButton btnBack = new JButton();
			frame.goBack(btnBack);

			btnBack.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new GenAuWm();
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

	public static class ProAuDpF extends JFrame {
		public ProAuDpF() {
			BaseSet frame = new BaseSet();
			ProductSet set = new ProductSet();
			// �ΰ��
			JLabel lblImage = new JLabel();
			JButton lblLED = new JButton();
			JButton lblTitle = new JButton();
			frame.logoSet(lblImage, lblLED, lblTitle);
			// ��� Ÿ��Ʋ
			ImageIcon AuDp = new ImageIcon("image/product/����.png");
			JLabel auDeep = new JLabel(AuDp);
			auDeep.setBounds(115, 70, 350, 110);
			frame.add(auDeep);

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
					JLabel DpSet1 = new JLabel(set1);
					DpSet1.setBounds(25, 25, 485, 485);
					newF.add(DpSet1);
					// ���� �̹���
					ImageIcon price = new ImageIcon("image/product/price/147.png");
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
					ImageIcon price = new ImageIcon("image/product/price/152.png");
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
					Shop audpf1 = new Shop("Autumn Deep Set1(F)", 147,
							new JLabel(new ImageIcon("image/product/fcart/f����1.png")));
					MyShop.pCount++;
					MyShop.add(audpf1);
				}
			});
			set.getBtnAdd2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop auwmf2 = new Shop("Autumn Deep Set2(F)", 152,
							new JLabel(new ImageIcon("image/product/fcart/f����2.png")));
					MyShop.pCount++;
					MyShop.add(auwmf2);
				}
			});
			set.getBtnAdd3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop auwmf3 = new Shop("Autumn Deep Set3(F)", 134,
							new JLabel(new ImageIcon("image/product/fcart/f����3.png")));
					MyShop.pCount++;
					MyShop.add(auwmf3);
				}
			});

			// back��ư
			JButton btnBack = new JButton();
			frame.goBack(btnBack);

			btnBack.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new GenAuDp();
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