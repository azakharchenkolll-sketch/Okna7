import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class FirstLabelApp {
    public static void main(String[] args) {
        // Создаем окно
        JFrame frame = new JFrame("Первая надпись");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Создаем надпись
        JLabel label = new JLabel("Моя первая надпись!", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.ITALIC, 50));

        // Создаем слайдер (от 5 до 100, начальное значение 50)
        JSlider slider = new JSlider(5, 100, 50);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Обработчик изменения слайдера
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int size = slider.getValue();
                label.setFont(new Font("Serif", Font.ITALIC, size));
            }
        });

        // Добавляем элементы в окно
        frame.add(label, BorderLayout.CENTER);
        frame.add(slider, BorderLayout.SOUTH);

        // Делаем окно видимым
        frame.setVisible(true);
    }
}
