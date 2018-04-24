//import javax.sound.midi.*;
//import javax.swing.*;
//import java.awt.*;
////实现音乐与图形同步出现，
//public class MiniMusicPlayer3 {                                              // 主类（外部类）
//    static JFrame f = new JFrame("My First Music Video");            // 主类的标题
//    static MyDrawPanel ml;                                                    // 画板
//
//    public static void main(String[] args){
//        MiniMusicPlayer3 mini = new MiniMusicPlayer3();                       // 运行主程序
//        mini.go();
//    }
//
//    public void setUpGui() {                                                  // 设置显示界面（f）的方法
//        ml = new MyDrawPanel();
//        f.setContentPane(ml);                                                  // 将画板添加进显示界面（f）中
//        f.setBounds(300,300,600,600);
//        f.setVisible(true);                                                    // 设置为可显示
//    }
//
//    public void go(){                                                          // 音频设置的方法，包括动作监听
//        setUpGui();
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        try {
//            Sequencer sequencer = MidiSystem.getSequencer();                     // 创建CD播放器
//            sequencer.open();                                                    // 打开播放器
//            sequencer.addControllerEventListener(ml, new int[]{127});           // 设置监听（监听画板）
//            Sequence seq = new Sequence(Sequence.PPQ,4);             // 创建CD
//            Track track = seq.createTrack();                                    // 创建专辑
//
//            int r = 0;
//            for (int i = 0; i < 60; i += 4){
//                r = (int)((Math.random()*50)+1);
//                track.add(makeEvent(144,1,r,100,i));            // 开始音
//                track.add(makeEvent(176,1,127,0,i));
//                track.add(makeEvent(128,1,r,100,i+2));     // 结束音
//            }
//
//            sequencer.setSequence(seq);
//            sequencer.setTempoInBPM(120);                                          // 设置速度
//            sequencer.start();                                                     // 开始播放
//        }catch (Exception ex){ex.printStackTrace();}
//    }
//
//    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){   // 快速设置track的方法
//        MidiEvent event = null;
//        try {
//            ShortMessage a = new ShortMessage();
//            a.setMessage(comd, chan, one, two);
//            event = new MidiEvent(a,tick);
//        }catch (Exception e){}
//        return event;
//    }
//
//    class MyDrawPanel extends JPanel implements ControllerEventListener {    // 设置画板（内部类），包括动作监听
//        boolean msg = false;
//
//        public void controlChange(ShortMessage event){                        // 监听音符改变信息
//            msg = true;
//            repaint();                                                          // 音符改变，则重画
//        }
//
//        public void paintComponent(Graphics g){
//            if (msg){
//                Graphics2D g2 = (Graphics2D)g;
//
//                int r = (int)(Math.random()*250);
//                int gr = (int)(Math.random()*250);
//                int b = (int)(Math.random()*250);
//                g.setColor(new Color(r,gr,b));                                   // 设置矩形随机颜色
//
//                int ht = (int)((Math.random()*120)+10);
//                int width = (int)((Math.random()*120)+10);
//                int x = (int)((Math.random()*40)+10);
//                int y = (int)((Math.random()*40)+10);
//                g.fillRect(x,y,width,ht);                                         // 设置矩形随机大小和初始位置
//                msg = false;
//            }
//        }
//    }
//}
