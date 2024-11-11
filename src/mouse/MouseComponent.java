package mouse;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @ClassName MouseComponent
 * @Description TODO
 * @Author ztc
 * @Date 2024/11/11 10:33
 */
public class MouseComponent extends JComponent {

    //组件到校
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    //长方形长宽
    private static final int SIDELENGTH = 10;

    //长方形集合
    private List<Rectangle2D> squares;
    //当前长方形
    private Rectangle2D current;

    //初始化组件
    public MouseComponent() {
        this.squares = new ArrayList<>();
        this.current = null;
        // 鼠标组件添加监听器
        addMouseListener(new MouseHandler());
        // 鼠标组件添加运动监听器
        addMouseMotionListener(new MouseMotionHandler());
    }

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    //绘制长方形
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        for (Rectangle2D square : squares) {
            g2.draw(square);
        }
    }

    //查找中心点
    public Rectangle2D find(Point2D p){
        for (Rectangle2D square : squares) {
            if (square.contains(p)) {
                return square;
            }
        }
        return null;
    }

    //添加长方形
    public void add(Point2D p){
        double x = p.getX();
        double y = p.getY();
        current =  new Rectangle2D.Double(x-SIDELENGTH/2,y-SIDELENGTH/2,SIDELENGTH,SIDELENGTH);
        squares.add(current);
        repaint();
    }

    //移除长方形
    public void remove(Rectangle2D r){
        if (Objects.isNull(r)) {
            return;
        }
        if (r == current) {
            current = null;
        }
        squares.remove(r);
        repaint();
    }

    //设置鼠标监听器
    private class MouseHandler extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            current = find(e.getPoint());
            if (!Objects.isNull(current) && e.getClickCount() >= 2) {
                remove(current);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            current = find(e.getPoint());
            if (Objects.isNull(current)) {
                add(e.getPoint());
            }
        }
    }

    //设置鼠标运动监听器
    private class MouseMotionHandler implements MouseMotionListener {
        @Override
        public void mouseDragged(MouseEvent e) {
            if (Objects.isNull(current)) {
                int x = e.getX();
                int y = e.getY();
                current.setFrame(x - SIDELENGTH/2,y-SIDELENGTH/2,SIDELENGTH,SIDELENGTH);
                repaint();

            }
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            if (Objects.isNull(find(e.getPoint()))) {
                setCursor(Cursor.getDefaultCursor());
            }else{
                setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
            }
        }

    }


}
