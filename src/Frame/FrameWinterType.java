package Frame;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frame.FrameGender.GenWiBr;
import Frame.FrameGender.GenWiCo;
import Frame.FrameGender.GenWiDp;
import Set.BaseSet;

public class FrameWinterType extends JFrame{
   public FrameWinterType() {
      
      // BaseSet ��ü ����
      BaseSet frame = new BaseSet();
      
      // �ܿ�Ÿ�� �̹���
      ImageIcon winter = new ImageIcon("image/frame/�ܿ�Ÿ��.png");
      JLabel lblWinter = new JLabel(winter);
      lblWinter.setBounds(115,70,350,110);
      frame.add(lblWinter);

      JLabel lblImage = new JLabel();
      JButton lblLED = new JButton(); 
      JButton lblTitle = new JButton();
      frame.logoSet(lblImage, lblLED, lblTitle);
      
      // deep �ȷ�Ʈâ
      ImageIcon info = new ImageIcon("image/info/�ȷ�Ʈ.png");
      ImageIcon infoon = new ImageIcon("image/info/�ȷ�Ʈon.png");
      JButton WiDeepPlt = new JButton();
      frame.ButtonSet(WiDeepPlt, info, infoon);
      
      WiDeepPlt.setBounds(460, 250, 40, 40);
      frame.add(WiDeepPlt);
      WiDeepPlt.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame widpPlt = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            widpPlt.setTitle("Winter Deep Palette");
            widpPlt.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon widp = new ImageIcon("image/info/�ܵ���.png");
            JLabel dpwiplt = new JLabel(widp);
            dpwiplt.setBounds(0, 150, 550, 550);
            widpPlt.add(dpwiplt);
            widpPlt.setVisible(true);
         }
      });

      // deep ��ư
      ImageIcon deep = new ImageIcon("image/frame/��.png");
      ImageIcon deepon = new ImageIcon("image/frame/��on.png");
      JButton btnDeep = new JButton();
      frame.ButtonSet(btnDeep, deep, deepon);
      btnDeep.setBounds(40, 240, 500, 120);
      frame.add(btnDeep);
      
      btnDeep.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new GenWiDp();
            frame.dispose();
         }
      });
      
      // cool �ȷ�Ʈâ
      JButton WiCoolPlt = new JButton();
      frame.ButtonSet(WiCoolPlt, info, infoon);
      
      WiCoolPlt.setBounds(460, 420, 40, 40);
      frame.add(WiCoolPlt);
      WiCoolPlt.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame wicoPlt = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            wicoPlt.setTitle("Winter Cool Palette");
            wicoPlt.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon wico = new ImageIcon("image/info/������.png");
            JLabel cowiplt = new JLabel(wico);
            cowiplt.setBounds(0, 150, 550, 550);
            wicoPlt.add(cowiplt);
            wicoPlt.setVisible(true);
         }
      });
      
      // cool ��ư
      ImageIcon cool = new ImageIcon("image/frame/��.png");
      ImageIcon coolon = new ImageIcon("image/frame/��on.png");
      JButton btnCool = new JButton();
      frame.ButtonSet(btnCool, cool, coolon);
      btnCool.setBounds(40, 410, 500, 120);
      frame.add(btnCool);
      
      btnCool.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new GenWiCo();
            frame.dispose();
         }
      });
      
      // bright �ȷ�Ʈâ
      JButton WiBrightPlt = new JButton();
      frame.ButtonSet(WiBrightPlt, info, infoon);
      
      WiBrightPlt.setBounds(460, 590, 40, 40);
      frame.add(WiBrightPlt);
      WiBrightPlt.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame wibrPlt = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            wibrPlt.setTitle("Winter Bright Palette");
            wibrPlt.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon wibr = new ImageIcon("image/info/�ܺ���.png");
            JLabel brwiplt = new JLabel(wibr);
            brwiplt.setBounds(0, 150, 550, 550);
            wibrPlt.add(brwiplt);
            wibrPlt.setVisible(true);
         }
      });
      
      // bright ��ư
      ImageIcon bright = new ImageIcon("image/frame/�����Ʈ.png");
      ImageIcon brighton = new ImageIcon("image/frame/�����Ʈon.png");
      JButton btnBright = new JButton();
      frame.ButtonSet(btnBright, bright, brighton);

      btnBright.setBounds(40, 580, 500, 120);
      frame.add(btnBright);
      
      btnBright.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new GenWiBr();
            frame.dispose();
         }
      });
      
      // back ��ư
      JButton btnBack = new JButton();
      frame.goBack(btnBack);

      btnBack.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new FrameSeason();
            frame.dispose();
         }
      });
      
      // main ��ư
      JButton btnMain = new JButton();
      frame.goMain(btnMain);
      
      // ���ȿ�� ó��
      JLabel effect = new JLabel();
      frame.backEffect(effect);
      
      // ����
      frame.setVisible(true);
      
   }
}