package Frame;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frame.FrameGender.GenSpBr;
import Frame.FrameGender.GenSpLt;
import Frame.FrameGender.GenSpWm;
import Set.BaseSet;

public class FrameSpringType extends JFrame{
   public FrameSpringType() {
      
      // BaseSet ��ü ����
      BaseSet frame = new BaseSet();
      
      // ��Ÿ�� �̹���
      ImageIcon spring = new ImageIcon("image/frame/��Ÿ��.png");
      JLabel lblSpring = new JLabel(spring);
      lblSpring.setBounds(115, 70, 350, 110);
      frame.add(lblSpring);
      
      JLabel lblImage = new JLabel();
      JButton lblLED = new JButton(); 
      JButton lblTitle = new JButton();
      frame.logoSet(lblImage, lblLED, lblTitle);
      
      // bright �ȷ�Ʈâ
      ImageIcon info = new ImageIcon("image/info/�ȷ�Ʈ.png");
      ImageIcon infoon = new ImageIcon("image/info/�ȷ�Ʈon.png");
      JButton spBrightPlt = new JButton();
      frame.ButtonSet(spBrightPlt, info, infoon);
      
      spBrightPlt.setBounds(460, 250, 40, 40);
      frame.add(spBrightPlt);
      spBrightPlt.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame spbrPlt = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            spbrPlt.setTitle("Spring Bright Palette");
            spbrPlt.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon spbr = new ImageIcon("image/info/������.png");
            JLabel brspplt = new JLabel(spbr);
            brspplt.setBounds(0, 150, 550, 550);
            spbrPlt.add(brspplt);
            spbrPlt.setVisible(true);
         }
      });
      
      // bright ��ư
      ImageIcon bright = new ImageIcon("image/frame/�����Ʈ.png");
      ImageIcon brighton = new ImageIcon("image/frame/�����Ʈon.png");
      JButton btnBright = new JButton();
      frame.ButtonSet(btnBright, bright, brighton);

      btnBright.setBounds(40, 240, 500, 120);
      frame.add(btnBright);
      
      btnBright.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new GenSpBr();
            frame.dispose();
         }
      });
      
      // warm �ȷ�Ʈâ
      JButton spWarmPlt = new JButton();
      frame.ButtonSet(spWarmPlt, info, infoon);
      
      spWarmPlt.setBounds(460, 420, 40, 40);
      frame.add(spWarmPlt);
      spWarmPlt.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame spwmPlt = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            spwmPlt.setTitle("Spring Warm Palette");
            spwmPlt.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon spwm = new ImageIcon("image/info/������.png");
            JLabel wmspplt = new JLabel(spwm);
            wmspplt.setBounds(0, 150, 550, 550);
            spwmPlt.add(wmspplt);
            spwmPlt.setVisible(true);
         }
      });
      
      // warm ��ư
      ImageIcon warm = new ImageIcon("image/frame/��.png");
      ImageIcon warmon = new ImageIcon("image/frame/��on.png");
      JButton btnWarm = new JButton();
      frame.ButtonSet(btnWarm, warm, warmon);

      btnWarm.setBounds(40, 410, 500, 120);
      frame.add(btnWarm);
      
      btnWarm.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new GenSpWm();
            frame.dispose();
         }
      });
      
      // light �ȷ�Ʈâ
      JButton spLightPlt = new JButton();
      frame.ButtonSet(spLightPlt, info, infoon);
      
      spLightPlt.setBounds(460, 590, 40, 40);
      frame.add(spLightPlt);
      spLightPlt.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame spltPlt = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            spltPlt.setTitle("Spring Light Palette");
            spltPlt.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon splt = new ImageIcon("image/info/������.png");
            JLabel ltspplt = new JLabel(splt);
            ltspplt.setBounds(0, 150, 550, 550);
            spltPlt.add(ltspplt);
            spltPlt.setVisible(true);
         }
      });
      
      // light ��ư
      ImageIcon light = new ImageIcon("image/frame/����Ʈ.png");
      ImageIcon lighton = new ImageIcon("image/frame/����Ʈon.png");
      JButton btnLight = new JButton();
      frame.ButtonSet(btnLight, light, lighton);

      btnLight.setBounds(40, 580, 500, 120);
      frame.add(btnLight);
      
      btnLight.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new GenSpLt();
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
      frame.setVisible(true);;
      
   }
}